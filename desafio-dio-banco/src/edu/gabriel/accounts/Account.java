package edu.gabriel.accounts;

public abstract class Account {
    private double balance;

    private String agency;

    private String verificationCode;

    public Account(double balance, String agency, String verificationCode) {
        this.balance = balance;
        this.agency = agency;
        this.verificationCode = verificationCode;
    }

    protected double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAgency() {
        return agency;
    }

    public String getVerificationCode() {
        return verificationCode;
    }

    public abstract void withdraw(double amount);
    
    public abstract void deposit(double amount);
    
    public void checkAccountBalance(){
        System.out.printf("%.2f%n", getBalance());
    }
}
