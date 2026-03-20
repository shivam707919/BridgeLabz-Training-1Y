package com.gla.exceptionhandling;

import java.io.*;
public class ExampleThrows {
        static void readFile() throws IOException {
            FileReader f = new FileReader("test.txt");
        }
        public static void main(String args[]) throws IOException {
            readFile();
        }
    }

