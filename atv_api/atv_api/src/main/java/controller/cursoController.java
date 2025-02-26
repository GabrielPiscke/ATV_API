package controller;

import banco.cursoBd;
import model.Aluno;
import model.Curso;
import java.util.List;

public class cursoController {
    cursoBd repository = new cursoBd();

    public List<Curso> getAll() {
        return repository.encontrarTodos();
    }

    public Curso getById(int idCurso) {
        return repository.getByid(idCurso);
    }
    public boolean inserir(Curso curso) {
        return repository.inserir(curso);
    }
    public Curso atualizarCurso(int idCurso, Curso curso) {
        boolean resultado = repository.atualizarCurso(idCurso, curso);
        if (resultado) {
            return null;
        }
        return null;
    }
//    public Aluno atualizarAluno(int alunoId, Aluno aluno) {
//        boolean resultado = repository.atualizarAluno(alunoId, aluno);
//        if (resultado) {
//            return null;
//        }
//        return null;
//    }
    public boolean removerCurso(int idCurso) {
        return repository.removerCurso(idCurso);
    }
}

