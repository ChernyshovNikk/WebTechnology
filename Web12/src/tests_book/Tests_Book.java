package tests_book;

import book.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * Created by NotePad.by on 02.10.2016.
 */
public class Tests_Book {
    TreeSet<Book> testBooks = new TreeSet<Book>();

    public void GetTestData()
    {
        testBooks.add(new Book("Book1", "Chernyshov", 342, 1, 3));
        testBooks.add(new Book("Book2", "Shestak", 543, 2, 5));
        testBooks.add(new Book("Book3", "Evdakov", 178, 3, 1));
        testBooks.add(new Book("Book4", "Pushkin", 283, 4, 4));
        testBooks.add(new Book("Book5", "Gogol", 495, 5, 2));
    }

    @Test
    public void FirstElementSortIsbnTest() {
        GetTestData();
        long expectValue = 1;
        Book sortValue = testBooks.first();
        Assert.assertEquals(expectValue,sortValue.GetBookIsbn());
    }

    @Test
    public void LastElementSortIsbnTest() {
        GetTestData();
        long expectValue = 5;
        Book sortValue = testBooks.last();
        Assert.assertEquals(expectValue,sortValue.GetBookIsbn());
    }
}
