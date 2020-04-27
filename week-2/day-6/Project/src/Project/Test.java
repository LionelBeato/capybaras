package Project;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int x = 4;
        int y = 4;
        System.out.printf("Please enter a string: ");
        String z;
        z = scn.nextLine();


        System.out.println(z);

        if (x == y){
            System.out.println("Those two values are the same!");
        }



        if (z.equals("hello")){
            System.out.println("this conditional works!");
        }
    }
}
