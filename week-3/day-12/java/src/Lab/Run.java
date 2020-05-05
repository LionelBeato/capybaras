package Lab;

import Lab.Model.Book;
import Lab.Model.CardHolder;
import Lab.Model.Inventory;

public class Run {


    // this is our main method for our inventory application
    // here we perform a lot of the logic, but ideally, this logic would
    // have its own class
    public static void main(String[] args) {


//        Creating two book libraryitems
//        these will be added to our inventory
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


//        inventory for our Library
//        we originally had this static, which is completely fine
//        for the purposes of our program
//        this would ideally be singleton
        Inventory inventory = new Inventory();

//        adding items into our inventory
        inventory.addItem(myBook);
        inventory.addItem(myOtherBook);

//        printing out the contents of our inventory
        System.out.println(inventory.getLibraryItems());


//        creating a new cardholder

        CardHolder Mike = new CardHolder(1, "Mike");

//        assigning a book to a cardholder

        myBook.setLoanee(Mike);

//        printing out the loanee information
        
        System.out.println(myBook.getLoanee());
    }
}
