package Exercises;

public class Primes {

//    print out all prime numbers from 1-100
//    utilize a isPrime() method

    public static boolean isPrime(int num){

//        this a series of if and else if code blocks that will
//        continuously check if a given number is prime (specifically our parameters "num")
//        we utilize modulus to check for any remaining value after division, indicating if a number is prime or not
//        we can do this with the smallest factor numbers, 3 and 2
        if (num <= 2) {
           return num < 3;
        } else if (num % 3 == 0){
            return false;
        } else if ( num % 2 == 0){
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {

//        checking to see if my prime method is working
        System.out.println(isPrime(29));

//        traditional for loop that checks for every prime from 1 through 100
        for (int i = 1; i <= 100; i++){
            if (isPrime(i)){
                System.out.printf("%d is a prime number!%n", i);
            }
        }

    }



}
