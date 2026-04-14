package com.gla.collection.List;

import java.util.*;
public class ReverseStringUsingStack {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String s= sc.next();
            Stack<Character> st = new Stack<>();
            for(char c : s.toCharArray()) st.push(c);

            String res = "";
            while(!st.isEmpty()) {
                res += st.pop();
            }

            System.out.println(res);
        }
    }