package com.gla.multithreading;

class BankAccount implements Runnable {
    private String name;
    private String type;

    public BankAccount(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(name + " (" + type + ") checking balance | Priority: "
                    + Thread.currentThread().getPriority());

            try {
                Thread.sleep(2000); // 2 seconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class BankAccountSimulation {
    public static void main(String[] args) {

        Thread premium = new Thread(new BankAccount("User1", "Premium"));
        Thread regular = new Thread(new BankAccount("User2", "Regular"));
        Thread basic = new Thread(new BankAccount("User3", "Basic"));

        premium.setPriority(10);
        regular.setPriority(5);
        basic.setPriority(1);

        premium.start();
        regular.start();
        basic.start();
    }
}
