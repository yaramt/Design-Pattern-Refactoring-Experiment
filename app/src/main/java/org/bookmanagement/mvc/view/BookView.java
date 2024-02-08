package org.bookmanagement.mvc.view;

import java.util.List;

public class BookView {
    public void displayBooks(List<String> books) {
        for (String book : books) {
            System.out.println(book);
        }
    }
}

