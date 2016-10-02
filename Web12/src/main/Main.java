package main;

import book.Book;

import java.util.Arrays;

/**
 * Created by NotePad.by on 02.10.2016.
 */
public class Main {
    public static void main(String args[]) {
        Book[] allBooks = new Book[5];
        allBooks[0] = new Book("Book1", "Chernyshov", 342, 1);
        allBooks[1] = new Book("Book2", "Shestak", 543, 2);
        allBooks[2] = new Book("Book3", "Evdakov", 178, 3);
        allBooks[3] = new Book("Book4", "Pushkin", 283, 4);
        allBooks[4] = new Book("Book5", "Gogol", 495, 5);

        for (Book temporaryBook : allBooks) {
            System.out.println(temporaryBook.toString());
        }
    }
}
