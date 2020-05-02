package com.example.bank;

import javax.naming.InsufficientResourcesException;

public class BankOperation {

    private int balance=0;

    public BankOperation() {
    }

    public int getBalance(){
        return balance;
    }

    public void withdraw(int amount) throws InsufficientResourcesException{
        if (amount>balance){
            throw new InsufficientResourcesException();
        }
        else {
            balance=balance-amount;
        }
    }

    public void deposit(int amount){
        balance = balance + amount;
    }
}
