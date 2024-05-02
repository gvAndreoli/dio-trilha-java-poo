package edu.gabriel.executable;

import edu.gabriel.accounts.Account;
import edu.gabriel.accounts.CheckingAccount;
import edu.gabriel.accounts.SavingsAccount;
import edu.gabriel.bank.Bank;
import edu.gabriel.individual.Client;
import edu.gabriel.individual.Person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        Account ac1 = new CheckingAccount(1000, "12345", "asdfg", 500);
        Client client = new Client("Gabriel", "12341231", "asdfg");

        if (bank.verifyAgency(ac1) && bank.verification(ac1, client)){
            client.setAccount(ac1);
        } else {
            System.out.println("Not verified");
        }

        client.getAccount().withdraw(1400);
    }
}
