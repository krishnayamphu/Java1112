package com.ky.abstraction;

public interface Bike {
    //public static final  int maxSpeed=200;
    //public abstract void test();
    int maxSpeed=200;
    void run();

    //default method included in jdk 1.8
    default void start(){
        System.out.println("Bike is ready to starting.");
    }
}
