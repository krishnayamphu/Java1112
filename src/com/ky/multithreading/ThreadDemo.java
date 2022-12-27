package com.ky.multithreading;

public class ThreadDemo extends Thread{
    @Override
    public void run() {
        while (true){
            try {
                System.out.println("Hello World");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ThreadDemo thread=new ThreadDemo();
        thread.start();
    }
}
