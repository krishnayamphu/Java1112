package com.ky.stringhandling;

import java.util.Locale;

public class StringDemo {
    public static void main(String[] args) {
        String s="Welcome";
        System.out.println(s.length());
        String s2=new String("Hello");
        System.out.println(s2);
        System.out.println(s2.toUpperCase());

        System.out.println(s.substring(3));
        System.out.println(s.substring(0,3));

        System.out.println(s2.charAt(4));
        System.out.println(s.concat(s2));
        System.out.println(s2.replace('e','a'));

        String s3=new String("Java World");
        System.out.println(s3.replace("World","Programming"));

        System.out.println(s3.indexOf('r'));
        System.out.println(s3.indexOf("World"));
        System.out.println(s3.lastIndexOf('a'));

        String s4="                  Aptech Computer Education              ";
        String s5="welcome";
        System.out.println(s4);
        System.out.println(s4.trim());
        System.out.println(s.equals(s2));
        System.out.println(s.equals(s5));
        System.out.println(s.equalsIgnoreCase(s5));

        int a=5;
        System.out.println(String.valueOf(a)); //string value
        String x="10";
        int b=Integer.parseInt(x);
        System.out.println(b);



    }
}
