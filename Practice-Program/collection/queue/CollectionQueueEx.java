package com.gla.collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class CollectionQueueEx {
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        q.add(56);
        q.add(45);
        q.add(51);
        q.offer(73);
        q.offer(93);


        System.out.println(q);;
        System.out.println(q.peek());   //get first with peek,element
        System.out.println(q.element());

        q.remove();
        System.out.println(q);  //remove first with remove,poll
        q.poll();
        System.out.println(q);

        System.out.println(q.size());
        System.out.println(q.contains(96));
    }
}
