package com.twu28.biblioteca;


import junit.framework.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;

public class MainprogramTest {

    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    Mainprogram mainprogram = new Mainprogram();
    Console console = new SystemConsole();
    static HashMap<String,Command> options = new HashMap<String,Command>();

    @Test
    public void testPrintWelcome(){
        mainprogram.setConsole(console);
        System.setOut(new PrintStream(outputStream));
        Mainprogram.printWelcome();
        Assert.assertEquals("WELCOME TO THE BANGALORE PUBLIC LIBRARY\n",outputStream.toString());
    }

    @Test
    public void testPrintMenu(){
        mainprogram.setConsole(console);
        System.setOut(new PrintStream(outputStream));
        Mainprogram.printMenu();
        Assert.assertEquals("Select An Option\n1:View List Of Books\n2:Reserve A Book\n3:View List Of Movies\n4:Check Library Number\n5:Exit\n",outputStream.toString());
    }

    @Test
    public void testInitializeOptions(){
        options.put("1",new PrintBookListCommand());
        options.put("2",new ReserveBookCommand());
        options.put("3",new PrintMovieListCommand());
        options.put("4",new PrintUserDetailsCommand());
        options.put("5",new ExitCommand());
        mainprogram.setConsole(console);
        System.setOut(new PrintStream(outputStream));
        Mainprogram.initializeOptions();
        Assert.assertEquals(options.keySet(),Mainprogram.optionMap.keySet());
    }

}
