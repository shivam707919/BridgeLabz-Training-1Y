package com.gla.wrapper;

public class WrapperAutoExample {
    public static void main(String[] args) {

        //AutoBoxing
        int a=10;

       // Integer i=a;        // Manual Approach

        Integer i=Integer.valueOf(a); //done by compiler
        System.out.println("value: "+i);

        System.out.println("...............................");

        //AutoUnBoxing
        Integer b=100;

        int m=b; //manual Approach
        //int m=b.intValue(); //compiler side

        System.out.println("Unboxing: "+m);
    }
}
