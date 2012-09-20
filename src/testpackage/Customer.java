package testpackage;

import java.util.HashSet;

public class Customer {
    String Library_Number;
    HashSet<Book> customer_books = new HashSet<Book>();

    public static void check_library_number(Customer customer){
        customer.Library_Number = "1234";
        System.out.print(customer.Library_Number);
    }

    public static Boolean add_book_if_available(Customer customer, Book book){
            Boolean book_issued=Book.reserve_book_if_available(book);
            customer.customer_books.add(book);
        return book_issued;
    }

    public static void book_not_available(){
            System.out.print("Sorry!We don't have that book yet.");
    }
}
