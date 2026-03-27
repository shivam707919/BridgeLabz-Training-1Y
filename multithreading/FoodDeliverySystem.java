package com.gla.multithreading;

class Order implements Runnable {
    private int orderId;
    private String restaurant;
    private int deliveryTime;

    public Order(int orderId, String restaurant, int deliveryTime) {
        this.orderId = orderId;
        this.restaurant = restaurant;
        this.deliveryTime = deliveryTime;
    }

    @Override
    public void run() {
        long start = System.currentTimeMillis();

        System.out.println("Order " + orderId + " picked up by " + Thread.currentThread().getName());

        try {
            Thread.sleep(deliveryTime * 1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Order " + orderId + " Delivered by " + Thread.currentThread().getName());

        long end = System.currentTimeMillis();
        System.out.println("Total time for Order " + orderId + ": " + (end - start) / 1000 + " sec");
    }
}

public class FoodDeliverySystem {
    public static void main(String[] args) {

        Thread t1 = new Thread(new Order(1, "Dominos", 3), "Agent-1");
        Thread t2 = new Thread(new Order(2, "KFC", 5), "Agent-2");
        Thread t3 = new Thread(new Order(3, "PizzaHut", 2), "Agent-3");
        Thread t4 = new Thread(new Order(4, "BurgerKing", 4), "Agent-4");
        Thread t5 = new Thread(new Order(5, "McD", 1), "Agent-5");

        t1.setPriority(10); // Express
        t2.setPriority(5);
        t3.setPriority(3);
        t4.setPriority(5);
        t5.setPriority(3);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
