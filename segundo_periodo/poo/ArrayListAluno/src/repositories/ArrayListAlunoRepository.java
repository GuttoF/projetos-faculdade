package repositories;

import java.util.ArrayList;
import java.util.List;
import contracts.iAlunoRepository;
import models.Aluno;

/**
 * Classe que implementa a interface iAlunoRepository e representa um repositório de alunos
 * utilizando uma ArrayList para armazenar os alunos.
 */
public class ArrayListAlunoRepository implements iAlunoRepository {
    private List<Aluno> alunos;

    /**
     * Construtor padrão que inicializa a lista de alunos como uma nova ArrayList.
     */
    public ArrayListAlunoRepository() {
        this.alunos = new ArrayList<>();
    }

    /**
     * Adiciona um aluno ao repositório.
     * 
     * @param aluno O aluno a ser adicionado.
     */
    @Override
    public void adicionar(Aluno aluno) {
        alunos.add(aluno);
    }

    /**
     * Remove um aluno do repositório.
     * 
     * @param aluno O aluno a ser removido.
     */
    @Override
    public void remover(Aluno aluno) {
        alunos.remove(aluno);
    }

    /**
     * Busca um aluno pelo nome no repositório.
     * 
     * @param nome O nome do aluno a ser buscado.
     * @return O aluno encontrado ou null se não for encontrado.
     */
    @Override
    public Aluno buscar(String nome) {
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equals(nome)) {
                return aluno;
            }
        }
        return null;
    }

    /**
     * Retorna a lista de alunos do repositório.
     * 
     * @return A lista de alunos.
     */
    @Override
    public List<Aluno> listar() {
        return alunos;
    }
}
