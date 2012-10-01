package com.twu28.biblioteca;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class BookListTest {

    @Test
    public void testAddBookSuccessful(){
        Book book = new Book("1","Book 1");
        BookList bookList = new BookList();
        bookList.addNew(book);
        assertEquals((Object) true, bookList.returnBookList().contains(book));
    }

    @Test
    public void testBookNotPresentInLibrary(){
        BookList bookList = new BookList();
        Book book = new Book("1","Let Us C");
        assertEquals((Object) false, bookList.returnBookList().contains(book));
    }

    @Test
    public void testSuccessfulBookReservation(){
        BookList bookList = new BookList();
        Book book = new Book("1","Book2");
        bookList.addNew(book);
        assertEquals((Object) true,bookList.reserveBook("1"));
    }

    @Test
    public void testReserveBookWhenBookNotPresent(){
        BookList bookList = new BookList();
        assertEquals((Object) false, bookList.reserveBook("1"));
    }

    @Test
    public void testReserveBookWhichIsAlreadyReserved(){
        BookList bookList = new BookList();
        Book book = new Book("1","Book");
        bookList.addNew(book);
        bookList.reserveBook("1");
        assertEquals((Object) false, bookList.reserveBook("1"));
    }
}
