package com.twu28.biblioteca;

public class PrintBookListCommand implements Command {

    Console console = new SystemConsole();
    BookList bookList = new BookList();

    @Override
    public void execute() {
        console.println("We Have The Following Books");
        console.println("Book Isbn\tBook Name");
        for(Book book:bookList.returnBookList())
            console.println(book.toString());
    }
}
