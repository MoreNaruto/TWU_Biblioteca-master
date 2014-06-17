package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BibliotecaApp {
    private static Book b1 = new Book("Harry Potter", "J.K. Rowling", "1998");
    private static Book b2 = new Book("1948", "George Orwell", "1951");
    //    private List<String> titleOfBooks = new ArrayList<String>(Arrays.asList(b1.title, b2.title));
    private static List<Book> listOfBooks = new ArrayList<Book>(Arrays.asList(b1, b2));
    public static void main(String[] args) {

        new BiblioTech(new Library(System.out, listOfBooks)).go();
    }

}
