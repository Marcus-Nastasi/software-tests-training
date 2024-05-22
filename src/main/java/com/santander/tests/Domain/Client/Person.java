package com.santander.tests.Domain.Client;

public abstract class Person {

    private final String name;
    private final String cpf;

    protected Person(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return("Person{" + "name='" + name + '\'' + ", cpf='" + cpf + '\'' + '}');
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }
}


