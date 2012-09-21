package com.twu28.biblioteca;

import junit.framework.Assert;
import org.junit.Test;

public class BookTest {

    @Test
    public void test_display_book_title() {
        Book book = new Book(1,"Programming With C++");
        Assert.assertEquals("Book Number: 1 Book Name: Programming With C++",book.display_book_title());
    }

    @Test
    public void test_book_not_reserved(){
        Book book = new Book(1,"Complete Reference - Java");
        Assert.assertEquals((Object) false,book.is_book_available());
    }

    @Test
    public void test_reserve_book_successful(){
        Book book = new Book(1,"Book 1");
        book.reserve_book_if_available();
        Assert.assertEquals((Object) true,book.is_book_available());
    }

}
