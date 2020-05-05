package Lab.Model;

import java.util.ArrayList;

// class that represents a library user
// the user has a list variable that represents his loaned out books

public class CardHolder {

    private long holderId;
    private String name;
    private ArrayList<LibraryItem> checkedOutItems;

    public CardHolder(long holderId, String name) {
        this.holderId = holderId;
        this.name = name;
    }

    public long getHolderId() {
        return holderId;
    }

    public void setHolderId(long holderId) {
        this.holderId = holderId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<LibraryItem> getCheckedOutItems() {
        return checkedOutItems;
    }

    public void setCheckedOutItems(ArrayList<LibraryItem> checkedOutItems) {
        this.checkedOutItems = checkedOutItems;
    }

    public void addItem(LibraryItem item){
        checkedOutItems.add(item);
    }

    public void removeItem(LibraryItem item){
        checkedOutItems.remove(item);
    }

    @Override
    public String toString() {
        return "CardHolder{" +
                "holderId=" + holderId +
                ", name='" + name + '\'' +
                ", checkedOutItems=" + checkedOutItems +
                '}';
    }
}
