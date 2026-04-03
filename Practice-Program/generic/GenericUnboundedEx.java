package com.gla.generic;


public class GenericUnboundedEx {
    public static<T> void fib(T n) {
        int num=Integer.parseInt(n.toString()); // first change int n to string using " n.tostring() " then
        int a=0,b=1;                            // use Integer.parseInt() to change in int
        for(int i=0;i<num;i++){                  //which show compier that your input is in interger
            System.out.print(a+" ");
            int c=a+b;
            a=b;
            b=c;
        }
    }
    public static void main(String[] args) {
        fib(10);
    }
}

