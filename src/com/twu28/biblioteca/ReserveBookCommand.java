package com.twu28.biblioteca;

public class ReserveBookCommand implements Command {
    UserAccountList userAccountList = new UserAccountList();
    Console console = new UserConsole();
    BookList bookList = new BookList();
    String username = null;
    String password = null;
    String bookIsbn = null;
    @Override
    public void execute() {
        console.println("Enter Your UserName");
        if(username == null)
            username = console.readLine();
        console.println("Enter Your Password");
        if(password == null)
            password = console.readLine();

            if(userAccountList.authenticate(username,password)){
                for(Book book:bookList.returnBookList())
                    console.println(book.toString());
                console.println("Enter The Number Of The Book You Want To Reserve");
                if(bookIsbn == null)
                    bookIsbn = console.readLine();
                if(bookList.reserveBook(bookIsbn))
                    console.println("Thank You!Enjoy The Book");
                else
                    console.println("Sorry!We Dont Have That Book Yet");
            }
            else
                console.println("Incorrect Login Details");


    }
}
