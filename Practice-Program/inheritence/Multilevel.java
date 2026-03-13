package com.gla.inheritence;

class First{
    void eat(){
        System.out.println("parent");
    }
}

class Child extends First{
    void bark(){
        System.out.println("Parent child");
    }
}

class Grandchild extends Child{
    void weep(){
        System.out.println("Child Children");
    }
}

public class Multilevel{
    public static void main(String[] args){

       Grandchild p = new Grandchild();

        p.eat();
        p.bark();
        p.weep();
    }
}
