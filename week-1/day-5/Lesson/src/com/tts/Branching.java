package com.tts;

import java.util.Random;

public class Branching {
//    this class will have the final control flow statement that we will cover

    public static void main(String[] args) {

//    break statement
        Random random = new Random();
        int breakAt = random.nextInt(100);

        for (int i = 0; i < 100; i++) {

            if ( i==breakAt) {
                System.out.println("Random number was: " + breakAt);
                break;
            }

            System.out.println("Index: " + i);
        }
        System.out.println("After the loop");


//        keep in mind that you can label your loops
//        this is very useful if you want to specify your break statement
        outer:
        for (int x=1; x<=5; x++){

            System.out.println("Starting list "+ x);

            for (int i=0; i<100; i++){

                if (i==breakAt){
                    System.out.println("Length of this list: " + breakAt);
                    break outer;
                } else {
                    break;
                }
            }
            System.out.println("Finished list " + x);
            breakAt = random.nextInt(100);
        }
        System.out.println("After the loop");

//        the compliment of break is continue
//        this is skip over other statements within your loop
//        and move on to the next iteration
        for (int i=0; i<100; i++){
            if ( i == breakAt){
                System.out.println("Random number was: "+ breakAt);
                break;
            }
            if (i%2 == 0){
                continue;
            }
            System.out.println("Index: "+ i);
        }
        System.out.println("After continue example loop");


    }




}
