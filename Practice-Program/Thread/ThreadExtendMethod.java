package com.gla.Thread;

public class ThreadExtendMethod extends Thread{
        public void run() {
            System.out.println("Thread is running...");
        }

        public static void main(String args[]) {
            ThreadExtendMethod t = new ThreadExtendMethod();
            t.start(); // start thread
        }
    }
