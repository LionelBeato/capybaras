package Lab;

import Lab.Model.Book;
import Lab.Model.Inventory;

public class Run {

    public static void main(String[] args) {

        Book myBook = new Book("Dr. Suess",
                1,
                "Green Eggs and Ham",
                "lorem ipsum",
                false);

        Book myOtherBook = new Book("David Foster Wallace",
                1,
                "Infinite Jest",
                "lorem ipsum",
                false);


        Inventory inventory = new Inventory();

        inventory.addItem(myBook);
        inventory.addItem(myOtherBook);

        System.out.println(inventory.getLibraryItems());
    }
}
