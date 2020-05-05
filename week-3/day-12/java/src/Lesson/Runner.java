package Lesson;

public class Runner {

    public static class inner {
        public static void main(String[] args) {
//            this class is inside another class!
            System.out.println("Hello from inside!");
        }
    }

    public static void main(String[] args) {

//        generic typing allows for a lot of flexibility
//        while there are criticisms of the design pattern, it does indeed has its use cases
        Generic<String> myGeneric = new Generic<>();

        System.out.println(myGeneric.giveBackGeneric("This is a generic typing!"));

        System.out.println("Hello world!");

        Single mySingle = Single.getInstance();



    }



}
