package Exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise {

    public static void main(String[] args) {

//        ask the user for 5 numbers and store them in an array list

        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> integers = new ArrayList<>();
        int sum = 0;
        int product = 1;

        System.out.println("Please enter five numbers: ");

        for (int i = 0; i < 5; i++){
            int input = scn.nextInt();
            integers.add(input);
        }

        System.out.println("Here is your list: "+ integers);


//        finding the sum and the product of our list

        for (int integer : integers){
            sum += integer;
            product *= integer;
        }

        System.out.println("Here is your sum: "+ sum);
        System.out.println("Here is your product: "+ product);
        




    }
}
