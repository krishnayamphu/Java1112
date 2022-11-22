package com.ky.exceptions;

public class MultiCatchBlock {
    public static void main(String[] args) {
        int num[]=new int[2];
    try {
        System.out.println("program starting...");
        System.out.println(20 / 10);
        System.out.println("Hello World");
        num[0] = 20;
        System.out.println(num[10]);
        System.out.println("ending program");
    }
    catch (ArithmeticException e){
        System.err.println(e);
    }
    catch (ArrayIndexOutOfBoundsException e){
        System.err.println(e);
    }
    }
}
