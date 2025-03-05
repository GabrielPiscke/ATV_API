package com.example.atv_api.view;

import com.example.atv_api.controller.cursoController;
import com.example.atv_api.model.Aluno;
import com.example.atv_api.model.Curso;
import com.example.atv_api.model.Professor;
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

    @GetMapping ("/{idCurso}")
    public Curso filtroId(@PathVariable int idCurso) {
        return controller.filById(idCurso);
    }

    @GetMapping ("/professor/{nome}")
    public Curso getNomeProf(@PathVariable String nome) {
        return controller.filtroProf(nome);
    }

    @GetMapping ("/sala/{numeroSala}")
    public Curso getNumeroSala(@PathVariable int numeroSala) {
        return controller.filtroSala(numeroSala);
    }

    @PostMapping
    public boolean insert(@RequestBody Curso curso){
        return controller.inserir(curso);
    }

    @PostMapping("/{idCurso}/aluno")
    public Curso insertAluno(@RequestBody Aluno aluno, @PathVariable int idCurso){
        return controller.inserirAluno(idCurso, aluno);
    }

    @PutMapping("{idCurso}/prof")
    public boolean atualizarCurso(@RequestBody Curso curso,@PathVariable int idCurso, @RequestBody Professor prof){
        return controller.updateCurso(idCurso, curso, prof);
    }

    @PutMapping("/{idCurso}/aluno/{alunoId}")
    public boolean updateAluno(@RequestBody Aluno aluno,@PathVariable int alunoId,@PathVariable int idCurso){
        return controller.atualizarAluno(alunoId, aluno, idCurso);
    }

    @DeleteMapping("/{idCurso}/delete")
    public void removeCurso(@PathVariable int idCurso) {
        controller.removerCurso(idCurso);
    }
}
