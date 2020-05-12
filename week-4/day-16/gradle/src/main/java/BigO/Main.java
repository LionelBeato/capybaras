package BigO;

public class Main {

    public static void printFirstItem(int[] items){
        System.out.println(items[2]);
    }

    public static void printAllItems(int[] items){
        for (int item : items){
            System.out.println(item);
        }
    }

    public static void printAllPossibleOrderedPairs(int[] items){
        for (int firstItem: items){
            for (int secondItem : items){
                System.out.println(firstItem + ", "+ secondItem);
            }
        }
    }

    public static void printBoth(int[] items, String[] strings){
        for (int item : items) {
            System.out.println(item);
        }

        for (String string : strings){
            System.out.println(string);
        }

    }

    public static void main(String[] args) {

        int[] items = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] strings = {"hi", "hello", "hola"};

        printFirstItem(items);
        printAllItems(items);


        printAllPossibleOrderedPairs(items);

        printBoth(items, strings);

    }

}
