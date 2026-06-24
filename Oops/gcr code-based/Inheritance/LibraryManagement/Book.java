package LibraryManagement;

public class Book extends LibraryItem {

    private String title;
    private int publicationYear;
    private Author author; // HAS-A Relationship

    public Book(String title, int publicationYear, Author author) {
        this.title = title;
        this.publicationYear = publicationYear;
        this.author = author;
    }

    @Override
    public void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("Author Name: " + author.getName());
        System.out.println("Author Bio: " + author.getBio());
    }
}