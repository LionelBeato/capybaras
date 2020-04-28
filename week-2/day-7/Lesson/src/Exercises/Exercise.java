package Exercises;

import java.util.*;
import java.util.stream.Collectors;

public class Exercise {

    public static void main(String[] args) {

//        ask the user for 5 numbers and store them in an array list
        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> integers = new ArrayList<>();
        int sum = 0;
        int product = 1;

        System.out.println("Please enter five numbers: ");

        for (int i = 0; i < 5; i++){
            int input = scn.nextInt();
            integers.add(input);
        }

        scn.nextLine();

        System.out.println("Here is your list: "+ integers);


//        finding the sum and the product of our list

        for (int integer : integers){
            sum += integer;
            product *= integer;
        }

        System.out.println("Here is your sum: "+ sum);
        System.out.println("Here is your product: "+ product);



//        second problem from end of slides

        HashMap<String, String> cars = new HashMap<>();

        cars.put("Civic", "Honda");
        cars.put("Corolla", "Toyota");
        cars.put("Rav-4", "Toyota");

        System.out.println("What make of car are you looking for?");
        String reply = scn.nextLine();

        if (cars.containsKey(reply)){
            System.out.println("Excellent, it seems we have just the thing!");
            System.out.println("Here are our "+cars.get(reply)+" selections!");

            /*
            * Brute force implementation of searching for
            * similar values in a HashMap,
            * note the use of Map.Entry,
            * Map.Entry is an interface we can use to manipulate
            * HashMap entries
            *
            *
            * */
            for (Map.Entry<String, String> entry : cars.entrySet()){
                String key = entry.getKey();
                String value = entry.getValue();
                if (value.equalsIgnoreCase(cars.get(reply))) {
                    System.out.println(key + " : " + value);
                }
            }




        } else {
            System.out.println("It seems we don't have that...");
        }





        




    }
}
