package com.twu28.biblioteca;

public class Display {

    inputoutputinterface inputoutputinterface = new userinput();

    public void print_welcome(){
       inputoutputinterface.println("Welcome To Bangalore Public Library");
   }

    public void print_menu(){
        inputoutputinterface.println("Select an option");
        inputoutputinterface.println("1:View All The Books In Library");
        inputoutputinterface.println("2:Reserve A Book");
        inputoutputinterface.println("3:Check Library Number");
        inputoutputinterface.println("4:Exit");
    }

    public void print_display_books_first_line(){
        inputoutputinterface.println("We Have The Following Books");
    }

    public void display_of_books(BookManager bookManager){
        for(Book book:bookManager.books_display())
            inputoutputinterface.println(book.BookTitle);
    }

    public void reserve_book_first_line(){
        inputoutputinterface.println("Enter the number of the book you want to reserve");
    }

    public Boolean reserve_book(Book book,BookManager bookManager){
        if(bookManager.reserve_book(book))
            return true;
        else
            return false;

    }

    public void check_library_number(){
        inputoutputinterface.println("Please Talk To Your Librarian");
    }

}