package com.twu28.biblioteca;


import junit.framework.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ReserveBookCommandTest {
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    ReserveBookCommand reserveBookCommand = new ReserveBookCommand();
    BookList bookList = new BookList();


    @Test
    public void testSuccessfulBookReservation(){
        System.setOut(new PrintStream(outputStream));
        reserveBookCommand.username = "111-1111";
        reserveBookCommand.password = "pass1";
        reserveBookCommand.bookIsbn = "123";
        reserveBookCommand.execute();
        String outputString = "Enter Your UserName\nEnter Your Password\n";
        for(Book book:bookList.returnBookList())
            outputString = outputString + book.toString()+"\n";
        outputString = outputString + "Enter The Number Of The Book You Want To Reserve\nThank You!Enjoy The Book\n";
        Assert.assertEquals(outputString,outputStream.toString());
    }

    @Test
    public void testReserveBookForInvalidBookIsbn(){
        System.setOut(new PrintStream(outputStream));
        reserveBookCommand.username = "111-1111";
        reserveBookCommand.password = "pass1";
        reserveBookCommand.bookIsbn = "1";
        reserveBookCommand.execute();
        String outputString = "Enter Your UserName\nEnter Your Password\n";
        for(Book book:bookList.returnBookList())
            outputString = outputString + book.toString()+"\n";
        outputString = outputString + "Enter The Number Of The Book You Want To Reserve\nSorry!We Dont Have That Book Yet\n";
        Assert.assertEquals(outputString,outputStream.toString());
    }

    @Test
    public void testReserveBookForInvalidUsername(){
        System.setOut(new PrintStream(outputStream));
        reserveBookCommand.username = "111";
        reserveBookCommand.password = "pass1";
        reserveBookCommand.bookIsbn = "123";
        reserveBookCommand.execute();
        String outputString = "Enter Your UserName\nEnter Your Password\n";
        outputString = outputString + "Incorrect Login Details\n";
        Assert.assertEquals(outputString,outputStream.toString());
    }

    @Test
    public void testReserveBookForInvalidPassword(){
        System.setOut(new PrintStream(outputStream));
        reserveBookCommand.username = "111-1111";
        reserveBookCommand.password = "xyz";
        reserveBookCommand.bookIsbn = "123";
        reserveBookCommand.execute();
        String outputString = "Enter Your UserName\nEnter Your Password\n";
        outputString = outputString + "Incorrect Login Details\n";
        Assert.assertEquals(outputString,outputStream.toString());
    }

    @Test
    public void testReserveBookForInvalidUserDetails(){
        System.setOut(new PrintStream(outputStream));
        reserveBookCommand.username = "111";
        reserveBookCommand.password = "abc";
        reserveBookCommand.bookIsbn = "123";
        reserveBookCommand.execute();
        String outputString = "Enter Your UserName\nEnter Your Password\n";
        outputString = outputString + "Incorrect Login Details\n";
        Assert.assertEquals(outputString,outputStream.toString());
    }
}
