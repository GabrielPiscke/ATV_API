package model;

public class Aluno{
    private int alunoId;
    private String nome;
    private String cpf;

    public Aluno(int alunoId, String nome, String cpf) {
        this.alunoId = alunoId;
        this.nome = nome;
        this.cpf = cpf;
    }

    public int getAlunoId() {
        return alunoId;
    }

    public void setAlunoId(int alunoId) {
        this.alunoId = alunoId;
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
}
