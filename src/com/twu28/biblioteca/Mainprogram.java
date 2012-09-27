package com.twu28.biblioteca;

import java.util.HashMap;

public class Mainprogram {

    static BookList bookList = new BookList();
    static Console console = new ConsoleStub();
    static HashMap<String,Runnable> optionMap = new HashMap<String, Runnable>();

    public static void main(String[] args) {
        bookList.addNew(new Book("1","First Book"));
        bookList.addNew(new Book("2", "Second Book"));
        bookList.addNew(new Book("3", "Third Book"));

        printWelcome();
        printMenu();

        String option = console.readLine();
        initializeOptions();
        Runnable task = optionMap.get(option);
        if(task!=null)
            task.run();
        else
            console.println("Wrong input");

    }

    public static void initializeOptions() {
        optionMap.put("1",ExecuteMenuOptions.PrintListOfBooks);
        optionMap.put("2",ExecuteMenuOptions.ReserveBook);
        optionMap.put("3",ExecuteMenuOptions.PrintListOfMovies);
        optionMap.put("4",ExecuteMenuOptions.PrintUserDetails);
        optionMap.put("5",ExecuteMenuOptions.OptionToExit);
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



}
