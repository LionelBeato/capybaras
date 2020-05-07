package Lesson;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MethodThrowing {

    private static int getInt() throws InputMismatchException {
        Scanner scn = new Scanner(System.in);
        System.out.println("Input a number: ");
        int x = scn.nextInt();
        return x;
    }


    public static void main(String[] args) {
            getInt();
            System.out.println("Hello there!");
    }
}
