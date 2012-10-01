package com.twu28.biblioteca;

import junit.framework.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PrintBookListCommandTest {
    PrintBookListCommand printBookListCommand = new PrintBookListCommand();
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @Test
    public void testPrintBookList(){
        System.setOut(new PrintStream(outputStream));
        printBookListCommand.execute();
        Assert.assertEquals("We Have The Following Books\nBook Isbn\tBook Name\n123\tBook1\n456\tBook2\n789\tBook3\n110\tBook4\n",outputStream.toString());

    }
}
