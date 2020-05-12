package Functional;

public class Lambdas {

//    what is functional programming?
//    functional programming is a programming paradigm that
//    emphasizes the use of pure functions

//    pure functions will typically have no side effects

    public static void main(String[] args) {

//        pure functions can be thought of as strictly the following:
//        input -> output

//        functional interfaces are declared similarly to new objects
//        on the righthand side, you will have to utilize the arrow notation and redefine any parameters from your interface
//        your return statement is everything to the right of the arrow
        Func func = () -> System.out.println("this works");

//        this method works just fine but note that the IDE will recommend you turn this lambda to a method reference
//        method references will refer to static methods inside class using a double colon notation (::)
        IntFunc intFunc = (int x, int y) -> x+y;
        IntFunc intOtherFunc = Integer::sum;


//        in order to utilize your lambda, you will have to refer back to the name of your method
//        as such, the name of the static abstract method can be considered important!
        System.out.println(intFunc.funcInt(3,2));
        System.out.println(intOtherFunc.funcInt(3,2));


//        you can perform many actions with lambdas and method references
//        here we're performing a concatenation action on two string variables
        Concat con = (String s1, String s2) -> s1 + s2;

        System.out.println(con.cat("Hello ", "World"));
    }



}
