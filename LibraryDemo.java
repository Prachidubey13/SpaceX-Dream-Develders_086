
public class LibraryDemo {
    public static void main(String[] args) {
        // Creating the library
        Library library = new Library();

        // Adding books to the library
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");
        Book book2 = new Book("1984", "George Orwell", "9780451524935");

        library.addBook(book1);
        library.addBook(book2);

        // Displaying all books in the library
        library.displayBooks();

        // Removing a book by ISBN
        System.out.println("\nRemoving book with ISBN: 9780451524935");
        library.removeBook("9780451524935");

        // Displaying all books in the library after removal
        library.displayBooks();
    }
}

