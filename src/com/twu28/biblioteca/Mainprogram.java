package com.twu28.biblioteca;

import java.util.HashMap;

public class Mainprogram {

    static BookList bookList = new BookList();
    static Console console = new SystemConsole();
    static HashMap<String,Command> optionMap = new HashMap<String,Command>();


    public static void main(String[] args) {
        bookList.addNew(new Book("1","First Book"));
        bookList.addNew(new Book("2", "Second Book"));
        bookList.addNew(new Book("3", "Third Book"));
        while(true){
        printWelcome();

        printMenu();

        String option = console.readLine();
        initializeOptions();
        optionMap.get(option).execute();
        }
    }

    public static void initializeOptions() {
        optionMap.put("1",new PrintBookListCommand());
        optionMap.put("2",new ReserveBookCommand());
        optionMap.put("3",new PrintMovieListCommand());
        optionMap.put("4",new PrintUserDetailsCommand());
        optionMap.put("5",new ExitCommand());
    }

    public static void printWelcome() {
        console.println("WELCOME TO THE BANGALORE PUBLIC LIBRARY");
    }

    public static void printMenu() {

        console.println("Select An Option");
        console.println("1:View List Of Books");
        console.println("2:Reserve A Book");
        console.println("3:View List Of Movies");
        console.println("4:Check Library Number");
        console.println("5:Exit");
    }

    public static void setConsole(Console console){
        Mainprogram.console = console;
    }

}
