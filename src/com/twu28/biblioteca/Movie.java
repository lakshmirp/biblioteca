package com.twu28.biblioteca;

public class Movie {

    String title;
    String director;
    String year;
    String rating;


    public Movie(String title1, String director1, String year1, String rating1) {
        this.title = title1;
        this.director = director1;
        this.year = year1;
        this.rating = rating1;

    }
    public String toString(){
        return this.title+"\t\t"+this.director+"\t\t"+this.year+"\t\t"+this.rating+"\n";
    }
    @Override
    public boolean equals(Object object){

        if(this == object)
            return true;
        if(object == null || object.getClass() != this.getClass())
            return false;
        Movie movie = (Movie)object;
        return movie.title.equals(this.title) && movie.director.equals(this.director) && movie.year.equals(this.year) && movie.rating.equals(this.rating) ;
    }
}
