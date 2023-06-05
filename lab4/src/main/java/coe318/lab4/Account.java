/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab4;

/**
 *
 * @author Charles Kelsey
 */
public class Account {
    private String nam;
    private int num;
    private double iniBal;
    
    public Account(String name, int number, double initialBalance) {
        this.nam = name;
        this.num = number;
        this.iniBal = initialBalance;
    }
    
    public String getName() {
        return this.nam;
    }
    
    public double getBalance() {
        return this.iniBal;
    }
    
    public int getNumber() {
        return this.num;
    }
    
    public boolean deposit(double amount) {
        this.iniBal = this.iniBal + amount;
        return true;
    }
    
    public boolean withdraw(double amount) {
        if (amount > this.iniBal || amount < 0) {
            return false;
        } else {
            this.iniBal = this.iniBal - amount;
            return true;
        }
    }
    
    public String toString() {
        return "(" + getName() + ", " + getNumber() + ", " + String.format("$%.2f", getBalance()) +")";
    }
}
