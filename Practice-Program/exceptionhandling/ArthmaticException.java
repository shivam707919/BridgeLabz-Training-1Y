package com.gla.exceptionhandling;

public class ArthmaticException {
        public static void main(String args[]) {
            try {
                int a = 10;
                int b = 0;
                int c = a / b;
                System.out.println("The result is " + c);
            }
            catch (ArithmeticException e) {
                System.out.println("No number can be divided by zero");
            }
            finally {
                System.out.println("Finally block");
            }
        }
    }
