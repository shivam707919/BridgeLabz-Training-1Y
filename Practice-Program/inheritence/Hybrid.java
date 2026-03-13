package com.gla.inheritence;

class Alphabet{
    void first() {
        System.out.println("Alphabet is the parent company");
    }
}
class Google extends Alphabet {
    void second() {
        System.out.println("Google comes under Alphabet");
    }
}
class Gemini extends Google {
    void third() {
        System.out.println("Gemini comes under Google");
    }
}
class Youtube extends Alphabet{
    void fourth() {
        System.out.println("Youtube also comes under Alphabet");
    }
}


public class Hybrid {
    public static void main(String[] args) {
        Gemini d = new Gemini();
        d.first();
        d.second();
        d.third();

        Youtube b = new Youtube();
        b.first();
        b.fourth();

    }
}