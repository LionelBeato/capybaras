package Lesson;

import java.util.*;

public class Main {

//    today, we will be talking about data structures!
//    all of the data structures explored today will be collections

//    Arrays


    public static void main(String[] args) {

//        this is one of the many ways you can declare an array
//        items in the array are referred to as elements
        String[] fruit = {"apples", "oranges", "pears"};

//        you can index an array, recall that arrays are zero-indexed
        System.out.println(fruit[0]);
//        all array objects have a variable called length
//        that tells you the length of an array
        System.out.println(fruit.length);

        ArrayList<Integer> integers = new ArrayList<>();

        integers.add(2);
        integers.add(6);
        integers.add(5);
        integers.add(2);

        integers.add(1, 9);

        integers.remove(3);


        System.out.println(integers);
        Collections.reverse(integers);


        System.out.println(integers.contains(6));

        String myString = "This is my string!";
        String str[] = myString.split(" ");
        List<String> arrayString = new ArrayList<>();

        arrayString = Arrays.asList(str);

        System.out.println(arrayString);

        System.out.println(arrayString.toString().replace("[","").replace("]","").replace(",", ""));



//        HashMap
        HashMap<String, Integer> person = new HashMap<>();

        person.put("Mike", 23);
        person.put("Ellen", 34);
        person.put("Jamie F.", 17);
        person.put("Fred", 17);
        person.put("Jamie W.", 34);

        System.out.println(person);


        System.out.println(person.get("Ellen"));

        System.out.println(person.containsKey("Jamie"));
        System.out.println(person.containsValue(45));
        System.out.println(person.isEmpty());

//        loops and collections

        String[] myStrings = {"String1", "String2", "String3"};

        for (int i = 0; i < myStrings.length; i++){
            System.out.println(myStrings[i]);
        }

//        print out I think I can 5 times


        for (int i = 0; i < 5; i++){
            System.out.println("I think I can!");
        }


//        times square
//        initiate a variable called count at 0

        int count = 0;

        for (int i = 1; i <= 10; i++){
            count *= count;
            System.out.println(count);
            count = i;
        }


        ArrayList<String> colors = new ArrayList<>();

        colors.add("red");
        colors.add("blue");
        colors.add("green");

//        enhanced for loop
        for (String color : colors){
            System.out.println(color);
        }

//        iterating through a hashmap
        for (Map.Entry<String, Integer> entry : person.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ":" + value);
        }


















    }


}
