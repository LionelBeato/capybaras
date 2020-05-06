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


public class PongApp extends GameApplication {

//    constants and variables declarations

    private static final int PADDLE_WIDTH = 30;
    private static final int PADDLE_HEIGHT = 100;
    private static final int BALL_SIZE = 20;
    private static final int PADDLE_SPEED = 5;
    private static final int BALL_SPEED = 5;

    private Entity paddle1;
    private Entity paddle2;
    private Entity ball;

    @Override
    protected void initInput() {
        getInput().addAction(new UserAction("Up 1") {
            @Override
            protected void onAction(){
                paddle1.translateY(-PADDLE_SPEED);
            }
        }, KeyCode.W);

        getInput().addAction(new UserAction("Down 1") {
            @Override
            protected void onAction(){
                paddle1.translateY(PADDLE_SPEED);
            }
        }, KeyCode.S);

        getInput().addAction(new UserAction("Up 2") {
            @Override
            protected void onAction(){
                paddle1.translateY(-PADDLE_SPEED);
            }
        }, KeyCode.DIGIT8);

        getInput().addAction(new UserAction("Down 2") {
            @Override
            protected void onAction(){
                paddle1.translateY(PADDLE_SPEED);
            }
        }, KeyCode.DIGIT5);
    }


//    here we define our scores
//    fxgl has a built in way of tracking game variables such as scores
    @Override
    protected void initGameVars(Map<String, Object> vars){
        vars.put("score1", 0);
        vars.put("score2", 0);
    }

//    giving our entities values and calling initGame()
    @Override
    protected void initGame(){
        paddle1 = spawnBat(0, getAppHeight() / 2 - PADDLE_HEIGHT / 2);
        paddle2 = spawnBat(getAppWidth() - PADDLE_WIDTH, getAppHeight() / 2 - PADDLE_WIDTH / 2);

        ball = spawnBall(getAppWidth() / 2 - BALL_SIZE / 2, getAppHeight() / 2 - BALL_SIZE / 2);
    }

    private Entity spawnBat(double x, double y){
        return entityBuilder()
                .at(x, y)
                .viewWithBBox(new Rectangle(PADDLE_WIDTH, PADDLE_HEIGHT))
                .buildAndAttach();
    }

    private Entity spawnBall(double x, double y){
        return entityBuilder()
                .at(x, y)
                .viewWithBBox(new Rectangle(BALL_SIZE, BALL_SIZE))
                .with("velocity", new Point2D(BALL_SPEED, BALL_SPEED))
                .buildAndAttach();
    }

//    this code will create the UI for us
    @Override
    protected void initUI(){
        Text textscore1 = getUIFactory().newText("", Color.BLACK, 22);
        Text textscore2 = getUIFactory().newText("", Color.BLACK, 22);

        textscore1.setTranslateX(10);
        textscore1.setTranslateY(50);

        textscore2.setTranslateX(getAppWidth() - 30);
        textscore2.setTranslateY(50);

        textscore1.textProperty().bind(getGameState().intProperty("score1").asString());
        textscore2.textProperty().bind(getGameState().intProperty("score2").asString());

        getGameScene().addUINodes(textscore1, textscore2);
    }

    @Override
    protected void onUpdate(double tpf){
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

        if (ball.getX() <= 0){
            getGameState().increment("score2", +1);
            resetBall();
        }

        if (ball.getRightX() >= getAppWidth()){
            getGameState().increment("score1", +1);
            resetBall();
        }

        if (ball.getY() <= 0) {
            ball.setY(0);
            ball.setProperty("velocity", new Point2D(velocity.getX(), -velocity.getY()));
        }

        if (ball.getBottomY() >= getAppHeight()){
            ball.setY(getAppHeight() - BALL_SIZE);
            ball.setProperty("velocity", new Point2D(velocity.getX(), -velocity.getY()));
        }
    }

    private void resetBall(){
        ball.setPosition(getAppWidth() / 2 - BALL_SIZE / 2, getAppHeight() / 2 - BALL_SIZE / 2);
        ball.setProperty("velocity", new Point2D(BALL_SPEED, BALL_SPEED));
    }




    //    This method allows us to define our game title
    @Override
    protected void initSettings(GameSettings settings) {
        settings.setTitle("Pong");
    }

//    This is our entrypoint

    public static void main(String[] args) {
        launch(args);
    }


}
