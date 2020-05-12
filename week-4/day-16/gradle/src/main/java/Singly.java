public class Singly {
    private int myInt;
    private static Singly myInstance = new Singly();

    private Singly() {

    }

    public static Singly getMyInstance() {
        return myInstance;
    }

    @Override
    public String toString() {
        return "Singly{" +
                "myInt=" + myInt +
                '}';
    }
}
