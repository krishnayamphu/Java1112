package com.ky.oop;

public class ThisDemo {
    int x;
    int y;

    public ThisDemo(){
        System.out.println("default constructor");
    }
    public ThisDemo(String s){
        this();
        System.out.println("Invoking parameterized constructor. "+s);
    }

    public void test(int x, int y){
        this.x=x;
        this.y=y;
    }

    public void demo(){
        System.out.println("hello demo java method");
    }

    public void run(){
        this.demo();
    }

    public static void main(String[] args) {
        ThisDemo ob=new ThisDemo();
        ob.test(10,5);

        System.out.println("value of x :"+ob.x);
        System.out.println("Valuel of y : "+ob.y);

        ob.run();
        new ThisDemo("Hello World");
    }
}
