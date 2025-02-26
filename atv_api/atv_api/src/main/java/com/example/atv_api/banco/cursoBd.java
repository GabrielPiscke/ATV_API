package com.example.atv_api.banco;

import com.example.atv_api.model.Curso;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

public class cursoBd {
    private List<Curso> cursos;
    private List<Curso> alunos;

    public cursoBd() {
        this.cursos = new ArrayList<>();
    }
    public void cursBd() {
        this.alunos = new ArrayList<>();
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
    public boolean atualizarCurso(int idCurso, Curso curso) {
       Curso cursoBd = cursos.stream()
                .filter(objeto -> objeto.getIdCurso() == idCurso)
                .findFirst()
                .orElse(null);
        if (cursoBd == null){
            return false;
        }
        cursoBd.setNome(curso.getNome());
        cursoBd.setNemeroSala(curso.getNemeroSala());
        cursoBd.setProfessor(curso.getProfessor());
        return true;
    }
//    public boolean atualizarAluno(int alunoId, Curso aluno) {
//        Curso cursoBd = cursos.stream()
//                .filter(objeto -> objeto.getAlunos().getFirst().getAlunoId() == alunoId)
//                .findFirst()
//                .orElse(null);
//        if (cursoBd == null){
//            return false;
//        }
//        cursoBd.setNome(aluno.getNome());
//        cursoBd.setAlunos(aluno.getCpf());
//        return true;
//    }
    public boolean removerCurso(@PathVariable int idCurso) {
        return cursos.removeIf(cur -> cur.getIdCurso() == (idCurso));
    }
}
