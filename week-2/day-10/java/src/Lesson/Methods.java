package Lesson;

public class Methods {

//    Java methods are basically java functions
//    public static is our modifier
//    this defines the access type of the method and its completely optional
//    void is our return type, this specifies the value that we get back
//    everything after the return type is referred to as a signature
//    everything in parans is known as parameters
//    these are optional
    public static void myFirstMethod(){
        System.out.println("Hello world!");
    }

    public static int mathMethod(int x, int y){
        return x + y;
    }

    public static String stringConverter(Integer x){
        return x.toString();
    }

//    the method below will not resolve because the return type
//    does not match the return value
//    public static void messedUpMethod(){
//        int x = 4;
//        return x;
//    }

    public static void myName(String first, String last){
        System.out.printf("Hello my name is %s %s!%n", first, last);
    }

    public static void main(String[] args) {

//        you can call a method multiple times
        myFirstMethod();
        myFirstMethod();

        int a = 3;
        int b = 5;

        System.out.println(mathMethod(3,4));
        System.out.println(stringConverter(4));

//        parameters can be thought of as placeholders
//        you can pass in whatever legal value you want

//        arguments are the actual values that we pass in
        System.out.println(mathMethod(a,b));

        myName("Lionel", "Beato");

    }

}
