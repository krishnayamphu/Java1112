package com.ky.abstraction;

public class Circle extends Shape{
    public Circle(){}
    public Circle(String name){
        super(name);
    }
    public static void main(String[] args) {
        Circle circle=new Circle("Circle");
        circle.test();
        circle.draw();
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}
