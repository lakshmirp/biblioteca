package com.twu28.biblioteca;

import java.util.ArrayList;

public class MovieList {

     private static ArrayList<Movie> movies = new ArrayList<Movie>();

     void addMovie(){

         movies.add(new Movie("First Movie","Director1","1986","5"));
         movies.add(new Movie("Second Movie","Director2","1987","10"));
         movies.add(new Movie("Third Movie","Director3","1988","4"));
         movies.add(new Movie("Fourth Movie","Director4","1989","9"));
         movies.add(new Movie("Fifth Movie","Director5","1990","NA"));
         movies.add(new Movie("Sixth Movie","Director6","1991","3"));
         movies.add(new Movie("Seventh Movie","Director7","1992","8"));
         movies.add(new Movie("Eighth Movie","Director8","1993","2"));
         movies.add(new Movie("Ninth Movie","Director9","1994","7"));
         movies.add(new Movie("Tenth Movie","Director10","1995","NA"));
         movies.add(new Movie("Eleventh Movie","Director11","1996","1"));
         movies.add(new Movie("Twelfth Movie","Director12","1997","6"));
         movies.add(new Movie("Thirteenth Movie","Director13","1998","5"));
         movies.add(new Movie("Fourteenth Movie","Director14","1999","10"));
         movies.add(new Movie("Fifteenth Movie","Director15","2000","NA"));
     }

    public ArrayList<Movie> returnMovieList(){
        return movies;
    }

}
