package testpackage;

import junit.framework.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static testpackage.StubbedInputStream.stubInputStream;

public class BookTest {
    private ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @Test
    public void test_display_book_title() {
        System.setOut(new PrintStream(outputStream));
        System.setIn(stubInputStream().toReturn("1").atSomePoint());
        Book book = new Book();
        book.BookTitle = "1 : Programming Using C++";
        Book.display_book_title(book);
        Assert.assertEquals("1 : Programming Using C++",outputStream.toString());
    }

    @Test
    public void test_reserve_book_successful(){
        System.setOut(new PrintStream(outputStream));
        System.setIn(stubInputStream().toReturn("2").atSomePoint());
        Book book = new Book();
        Assert.assertEquals((Object) true, Book.reserve_book_if_available(book));
    }

    @Test
    public void test_reserve_book_unavailable(){
        System.setOut(new PrintStream(outputStream));
        System.setIn(stubInputStream().toReturn("2").atSomePoint());
        Assert.assertEquals((Object) false,Book.book_unavailable());
    }

}
