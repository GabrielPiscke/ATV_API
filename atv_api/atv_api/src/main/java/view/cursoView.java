package view;

import controller.cursoController;
import model.Curso;
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
    @GetMapping ("/{id}")
    public Curso getById(@PathVariable int id) {
        return controller.getById(id);
    }
    @PostMapping
    public boolean insert(@RequestBody Curso curso){
        return controller.inserir(curso);
    }
    @PutMapping("/{id}")
    public Curso updateCurso(@RequestBody Curso curso,@PathVariable int id){
        return controller.atualizarCurso(id, curso);
    }
    @PutMapping("/{id}")
    public Curso updateAluno(@RequestBody Curso alunos,@PathVariable int id){
        return controller.atualizarCurso(id, alunos);
    }
    @DeleteMapping("/{id}")
    public void removerCurso(@PathVariable int idCurso) {
        controller.removerCurso(idCurso);
    }
}
