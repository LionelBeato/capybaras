package DiamondProblem;

public class Horse extends Animal implements Speakable, Flyable {


    @Override
    public String doSpeak() {
        return null;
    }

    @Override
    public boolean canFly() {
        return false;
    }
}
