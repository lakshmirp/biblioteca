package com.twu28.biblioteca;

import junit.framework.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class DisplayTest {

    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @Test
    public void test_print_welcome(){
        System.setOut(new PrintStream(outputStream));
        Display display = new Display();
        display.print_welcome();
        Assert.assertEquals("Welcome To Bangalore Public Library\n",outputStream.toString());
    }

    @Test
    public void test_print_menu(){
        System.setOut(new PrintStream(outputStream));
        Display display = new Display();
        display.print_menu();
        Assert.assertEquals("Select an option\n1:View All The Books In Library\n2:Reserve A Book\n3:Check Library Number\n4:Exit\n",outputStream.toString());
    }

    @Test
    public void test_display_of_books(){
        System.setOut(new PrintStream(outputStream));
        Display display = new Display();
        display.print_display_books_first_line();
        Assert.assertEquals("We Have The Following Books\n",outputStream.toString());
        Book book1 = new Book(1,"First Book");
        Book book2 = new Book(2,"Second Book");
        Book book3 = new Book(3,"Third Book");
        BookManager bookManager = new BookManager();
        bookManager.addnew(book1);
        bookManager.addnew(book2);
        bookManager.addnew(book3);
        display.display_of_books(bookManager);
        Assert.assertEquals("1:First Book\n2:Second Book\n3:Third Book\n",outputStream.toString());
    }

    @Test
    public void test_movies_display(){
        System.setOut(new PrintStream(outputStream));
        Display display = new Display();
        display.display_movies_first_line();
        Assert.assertEquals("Here Are The List Of Movies\n",outputStream.toString());
        Moviemanager moviemanager = new Moviemanager();
        moviemanager.addmovie();
        display.display_movies(moviemanager);
        Assert.assertEquals(moviemanager.movie_display().toString(),outputStream.toString());
    }

    @Test
    public void test_book_reserve(){
        System.setOut(new PrintStream(outputStream));
        Display display = new Display();
        display.reserve_book_first_line();
        Assert.assertEquals("Enter the number of the book you want to reserve\n",outputStream.toString());

    }

    @Test
    public void test_book_reserve_successful(){
        System.setOut(new PrintStream(outputStream));
        Display display = new Display();
        Book book = new Book(1,"Complete Reference-Java");
        BookManager bookManager = new BookManager();
        bookManager.addnew(book);
        Assert.assertEquals((Object) true,display.reserve_book(book,bookManager));
    }

    @Test
    public void test_book_reserve_unsuccessful(){
        System.setOut(new PrintStream(outputStream));
        Display display = new Display();
        Book book = new Book(1,"Complete Reference-Java");
        BookManager bookManager = new BookManager();
        Assert.assertEquals((Object) false,display.reserve_book(book, bookManager));
    }

    @Test
    public void test_check_library_number(){
        System.setOut(new PrintStream(outputStream));
        Display display = new Display();
        display.check_library_number();
        Assert.assertEquals("Please Talk To Your Librarian\n",outputStream.toString());
    }
}
