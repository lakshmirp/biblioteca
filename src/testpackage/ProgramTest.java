package testpackage;

import junit.framework.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ProgramTest {

    private ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @Test
    public void test_print_welcome(){
        System.setOut(new PrintStream(outputStream));
        Assert.assertEquals("Welcome To The Bangalore Public Library",Program.print_welcome());
    }

    @Test
    public void test_print_menu(){
        System.setOut(new PrintStream(outputStream));
        Assert.assertEquals("1->View The List Of Books\n2->Reserve Book\n3->Check Library Number\n4:Exit",Program.print_menu());
    }


}
