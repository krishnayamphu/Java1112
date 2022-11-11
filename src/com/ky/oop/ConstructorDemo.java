package com.ky.oop;
class Car{
    public Car(){
        System.out.println("Car is running...");
    }
    public Car(String carname){
        System.out.println(carname+" car is running...");
    }
    public Car(String carname, int maxspeed){
        System.out.println(carname+" car is running...");
        System.out.println("Car maximum speed is "+maxspeed);

    }
}
public class ConstructorDemo {
    public ConstructorDemo(){
        System.out.println("default constructor");
    }
    public void test(){
        System.out.println("test method");
    }
    public static void main(String[] args) {
//        new ConstructorDemo();
//        new ConstructorDemo().test();

        new Car("BMW",300);

    }
}
