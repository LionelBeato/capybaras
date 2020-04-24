package com.tts;

import java.io.IOException;

public class Lesson {

    public static void main(String[] args) throws IOException {

//        if statements

        int x = 1;

        // this double equal sign will check for equality
        // thus, it will return a true or false value
        if (x == 3){
            System.out.println(x);
            System.out.println("I am inside my if statement");
        }

        if (x > 3) {
            System.out.printf("%d is a big number%n", x);


//            this right here is a nested if statement
//            you can have as many nested if statements as you want
//            just keep in mind your code readability and efficiency
            if (x > 9){
                System.out.printf("%d is a really big number!%n", x);
            }
//            below is an else block
//            note that you can also use else if with another condition
//            this will allow you to chain multiple conditionals
        } else {
            System.out.println("This number is too small:"+x);
        }

//        switch statements

        char grade = 'a';

//        this switch will check evaluate the value of "grade"
//        if grate matches a specific case, it will then commit the following statement
//        multiple cases can be stacked on top of one another
//        thus resolving to the same statement
        switch(grade){
            case 'a':
            case 'A':
                System.out.println("You got an A!");
//                breaks are used to end our switch statement
                break;
            case 'B':
                System.out.println("You got a B!");
                break;

            default:
                System.out.println("Not a valid grade");
                break;
        }

//        for loop

//        this here is a traditional for loop
//        the middle statement is called our end check
//        it will allow our loop to run as long as its true
        for(int i = 1; i < 11; i++){
            System.out.println("I'm in a for loop: "+i);
        }

        for (int i = 1; i <= 20; i++){
            System.out.println("Count: "+ i);
        }

        for ( ; ; ){
            System.out.println("Help, I'm stuck in an infinite loop.");
            break;
        }

//        enhanced for

        int[] simpleArray = {1,2,3,4,5};

//        this is a more traditional way to iterate over an array
//        note the ".length" value on simpleArray
//        that is a value within simpleArray that represents the length of our array
        for (int i = 0; i < simpleArray.length;i++){
            System.out.println("Value of item in array: "+ simpleArray[i]);
        }

//        this is an enhanced for loop
//        this for loop lacks an iterator value but is much simpler to type
        for (int item: simpleArray){
            System.out.println("Enhanced for loop item: "+item);
        }


        int y = 1;

        while(y == 2){
            System.out.println(y);
            break;
        }

        do {
            System.out.println("y is great!");
        } while ( y == 2);

        char ch = 'c';

        do {
            System.out.println("Enter another char command or q to quit: ");
            ch = (char) System.in.read();
        } while (ch != 'q');

        System.out.println("Quit command entered!");

    }
}
