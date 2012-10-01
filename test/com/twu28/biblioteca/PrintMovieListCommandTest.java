package com.twu28.biblioteca;


import junit.framework.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PrintMovieListCommandTest {
    PrintMovieListCommand printMovieListCommand = new PrintMovieListCommand();
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    MovieList movieList = new MovieList();
    @Test
    public void testPrintMovieList(){
        String outputString = "Movie Name\t\tDirector\t\tYear\t\tRating\n";
        System.setOut(new PrintStream(outputStream));
        printMovieListCommand.execute();
        for(Movie movie:movieList.returnMovieList())
            outputString = outputString + movie.toString() + "\n";
        Assert.assertEquals(outputString, outputStream.toString());

    }
}
