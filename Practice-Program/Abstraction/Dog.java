package Abstraction;

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        Animal d = new Dog();
        d.sound();
        d.eat();
    }
}

