package com.twu28.biblioteca;


import static java.lang.System.exit;

public class ExecuteMenuOptions {

    static Console console = new FakeConsole();
    static BookList bookList = new BookList();


     static Runnable PrintListOfBooks = new Runnable() {

        @Override
        public void run() {
            console.println("We Have The Following Books");
            for(Book book:bookList.returnBookList())
                console.println(book.displayDetails());
        }
    };

    static Runnable PrintListOfMovies = new Runnable() {
        MovieList movieList = new MovieList();

        @Override
        public void run() {
            movieList.addMovie();
            console.println(movieList.returnMovieList().toString());
        }
    };

    static Runnable ReserveBook = new Runnable() {
        UserAccountList userAccountList = new UserAccountList();
        @Override
        public void run() {
            console.println("Enter Your UserName");
            String userName = console.readLine();
            console.println("Enter Your Password");
            String passWord = console.readLine();

            if(userAccountList.authenticateUser(userName,passWord)){
                for(Book book:bookList.returnBookList())
                    console.println(book.displayDetails());
                console.println("Enter The Number Of The Book You Want To Reserve");
                String bookIsbn = console.readLine();
                if(bookList.reserveBook(bookIsbn))
                    console.println("Thank You!Enjoy The Book");
                else
                    console.println("Sorry!We Dont Have That Book Yet");
            }
            else
                console.println("Please Login To Avail This Facility");

        }
    };

    static Runnable PrintUserDetails = new Runnable() {
        UserAccountList userAccountList = new UserAccountList();
        UserAccount userAccount;
        @Override
        public void run() {
            console.println("Enter Your UserName");
            String userName = console.readLine();
            console.println("Enter Your Password");
            String passWord = console.readLine();
            userAccount = new UserAccount(userName,passWord);
            if(userAccountList.authenticateUser(userName,passWord))
                 console.println("Your Name :"+userAccount.getName()+"\nYour Email Id :"+userAccount.getEmailId()+"\nYour Phone Number :"+userAccount.getPhoneNumber());
             else
                 console.println("Please Talk To Your Librarian");
        }
    };

    static Runnable OptionToExit = new Runnable() {
        @Override
        public void run() {
            exit(0);
        }
    };

    public void setConsole(Console console){
        this.console = console;
    }

}
