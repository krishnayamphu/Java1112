package com.ky.abstraction;

public class Suzuki implements Bike,Sound{
    @Override
    public void run() {
        System.out.println("Suzuki bike running smoothly.");
    }

    public static void main(String[] args) {
        Suzuki hayabusha=new Suzuki();
        hayabusha.start();
        hayabusha.run();
        hayabusha.play();
        System.out.println("MaxSpeed:"+Bike.maxSpeed);
    }

    @Override
    public void play() {
        System.out.println("Suzuki bike playing sound");
    }
}
