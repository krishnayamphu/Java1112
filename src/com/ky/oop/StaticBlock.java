package com.ky.oop;

public class StaticBlock {
    static double PI;
    static {
        PI=3.14;
        System.out.println("Static block demo");
    }
    public static void main(String[] args) {
        System.out.println("Main method");
        System.out.println(PI);
    }
}
