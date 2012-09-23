package com.twu28.biblioteca;

import junit.framework.Assert;
import org.junit.Test;

public class MoviemanagerTest {

    @Test
    public void test_add_all_movies(){
        Moviemanager moviemanager = new Moviemanager();
        Assert.assertEquals(true,moviemanager.addmovie());
    }

    @Test
    public void test_movie_display(){
        Movie movie = new Movie("First Movie",1986,"Director1","5");
        Moviemanager moviemanager = new Moviemanager();
        moviemanager.addmovie();
        Assert.assertEquals(movie.display_movie_details(),moviemanager.movie_display().get(0).display_movie_details());
    }
}
