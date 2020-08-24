package br.zup.discovery.academy.juliana.model;
import java.util.Scanner;

public class Account {

    long id;
    long number;
    double balance;
    Cliente cliente;

    public Account(long id, long number, double balance, Cliente cliente) {
        super();
        this.id = id;
        this.number = number;
        this.balance = balance;
        this.cliente = cliente;
    }
}

