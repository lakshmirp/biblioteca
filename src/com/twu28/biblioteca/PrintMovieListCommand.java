package com.twu28.biblioteca;


public class PrintMovieListCommand implements Command {
    Console console = new SystemConsole();
    MovieList movieList = new MovieList();
    @Override
    public void execute() {
        movieList.addMovie();
        console.println("Movie Name\t\tDirector\t\tYear\t\tRating");
        for(Movie movie:movieList.returnMovieList())
             console.println(movie.toString());
    }
}
