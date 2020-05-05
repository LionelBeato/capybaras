package Lab.Model;

import java.util.ArrayList;

public class Inventory {

    private ArrayList<LibraryItem> libraryItems = new ArrayList<>();

    public ArrayList<LibraryItem> getLibraryItems() {
        return libraryItems;
    }

    public void setLibraryItems(ArrayList<LibraryItem> libraryItems) {
        this.libraryItems = libraryItems;
    }

    public Inventory(ArrayList<LibraryItem> libraryItems) {
        this.libraryItems = libraryItems;
    }

    public Inventory(){}

    public void addItem(LibraryItem libraryItem){
        libraryItems.add(libraryItem);
    }
}
