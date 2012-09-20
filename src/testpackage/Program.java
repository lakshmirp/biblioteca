package testpackage;

import java.util.HashSet;

public class Program {

    static HashSet<Book> books = new HashSet<Book>();
    static HashSet<Customer> customers = new HashSet<Customer>();
    public static void main(String[] args) {

        print_welcome();
        print_menu();

    }


    public static void print_menu() {
        System.out.println("*                  Choose an option from the menu below                     *\n");
        System.out.println("*                  1-> View The Books Catalog                               *");
        System.out.println("*                  2-> Reserve A book                                       *");
        System.out.println("*                  3-> Check Your Library Number                            *");
        System.out.println("*                  4-> Exit                                                 *\n");
    }

    public static String print_welcome() {
        return "Welcome To The Bangalore Public Library";
    }
}
