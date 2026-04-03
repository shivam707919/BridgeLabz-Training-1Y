package com.gla.wrapper;

public class WrapperAutoEx2 {
    public static void main(String[] args) {

        //AutoBoxing
        float a=10.34f;
        double b=20.3434;

        // Manual Approach
        Float i = a;
        Double j = b;

        //complier side
       // Float i = Float.valueOf(a);
       // Double j = Double.valueOf(b);


        System.out.println("Float value: "+i);
        System.out.println("Double value: "+j);

        System.out.println("...............................");

        //AutoUnBoxing
        Float c = 100.34f;
        Double d = 300.4334;

        //Manual approach
        float m = c;
        double n = d;


        System.out.println("Unboxing float: "+m);
        System.out.println("Unboxing double: "+n);
    }
}
