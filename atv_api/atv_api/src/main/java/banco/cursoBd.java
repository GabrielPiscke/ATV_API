package banco;

import model.Aluno;
import model.Curso;
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
    public boolean atualizarAluno(int alunoId, Aluno aluno) {
        Curso cursoBd = alunos.stream()
                .filter(objeto -> objeto.getArrayList() == alunoId)
                .findFirst()
                .orElse(null);
        if (cursoBd == null){
            return false;
        }
        cursoBd.setArrayList(aluno.getNome());
        cursoBd.setArrayList(aluno.getCpf());
        return true;
    }
    public boolean removerCurso(@PathVariable int idCurso) {
        return cursos.removeIf(cur -> cur.getIdCurso() == (idCurso));
    }

}
