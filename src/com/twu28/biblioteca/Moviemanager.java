package com.twu28.biblioteca;

import java.util.ArrayList;

public class Moviemanager {

    private ArrayList<Movie> movies = new ArrayList<Movie>();

    public boolean addmovie(){
        String [] movietitles = {"First Movie","Second Movie","Third Movie","Fourth Movie","Fifth Movie","Sixth Movie","Seventh Movie","Eighth Movie","Ninth Movie","Tenth Movie","Eleventh Movie","Twelfth Movie","Thirteenth Movie","Fourteenth Movie","Fifteenth Movie"};
        String [] directornames = {"Director1","Director2","Director3","Director4","Director5","Director6","Director7","Director8","Director9","Director10","Director11","Director12","Director13","Director14","Director15"};
        int [] movieyears = {1986,1987,1988,1989,1990,1991,1992,1993,1994,1995,1996,1997,1998,1999,2000};
        String [] ratings = {"5","10","4","9","NA","3","8","2","7","NA","1","6","5","10","NA"};

        try{
            for(int i=0;i<15;i++){
                movies.add(new Movie(movietitles[i],movieyears[i],directornames[i],ratings[i]));
            }
            return true;
        }
        catch (Exception e){
            return false;
        }

    }

    public ArrayList<Movie> movie_display(){
        return movies;
    }
}
