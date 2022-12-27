package com.ky.stringhandling;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("welcome");
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println(sb.append(" to Aptech"));

        System.out.println(sb);

        System.out.println(sb.insert(17,"Lalitpur"));
        System.out.println(sb.delete(17,27));
        System.out.println(sb.deleteCharAt(0));
        System.out.println(sb.indexOf("A"));
        System.out.println(sb.reverse());
    }
}
