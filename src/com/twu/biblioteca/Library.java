package com.twu.biblioteca;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by brandonteng on 6/17/14.
 */
public class Library {

    private final PrintStream out;
    private List<Book> listOfBooks = new ArrayList<Book>();

    public Library(PrintStream out, List<Book> books) {
        this.out = out;
        this.listOfBooks = books;
    }

    public void displayWelcomeMessage() {
        out.println("Welcome!");
    }

    public List<Book> listBooks() {
        return listOfBooks;
    }

    public void displayListOfBooks() {
        out.println(listBooks().get(0).title);
        out.println(listBooks().get(1).title);
    }

    public void formatBookIntoColumns(){
        for(int i = 0; i < listBooks().size(); i++){
            out.printf("Book Title: " + listBooks().get(i).title + "\n");
            out.printf("Book Author: " + listBooks().get(i).author + "\n");
            out.printf("Publish Year: " + listBooks().get(i).year + "\n");
            out.println("\n");
        }
//        out.printf(b1.title + ", " + b1.author + " in " + b1.year);
    }
}
