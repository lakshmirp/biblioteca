package com.twu28.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Biblioteca {

    public static void main(String[] args) {

        while(true){

        int input = 0;
        print_welcome();                                                       //prints the welcome line
        print_menu();                                                          //prints the menu
        try{
            InputStreamReader inputstream = new InputStreamReader(System.in);
            BufferedReader bufferreader = new BufferedReader(inputstream);
            String value = bufferreader.readLine();
            input = Integer.parseInt(value);
            System.out.println("\nYou Have Entered : " + input);

        }
        catch(Exception e){
            System.out.println("Please enter only integer values");
        }
        if(input==1)
            print_book_list();                                                 //displays the list of books available

        else if(input==2)
            book_reserve();                                                    //reserves the available book

        else if(input==3)
            check_library_number();                                            //allows to check library number
        else{
            System.out.println("Incorrect Input");
        }

        }

    }


    private static void print_welcome() {
        System.out.println("\n-----------------WELCOME TO BANGALORE PUBLIC LIBRARY-----------------------");
    }

    private static void print_menu() {
        System.out.println("*                  Choose an option from the menu below                     *\n");
        System.out.println("*                  1-> View The Books Catalog                               *");
        System.out.println("*                  2-> Reserve A book                                       *");
        System.out.println("*                  3-> Check Your Library Number                            *");
        System.out.println("*                  4-> Exit                                                 *\n");
        System.out.println("*                  Provide Your Choice:                                     *");

    }

    private static void print_book_list() {
        System.out.println("1 : Programming Using C++");
        System.out.println("2 : The C Programming Language");
        System.out.println("3 : Let Us C");
        System.out.println("4 : The Complete Reference - Java");
    }

    private static void book_reserve() {
        System.out.println("Select the book you want to reserve by providing its number");
        int booktobereserved = 0;
        try {
            InputStreamReader inputstream = new InputStreamReader(System.in);
            BufferedReader bufferreader = new BufferedReader(inputstream);
            booktobereserved = Integer.parseInt(bufferreader.readLine());
        } catch (IOException e) {
            System.out.println("Invalid Input");  //To change body of catch statement use File | Settings | File Templates.
        }

        if(booktobereserved>0 && booktobereserved<5) {
            System.out.println("\nThank you! Enjoy the book.");
        }
        else{
            System.out.println("\nSorry! We dont have that book yet.");
        }
    }
    private static void check_library_number() {
        System.out.println("Please Talk To Your Librarian.Thank You.");
    }

}
