package com.ky.oop;

public class Person {
    String name;
    String address;
    int age;

    public void test(){
        System.out.println("testing method");
    }

    public int getMaxAge(){
        return 120;
    }
    public void getName(String name){
        System.out.println("Your name is: "+name);
    }

    public int getAvgAge(int age1, int age2){
        return (age1+age2)/2;
    }

    public static void main(String[] args) {
        Person p=new Person();
        p.name="Ram";
        p.address="Pokhara";
        p.age=20;

        System.out.println("Name: "+p.name);
        System.out.println("Address: "+p.address);
        System.out.println("Age: "+p.age);
        p.test(); //calling/invoking

        System.out.println("Maximum age: "+p.getMaxAge());
        p.getName("Gita");
        p.getName("Sita");

        System.out.println("Average Age: "+p.getAvgAge(40,70));
        System.out.println("Average Age: "+p.getAvgAge(10,30));
    }


}
