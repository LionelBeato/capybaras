package Lab.Model;

public class LibraryItem implements Loanable{

   private long libraryId;
   private String title;
   private String description;
   private boolean loanedOut;


    public LibraryItem(long libraryId, String title, String description, boolean loanedOut) {
        this.libraryId = libraryId;
        this.title = title;
        this.description = description;
    }

    public long getLibraryId() {
        return libraryId;
    }

    public void setLibraryId(long libraryId) {
        this.libraryId = libraryId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean isLoanable() {
        return !loanedOut;
    }
}
