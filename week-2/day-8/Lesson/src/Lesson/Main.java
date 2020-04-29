package Lesson;

import java.util.*;

public class Main {

    public static void main(String[] args) {

//        Data Structures II

//        Linked List

        LinkedList<String> animalList = new LinkedList<String>();
        animalList.add("frog");
        animalList.add("giraffe");
        animalList.add("buffalo");
        animalList.add("mongoose");
        System.out.println(animalList);

        animalList.addLast("koala");
        System.out.println(animalList);

        animalList.add(3, "cuttlefish");
        System.out.println(animalList);

        animalList.set(3, "emu");
        System.out.println(animalList);

        List<String> l = new ArrayList<>();

//        Queues

        Queue<String> q = new LinkedList<String>();

        Queue<Integer> myQueue = new LinkedList<>();

        for(int i = 5; i < 10; i++){
            myQueue.add(i);
            System.out.println("Elements of my queue: "+myQueue);
        }


        int removedHead = myQueue.remove();
        System.out.println("removed element: "+removedHead);

        int head = myQueue.peek();
        System.out.println("head of queue: "+head);

//        Stacks

        Stack<Integer> myStack = new Stack<Integer>();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        System.out.println(myStack);

        System.out.println(myStack.pop());






    }
}
