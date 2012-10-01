package com.twu28.biblioteca;


import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class MovieTest {

    static class SampleMovie {
        static Movie movie1 = new Movie("First Movie","Director1","1986","5");
        static Movie movie2 = new Movie("First Movie","Director1","1986","5");
        static Movie movie3 = new Movie("First Movie","Director1","1986","5");
        static Movie movie4 = new Movie("Fourth Movie","Director4","1989","9");
    }
    @Test

    public void testEqualToSelf() {

        assertTrue("Class equal to itself.", SampleMovie.movie1.equals(SampleMovie.movie1));
    }


    @Test
    public void testIncompatibleTypeIsFalse() {
        assertFalse("Passing incompatible object to equals should return false",SampleMovie.movie1.equals("string"));
    }


    @Test
    public void testNullReferenceIsFalse() {
        assertFalse("Passing null to equals should return false", SampleMovie.movie1.equals(null));
    }


    @Test
    public void testEqualsForSymmetric() {

        assertTrue("Symmetric test", SampleMovie.movie1.equals(SampleMovie.movie2));
        assertTrue("Symmetric test ", SampleMovie.movie2.equals(SampleMovie.movie1));

    }


    @Test
    public void testEqualsForTransitive() {

        assertTrue("Transitive test ",  SampleMovie.movie1.equals(SampleMovie.movie2));
        assertTrue("Transitive test ", SampleMovie.movie2.equals(SampleMovie.movie3));
        assertTrue("Transitive test ",  SampleMovie.movie1.equals(SampleMovie.movie3));
    }


    @Test
    public void testEqualsForConsistency() {

        assertTrue("Consistent test ", SampleMovie.movie1.equals(SampleMovie.movie2));
        assertTrue("Consistent test ",SampleMovie.movie1.equals(SampleMovie.movie2));
        assertTrue("Consistent test ", SampleMovie.movie1.equals(SampleMovie.movie2));
        assertFalse(SampleMovie.movie4.equals(SampleMovie.movie1));
        assertFalse(SampleMovie.movie4.equals(SampleMovie.movie1));
        assertFalse(SampleMovie.movie4.equals(SampleMovie.movie1));

    }
}
