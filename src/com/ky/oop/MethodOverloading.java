package com.ky.oop;

public class MethodOverloading {
    public void sum(){
        System.out.println("Default sum method");
    }
    public void sum(int x, int y){
        System.out.println("Total sum: "+(x+y));
    }

    public static void main(String[] args) {
        MethodOverloading ob=new MethodOverloading();
        ob.sum();
        ob.sum(10,5);
        ob.sum(20,30);
    }
}
