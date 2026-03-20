package com.gla.Thread;

public class RunnableMethod implements Runnable {
        public void run() {
            System.out.println("Thread running...");
        }

        public static void main(String args[]) {
            Thread t = new Thread(new RunnableMethod());
            t.start();
        }
    }
