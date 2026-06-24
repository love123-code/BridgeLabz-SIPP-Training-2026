package LibraryManagement;

public class Main {

    public static void main(String[] args) {

        Author author =
                new Author("Love Sharma",
                        "Java Developer");

        Book book =
                new Book("Java Programming",
                        2025,
                        author);

        LibraryUtility utility =
                new LibraryUtility();

        utility.showDetails(book);
    }
}