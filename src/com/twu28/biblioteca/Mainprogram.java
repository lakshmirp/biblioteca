package com.twu28.biblioteca;

public class Mainprogram {

    public static void main(String[] args) {
        inputoutputinterface inputoutputinterface = new userinput();
        Display display = new Display();
        Book book1 = new Book(1,"First Book");
        Book book2 = new Book(2,"Second Book");
        Book book3 = new Book(3,"Third Book");
        BookManager bookManager = new BookManager();
        bookManager.addnew(book1);
        bookManager.addnew(book2);
        bookManager.addnew(book3);

        display.print_welcome();
        display.print_menu();
        String input = inputoutputinterface.readLine();

        if(input.equals(1)){
            display.print_display_books_first_line();
            display.display_of_books(bookManager);
        }

        else if(input.equals(2)){
            display.display_of_books(bookManager);
            display.reserve_book_first_line();
            String book_to_reserved = inputoutputinterface.readLine();
            Book book = new Book(book_to_reserved);
            if(display.reserve_book(book,bookManager))
                inputoutputinterface.println("Thank You!Enjoy The Book");
            else
                inputoutputinterface.println("Sorry!We Dont Have That Book Yet");
        }

        else if(input==3){

        }
    }
}
