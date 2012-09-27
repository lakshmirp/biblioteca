package com.twu28.biblioteca;


import junit.framework.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MainprogramTest {

    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    Mainprogram mainprogram = new Mainprogram();
    Console console = new UserConsole();

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
        mainprogram.setConsole(console);
        System.setOut(new PrintStream(outputStream));
        Mainprogram.initializeOptions();
        Assert.assertEquals(true,Mainprogram.optionMap.containsValue(ExecuteMenuOptions.PrintListOfBooks));
        Assert.assertEquals(true,Mainprogram.optionMap.containsValue(ExecuteMenuOptions.ReserveBook));
        Assert.assertEquals(true,Mainprogram.optionMap.containsValue(ExecuteMenuOptions.PrintListOfMovies));
        Assert.assertEquals(true,Mainprogram.optionMap.containsValue(ExecuteMenuOptions.PrintUserDetails));
        Assert.assertEquals(true,Mainprogram.optionMap.containsValue(ExecuteMenuOptions.OptionToExit));
    }

}
