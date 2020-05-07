import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Runner {

    private static String doThing(){

//        We can indeed create our own custom exceptions!
//        We can construct and create instances like any other object
        DontFeelLikeItException dontFeelLikeItException = new DontFeelLikeItException("Eh, I don't feel like it");

        try {
//            We can also explicitly throw our errors
            throw dontFeelLikeItException;

        } catch (DontFeelLikeItException e) {
            e.printStackTrace();
        }

        return "did a thing";

    }

    private static int divide(int x, int y){
        try {
            return x / y;
        } catch(ArithmeticException e){
            return 0;
        }
    }

    private static int getInt(){
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a number");
        while(true){
            try {
                return s.nextInt();
            } catch (InputMismatchException e){
                s.nextLine();
                System.out.println("Error - please enter a number");
            } catch (NoSuchElementException e){
                System.out.println("Error - please enter a number");
                return 0;
            }

        }
    }

    public static void main(String[] args) {
        int x = 100;
        int y = 0;
        System.out.println(divide(x, y));

//        getInt();

        doThing();
    }

}
