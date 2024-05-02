package edu.gabriel.individual;

import edu.gabriel.accounts.Account;
import java.time.LocalDate;


public class Client extends Person{
    private String verificationCode;

    private Account account;

    public Client(String name, String cpf, String verificationCode) {
        super(name, cpf);
        this.verificationCode = verificationCode;
        this.account = null;
    }

    public void setAccount(Account acc){
        if (getAccount() == null){
            this.account = acc;
            System.out.println("account linked");
        } else {
            System.out.println("This client already have an account");
        }
    }

    public String getVerificationCode() {
        return verificationCode;
    }

    public Account getAccount() {
        return account;
    }
}
