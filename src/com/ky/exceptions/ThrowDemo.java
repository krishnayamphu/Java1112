package com.ky.exceptions;

public class ThrowDemo {
    public void checkVoterAge(int age) throws ArithmeticException{
        if(age>=18){
            System.out.println("You are eligible to vote");
        }else {
            throw new ArithmeticException("Invalid age");
        }
    }

    public static void main(String[] args) {
        ThrowDemo td=new ThrowDemo();
        try{
            td.checkVoterAge(4);
        }catch (ArithmeticException e){
            System.err.println(e);
            System.err.println("Voter age must be above 18 or equal");
        }
    }
}
