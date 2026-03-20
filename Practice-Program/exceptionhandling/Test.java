package com.gla.exceptionhandling;

import java.util.Scanner;

public class Test {
    static Scanner sc = new Scanner(System.in);

    public static void checkout() throws ArithmeticException {
        System.out.println("Enter your Number : ");
        int num = sc.nextInt();

        if (num < 0) {
            throw new ArithmeticException("Negative number not allowed");
        } else {
            System.out.println("Your Number : " + num);
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println("Enter your Balance");
            int balance = sc.nextInt();

            if (balance < 1000) {
                throw new ArithmeticException("Insufficient Balance");
            } else {
                System.out.println("Your Balance : " + balance);
            }

            checkout(); // calling method

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Hello world");
    }
}