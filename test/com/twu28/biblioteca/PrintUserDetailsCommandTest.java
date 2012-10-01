package com.twu28.biblioteca;

import junit.framework.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PrintUserDetailsCommandTest {
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintUserDetailsCommand printUserDetailsCommand = new PrintUserDetailsCommand();

    @Test
    public void testPrintUserDetailsForLegitimateUser(){
        System.setOut(new PrintStream(outputStream));
        UserAccount userAccount = new UserAccount("111-1111","pass1");
        printUserDetailsCommand.username = "111-1111";
        printUserDetailsCommand.password = "pass1";
        printUserDetailsCommand.execute();
        String outputString = "Enter Your UserName\nEnter Your Password\n";
        outputString = outputString + userAccount.toString() + "\n";
        Assert.assertEquals(outputString,outputStream.toString());
        Assert.assertEquals(outputString,outputStream.toString());
    }

    @Test
    public void testPrintMessageForInvalidUserName(){
        System.setOut(new PrintStream(outputStream));
        printUserDetailsCommand.username = "555-1111";
        printUserDetailsCommand.password = "pass1";
        printUserDetailsCommand.execute();
        Assert.assertEquals("Enter Your UserName\nEnter Your Password\nPlease Talk To Your Librarian\n",outputStream.toString());

    }

    @Test
    public void testPrintMessageForInvalidPassword(){
        System.setOut(new PrintStream(outputStream));
        printUserDetailsCommand.username = "111-1111";
        printUserDetailsCommand.password = "xyz";
        printUserDetailsCommand.execute();
        Assert.assertEquals("Enter Your UserName\nEnter Your Password\nPlease Talk To Your Librarian\n",outputStream.toString());

    }

    @Test
    public void testPrintMessageForInvalidUserDetails(){
        System.setOut(new PrintStream(outputStream));
        printUserDetailsCommand.username = "111";
        printUserDetailsCommand.password = "xyz";
        printUserDetailsCommand.execute();
        Assert.assertEquals("Enter Your UserName\nEnter Your Password\nPlease Talk To Your Librarian\n",outputStream.toString());

    }
}
