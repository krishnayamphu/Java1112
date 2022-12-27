package com.ky.stringhandling;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Hello");
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.toString().toUpperCase());
    }
}
