package com.twu28.biblioteca;

public class Movie {

    String movietitle;
    int movieyear;
    String moviedirector;
    String movierating;

    public Movie(String title,int year,String director,String rating){
        this.movietitle = title;
        this.movieyear = year;
        this.moviedirector = director;
        this.movierating = rating;
    }

    public String display_movie_details(){
        return movietitle+"\t"+movieyear+"\t"+moviedirector+"\t"+movierating;
    }

}
