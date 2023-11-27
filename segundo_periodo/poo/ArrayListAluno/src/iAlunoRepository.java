import java.util.List;

// Implementar interface
public interface iAlunoRepository {
    void adicionar(Aluno aluno);
    void remover(Aluno aluno);
    Aluno buscar(String nome);
    List<Aluno> listar();
}
