package Lesson;

public class Single {

    private static Single SINGLE_INSTANCE = new Single();
    private Single(){}

    public static Single getInstance(){
        return SINGLE_INSTANCE;
    }


}
