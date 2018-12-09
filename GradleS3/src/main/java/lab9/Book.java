package lab9;

import java.util.Scanner;

public class Book {
    private String isbn;
    private String title;
    private String author;
    private int year;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Book(String isbn, String title, String author, int year) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getAll(){
        return("isbn: " + getIsbn() + " title: " + getTitle() + " author: " + getAuthor() + " year: " + getYear());
    }

//    public Book setAllData(){
//        Scanner s = new Scanner(System.in);
//        System.out.println("Podaj kod ISBN:");
//        String isbn = s.nextLine();
//        System.out.println("Podaj tytuł:");
//        String title = s.nextLine();
//        System.out.println("Podaj autora:");
//        String author = s.nextLine();
//        System.out.println("Podaj rok:");
//        int year = Integer.parseInt(s.nextLine());
//        Book b = new Book(isbn, title, author, year);
//        return b;
//    }
}
