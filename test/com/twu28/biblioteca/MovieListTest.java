package com.twu28.biblioteca;

import junit.framework.Assert;
import org.junit.Test;

public class MovieListTest {

    @Test
    public void testAddMovieSuccessful(){
        Movie movie = new Movie("First Movie","Director1","1986","5");
        MovieList movieList = new MovieList();
        movieList.addMovie();
        Assert.assertEquals(true,movieList.returnMovieList().contains(movie));
    }

    @Test
    public void testAddMovieUnsuccessful(){
        Movie movie = new Movie("Last Movie","Director25","1949","5");
        MovieList movieList = new MovieList();
        Assert.assertEquals(false,movieList.returnMovieList().contains(movie));
    }

    @Test
    public void testReturnMovieDetails(){
        Movie movie = new Movie("First Movie","Director1","1986","5");
        MovieList movieList = new MovieList();
        movieList.addMovie();
        Movie movie2 = movieList.returnMovieList().get(0);
        Assert.assertEquals(movie,movie2);
    }
}
