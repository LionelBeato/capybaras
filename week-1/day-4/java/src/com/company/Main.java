package com.company;

public class Main {

//    this down here is our main method
//    this is considered our "entry point" for our application
//    this is also considered a "main thread"
    public static void main(String[] args) {

        // Java is written out in camelCase
        // myVariable
        // myNumberThatIsCool
        // MyClass

        System.out.println("Hello World");

        // boolean which refers to true or false values
        // char which refers to characters
        // byte

        // short
        // int which refers to a whole number
        // long

        // float which refers to decimal values
        // double

        int myInt = 5;
        // this is completely legal but please don't ever do it!
//        int pop, top, can;

        // whats going to happen when I try to print this value?
        System.out.println("Hey, the value of myInt is: "+myInt);

        byte b = (byte)1293;

        System.out.println(b);

        // boolean only accepts true or false as values
        boolean myBool = false;

        char myChar = 'A';

        char capitalK = 'K';

        System.out.println(capitalK);

        // with some variables, you can denote intention
        // so that Java understands what you want from that value
        long bigLong = 230L;
        float someFloat = 927.42f;

        System.out.println(someFloat);

        // operators

        int x = 2;
        int y = 3;

        int z = x + y;
        int c = y - x;
        int a = x * y;
        int d = 6/2;

        int mod = 5%2;

        int inc = ++x;


        System.out.println(z);
        System.out.println(c);
        System.out.println(a);
        System.out.println(d);
        System.out.println(mod);
        System.out.println("this is the value of x incremented: "+inc);


        int otherInt = 5;

//        System.out.println(otherInt++);
//        System.out.println(otherInt);
        System.out.println(++otherInt);

        int yetAnotherInt = 5;
        int stillAnotherInt = 4;

        System.out.println(yetAnotherInt <= stillAnotherInt);

        yetAnotherInt += 3;

        System.out.println(yetAnotherInt);


        int myX = 50;
        int myY = 19;
        int q = myX ^ myY;

        System.out.println(q);

    }
}
