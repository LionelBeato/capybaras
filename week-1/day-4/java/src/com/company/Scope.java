package com.company;

public class Scope {

    // this would be a field
    // this is a class-level variable
    int x = 3;

    // public is an access modifier
    // with this modifier certain properties of
    // the code are altered
    public void myMethod(){
        // this is method-level variable
        // you can access it anywhere in your method
        int outer = 0;

        if ( outer == 0){
            // this is only accessible inside
            // of my if conditional statement
            int inner = 33;
            System.out.println(inner);
            System.out.println(outer);
        }

//        System.out.println(inner);




    }


}
