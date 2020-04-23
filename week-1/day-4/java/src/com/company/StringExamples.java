package com.company;

public class StringExamples {



    public static void main(String[] args) {

        // A string is how we will typically render text
        // it is literally a collection of characters

        String myString = "Hello";
        String otherString = new String("World");

        System.out.println(myString+" "+otherString);
        System.out.println(myString.length());
        System.out.println(myString.length() == otherString.length());
        System.out.println(myString.concat(" ").concat(otherString));

        System.out.println(myString.indexOf('H'));


        int myInt = 1423;

        System.out.printf("This is my integer: %d", myInt);

    }






}
