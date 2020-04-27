package Project;

import java.util.Scanner;

public class Lottery {

    static String petName;
    static int petAge;
    static int luckyNum;
    static String quarterbackReply;
    static int jerseyNum;
    static int modelYear;
    static String actorName;
    static int randomNum;


    static int magicBall;
    static int selectedRandomNum;

//    another void method for testing purposes
    public static void testMethod(){
        System.out.println("give me a sec...");
    }

//      method that accept a number and convert it to 65 if its too high
//      this explicitly returns an integer value
    public static int numConverter(int num){
        while (num > 65) {
            num = num/2;
        }
        return num;

    }

    public static void runLottery(){

//        you can call a void method within another void method
        testMethod();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Starting survey...");
        System.out.println("What is your pet's name?");
        petName = scanner.nextLine();
        System.out.println("What is your pet's age?");
        petAge = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What is your lucky number?");
        luckyNum = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Do you have a favorite quarterback?");
        quarterbackReply = scanner.nextLine();
        if (quarterbackReply.compareTo("yes") == 0){
            System.out.println("What is their jersey number?");
            jerseyNum = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println("What is the two-digit model year of your car?");
        modelYear = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What is your favorite actor's first name?");
        actorName = scanner.nextLine();
        System.out.println("Please enter a number between 1-50.");
        randomNum = scanner.nextInt();
        scanner.nextLine();

        System.out.printf("Here are your inputs: %s, %d, %d, %d, %s, %d %n", petName, petAge, luckyNum, modelYear, actorName, randomNum);

//        random integer values
//        the parans around int is called casting
//        this make sure we have an int type from Math.random()
        int randOne = (int)(10.0 * Math.random());
        int randTwo = (int)(10.0 * Math.random());
        int randThree = (int)(10.0 * Math.random());

//        assigning one of the three random numbers to our selected random number variable

        System.out.printf("Here are my random numbers: %d, %d, %d %n", randOne,randTwo,randThree);


//        magic ball generation
//        we need to ensure the magicBall value is below 75

        if (quarterbackReply.compareTo("yes") == 0 || quarterbackReply.compareTo("y") == 0){
            magicBall = jerseyNum * randOne;
        } else {
            magicBall = luckyNum * randOne;
        }

        if (magicBall > 75){
            magicBall -= 75;
        }

//        System.out.printf("Your magic ball number is: %d %n", magicBall);


//        calculating lottery number

        int lotteryNumOne = petName.charAt(2);
        int lotteryNumTwo = (luckyNum + modelYear);
        int lotteryNumThree = (randomNum - randOne);
        int lotteryNumFour = (actorName.charAt(0));
        int lotteryNumFive = (actorName.charAt(actorName.length() - 1));
        int lotteryNumSix = 42;
        int lotteryNumSeven = (petAge + modelYear);
        int lotteryNumEight;
        if (quarterbackReply.compareTo("yes") == 0 || quarterbackReply.compareTo("y") == 0){
            lotteryNumEight = (jerseyNum + petAge + luckyNum);
        } else {
            lotteryNumEight = (petAge + luckyNum);
        }

        numConverter(lotteryNumTwo);
        numConverter(lotteryNumThree);
        numConverter(lotteryNumFour);
        numConverter(lotteryNumFive);
        numConverter(lotteryNumSix);
        numConverter(lotteryNumSeven);
        numConverter(lotteryNumEight);

//        final lottery number output
        System.out.printf("Here are your lottery numbers: %d %d %d %d %d %d %d %d! Magic ball number: %d",
                numConverter(lotteryNumOne),
                numConverter(lotteryNumTwo),
                numConverter(lotteryNumThree),
                numConverter(lotteryNumFour),
                numConverter(lotteryNumFive),
                numConverter(lotteryNumSix),
                numConverter(lotteryNumSeven),
                numConverter(lotteryNumEight),
                magicBall);



//        TODO: play again logic
//        TODO: error handling


    }

}
