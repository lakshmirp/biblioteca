package com.twu28.biblioteca;


import junit.framework.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ExecuteMenuOptionsTest {

    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    ExecuteMenuOptions executeMenuOptions = new ExecuteMenuOptions();
    @Test

    public void testPrintListOfBooks(){
        executeMenuOptions.setConsole(new UserConsole());
        System.setOut(new PrintStream(outputStream));
        BookList bookList = new BookList();
        bookList.addNew(new Book("1", "Book1"));
        ExecuteMenuOptions.PrintListOfBooks.run();
        Assert.assertEquals("We Have The Following Books\n", outputStream.toString());
        Assert.assertEquals(true,outputStream.toString().contains("Book Number: 1 Book Name: Book1"));

    }

    @Test
    public void testPrintListOfMovies(){
        executeMenuOptions.setConsole(new UserConsole());
        System.setOut(new PrintStream(outputStream));
        MovieList movieList = new MovieList();
        movieList.addMovie();
        ExecuteMenuOptions.PrintListOfMovies.run();
        Assert.assertEquals(movieList.returnMovieList()+"\n",outputStream.toString());
    }


}
