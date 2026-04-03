package com.gla.generic;

public class GenericUnboundedClass {
    public static<T> void swap(T a,T b){
        System.out.println("Before Swapping: "+a+" "+b);
        T temp=a;
        a=b;
        b=temp;
        System.out.println("After Swapping: "+a+" "+b);
    }
    public static void main(String[] args) {
        swap(11,34);
        swap("aa","bb");
    }
}
