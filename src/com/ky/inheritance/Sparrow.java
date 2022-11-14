package com.ky.inheritance;
class Animal{
    String name;
}
class Bird extends Animal{
    String color;
}
public class Sparrow extends Bird{
    public static void main(String[] args) {
        Sparrow sparrow=new Sparrow();
        sparrow.name="Little Bird";
        sparrow.color="Brown";

        System.out.println(sparrow.name);
        System.out.println(sparrow.color);
    }
}
