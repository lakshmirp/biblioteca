package com.twu28.biblioteca;


import junit.framework.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MainprogramTest {

    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    Console console = new ConsoleStub();
    @Test
    public void testPrintWelcome(){
        System.setOut(new PrintStream(outputStream));
        Mainprogram.printWelcome();
        Assert.assertEquals("WELCOME TO THE BANGALORE PUBLIC LIBRARY",outputStream.toString());
    }
}
