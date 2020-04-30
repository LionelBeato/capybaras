package Assignment;

import java.util.ArrayList;
import java.util.LinkedList;

public class Sorting {

    /*
    *
    *
    *
        -Create one array or ArrayList of 100 values, filled with math.random*100 in a for each loop.

        -Sort the array/ArrayList (must be a harder sort option and must be able to explain what’s happening)
    *
    *
    * */


    public static void sort(ArrayList<Integer> myInts){

//        this is a super simple sorting algorithm that compares each element at either end
//        i represents the elements near the start
//        j represents the elements near the end
//        I want to iterate through the list and check every element
        for (int i = 0; i < myInts.size(); i++ ){
//            with every search near the start, I want to compare the element to one
//            near the end, these loops will technically go through the entire list
//            you can optimize this algorithm by
            for (int j = 99; j > -1; j--){
                System.out.printf("comparing %d and %d!%n", myInts.get(i), myInts.get(j));
                if (myInts.get(i) > myInts.get(j)) {
                    System.out.printf("switching %d and %d%n", myInts.get(i), myInts.get(j));
                    Integer tempValue = myInts.get(i);
                    myInts.set(i, myInts.get(j));
                    myInts.set(j, tempValue);
                }
            }
        }


        myInts.add(0, myInts.get(99));
        myInts.remove(myInts.remove(100));

        System.out.println(myInts);
    }

    public static void main(String[] args) {

        LinkedList<Integer> myInts = new LinkedList<>();


        ArrayList<Integer> myIntegers = new ArrayList<>(100);

        for (int i = 0; i < 100; i++){
            myIntegers.add(i, (int) (Math.random()*100));
        }



        System.out.println(myIntegers);

       myIntegers.sort(null);

        sort(myIntegers);
    }



}
