package com.gla.inheritence;

interface A {
    void show();
}

interface B {
    void display();
}

class Test implements A, B {

    public void show() {
        System.out.println("Show method from Interface A");
    }

    public void display() {
        System.out.println("Display method from Interface B");
    }

}

public class Multiple {
    public static void main(String[] args) {

        Test t = new Test();
        t.show();
        t.display();

    }
}
