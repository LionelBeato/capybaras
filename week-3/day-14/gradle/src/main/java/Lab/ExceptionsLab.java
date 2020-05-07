package Lab;

public class ExceptionsLab {
//    1. Create a try and catch block that will explicitly throw a built-in exception (something like `NullPointerException`).
//    2. Create a try and catch block and use the keyword `throw` in order to throw an exception.
//    3. Create a custom `Exception` class and throw that exception in another try and catch block.


    public static void main(String[] args) {

        try{
            int x = 0;
            int y = 100;

            System.out.println(y/x);

        } catch(ArithmeticException e) {
            System.out.println("Dividing by Zero?! You can't do that!");
        }

        try{
            throw new Exception("Here's your exception, sir.");
        } catch (Exception e) {
            System.out.println("Thanks, the exception was caught.");
//            e.printStackTrace();
        }


        try{
            int x = 0;
            if (x > 0){
                throw new GrumpyException("That number makes me grumpy!");
            } else {
                System.out.println("Nice number!");
            }
        } catch (GrumpyException e) {
            e.printStackTrace();
        }


    }


}
