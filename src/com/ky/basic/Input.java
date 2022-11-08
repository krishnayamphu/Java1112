package com.ky.basic;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name:");
        String name=sc.nextLine();

        System.out.print("Enter contact:");
        int phone=sc.nextInt();

        System.out.println("Name: "+name);
        System.out.println("Phone: "+phone);
    }
}
