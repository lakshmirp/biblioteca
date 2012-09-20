package testpackage;

import junit.framework.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static testpackage.StubbedInputStream.stubInputStream;

public class CustomerTest {

    private ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @Test
    public void test_check_library_number(){
        System.setOut(new PrintStream(outputStream));
        System.setIn(stubInputStream().toReturn("3").atSomePoint());
        Customer customer = new Customer();
        Customer.check_library_number(customer);
        Assert.assertEquals("1234",outputStream.toString());
    }

    @Test
    public void test_add_book_if_available(){
        System.setOut(new PrintStream(outputStream));
        System.setIn(stubInputStream().toReturn("3").atSomePoint());
        Book book = new Book();
        Customer customer = new Customer();
        Assert.assertEquals((Object) true,Customer.add_book_if_available(customer,book));

    }

    @Test
    public void test_book_not_available(){
        System.setOut(new PrintStream(outputStream));
        System.setIn(stubInputStream().toReturn("3").atSomePoint());
        Customer.book_not_available();
        Assert.assertEquals("Sorry!We don't have that book yet.",outputStream.toString());

    }
}
