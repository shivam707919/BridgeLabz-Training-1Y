package com.gla.generic;


public class GenericBoundedEx {
    public static<T extends Number> void fibo(double n) {
         int a=0,b=1;
        for(int i=0;i<n;i++){
            System.out.print(a+" ");
            int c=a+b;
            a=b;
            b=c;
        }
    }
    public static void main(String[] args) {
        fibo(10.9);
    }
}


