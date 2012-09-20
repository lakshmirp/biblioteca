package testpackage;

import java.util.HashSet;

public class Program {

    static HashSet<Book> books = new HashSet<Book>();
    static HashSet<Customer> customers = new HashSet<Customer>();
    public static void main(String[] args) {

        print_welcome();
        print_menu();

    }


    public static String print_menu() {
        return "1->View The List Of Books\n2->Reserve Book\n3->Check Library Number\n4:Exit";


    }

    public static String print_welcome() {
        return "Welcome To The Bangalore Public Library";
    }
}
