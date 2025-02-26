package model;

public class Curso {
    private int idCurso;
    private String nome;
    private int nemeroSala;
    Aluno ArrayList;
    Professor professor;

    public Curso(int idCurso, String nome, int nemeroSala, Aluno arrayList, Professor professor) {
        this.idCurso = idCurso;
        this.nome = nome;
        this.nemeroSala = nemeroSala;
        ArrayList = arrayList;
        this.professor = professor;
    }
    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNemeroSala() {
        return nemeroSala;
    }

    public void setNemeroSala(int nemeroSala) {
        this.nemeroSala = nemeroSala;
    }

    public Aluno getArrayList(String cpf) {
        return ArrayList;
    }

    public void setArrayList(Aluno arrayList) {
        ArrayList = arrayList;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
