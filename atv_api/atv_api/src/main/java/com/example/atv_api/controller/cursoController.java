package com.example.atv_api.controller;

import com.example.atv_api.banco.cursoBd;
import com.example.atv_api.model.Aluno;
import com.example.atv_api.model.Curso;
import com.example.atv_api.model.Professor;

import java.util.List;

public class cursoController {
    cursoBd repository = new cursoBd();

    public List<Curso> getAll() {
        return repository.encontrarTodos();
    }

    public Curso filById(int idCurso) {
        return repository.getByid(idCurso);
    }

    public Curso filtroProf(String nome) {
        return repository.filtroProf(nome);
    }

    public Curso filtroSala(int numeroSala) {
        return repository.filtroSala(numeroSala);
    }

    public boolean inserir(Curso curso) {
        return repository.inserir(curso);
    }

    public Curso inserirAluno(int idCurso, Aluno aluno) {
            return repository.inserirAluno(idCurso, aluno);
    }

    public boolean updateCurso(int idCurso, Curso curso, Professor prof) {
        return repository.atualizarCurso(idCurso, curso, prof);
    }

    public boolean atualizarAluno(int alunoId, Aluno aluno, int idCurso) {
        return repository.atualizarAluno(alunoId, aluno,idCurso);
    }

    public boolean removerCurso(int idCurso) {
        return repository.removerCurso(idCurso);
    }
}

