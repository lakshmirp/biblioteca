package com.twu28.biblioteca;

public class Display {

   public void print_welcome(){
       System.out.print("Welcome To Bangalore Public Library");
   }

    public void print_menu(){
        System.out.println("Select an option");
        System.out.println("1:View All The Books In Library");
        System.out.println("2:Reserve A Book");
        System.out.println("3:Check Library Number");
        System.out.println("4:Exit");
    }

    public void print_display_books_first_line(){
        System.out.println("We Have The Following Books");
    }

    public void display_of_books(BookManager bookManager){
        for(Book book:bookManager.books_display())
            System.out.println(book.BookTitle);
    }

    public void reserve_book_first_line(){
        System.out.print("Enter the number of the book you want to reserve");
    }

    public void reserve_book(Book book,BookManager bookManager){
        if(bookManager.reserve_book(book))
            System.out.print("Thank You!Enjoy The Book");
        else
            System.out.print("Sorry!We Dont Have That Book Yet");

    }

    public void check_library_number(){
        System.out.print("Please Talk To Your Librarian");
    }
}
