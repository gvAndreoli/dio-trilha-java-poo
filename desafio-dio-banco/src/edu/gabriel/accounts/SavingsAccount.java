package edu.gabriel.accounts;


import java.util.Random;

public class SavingsAccount extends Account{

    private double yield;
    public SavingsAccount(double balance, String agency, String verificationCode, double yield) {
        super(balance, agency, verificationCode);
        this.yield = yield;
    }

    public double getYield() {
        return yield;
    }

    private void setYield(double yield) {
        this.yield = yield;
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
            System.out.printf("Your new balance is $%.2f%n", getBalance());
        } else {
            System.out.println("Sorry, you dont have enough money to complet this transaction");
        }
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.printf("Your new balance is $%.2f%n", getBalance());
    }

    public void increaseYield(){
        int answer = new Random().nextInt(0, 2);
        if (answer == 0){
            System.out.println("yield increase denied");
        } else {
            double rate = new Random().nextDouble(0, 1);
            setYield(getYield() + rate);
            System.out.printf("Your new yield rate: %.2f", getYield());
        }
    }
}
