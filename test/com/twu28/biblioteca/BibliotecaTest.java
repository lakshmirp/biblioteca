package com.twu28.biblioteca;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static junit.framework.Assert.*;

public class BibliotecaTest {

    static ByteArrayOutputStream outputStream;                        //to store the output printed on the console

     @Test
     public void testWelcome(){                                     //to test the print_welcome() function
        Biblioteca.main(new String[]{});
        System.setOut(new PrintStream(outputStream));
        assertEquals("WELCOME TO BANGALORE PUBLIC LIBRARY\n", outputStream.toString());
     }

     @Test
     public void testMenu(){                                          //to test the print_menu() function
         Biblioteca.main(new String[]{});
         System.setOut(new PrintStream(outputStream));
         assertEquals("Choose an option from the menu below\n\n1-> View The Books Catalog\n2-> Reserve A book\n3-> Check Your Library Number\n4-> Exit\n\nProvide Your Choice:\n", outputStream.toString());
     }

    @Test
    public void testBookList(){                                       //to test the print_book_list() function
        Biblioteca.main(new String[]{});
        System.setOut(new PrintStream(outputStream));
        assertEquals("1 : Programming Using C++\n2 : The C Programming Language\n3 : Let Us C\n4 : The Complete Reference - Java\n", outputStream.toString());

    }

    @Test
    public void testBookAvailable(){                                  //to test the book_reserve() function for available books
        Biblioteca.main(new String[]{});
        System.setOut(new PrintStream(outputStream));
        assertEquals("\nThank you! Enjoy the book.", outputStream.toString());

    }

    @Test
    public void testBookNotAvailable(){                               //to test the book_reserve() function for unavailable books
        Biblioteca.main(new String[]{});
        System.setOut(new PrintStream(outputStream));
        assertEquals("\nSorry! We dont have that book yet.", outputStream.toString());

    }

    @Test
    public void testLibraryNumber(){                                  //to test the check_library_number() function
        Biblioteca.main(new String[]{});
        System.setOut(new PrintStream(outputStream));
        assertEquals("Please Talk To Your Librarian.Thank You.", outputStream.toString());
    }

}
