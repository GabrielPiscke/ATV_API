package com.example.atv_api.view;

import com.example.atv_api.controller.cursoController;
import com.example.atv_api.model.Aluno;
import com.example.atv_api.model.Curso;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/curso")

public class cursoView {
    cursoController controller = new cursoController();

    @GetMapping
    public List<Curso>getAll(){
        return controller.getAll();
    }

    @GetMapping ("/{cursoId}")
    public Curso getById(@PathVariable int cursoId) {
        return controller.getById(cursoId);
    }

    @GetMapping ("/professor/{nome}")
    public Curso getNomeProf(@PathVariable String nome) {
        return controller.filtroProf(nome);
    }

    @GetMapping ("/{numeroSala}")
    public Curso getNumeroSala(@PathVariable int numeroSala) {
        return controller.filtroSala(numeroSala);
    }

    @PostMapping
    public boolean insert(@RequestBody Curso curso){
        return controller.inserir(curso);
    }

    @PostMapping("{cursoId}/aluno")
    public Curso insertAluno(@RequestBody Aluno aluno, @PathVariable int cursoId){
        return controller.inserirAluno(cursoId, aluno);
    }

    @PutMapping("/{cursoId}")
    public boolean updateCurso(@RequestBody Curso curso,@PathVariable int cursoId){
        return controller.atualizarCurso(cursoId, curso);
    }

    @PutMapping("/aluno/{alunoId}")
    public boolean updateAluno(@RequestBody Aluno aluno,@PathVariable int alunoId,@PathVariable int idCurso){
        return controller.atualizarAluno(alunoId, aluno, idCurso);
    }

    @DeleteMapping("/{idCurso}")
    public void removerCurso(@PathVariable int idCurso) {
        controller.removerCurso(idCurso);
    }
}
