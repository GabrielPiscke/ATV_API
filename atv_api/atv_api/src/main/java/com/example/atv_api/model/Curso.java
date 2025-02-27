package com.example.atv_api.model;

import java.util.ArrayList;

public class Curso {
    private int idCurso;
    private String nome;
    private int nemeroSala;
    private ArrayList<Aluno> alunos;
    private Professor professor;

    public Curso(int idCurso, String nome, int nemeroSala, ArrayList<Aluno> alunos, Professor professor) {
        this.idCurso = idCurso;
        this.nome = nome;
        this.nemeroSala = nemeroSala;
        this.alunos = alunos;
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

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
