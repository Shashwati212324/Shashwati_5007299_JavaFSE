package LibraryManagement;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Book[] books = {
                new Book("B001", "The Catcher in the Rye", "J.D. Salinger"),
                new Book("B002", "To Kill a Mockingbird", "Harper Lee"),
                new Book("B003", "1984", "George Orwell"),
                new Book("B004", "Moby-Dick", "Herman Melville"),
                new Book("B005", "The Great Gatsby", "F. Scott Fitzgerald")
        };

        LibraryManagementSystem lms = new LibraryManagementSystem(books);

        System.out.println("Linear Search Results:");
        Book book = lms.linearSearchByTitle("1984");
        if (book != null) {
            System.out.println("Found: " + book);
        } else {
            System.out.println("Book not found.");
        }

        lms.sortBooksByTitle();
        System.out.println("\nBinary Search Results:");
        book = lms.binarySearchByTitle("Moby-Dick");
        if (book != null) {
            System.out.println("Found: " + book);
        } else {
            System.out.println("Book not found.");
        }
    }
}
