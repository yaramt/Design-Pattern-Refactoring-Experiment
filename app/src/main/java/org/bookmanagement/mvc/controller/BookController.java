package org.bookmanagement.mvc.controller;

import org.bookmanagement.mvc.model.BookModel;
import org.bookmanagement.mvc.view.BookView;

import java.util.Scanner;

public class BookController {
    private BookModel model;
    private BookView view;

    public BookController(BookModel model, BookView view) {
        this.model = model;
        this.view = view;
    }

    public void handleUserInput() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nBook Management Menu:");
            System.out.println("1. Add a Book");
            System.out.println("2. View All Books");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the title of the book: ");
                    String title = scanner.nextLine();
                    model.addBook(title);
                    break;
                case 2:
                    view.displayBooks(model.getBooks());
                    break;
                case 3:
                    System.out.println("Exiting Book Management. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}

