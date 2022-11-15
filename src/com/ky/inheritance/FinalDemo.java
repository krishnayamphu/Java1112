package com.ky.inheritance;
//final class Abc{
class Abc{
    public final void demo(){
        System.out.println("demo method from Abc class");
    }
}
public class FinalDemo extends Abc{
    public final int maxSpeed=120; //make constant

//    @Override
//    public void demo(){
//        System.out.println("demo method from finalDemo class");
//    }

    public static void main(String[] args) {
        FinalDemo obj=new FinalDemo();
        System.out.println(obj.maxSpeed);
//        obj.maxSpeed=300;
//        System.out.println(obj.maxSpeed);
        obj.demo();

    }
}
