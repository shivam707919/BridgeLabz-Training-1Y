package com.gla.collection.List;

import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class CollectionFrameworkPractice2 {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        Vector<Boolean> vector=new Vector<>();
        Stack<Integer> st =new Stack<>();


        //Stack
        st.push(1);   //add element by "push"
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);

        st.pop();          //Remove last element by "pop"
        System.out.println(st);

        System.out.println(st.peek()); //pick last element by "peek"
        System.out.println(st.size());  //size
        System.out.println(st.isEmpty()); //check if it is empty or not

        //Linked List
        ll.add(11);
        ll.add(22);
        ll.add(33);
        ll.add(44);
        System.out.println(ll);
        ll.set(0,90);
        System.out.println(ll);

        LinkedList<Integer> l=new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);

        ll.addAll(l); //add "l" array into "ll"
        System.out.println(ll);
    }
}
