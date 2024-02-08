package org.bookmanagement.mvc;

import org.bookmanagement.mvc.controller.BookController;
import org.bookmanagement.mvc.model.BookModel;
import org.bookmanagement.mvc.view.BookView;

public class Main {
    public static void main(String[] args) {
        BookModel model = new BookModel();
        BookView view = new BookView();
        BookController controller = new BookController(model, view);

        controller.handleUserInput();
    }
}

