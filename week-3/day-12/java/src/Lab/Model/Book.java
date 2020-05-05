package Lab.Model;

public class Book extends LibraryItem {

    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(String author, long libraryId, String title, String description, boolean loanedOut) {
        super(libraryId, title, description, loanedOut);
        this.author = author;
    }


    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                "title='" + super.getTitle()+ '}' + '\n';
    }
}
