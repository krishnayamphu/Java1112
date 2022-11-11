package com.ky.oop;

public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public Book(){}

    public void getBookInfo(Book book){
        System.out.println("Book Name: "+book.title);
        System.out.println("Book Author: "+book.author);
        System.out.println("Book Price: "+book.price);
    }
    public void showBookInfo(){
        getBookInfo(this);
    }
    public Book getBook(){
        return this;
    }

    public static void main(String[] args) {
        Book book=new Book("Java Programming","ABC",300);
        book.showBookInfo();

        Book book1=new Book().getBook();
        book1.title="fasf";
        book1.author="fasf";
    }
}
