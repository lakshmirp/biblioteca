package com.twu28.biblioteca;

import java.util.ArrayList;

public class BookList {

    private ArrayList<Book> books = new ArrayList<Book>();

    public void addNew(Book book){
        books.add(book);
    }

    public ArrayList<Book> returnBookList(){
         return books;
    }

    public Boolean reserveBook(String bookIsbn){

        for(Book book:books){
            if(book.getBookUsingBookIsbn(bookIsbn)!=null)
                if (!book.isBookReserved()){
                    book.reserve();
                    return true;
                }
        }
            return false;
    }
}
