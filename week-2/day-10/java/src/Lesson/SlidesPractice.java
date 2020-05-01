package Lesson;

public class SlidesPractice {

//    converts from pounds to kilos

    public static double poundsToKilos(double pounds){
        return pounds*0.45;
    }

//    reverses a string

    public static StringBuilder stringReverser(String string){
        StringBuilder reversed = new StringBuilder();
        for (int i = string.length()-1; i >= 0; i--){
            System.out.println(string.charAt(i));
            reversed.append(string.charAt(i));
        }
        return reversed;
    }

//    method that turns an arraylist into a hashmap


//    method that divides

    public static void divider(int x, int y){

        if (x == 0 || y == 0){
            System.out.println("That's not allowed!");
            return;
        }

        int result = x/y;
        int mod = x % y;
        System.out.println(result+" : "+mod);
    }

    public static void main(String[] args) {

        System.out.println(poundsToKilos(4.00));
        System.out.println(stringReverser("Hello"));

//        divider accepts two ints and will print the resulting
//        division and the remainder
        divider(6,2);
//        divider will not accept 0 as a valid input
        divider(0,2);

    }
}
