package com.ky.collections;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> students = new HashSet<>();
        students.add("Ram");
        students.add("Hari");
        students.add("Sita");
        students.add("Ram");
        for (String name : students) {
            System.out.println("Name: " + name);
        }
        System.out.println("=================");
        students.remove("Hari");
        for (String name : students) {
            System.out.println("Name: " + name);
        }
    }
}
