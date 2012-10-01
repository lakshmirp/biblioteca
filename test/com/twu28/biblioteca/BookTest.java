package com.twu28.biblioteca;

import junit.framework.Assert;
import org.junit.Test;

public class BookTest {

    @Test
    public void testDisplayDetails() {
        Book book = new Book("1","Programming With C++");
        Assert.assertEquals("1\tProgramming With C++",book.toString());
    }

    @Test
    public void testBookExists(){
        Book book = new Book("1","First Book");
        Assert.assertEquals(true,book.bookExists("1"));
    }

    @Test
    public void testBookDoesNotExist(){
        Book book = new Book("1","Book1");
        Assert.assertEquals(false,book.bookExists("2"));
    }
    @Test
    public void testSuccessfulReserveBook(){
        Book book = new Book("1","Book 1");
        Assert.assertEquals((Object) true,book.reserve());
    }

    @Test
    public void testUnsuccessfulReserveBook(){
        Book book = new Book("1","Book");
        book.reserve();
        Assert.assertEquals((Object) false,book.reserve());
    }

}
