package com.twu28.biblioteca;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class BookManagerTest {

    @Test
    public void test_add_book(){
        Book book = new Book(1,"Book 1");
        BookManager bookManager = new BookManager();
        assertEquals((Object) true, bookManager.addnew(book));
    }

    @Test
    public void test_books_display(){
        BookManager bookManager = new BookManager();
        Book book1 = new Book(1,"First Book In Library");
        Book book2 = new Book(2,"Second Book In Library");
        Book book3 = new Book(3,"Third Book In Library");
        bookManager.addnew(book1);
        bookManager.addnew(book2);
        bookManager.addnew(book3);
        assertEquals(book1, bookManager.books_display().get(0));
        assertEquals(book2, bookManager.books_display().get(1));
        assertEquals(book3, bookManager.books_display().get(2));
    }

    @Test
    public void test_is_book_in_library(){
        BookManager bookManager = new BookManager();
        Book book = new Book(1,"The Book");
        bookManager.addnew(book);
        assertEquals((Object) true, bookManager.is_book_in_library(book));
    }

    @Test
    public void test_book_not_in_library(){
        BookManager bookManager = new BookManager();
        Book book = new Book(1,"Let Us C");
        assertEquals((Object) false, bookManager.is_book_in_library(book));
    }

    @Test
    public void test_reserve_book_successfully(){
        BookManager bookManager = new BookManager();
        Book book = new Book(1,"Book2");
        bookManager.addnew(book);
        assertEquals((Object) true, bookManager.reserve_book(book));
    }

    @Test
    public void test_reserve_book_when_book_not_present(){
        BookManager bookManager = new BookManager();
        Book book = new Book(1,"Book2");
        assertEquals((Object) false, bookManager.reserve_book(book));
    }

    @Test
    public void test_reserve_book_which_is_already_reserved(){
        BookManager bookManager = new BookManager();
        Book book = new Book(1,"Book");
        bookManager.reserve_book(book);
        assertEquals((Object) false, bookManager.reserve_book(book));
    }
}
