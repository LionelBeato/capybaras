package Lab;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class Structures {

    public static void main(String[] args) {
        System.out.println("Hello World");

        //    make a primitive int array
//    use a traditional for loop and enhanced for loop


        int[] intArray = {1, 3, 4, 6, 0, 11};



        for(int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }

        for ( int element : intArray){
            System.out.println(element);
        }

//        interactive loop where we ask the user for words
//        those words get added to an arrayList

        ArrayList<String> myStrings = new ArrayList<>();

        Scanner scn = new Scanner(System.in);

        while(true){
            System.out.println("Please enter a word (or press q to quit): ");
            String input = scn.nextLine();
            if (!input.equalsIgnoreCase("q")) {
                myStrings.add(input);
            } else {
                break;
            }
        }

        System.out.println("Please enter a word to search for");
        String input = scn.nextLine();
        System.out.println(myStrings.contains(input));


//        Vector
//        Vector is an old class that can be utilized in the Java API
//        It behaves similarly to an ArrayList
//        in that the size of the vector can be dynamic as opposed to fixed


        Vector<String> stringVector = new Vector<>();

        stringVector.add("Hello");
        stringVector.add("World!");




    }




}
