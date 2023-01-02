package com.ky.collections;

import com.ky.basic.Array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> persons=new ArrayList<>();
        //ArrayList<String> persons=new ArrayList<>(); ->new method whit generics
        //ArrayList persons =new ArrayList(); ->old method

        persons.add("Ram");
        persons.add("Hari");
        persons.add("Sita");

        Iterator itr=persons.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("=====================");
        persons.remove("Sita");
        persons.add("Mohan");
        for(String p:persons){
            System.out.println(p);
        }

        System.out.println("=====================");
        Book b1=new Book("Java",320);
        Book b2=new Book("C programming", 560);
        ArrayList<Book> allBooks=new ArrayList<>();
        allBooks.add(b1);
        allBooks.add(b2);
        for(Book book:allBooks){
            System.out.println("Book's name: "+book.getTitle());
            System.out.println("Book's price: "+book.getPrice());
            System.out.println("");
        }
    }
}
