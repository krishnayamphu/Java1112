package com.ky.inheritance;
class Mobile{
    public String brandname;
    public String model;
    public double price;
}
public class Samsung extends Mobile{
    public static void main(String[] args) {
        Samsung gs11=new Samsung();
        gs11.brandname="SAMSUNG";
        gs11.model="Galaxy S11";
        gs11.price=123000;

        System.out.println(gs11.brandname);
        System.out.println(gs11.model);
        System.out.println(gs11.price);
    }
}
