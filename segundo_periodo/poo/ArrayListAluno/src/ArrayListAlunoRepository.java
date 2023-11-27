import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class ArrayListAlunoRepository implements iAlunoRepository {
    private List<Aluno> alunos;

    public ArrayListAlunoRepository() {
        this.alunos = new ArrayList<>();
    }

    public void adicionar(Aluno aluno) {
        alunos.add(aluno);
    }

    public void remover(Aluno aluno) {
        Iterator<Aluno> iterator = alunos.iterator();
        while (iterator.hasNext()) {
            Aluno alunoAtual = iterator.next();
            if (alunoAtual.getNome().equals(aluno.getNome())) {
                iterator.remove();
                break;
            }
        }
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
