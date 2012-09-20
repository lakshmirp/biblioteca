package testpackage;

public class Book {
    String BookTitle;
    Boolean Issued;

    public static void display_book_title(Book book){
      System.out.print(book.BookTitle);
    }

    public static Boolean reserve_book_if_available(Book book){
        book.Issued = true;
        return book.Issued;
    }
    public static Boolean book_unavailable(){
        return false;
    }

}
