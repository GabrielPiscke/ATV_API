package com.example.atv_api.model;

public class Professor {
    private int idProfessor;
    private String nome;
    private String cpf;
    private double salario;

    public Professor(int idProfessor, String nome, String cpf, double salario) {
        this.idProfessor = idProfessor;
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public int getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
