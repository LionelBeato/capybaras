# May 6, 2020 - Day 13

## Agenda 

- Pop quiz, hotshot!
- Let's create our very own Pong game.


## Outline

| Time   | Objective                        |
| -------|:---------------------------------|
| 1:00p  | Roll Call and settling in        |
| 1:10p  | Slides and examples              |
| 2:30p  | Break                            |
| 2:40p  | Slides and examples wrap-up      |
| 3:00p  | Assignment                       |
| 3:30p  | Lab time                         |
| 4:00p  | Break                            |
| 4:10p  | Lab time                         |
| 4:50p  | Retrospective                    |
| 5:00p  | Class is dismissed!              |


## Lab


### OOP Pop Quiz

1. You'll have at least the first 30 minutes to finish the quiz.
2. We'll review the questions together after the fact.

### Java Pong! 

1. Alright, guys. It's time to test out building pong. We're going to be using a library called *fxgl* that is specifically created for games. To start, create a gradle project in Intellij. Make sure you are using Java 12 or under. Java 11 should work just fine!

2. Go to your `build.gradle` and replace its content with the following: 

```
plugins {
    id 'application'
    id 'org.openjfx.javafxplugin' version '0.0.8'
}

group 'org.example'
version '1.0-SNAPSHOT'

repositories {
    mavenCentral()
    jcenter()
    maven {
        url "https://nexus.gluonhq.com/nexus/content/repositories/releases/"
    }

}

dependencies {
    testCompile group: 'junit', name: 'junit', version: '4.12'
    compile 'com.github.almasb:fxgl:11.8'
}

javafx {
    version = "12.0.1"
    modules = [ 'javafx.controls', 'javafx.fxml', 'javafx.swing', 'javafx.media' ]
}

```

3. There should then be a refresh button popup towards the upper right side of the screen. Click on it and wait for your project to update.

4. Now lets create our application class. Under `src/java` create a new class named `PongApp`. 

5. Inside of your class add the following imports: 

```
import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;
import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.input.UserAction;
import javafx.geometry.Point2D;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import java.util.Map;

import static com.almasb.fxgl.dsl.FXGL.*;


```

6. Have your `PongApp` class extend the class `GameApplication`. 

7. Now add the following bits of code to your class: 

```java
 @Override
    protected void initSettings(GameSettings settings) {
        settings.setTitle("Pong");
    }

    public static void main(String[] args) {
        launch(args);
    }
```
>`initSettings` will load our settings and our `main` method acts as our entry point 

8. Now lets define some constants and variables, add the following code to your class:

```Java
private static final int PADDLE_WIDTH = 30;
private static final int PADDLE_HEIGHT = 100;
private static final int BALL_SIZE = 20;
private static final int PADDLE_SPEED = 5;
private static final int BALL_SPEED = 5;

private Entity paddle1;
private Entity paddle2;
private Entity ball;

```

9. Moving on, we'll next add user inputs to our class as well. These inputs are for both players of the game and as such target two different paddle `Entities`. The key that manipulates the paddle is defined by `KeyCode`:

```Java
@Override
protected void initInput() {
    getInput().addAction(new UserAction("Up 1") {
        @Override
        protected void onAction() {
            paddle1.translateY(-PADDLE_SPEED);
        }
    }, KeyCode.W);

    getInput().addAction(new UserAction("Down 1") {
    @Override
    protected void onAction() {
        paddle1.translateY(PADDLE_SPEED);
      }
   }, KeyCode.S);

   getInput().addAction(new UserAction("Up 2") {
      @Override
      protected void onAction() {
         paddle2.translateY(-PADDLE_SPEED);
      }
   }, KeyCode.UP);

   getInput().addAction(new UserAction("Down 2") {
      @Override
      protected void onAction() {
         paddle2.translateY(PADDLE_SPEED);
      }
   }, KeyCode.DOWN);
}
```

10. Let's write code to keep track of our score. *fxgl* allows us to do this via its own variable tracking system. Here is the code:

```Java
@Override
protected void initGameVars(Map<String, Object> vars) {
    vars.put("score1", 0);
    vars.put("score2", 0);
}
```

11. We then have our `Entities` initialized. In *fxgl*, there is a built in method named `entityBuilder()` that will handle a lot of the details for us. We then initialize them via `initGame()`:

```Java
@Override
protected void initGame() {
    paddle1 = spawnBat(0, getAppHeight() / 2 - PADDLE_HEIGHT / 2);
    paddle2 = spawnBat(getAppWidth() - PADDLE_WIDTH, getAppHeight() / 2 - PADDLE_HEIGHT / 2);

    ball = spawnBall(getAppWidth() / 2 - BALL_SIZE / 2, getAppHeight() / 2 - BALL_SIZE / 2);
}

private Entity spawnBat(double x, double y) {
    return entityBuilder()
            .at(x, y)
            .viewWithBBox(new Rectangle(PADDLE_WIDTH, PADDLE_HEIGHT))
            .buildAndAttach();
}

private Entity spawnBall(double x, double y) {
    return entityBuilder()
            .at(x, y)
            .viewWithBBox(new Rectangle(BALL_SIZE, BALL_SIZE))
            .with("velocity", new Point2D(BALL_SPEED, BALL_SPEED))
            .buildAndAttach();
}

```

12. The next step is to initialize the UI like so:

```Java
@Override
protected void initUI() {
    Text textScore1 = getUIFactory().newText("", Color.BLACK, 22);
    Text textScore2 = getUIFactory().newText("", Color.BLACK, 22);

    textScore1.setTranslateX(10);
    textScore1.setTranslateY(50);

    textScore2.setTranslateX(getAppWidth() - 30);
    textScore2.setTranslateY(50);

    textScore1.textProperty().bind(getGameState().intProperty("score1").asString());
    textScore2.textProperty().bind(getGameState().intProperty("score2").asString());

    getGameScene().addUINodes(textScore1, textScore2);
}
```

13. Almost done! We then provide code that tells our game what to do at every *tick*. A *tick* can be thought of as one iteration of a loop:


```Java

@Override
protected void onUpdate(double tpf) {
    Point2D velocity = ball.getObject("velocity");
    ball.translate(velocity);

    if (ball.getX() == paddle1.getRightX()
            && ball.getY() < paddle1.getBottomY()
            && ball.getBottomY() > paddle1.getY()) {
        ball.setProperty("velocity", new Point2D(-velocity.getX(), velocity.getY()));
    }

    if (ball.getRightX() == paddle2.getX()
            && ball.getY() < paddle2.getBottomY()
            && ball.getBottomY() > paddle2.getY()) {
        ball.setProperty("velocity", new Point2D(-velocity.getX(), velocity.getY()));
    }

    if (ball.getX() <= 0) {
        getGameState().increment("score2", +1);
        resetBall();
    }

    if (ball.getRightX() >= getAppWidth()) {
        getGameState().increment("score1", +1);
        resetBall();
    }

    if (ball.getY() <= 0) {
        ball.setY(0);
        ball.setProperty("velocity", new Point2D(velocity.getX(), -velocity.getY()));
    }

    if (ball.getBottomY() >= getAppHeight()) {
        ball.setY(getAppHeight() - BALL_SIZE);
        ball.setProperty("velocity", new Point2D(velocity.getX(), -velocity.getY()));
    }
}

```
14. Finally, we add a reset method so that the ball is centered after every round:

```Java
private void resetBall() {
    ball.setPosition(getAppWidth() / 2 - BALL_SIZE / 2, getAppHeight() / 2 - BALL_SIZE / 2);
    ball.setProperty("velocity", new Point2D(BALL_SPEED, BALL_SPEED));
}
```

15. Now run your code and play some Pong! Does it work as expected? What do you think could be improved? 



## Hand in Assignments
>these are expected to be handed in through TiTuS.

### HackerRank Challenge

1. Go to https://www.hackerrank.com/domains/java and complete the following challenges: 
   - Java Method Overriding
   - Java Generics
2. Take a screenshot of your progress and upload it to TiTuS.


## Notes and Links

- [The code tutorial for our Pong game comes from here](https://github.com/AlmasB/FXGL/wiki/Simple-Game---Pong-(FXGL-11)). There were many solutions, but this one seemed the simplest and used the dedicated game library. 


- [Open JavaFX Introduction Documentation](https://openjfx.io/openjfx-docs/#introduction). 

- Did You Know... [that a lot of early flip-phone games ran on Java](https://en.wikipedia.org/wiki/Java_Platform,_Micro_Edition)? As you may be able to imagine, the performance wasn't stellar but it was something. 

## Quote of the Day 

```
 _______________________________________
/ A lack of leadership is no substitute \
\ for inaction.                         /
 ---------------------------------------
        \   ^__^
         \  (oo)\_______
            (__)\       )\/\
                ||----w |
                ||     ||
```
