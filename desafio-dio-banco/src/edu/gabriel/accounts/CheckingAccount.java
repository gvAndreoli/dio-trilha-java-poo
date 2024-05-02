package edu.gabriel.accounts;

public class CheckingAccount extends Account{

    private int limit;

    public CheckingAccount(double balance, String agency, String verificationCode, int limit) {
        super(balance, agency, verificationCode);
        this.limit = limit;
    }

    public int getLimit() {
        return limit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0) {
            if (getBalance() >= amount) {
                setBalance(getBalance() - amount);
                System.out.printf("Your new balance is $%.2f%n", getBalance());
            } else if (getBalance() + getLimit() >= amount) {
                setBalance(getBalance() - amount);
                System.out.printf("Your new balance is $%.2f, your current limit {%.2f}%n", getBalance(), getBalance() + getLimit());
            } else {
                System.out.println("Sorry, you don't have enough money to complete this transaction");
            }
        }
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            setBalance(getBalance() + amount);
            System.out.printf("Your new balance is $%.2f%n", getBalance());
        }
    }
}
