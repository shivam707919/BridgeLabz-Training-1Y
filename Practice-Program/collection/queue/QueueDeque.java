package com.gla.collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueueDeque {
    public static void main(String[] args) {
        Deque<Integer> dq=new ArrayDeque<>();
        dq.addLast(57);
        dq.addFirst(93);
        dq.addLast(77);
        dq.addFirst(23);

        System.out.println(dq);

        dq.pollLast();
        System.out.println(dq);

        dq.pollFirst();
        System.out.println(dq);

        System.out.println(dq.peekFirst());
        
    }
}
