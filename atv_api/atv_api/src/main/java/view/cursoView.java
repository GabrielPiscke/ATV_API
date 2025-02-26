package view;

import controller.cursoController;
import model.Curso;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping
@RequestBody("/Curso")

public class cursoView {
    cursoController controller = new cursoController();

    @GetMapping
    public List<Curso>getAll(){
        return controller.getall();
    }
    @GetMapping ("/{id}")
    public Curso public Curso getById(@PathVariable int id) {
        return CursoController.getById(id);
    }
    @PostMapping
    public boolean inset(@RequestBody Curso curso){
        return controller instanceof(Curso);
    }
    @PutMapping("/{id}")
    public Curso update(@RequestBody Curso curso,@PathVariable int id){
        return controller.update(id, curso);
    }






}
