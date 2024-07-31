package anudip.com;

import java.util.Random;
import java.util.Scanner;

class Customer {
    String name;
    long accountnumber;
    double total = 5000;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(long accountnumber) {
        this.accountnumber = accountnumber;
    }

    public void Deposit(double amount) {
        total += amount;
        System.out.println("Amount Deposited Successfully");
    }

    public void withdraw(double amount) {
        if (total < amount) {
            System.out.println("Insufficient Balance, Your Current Balance Is: "+total);
        } else {
            total -= amount;
            System.out.println("Amount Withdrawn Successfully");
        }
    }

    public void balance() {
        System.out.println("Current Balance: " + total);
    }
}
