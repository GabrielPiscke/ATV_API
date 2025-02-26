package model;

public class Professor {
    private String professor;
    private String nome;
    private String cpf;
    private double salario;

    public Professor(String professor, String nome, String cpf, double salario) {
        this.professor = professor;
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public String getProfessor() {
        return professor;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
