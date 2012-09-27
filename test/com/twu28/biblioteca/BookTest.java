package com.twu28.biblioteca;

import junit.framework.Assert;
import org.junit.Test;

public class BookTest {

    @Test
    public void testDisplayDetails() {
        Book book = new Book("1","Programming With C++");
        Assert.assertEquals("Book Number: 1 Book Name: Programming With C++",book.displayDetails());
    }

    @Test
    public void testIsBookAvailableForReservation(){
        Book book = new Book("1","Complete Reference - Java");
        Assert.assertEquals((Object) false,book.isBookReserved());
    }

    @Test
    public void testReserveBook(){
        Book book = new Book("1","Book 1");
        book.reserve();
        Assert.assertEquals((Object) true,book.isBookReserved());
    }

}
