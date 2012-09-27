package com.twu28.biblioteca;

import junit.framework.Assert;
import org.junit.Test;

public class MovieListTest {

    @Test
    public void testAddMovie(){
        String movie = "First Movie"+"\t"+"Director1"+"\t"+"1986"+"\t"+"5";
        MovieList movieList = new MovieList();
        movieList.addMovie();
        Assert.assertEquals(true,movieList.returnMovieList().contains(movie));
    }

    @Test
    public void testReturningMovieDetails(){
        String movie = "First Movie"+"\t"+"Director1"+"\t"+"1986"+"\t"+"5";
        MovieList movieList = new MovieList();
        movieList.addMovie();
        Assert.assertEquals(movie,movieList.returnMovieList().get(0));
    }
}
