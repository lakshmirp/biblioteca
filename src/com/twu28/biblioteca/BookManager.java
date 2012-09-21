package com.twu28.biblioteca;

import java.util.ArrayList;

public class BookManager {

    private ArrayList<Book> books = new ArrayList<Book>();

    public Boolean addnew(Book book){
        if(books.contains(book)){
            return false;
        }
        else{
            books.add(book);
            return true;
        }
    }

    public ArrayList<Book> books_display(){
         return books;
    }

    public Boolean is_book_in_library(Book book){
        if(books.contains(book))
            return true;
        else
            return false;
    }

    public Boolean reserve_book(Book book){
        if (this.is_book_in_library(book)&&!book.Issued){
                book.reserve_book_if_available();
                return true;
        }
        else
            return false;
    }
}
