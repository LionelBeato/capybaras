package Project;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Simple print statement to make sure everything
//        is working and set up correctly
        System.out.println("Hello World!");

//        these are static method calls to our methods
//        in the class AsciiChars.
//        Although they do not have return values,
//        they will still print something to the console.
        AsciiChars.printNumbers();
        AsciiChars.printLowerCase();
        AsciiChars.printUpperCase();


//        Asking a user for their name
//        and echoing it back
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String userName = scanner.nextLine();
        System.out.printf("Hello %s %n", userName);

//        Asking the user if they want to continue
        System.out.println("Do you wish to continue?");
        String userReply = scanner.nextLine();

        if (userReply.compareTo("yes") == 0 || userReply.compareTo("y") == 0){
            System.out.println("Continuing...");
            Lottery.runLottery();

        } else {
            System.out.println("Understood. Complete the survey at a later date.");
        }

    }
}
