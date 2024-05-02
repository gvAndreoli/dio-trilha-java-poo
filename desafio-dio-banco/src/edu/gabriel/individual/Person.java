package edu.gabriel.individual;

import java.time.LocalDate;

public abstract class Person {
    private String name;
    private String cpf;

    public Person(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

}
