package tests_book;

import book.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by NotePad.by on 02.10.2016.
 */
public class Tests_Sorts {
    Book[] testBooks = new Book[5];

    public void GetTestData()
    {
        testBooks[0] = new Book("Rook", "Chernyshov", 342, 1, 3);
        testBooks[1] = new Book("Book", "Shestak", 543, 2, 5);
        testBooks[2] = new Book("Zook", "Evdakov", 178, 3, 1);
        testBooks[3] = new Book("Dook", "Pushkin", 283, 4, 4);
        testBooks[4] = new Book("Took", "Gogol", 495, 5, 2);
    }

    @Test
    public void SortBooksByTitleTest() {
        GetTestData();
        String expectValue = "Zook";
        Arrays.sort(testBooks, new Book.SortBooksByTitle());
        Book sortValue = testBooks[4];
        Assert.assertEquals(expectValue,sortValue.GetBookTitle());
    }

    @Test
    public void SortBooksByTitleAndAuthorTest() {
        GetTestData();
        String expectValue = "Took";
        Arrays.sort(testBooks, new Book.SortBooksByTitleAndAuthor());
        Book sortValue = testBooks[3];
        Assert.assertEquals(expectValue,sortValue.GetBookTitle());
    }

    @Test
    public void SortBooksByAuthorAndTitleTest() {
        GetTestData();
        String expectValue = "Chernyshov";
        Arrays.sort(testBooks, new Book.SortBooksByAuthorAndTitle());
        Book sortValue = testBooks[0];
        Assert.assertEquals(expectValue,sortValue.GetBookAuthor());
    }

    @Test
    public void SortBooksByAuthorAndTitleAndPriceTest() {
        GetTestData();
        int expectValue = 342;
        Arrays.sort(testBooks, new Book.SortBooksByAuthorAndTitleAndPrice());
        Book sortValue = testBooks[0];
        Assert.assertEquals(expectValue,sortValue.GetBookPrice());
    }
}
