package com.gla.collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetPractice {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        hs.add(23);
        hs.add(54);
        hs.add(78);
        hs.add(93);
        hs.add(0);
        hs.add(18);
        System.out.println("================HashSet==============");
        System.out.println(hs);

        LinkedHashSet<Integer> ls=new LinkedHashSet<>();
        ls.add(23);
        ls.add(54);
        ls.add(78);
        ls.add(93);
        ls.add(0);
        ls.add(18);
        System.out.println("==============LinkedHashSet==============");
        System.out.println(ls);

        TreeSet<Integer> ts=new TreeSet<>();
        ts.add(23);
        ts.add(54);
        ts.add(78);
        ts.add(93);
        ts.add(0);
        ts.add(18);
        System.out.println("====================TreeSet================");
        System.out.println(ts);

    }
}
