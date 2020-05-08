public class Runner {

//    We always need a main method in Java
//    This serves as our entry point

//    static means it belongs to the class implementation instead of an instance

    public static void main(String[] args) {

        System.out.println("Hello world!");

        Animal bird = new Animal("bird", true);
        Animal whale = new Animal("whale", true);

//        Note that this will print out the value of "2"
//        "count" is essentially tracking the number of instances
        System.out.println(Animal.getCount());

        System.out.println(whale.metabolize());


    }


}
