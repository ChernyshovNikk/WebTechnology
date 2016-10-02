package main;

import book.Book;
import book.ProgrammerBook;

import java.util.Arrays;

/**
 * Created by NotePad.by on 02.10.2016.
 */
public class Main {
    public static void main(String args[]) {
        Book[] allBooks = new Book[5];
        allBooks[0] = new Book("Book1", "Chernyshov", 342, 1, 3);
        allBooks[1] = new Book("Book2", "Shestak", 543, 2, 5);
        allBooks[2] = new Book("Book3", "Evdakov", 178, 3, 2);
        allBooks[3] = new Book("Book4", "Pushkin", 283, 4, 1);
        allBooks[4] = new Book("Book5", "Gogol", 495, 5, 4);

        for (Book temporaryBook : allBooks) {
            System.out.println(temporaryBook.toString());
        }

        System.out.println();

        ProgrammerBook[] allProgrammerBooks = new ProgrammerBook[5];
        allProgrammerBooks[0] = new ProgrammerBook("Java", 1);
        allProgrammerBooks[1] = new ProgrammerBook("C#", 2);
        allProgrammerBooks[2] = new ProgrammerBook("PHP", 3);
        allProgrammerBooks[3] = new ProgrammerBook("JavaScript", 4);
        allProgrammerBooks[4] = new ProgrammerBook("Delphi", 5);

        for (ProgrammerBook temporaryProgrammerBook : allProgrammerBooks) {
            System.out.println(temporaryProgrammerBook.toString());
        }
    }
}
