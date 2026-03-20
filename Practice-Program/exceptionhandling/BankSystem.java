package com.gla.exceptionhandling;

public class BankSystem {
    int balance=10000;
    public void withdraw(int amount){
        try{
            if(amount>balance){
                throw new InsufficientBalanceException("Insufficient Balance");
            }
            balance=balance-amount;
            System.out.println("Amount Withdrwan succesfully "+balance);
        }catch(InsufficientBalanceException e) {
            System.out.println("Exception Handled inside Method :" + e.getMessage());

        }
    }

    public static void main(String[] args) {
        BankSystem bs=new BankSystem();
        bs.withdraw(200000);
        System.out.println("Program continues...");
    }
}
