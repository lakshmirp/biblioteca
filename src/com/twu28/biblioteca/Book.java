package com.twu28.biblioteca;

public class Book {
    private String Title;
    private String Isbn;
    private Boolean issued;

    public Book(String Number,String Title){
        this.Title = Title;
        this.Isbn = Number;
        this.issued = false;
    }

    public String toString(){
        return this.Isbn+"\t"+this.Title;
    }

    public boolean bookExists(String Isbn){
            return this.Isbn.equals(Isbn);
    }
    public Boolean reserve(){
       if(!this.issued){
           this.issued = true;
           return true;
       }
        else
           return false;

    }


}
