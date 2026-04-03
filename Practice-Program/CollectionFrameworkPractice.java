package com.gla.collection;

import java.util.*;

public class CollectionFrameworkPractice {
    public static void main(String[] args) {
        List l = new ArrayList();
        List a = new LinkedList();
        List b = new Vector();
        List c = new Stack();

        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add("Shivam");
        l.add(56.454);
        System.out.println(l);

        ArrayList<String> al = new ArrayList<>();
        System.out.println("Array List: " + al);
        al.add("aa");
        al.add("bb");
        al.add("cc");
        al.add("dd");
        al.add("ee");
        al.add("ff");

        System.out.println("Using Simple for loop...........");
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i) + " ");
        }

        System.out.println("Using Simple for Each loop...........");
        for (String s : al) {
            System.out.println(s);
        }
    }
}
