package br.zup.discovery.academy.juliana.model;

public class Cliente {
    long Id;
    String nome;
    Account account;
    public Cliente(long id, String nome, Account account) {
        super();
        Id = id;
        this.nome = nome;
        this.account = account;
    }
}
