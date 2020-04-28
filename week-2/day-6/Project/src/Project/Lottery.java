package Project;

import java.util.Scanner;

public class Lottery {

    static String petName;
    static Integer petAge;
    static Integer luckyNum;
    static String quarterbackReply;
    static Integer jerseyNum;
    static Integer modelYear;
    static String actorName;
    static Integer randomNum;


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


//        do-while loop for pet's name
        do {
            System.out.println("What is your pet's name?");
            petName = scanner.nextLine();
            if (petName.isEmpty()){
                System.out.println("Enter a valid pet name!");
            }
            if (petName.length() < 3){
                System.out.println("Pet name is too short!");
            }
        } while (petName.length() <= 2);

//        do-while loop for pet's age

        do {
            System.out.println("What is your pet's age?");
            petAge = scanner.nextInt();
            scanner.nextLine();
            if (petAge <= 0){
                System.out.println("Pet age is invalid!");
            }
        } while (petAge <= 0);

//        do-while loop for lucky number
        do {
            try {
                luckyNum = 0;
                System.out.println("What is your lucky number?");
                luckyNum = scanner.nextInt();
                scanner.nextLine();
                if (luckyNum > 50) {
                    System.out.println("That number is too big!");
                }
            } catch (Exception e){
                System.out.println("Not a valid input!");
                scanner.nextLine();
            }
        } while (luckyNum > 50 || luckyNum == 0);


            System.out.println("Do you have a favorite quarterback?");
            quarterbackReply = scanner.nextLine();
            if (quarterbackReply.equals("yes")) {
                System.out.println("What is their jersey number?");
                jerseyNum = scanner.nextInt();
                scanner.nextLine();
            }
            System.out.println("What is the two-digit model year of your car?");
            modelYear = scanner.nextInt();
            scanner.nextLine();
            System.out.println("What is your favorite actor's first name?");
            actorName = scanner.nextLine();

            do {
                System.out.println("Please enter a number between 1-50.");
                randomNum = scanner.nextInt();
                scanner.nextLine();
                if (randomNum > 50){
                    System.out.println("That's an invalid input");
                }
            } while (randomNum > 50);

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

        if (quarterbackReply.equalsIgnoreCase("yes") || quarterbackReply.equalsIgnoreCase("y")){
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

//        numConverter(lotteryNumTwo);
//        numConverter(lotteryNumThree);
//        numConverter(lotteryNumFour);
//        numConverter(lotteryNumFive);
//        numConverter(lotteryNumSix);
//        numConverter(lotteryNumSeven);
//        numConverter(lotteryNumEight);

//        final lottery number output
        System.out.printf("Here are your lottery numbers: %d %d %d %d %d %d %d %d! Magic ball number: %d%n",
                numConverter(lotteryNumOne),
                numConverter(lotteryNumTwo),
                numConverter(lotteryNumThree),
                numConverter(lotteryNumFour),
                numConverter(lotteryNumFive),
                numConverter(lotteryNumSix),
                numConverter(lotteryNumSeven),
                numConverter(lotteryNumEight),
                numConverter(magicBall));
    }

}
