package edu.gabriel.bank;

import edu.gabriel.accounts.Account;
import edu.gabriel.individual.Client;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Bank {

    private final List<String> agencies = Arrays.asList("12345", "abcde", "09876");

    public Bank() {
    }

    public List<String> getAgencies() {
        return agencies;
    }

    public boolean verification(Account acc, Client client){
        return Objects.equals(acc.getVerificationCode(), client.getVerificationCode());
    }

    public boolean verifyAgency(Account acc){
        return agencies.contains(acc.getAgency());
    }
}
