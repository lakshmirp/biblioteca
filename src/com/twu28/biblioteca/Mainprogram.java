package com.twu28.biblioteca;

import static java.lang.System.exit;

public class Mainprogram {

    inputoutputinterface inputoutputinterface = new userinput();
    Display display = new Display();
    Book book1 = new Book(1,"First Book");
    Book book2 = new Book(2,"Second Book");
    Book book3 = new Book(3,"Third Book");
    BookManager bookManager = new BookManager();

    public void main(String[] args) {
        bookManager.addnew(book1);
        bookManager.addnew(book2);
        bookManager.addnew(book3);

        display.print_welcome();
        display.print_menu();
        executelogic();

    }

    public void executelogic() {
        int choice = Integer.parseInt(inputoutputinterface.getoption());
        if(choice==1){
            display.print_display_books_first_line();
            display.display_of_books(bookManager);
        }

        else if(choice==2){
            display.display_of_books(bookManager);
            display.reserve_book_first_line();
            String book_to_reserved = inputoutputinterface.readLine();
            Book book = new Book(book_to_reserved);
            if(display.reserve_book(book,bookManager))
                inputoutputinterface.println("Thank You!Enjoy The Book");
            else
                inputoutputinterface.println("Sorry!We Dont Have That Book Yet");
        }

        else if(choice==3){
            display.check_library_number();
        }
        else
            exit(0);
    }

    public void setInputoutputinterface(inputoutputinterface inputoutputinterface){
        this.inputoutputinterface = inputoutputinterface;
    }
}
