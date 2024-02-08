package org.bookmanagement.patternless;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    private List<String> books = new ArrayList<>();
    public void addBook(String book) {
        books.add(book);
    }
    public List<String> getBooks() {
        return books;
    }
    public void displayBooks() {
        for (String book : books) {
            System.out.println(book);
        }
    }
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        bookManager.addBook("Java Programming");
        bookManager.addBook("Clean Code");
        bookManager.addBook("Design Patterns");

        bookManager.displayBooks();
    }
}



