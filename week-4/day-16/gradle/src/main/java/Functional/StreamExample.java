package Functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {

//        Now lets talk about streams!
//        Streams are not data structures, instead they're closely related to I/O streams
//        Collection types are treated as I/O streams and actions can be performed on them
        List<Integer> numbers = Arrays.asList(2,6,8,3);

//        here we're performing a map function that accepts a lambda expression as an argument
//        this lambda determines what we do for each element in a collection
//        forEach will perform an action on each element and potentially mutate the original collection
//        here we're using a method reference to print each element to the console
        numbers.stream()
                .map(item -> item+item)
                .forEach(System.out::println);

//        map and forEach are examples of higher order functions, or functions that can have functions as argument/return values
//        higher order functions is a powerful concept in programming
//        there are many different higher order functions we can perform on streams in Java
//        here, we use filter to ONLY return elements that match our predicate, essentially a boolean value function

        List<Integer> integers = numbers.stream()
                .filter( item -> item % 2 != 0 )
                .collect(Collectors.toList());

        System.out.println(integers);

    }
}
