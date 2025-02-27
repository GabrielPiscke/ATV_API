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
    public Curso getByid(@PathVariable int idCurso) {
        return controller.getByid(idCurso);
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

    @PostMapping("/aluno/{idCurso}")
    public Curso insertAluno(@RequestBody Aluno aluno, @PathVariable int idCurso){
        return controller.inserirAluno(idCurso, aluno);
    }

    @PutMapping("/prof/{idCurso}")
    public boolean atualizarCurso(@RequestBody Curso curso,@PathVariable int idCurso, @RequestBody Professor prof){
        return controller.updateCurso(idCurso, curso, prof);
    }

    @PutMapping("/aluno/{alunoId}/{idCurso}")
    public boolean updateAluno(@RequestBody Aluno aluno,@PathVariable int alunoId,@PathVariable int idCurso){
        return controller.atualizarAluno(alunoId, aluno, idCurso);
    }

    @DeleteMapping("/{idCurso}")
    public void removerCurso(@PathVariable int idCurso) {
        controller.removerCurso(idCurso);
    }
}
