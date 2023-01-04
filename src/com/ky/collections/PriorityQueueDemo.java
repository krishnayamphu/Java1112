package com.ky.collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<String> queue=new PriorityQueue<>();
        queue.add("apple");
        queue.offer("banana");
        queue.add("orange");

        System.out.println("Head element:"+queue.peek());
        System.out.println("==============");
        Iterator itr=queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("========");
        queue.remove();
        for(String s: queue){
            System.out.println(s);
        }
    }
}
