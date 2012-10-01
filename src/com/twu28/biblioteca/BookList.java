package com.twu28.biblioteca;

import java.util.ArrayList;

public class BookList {

    private ArrayList<Book> books = new ArrayList<Book>();
    BookList(){
        addNew(new Book("123","Book1"));
        addNew(new Book("456","Book2"));
        addNew(new Book("789","Book3"));
        addNew(new Book("110","Book4"));
    }
    public void addNew(Book book){
        books.add(book);
    }

    public ArrayList<Book> returnBookList(){
         return books;
    }

    public Boolean reserveBook(String bookIsbn){

        for(Book book:books){
            if(book.bookExists(bookIsbn))
                return book.reserve();

        }
        return false;
    }
}
