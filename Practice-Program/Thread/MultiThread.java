package com.gla.Thread;

class A extends Thread {
    public void run() {
        System.out.println("Task A");
    }
}

class B extends Thread {
    public void run() {
        System.out.println("Task B");
    }
}

public class MultiThread {
    public static void main(String args[]) {
        A t1 = new A();
        B t2 = new B();

        t1.start();
        t2.start();
    }
}
