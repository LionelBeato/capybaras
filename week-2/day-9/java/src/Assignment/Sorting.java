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

    public static void main(String[] args) {

        LinkedList<Integer> myInts = new LinkedList<>();


        ArrayList<Integer> myIntegers = new ArrayList<>(100);

        for (int i = 0; i < 100; i++){
            myIntegers.add(i, (int) (Math.random()*100));
        }



        System.out.println(myIntegers);

        myIntegers.sort(null);

        System.out.println(myIntegers);

    }



}
