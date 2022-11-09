package com.ky.basic;

public class Tenary {
    public static void main(String[] args) {
        int n1=10,n2=-50;
        System.out.println(n1>n2?"first number is greater":"second number is greater");

        System.out.println(5>4);
        System.out.println(5==5);
        System.out.println(5!=5);

        System.out.println(n1>0 && n2>0);

        if(5==5){
            System.out.println("ok");
        }else{
            System.out.println("not ok");
        }
    }
}
