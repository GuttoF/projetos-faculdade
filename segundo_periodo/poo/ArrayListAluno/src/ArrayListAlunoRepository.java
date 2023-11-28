import java.util.List;
import java.util.ArrayList;

public class ArrayListAlunoRepository implements iAlunoRepository {
    private List<Aluno> alunos;

    public ArrayListAlunoRepository() {
        this.alunos = new ArrayList<>();
    }

    public void adicionar(Aluno aluno) {
        alunos.add(aluno);
    }

    // Removendo iterator
    public void remover(Aluno aluno) {
        alunos.remove(aluno);
    }

    public Aluno buscar(String nome) {
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equals(nome)) {
                return aluno;
            }
        }
        return null;
    }

    public List<Aluno> listar() {
        return new ArrayList<>(alunos);
    }
    
}

