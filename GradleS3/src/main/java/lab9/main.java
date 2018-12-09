package lab9;
import java.util.ArrayList;
import java.util.Scanner;

public class main{
public static void main(String[] args) {
    DB db=new DB();
    System.out.println("Wybierz opcję:");
    System.out.println("1. Wyszukaj po numerze ISBN");
    System.out.println("2. Wyszukaj po nazwisku autora");
    System.out.println("3. Dodaj książkę");
    Scanner s = new Scanner(System.in);
    String kod = s.nextLine();
    switch (kod){
        case "1":
            System.out.println("Podaj kod ISBN:");
            String isbn = s.nextLine();
            ArrayList<Book> list = db.searchByIsbn(isbn);
            Book book = list.get(0);
            System.out.println(book.getAll());
            break;
        case "2":
            System.out.println("Podaj autora:");
            String author = s.nextLine();
            list = db.searchByAuthor(author);
//            for (Book book2 : list) {
//                System.out.println(book2.getAll());
//            }
            book = list.get(0);
            System.out.println(book.getAll());
            break;
        case "3":
            System.out.println("Podaj kod ISBN:");
            isbn = s.nextLine();
            System.out.println("Podaj tytuł:");
            String title = s.nextLine();
            System.out.println("Podaj autora:");
            author = s.nextLine();
            System.out.println("Podaj rok:");
            int year = Integer.parseInt(s.nextLine());
            Book b = new Book(isbn, title, author, year);
            System.out.println(b.getAll());
            break;
        default:
            break;
    }

}
}
