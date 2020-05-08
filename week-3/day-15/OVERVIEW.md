# May 8, 2020 - Day 15

## Agenda

- General review of OOP and Java
- Touch on topics for next week
- Start our flappy bird project

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

### Review and Catchup

- Go ahead and take the time to review and catchup on any assignments.
- I'll review all submissions by the end of the week on Sundays. Expect grades by Monday if your submission hasn't been already reviewed.

### Flappy Bird Java Project

1. Let's create a simple clone of Flappy Bird. Create a new gradle project and add fxgl to your `build.gradle` as a dependency like so:

    ```groovy

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

2. Now let's create our project structure. Under `src > main > java` create your base package. Then create the following files: `EntityType` which will be an enum;`FlappyBirdApp`, `PlayerComponent`, and `WallBuildingComponent` which are all classes.

3. Our `EntityType`  will be a simple enum for holding `PLAYER and WALL`:

    ```Java

    public enum EntityType {
        PLAYER, WALL
    }
    ```

4. Our `PlayerComponent` defines the properties and behaviors of our flappy bird. This includes acceleration, jumping, a fail state, and audio. This class will extend a fxgl class named `Component`. Components in fxgl are thought of as parts of an Entity object, but not necessessarily the Entity itself:

    ```Java

        private Vec2 acceleration = new Vec2(6, 0);

        @Override
        public void onUpdate(double tpf) {
            acceleration.x += tpf * 0.1;
            acceleration.y += tpf * 10;

            if (acceleration.y < -5)
                acceleration.y = -5;

            if (acceleration.y > 5)
                acceleration.y = 5;

            entity.translate(acceleration.x, acceleration.y);

            if (entity.getBottomY() > getAppHeight()) {
                FXGL.<FlappyBirdApp>getAppCast().requestNewGame();
            }
        }

        public void jump() {
            acceleration.addLocal(0, -5);

            play("jump.wav");
        }

    ```

5. Our `WallBuildingComponent` similarly defines the properties and behaviors of our obstacles. Note that each component defines a behavior for every game tick via `onUpdate()`:

    ```Java
    private double lastWall = 1000;

        @Override
        public void onUpdate(double tpf) {
            if (lastWall - entity.getX() < FXGL.getAppWidth()) {
                buildWalls();
            }
        }

        private Rectangle wallView(double width, double height) {
            Rectangle wall = new Rectangle(width, height);
            wall.setArcWidth(25);
            wall.setArcHeight(25);
            wall.fillProperty().bind(FXGL.getGameState().objectProperty("stageColor"));
            return wall;
        }

        private void buildWalls() {
            double height = FXGL.getAppHeight();
            double distance = height / 2;

            for (int i = 1; i <= 10; i++) {
                double topHeight = Math.random() * (height - distance);

                entityBuilder()
                        .at(lastWall + i * 500, 0 - 25)
                        .type(EntityType.WALL)
                        .viewWithBBox(wallView(50, topHeight))
                        .with(new CollidableComponent(true))
                        .buildAndAttach();

                entityBuilder()
                        .at(lastWall + i * 500, 0 + topHeight + distance + 25)
                        .type(EntityType.WALL)
                        .viewWithBBox(wallView(50, height - distance - topHeight))
                        .with(new CollidableComponent(true))
                        .buildAndAttach();
            }

            lastWall += 10 * 500;
        }
    ```

6. Now we tackle `FlappyBirdApp`. We start by extending `GameApplication`. Then, we add our main method with `launch(args)` and declare our variables:

    ```Java
    public class FlappyBirdApp extends GameApplication {

        private PlayerComponent playerComponent;
        private boolean requestNewGame = false;

            public static void main(String[] args) {
            launch(args);
        }

    }

    ```

7. Lets add code that will implement our game states:

    ```Java
        public void requestNewGame() {
            requestNewGame = true;
        }

        private void showGameOver() {
            getDisplay().showMessageBox("Demo Over. Thanks for playing!", getGameController()::exit);
        }
    ```

8. Now we declare our init methods. `initSettings()` simply sets our game settings. `initInput()` is for defining how we'll jump, note that it's calling `PlayerComponent`'s `jump()` method. `initGameVars()` is for our game variables (so our score). `initGame()` sets our background and player (along with background music). `initUI()` is for our user interface:

    ```Java
        @Override
        protected void initSettings(GameSettings settings) {
            settings.setWidth(1280);
            settings.setHeight(720);
            settings.setTitle("Flappy Bird Clone");
            settings.setVersion("1.0");
        }

        @Override
        protected void initInput() {
            getInput().addAction(new UserAction("Jump") {
                @Override
                protected void onActionBegin() {
                    playerComponent.jump();
                }
            }, KeyCode.SPACE, VirtualButton.UP);
        }

        @Override
        protected void initGameVars(Map<String, Object> vars) {
            vars.put("stageColor", Color.BLACK);
            vars.put("score", 0);
        }

        private boolean loopBGM = true;

        @Override
        protected void initGame() {
            if (loopBGM) {
                loopBGM("bgm.mp3");
                loopBGM = false;
            }

            initBackground();
            initPlayer();
        }

        @Override
        protected void initPhysics() {
            getPhysicsWorld().addCollisionHandler(new CollisionHandler(EntityType.PLAYER, EntityType.WALL) {
                @Override
                protected void onCollisionBegin(Entity a, Entity b) {
                    requestNewGame();
                }
            });
        }

        @Override
        protected void initUI() {
            Text uiScore = new Text("");
            uiScore.setFont(Font.font(72));
            uiScore.setTranslateX(getAppWidth() - 200);
            uiScore.setTranslateY(50);
            uiScore.fillProperty().bind(getop("stageColor"));
            uiScore.textProperty().bind(getip("score").asString());

            addUINode(uiScore);

            Group dpadView = getInput().createVirtualDpadView();

            addUINode(dpadView, 0, 625);


    private void initBackground() {
        Rectangle rect = new Rectangle(getAppWidth(), getAppHeight(), Color.WHITE);

        Entity bg = entityBuilder()
                .view(rect)
                .with("rect", rect)
                .buildAndAttach();

        bg.xProperty().bind(getGameScene().getViewport().xProperty());
        bg.yProperty().bind(getGameScene().getViewport().yProperty());
    }

    private void initPlayer() {
        playerComponent = new PlayerComponent();

        Entity player = entityBuilder()
                .at(100, 100)
                .type(EntityType.PLAYER)
                .bbox(new HitBox(BoundingShape.box(70, 60)))
                .view(texture("bird.png").toAnimatedTexture(2, Duration.seconds(0.5)).loop())
                .collidable()
                .with(playerComponent, new WallBuildingComponent())
                .build();

        getGameScene().getViewport().setBounds(0, 0, Integer.MAX_VALUE, getAppHeight());
        getGameScene().getViewport().bindToEntity(player, getAppWidth() / 3, getAppHeight() / 2);

        playSpawnAnimation(player);
    }
    ```

9. Let's create a simple animation for whenever our bird starts a game:

    ```Java
        private void playSpawnAnimation(Entity player) {
            player.setScaleX(0);
            player.setScaleY(0);

            getGameWorld().addEntity(player);

            animationBuilder()
                    .duration(Duration.seconds(0.86))
                    .interpolator(Interpolators.BOUNCE.EASE_OUT())
                    .scale(player)
                    .from(new Point2D(0, 0))
                    .to(new Point2D(1, 1))
                    .buildAndPlay();
        }
    ```

10. Finally, let's define our `onUpdate()` method:

    ```Java

        @Override
        protected void onUpdate(double tpf) {
            inc("score", +1);

            if (geti("score") == 3000) {
                showGameOver();
            }

            if (requestNewGame) {
                requestNewGame = false;
                getGameController().startNewGame();
            }
        }

    ```

11. One last step! We forgot to add our resources! Under `src > main` [add the contents of this zip](resources.zip). You can simply replace your current resources folder with our new one.

12. Now see if your code runs! What do you think? Does it play well? What would you change about it if anything? Tinker with it (maybe perhaps the bird png) and customize it to your liking!


## Hand in Assignments

>these are expected to be handed in through TiTuS.

- Nothing to hand in for today!

## Notes and Links

- Threads can be a daunting topic. Just think of them as a discrete set of instructions that are executed. Here's [the Oracle tutorial on threads](https://docs.oracle.com/javase/tutorial/essential/concurrency/index.html);

- Credit to @AlmasB for the flappy bird implementation! [You can find his entire collection of fxgl games here](https://github.com/AlmasB/FXGLGames).

## Quote of the Day

```bash
 ________________________________________
/ A conclusion is simply the place where \
\ someone got tired of thinking.         /
 ----------------------------------------
        \   ^__^
         \  (oo)\_______
            (__)\       )\/\
                ||----w |
                ||     ||
```
