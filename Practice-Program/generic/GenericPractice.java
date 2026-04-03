package com.gla.generic;

class Number<T> {
    T num;
    void setNumber(T num){
        this.num=num;
    }
    T getNumber(){
        return num;
    }
}
public class GenericPractice {

    public static void main(String[] args) {
        Number<Integer> n1=new Number<>();
        n1.setNumber(23);
        System.out.println(n1.getNumber());

        Number<String> n2=new Number<>();
        n2.setNumber("shivam");
        System.out.println(n2.getNumber());

        Number<Double> n3=new Number<>();
        n3.setNumber(34.3423);
        System.out.println(n3.getNumber());

        Number<Long> n4=new Number<>();
        n4.setNumber(1464l);
        System.out.println(n4.getNumber());

        Number<Float> n5=new Number<>();
        n5.setNumber(15.4534f);
        System.out.println(n5.getNumber());


    }
}
