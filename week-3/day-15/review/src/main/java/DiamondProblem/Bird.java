package DiamondProblem;

public class Bird extends Animal implements Speakable, Flyable {


    @Override
    public String doSpeak() {
        return null;
    }

    @Override
    public boolean canFly() {
        return true;
    }
}
