package book;

import java.util.Comparator;

/**
 * Created by NotePad.by on 02.10.2016.
 */
public class Book implements Comparator<Book>,Comparable{
    private String title;
    private String author;
    private int price;
    private static int edition;

    private int isbn;

    public Book(){}

    public Book(String title, String author, int price, int edition, int isbn)  {
        this.title = title;
        this.author = author;
        this.price = price;
        this.edition = edition;
        this.isbn = isbn;
    }

    public int GetBookIsbn() {
        return isbn;
    }

    public String GetBookTitle() {
        return title;
    }

    public String GetBookAuthor() {
        return author;
    }

    public int GetBookPrice() {
        return price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;

        if (obj == null)
            return false;

        if (getClass() != obj.getClass())
            return false;

        Book currentBook = (Book) obj;

        if (this.GetBookPrice() != currentBook.GetBookPrice())
            return false;

        if (this.GetBookTitle().equals(currentBook.GetBookTitle()))
            return false;

        if (this.GetBookAuthor().equals(currentBook.GetBookAuthor()))
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result += this.GetBookPrice();

        if (this.GetBookAuthor() != null)
            result += this.GetBookAuthor().hashCode();

        if (this.GetBookTitle() != null)
            result += this.GetBookTitle().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "(Book)" + "  Title: '" + title + '\''+ ",  Author: '" + author + '\'' +  ",  Price = " + price;
    }

    @Override
    public Book clone() throws CloneNotSupportedException {
        Book copyObj = (Book)super.clone();
        return copyObj;
    }

    @Override
    public int compareTo(Object obj) {
        Book entry = (Book) obj;
        int result = this.GetBookIsbn() - entry.isbn;
        if (result != 0) {
            return (int) result / Math.abs(result);
        }
        return 0;
    }

    public int compare(Book firstBook, Book secondBook) {
        String firstString = firstBook.GetBookTitle();
        String secondString = secondBook.GetBookTitle();
        return firstString.compareTo(secondString);
    }

    public static class SortBooksByTitle implements Comparator<Book>{
        @Override
        public int compare(Book firstBook, Book secondBook) {
            String firstString = firstBook.GetBookTitle();
            String secondString = secondBook.GetBookTitle();
            return firstString.compareTo(secondString);
        }
    }

    public static class SortBooksByTitleAndAuthor implements Comparator<Book> {
        @Override
        public int compare(Book firstBook, Book secondBook) {
            String firstString = firstBook.GetBookTitle();
            String secondString = secondBook.GetBookTitle();
            if (firstString.compareTo(secondString) != 0)
                return firstString.compareTo(secondString);

            firstString = firstBook.GetBookAuthor();
            secondString = secondBook.GetBookAuthor();
            return firstString.compareTo(secondString);
        }
    }

    public static class SortBooksByAuthorAndTitle implements Comparator<Book> {
        @Override
        public int compare(Book firstBook, Book secondBook) {
            String firstString = firstBook.GetBookAuthor();
            String secondString = secondBook.GetBookAuthor();
            if (firstString.compareTo(secondString) != 0)
                return firstString.compareTo(secondString);

            firstString = firstBook.GetBookTitle();
            secondString = secondBook.GetBookTitle();
            return firstString.compareTo(secondString);
        }
    }

    public static class SortBooksByAuthorAndTitleAndPrice implements Comparator<Book> {
        @Override
        public int compare(Book firstBook, Book secondBook) {
            String firstString = firstBook.GetBookAuthor();
            String secondString = secondBook.GetBookAuthor();
            if (firstString.compareTo(secondString) != 0)
                return firstString.compareTo(secondString);

            firstString = firstBook.GetBookTitle();
            secondString = secondBook.GetBookTitle();
            if (firstString.compareTo(secondString) != 0)
                return firstString.compareTo(secondString);

            if(firstBook.GetBookPrice() > secondBook.GetBookPrice())
                return 1;
            else
                if(firstBook.GetBookPrice() < secondBook.GetBookPrice())
                    return -1;
                else
                    return 0;
        }
    }
}
