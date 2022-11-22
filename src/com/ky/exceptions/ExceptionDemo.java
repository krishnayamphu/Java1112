package com.ky.exceptions;

public class ExceptionDemo {
    public static void main(String[] args) {
        try{
            System.out.println("test 1");
            System.out.println(10/0);
            System.out.println("test 2");
        }
        catch (ArithmeticException e){
            //System.err.println("Number can't / by zero.");
            System.err.println(e);
        }

    }
}
