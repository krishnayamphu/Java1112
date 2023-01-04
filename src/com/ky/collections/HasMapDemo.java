package com.ky.collections;

import java.util.HashMap;
import java.util.Map;

public class HasMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"Red");
        map.put(2,"Green");
        map.put(3,"Blue");

        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" => "+m.getValue());
        }
        System.out.println("==============");
        HashMap<String,Integer> person=new HashMap<>();
        person.put("Ram",40);
        person.put("Hari",45);
        person.put("Sita",35);
        for(Map.Entry p:person.entrySet()){
            System.out.println("Name: "+p.getKey());
            System.out.println("Age: "+p.getValue());
            System.out.println("------------------------");
        }
    }
}
