package com.twu28.biblioteca;

import java.util.ArrayList;

public class MovieList {

    private ArrayList<String> movies = new ArrayList<String>();

     void addMovie(){
        String [] movietitles = {"First Movie","Second Movie","Third Movie","Fourth Movie","Fifth Movie","Sixth Movie","Seventh Movie","Eighth Movie","Ninth Movie","Tenth Movie","Eleventh Movie","Twelfth Movie","Thirteenth Movie","Fourteenth Movie","Fifteenth Movie"};
        String [] directornames = {"Director1","Director2","Director3","Director4","Director5","Director6","Director7","Director8","Director9","Director10","Director11","Director12","Director13","Director14","Director15"};
        String [] movieyears = {"1986","1987","1988","1989","1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000"};
        String [] ratings = {"5","10","4","9","NA","3","8","2","7","NA","1","6","5","10","NA"};

        for(int i=0;i<15;i++)
                movies.add(movietitles[i]+"\t"+movieyears[i]+"\t"+directornames[i]+"\t"+ratings[i]+"\n");


    }

    public ArrayList<String> returnMovieList(){
        return movies;
    }
}
