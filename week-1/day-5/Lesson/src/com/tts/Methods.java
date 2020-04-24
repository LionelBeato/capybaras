package com.tts;

public class Methods {

//    this is how you would declare a method
//    all legal methods need a return type specified
//    access modifiers can be specified as well but aren't necessary
//    within intellij, undefined modifiers will resolve to package-private
//    static means it belongs to the original instance of that class(so, the class itself)
    public static String myString(String str){
        return str;
    }

//    methods that don't return a value are denoted with "void"
    public static void myVoid(String str){
        return;
    }

    public static void main(String[] args) {
//        since myString() will resolve to a string,
//        I can put it inside of a print statement
        System.out.println(myString("Hello class!"));
        myVoid("this is my string.");
    }

}
