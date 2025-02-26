package view;

import controller.cursoController;
import model.Curso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

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




}
