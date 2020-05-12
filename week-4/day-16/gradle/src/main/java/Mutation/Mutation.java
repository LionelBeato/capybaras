package Mutation;

public class Mutation {

//    this method will mutate the passed in food object
    static void prepareFood(Food myFood){
        myFood.setCooked(true);
    }

    public static void main(String[] args) {
        Food myFood = new Food("pizza", false);
        prepareFood(myFood);
//        even though myFood was initialized with a isCooked value set to false
//        prepareFood() will set it to true
        System.out.println(myFood.isCooked());


    }
}
