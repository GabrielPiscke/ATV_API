package com.example.atv_api.banco;

import com.example.atv_api.model.Aluno;
import com.example.atv_api.model.Curso;
import com.example.atv_api.model.Professor;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

public class cursoBd {

    private List<Curso> cursos;

    public cursoBd() {
        this.cursos = new ArrayList<>();
    }

    public List<Curso> encontrarTodos() {
        return new ArrayList<>(cursos);
    }

    public Curso getByid(int idCurso){
        return cursos.stream()
                .filter(cur -> cur.getIdCurso() == idCurso)
                .findFirst()
                .orElse(null);
    }
    public Curso filtroProf(String nome){
        return cursos.stream()
                .filter(cur -> cur.getProfessor().getNome() == nome)
                .findFirst()
                .orElse(null);
    }
    public Curso filtroSala(int numeroSala){
        return cursos.stream()
                .filter(cur -> cur.getNemeroSala() == numeroSala)
                .findFirst()
                .orElse(null);
    }

    public boolean inserir(Curso curso){
       cursos.add(curso);
        return true;
    }
    public Curso inserirAluno(int idCurso, Aluno aluno) {
        Curso cursoBd = cursos.stream()
                .filter(objeto -> objeto.getIdCurso() == idCurso)
                .findFirst()
                .orElse(null);
        if (cursoBd == null) {
            System.out.println("Erro");
        }
        cursoBd.getAlunos().add(aluno);
        return cursoBd;
    }
    public boolean atualizarAluno(int alunoId, Aluno aluno, int idCurso) {
        Curso cursoBd = cursos.stream()
                .filter(objeto -> objeto.getIdCurso() == idCurso)
                .findFirst()
                .orElse(null);
        Aluno alunoBd = cursoBd.getAlunos().stream()
                .filter(objeto -> objeto.getAlunoId() == alunoId)
                .findFirst()
                .orElse(null);
        if (cursoBd == null){
            return false;
        }
        alunoBd.setNome(aluno.getNome());
        alunoBd.setCpf(aluno.getCpf());
        return true;
    }

    public boolean atualizarCurso(int idCurso, Curso curso, Professor prof) {
       Curso cursoBd = cursos.stream()
                .filter(objeto -> objeto.getIdCurso() == idCurso)
                .findFirst()
                .orElse(null);
        if (cursoBd == null){
            return false;
        }
        cursoBd.setNome(curso.getNome());
        cursoBd.setNemeroSala(curso.getNemeroSala());
        cursoBd.getProfessor().setSalario(prof.getSalario());
        cursoBd.getProfessor().setNome(prof.getNome());
        cursoBd.getProfessor().setCpf(prof.getCpf());
        return true;
    }

    public boolean removerCurso(@PathVariable int idCurso) {
        return cursos.removeIf(cur -> cur.getIdCurso() == (idCurso));
    }
}
