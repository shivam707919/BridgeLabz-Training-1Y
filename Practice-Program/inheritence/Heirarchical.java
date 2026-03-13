package com.gla.inheritence;

class Creature{
    void eat(){
        System.out.println("Animal Eat Food");
    }
}
class Wolf extends Creature{
    void bark(){
        System.out.println(("Dog Barks"));
    }
}

class Cat extends Creature{
    void meow(){
        System.out.println(("Cat Meow"));
    }
}

public class Heirarchical{
    public static void main(String[] args){
        Wolf d=new Wolf();
        d.eat();
        d.bark();

        Cat c=new Cat();
        c.eat();
        c.meow();
    }
}
