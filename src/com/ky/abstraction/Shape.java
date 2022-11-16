package com.ky.abstraction;

public abstract class Shape {
    public Shape(){
        System.out.println("Ready to drawing shape");
    }
    public Shape(String shape){
        System.out.println("Drawing "+shape+" shape.");
    }
    //non abstract method
    public void test(){
        System.out.println("default test method");
    }

    //abstract method
    public abstract void draw();
}
