package com.company;

public class Wrappers {

    // wrappers are reference types for primitives
    // there's a wrapper class for every primitive type

    Boolean myBool = true;
    Character myChar = 'A';

    // you can "construct" a
    // new instance of a wrapper class
    // using the "new" keyword
    Integer myInt = new Integer(55);
    Integer otherInt = 55;

    public static void main(String[] args) {

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);

        // you can parse string values into the appropriate
        // wrapper class
        Double number = Double.parseDouble("1203.44");

        System.out.println(number);

    }





}
