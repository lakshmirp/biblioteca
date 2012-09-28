package com.twu28.biblioteca;


import static java.lang.System.exit;

public class ExecuteMenuOptions {

    static Console console = new FakeConsole();
    static BookList bookList = new BookList();


     static Runnable PrintListOfBooks = new Runnable() {

        @Override
        public void run() {
            console.println("We Have The Following Books");
            for(Book book:bookList.returnBookList())
                console.println(book.displayDetails());
        }
    };

    static Runnable PrintListOfMovies = new Runnable() {
        MovieList movieList = new MovieList();

        @Override
        public void run() {
            movieList.addMovie();
            console.println(movieList.returnMovieList().toString());
        }
    };



    public void setConsole(Console console){
        this.console = console;
    }

}
