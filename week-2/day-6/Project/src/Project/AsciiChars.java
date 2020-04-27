package Project;

public class AsciiChars {

    public static void printNumbers(){
        System.out.printf("Printing numbers...%n");
//        A traditional for loop is an ideal way to traverse
//        our ascii chart
        for(int i = 48; i < 58; i++){
//            we can then simply cast our iterator value to a char
//            to then represent that char
//            we do this for every static method in our class
            char myChar = (char) i;
            System.out.printf("Here is the char value of %d: %c %n", i, myChar);
        }
    }

    public static void printLowerCase(){
        System.out.printf("Printing lowercase letters...%n");
        for (int i = 97; i < 123; i++){
            char myChar = (char) i;
            System.out.printf("Here is the char value of %d: %c %n", i, myChar);
        }
    }

    public static void printUpperCase(){
        System.out.printf("Printing uppercase letters...%n");
        for (int i = 65; i < 91; i++){
            char myChar = (char) i;
            System.out.printf("Here is the char value of %d: %c %n", i, myChar);
        }
    }


}
