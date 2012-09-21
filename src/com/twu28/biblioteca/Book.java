package com.twu28.biblioteca;

public class Book {
    String BookTitle;
    int BookNumber;
    Boolean Issued;

    public Book(int Number,String Title){
        this.BookTitle = Title;
        this.BookNumber = Number;
        this.Issued = false;
    }
    public String display_book_title(){
      return "Book Number: "+this.BookNumber+" Book Name: "+this.BookTitle;
    }

    public void reserve_book_if_available(){
       this.Issued = true;
    }
    public Boolean is_book_available(){
        return this.Issued;
    }

}
