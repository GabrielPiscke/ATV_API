package com.example.atv_api.view;

import com.example.atv_api.controller.cursoController;
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
    @PostMapping
    public boolean insert(@RequestBody Curso curso){
        return controller.inserir(curso);
    }
    @PutMapping("/{cursoId}")
    public Curso updateCurso(@RequestBody Curso curso,@PathVariable int cursoId){
        return controller.atualizarCurso(cursoId, curso);
    }
    @PutMapping("/aluno/{alunoId}")
    public Curso updateAluno(@RequestBody Curso alunos,@PathVariable int alunoId){
        return controller.atualizarCurso(alunoId, alunos);
    }
    @DeleteMapping("/{idCurso}")
    public void removerCurso(@PathVariable int idCurso) {
        controller.removerCurso(idCurso);
    }
}
