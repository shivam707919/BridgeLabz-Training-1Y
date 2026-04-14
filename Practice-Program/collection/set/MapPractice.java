package com.gla.collection.set;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapPractice {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(2,90);
        hm.put(6,88);
        hm.put(3,78);
        hm.put(1,99);
        hm.put(9,45);
        System.out.println(hm);
        System.out.println("Values: "+hm.keySet()); //key in a set

        for(int i:hm.keySet()){
            System.out.println(i); //key not in set
        }

        System.out.println("Values: "+hm.values()); // values in a set
        for(int j:hm.values()){
            System.out.println(j); //values not in set
        }

        LinkedHashMap<Integer,Integer> lm=new LinkedHashMap<>();
        TreeMap<Integer,Integer> tm=new TreeMap<>();
    }
}
