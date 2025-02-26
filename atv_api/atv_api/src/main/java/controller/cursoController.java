package controller;

import banco.cursoBd;
import model.Aluno;
import model.Curso;
import java.util.List;

public class cursoController {
    cursoBd repository = new cursoBd();

    public List<Curso> getall() {
        return repository.getById();
    }

    public Aluno getById(int id) {
        return repository.findAll();
    }

    public String insert(Curso curso) {
        return repository.insert(curso);
    }

    public Curso update(int id, Curso curso) {
        boolean resultado = repository.upadte(id, Curso);


        if (resultado) {
            return null;
        }
        return null;
    }
}
