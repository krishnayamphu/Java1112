package com.ky.exceptions;

public class FinallyDemo {
    public static void main(String[] args) {
        try{
            System.out.println("welcome to java exception");
            System.out.println(20/0);
            System.out.println("end program");
        }catch (ArithmeticException e){
            System.out.println(e);
        }
        finally {
            System.out.println("you reached finally block");
        }
    }
}
