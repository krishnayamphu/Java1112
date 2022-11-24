package com.ky.exceptions;

public class ThrowsDemo {
    public void calc() throws ArithmeticException,ArrayIndexOutOfBoundsException{
        int[] num =new int[2];
        System.out.println(20/5);
        System.out.println(num[5]);
    }

    public static void main(String[] args) {
        ThrowsDemo th =new ThrowsDemo();
        try {
            th.calc();
        }catch (ArithmeticException e){
            System.err.println(e);
            System.err.println("number can't / zero");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.err.println(e);
        }
    }
}
