package com.twu28.biblioteca;

import junit.framework.Assert;
import org.junit.Test;

public class movieTest {

    @Test
    public void test_display_movie_details(){
        Movie movie = new Movie("Sholay",1975,"Ramesh Sippy","N/A");
        Assert.assertEquals("Sholay\t1975\tRamesh Sippy\tN/A",movie.display_movie_details());
    }
}
