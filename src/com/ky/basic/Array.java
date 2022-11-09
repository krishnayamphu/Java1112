package com.ky.basic;

public class Array {
    public static void main(String[] args) {
        int num[]=new int[2];
        num[0]=100;
        num[1]=200;

        System.out.println(num[0]);
        System.out.println(num[1]);

        int n[]={10,20,30,40,50};
        for(int i=0; i<5; i++){
            System.out.println(n[i]);
        }
        System.out.println("=================");
        for(int i:n){
            System.out.println(i);
        }

        String name_list[]={"Ram","Hari","Mohan","Sita"};
        for(String name:name_list){
            System.out.println(name);
        }
    }
}
