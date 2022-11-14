package com.ky.inheritance;

import java.lang.invoke.VarHandle;

class Vehicle {
    public void run() {
        System.out.println("Running vehicle");
    }
}

class Bike extends Vehicle {
    @Override
    public void run() {
        System.out.println("Bike running smoothly.");
    }
}

class Car extends Vehicle {
    @Override
    public void run() {
        System.out.println("Car running safely.");
    }
}

public class MethodOverrideDemo {
    public static void main(String[] args) {
        Vehicle bike = new Bike();
        bike.run();

        Vehicle car = new Car();
        car.run();
    }
}
