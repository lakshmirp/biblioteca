package com.twu28.biblioteca;

public class Book {
    private String bookTitle;
    private String bookIsbn;
    private Boolean issued;

    public Book(String Number,String Title){
        this.bookTitle = Title;
        this.bookIsbn = Number;
        this.issued = false;
    }

    public String displayDetails(){
      return "Book Number: "+this.bookIsbn+" Book Name: "+this.bookTitle;
    }

    public Book getBookUsingBookIsbn(String bookIsbn){
        if(this.bookIsbn == bookIsbn)
            return this;
        else
            return null;
    }
    public void reserve(){
       this.issued = true;
    }
    public Boolean isBookReserved(){
        return this.issued;
    }

}
