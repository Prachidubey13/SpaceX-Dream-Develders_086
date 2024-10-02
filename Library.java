

import java.util.ArrayList;

class Library {
    // A collection to hold the books
    private ArrayList<Book> books;

    // Constructor to initialize the library
    public Library() {
        books = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.title);
    }

    // Method to remove a book by ISBN
    public void removeBook(String isbn) {
        for (Book book : books) {
            if (book.isbn.equals(isbn)) {
                books.remove(book);
                System.out.println("Book removed successfully.");
                return;
            }
        }
        System.out.println("Book with ISBN " + isbn + " not found.");
    }

    // Method to display all books in the library
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            System.out.println("Books in the library:");
            for (Book book : books) {
                System.out.println(book.toString());
            }
        }
    }
}

