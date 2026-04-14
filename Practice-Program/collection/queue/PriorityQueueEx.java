package com.gla.collection.queue;

import java.util.*;

import java.util.PriorityQueue;

public class PriorityQueueEx {

        public static void main(String[] args) {
            PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
            Queue<Integer> q = new LinkedList<>();
            pq.add(5);
            pq.add(7);
            pq.offer(9);

            System.out.println(pq);
            System.out.println(pq.peek());
            System.out.println(pq.element());

            pq.remove();
            pq.poll();
            System.out.println(pq);
            System.out.println(pq.size());
            System.out.println(pq.contains(7));
        }
    }

