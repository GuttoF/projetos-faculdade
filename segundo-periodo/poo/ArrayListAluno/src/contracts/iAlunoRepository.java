package contracts;

import java.util.List;
import models.Aluno;

/**
 * Interface que define as operações básicas de um repositório de alunos.
 */
public interface iAlunoRepository {
    /**
     * Adiciona um aluno ao repositório.
     *
     * @param aluno O aluno a ser adicionado.
     */
    void adicionar(Aluno aluno);

    /**
     * Remove um aluno do repositório.
     *
     * @param aluno O aluno a ser removido.
     */
    void remover(Aluno aluno);

    /**
     * Busca um aluno pelo nome no repositório.
     *
     * @param nome O nome do aluno a ser buscado.
     * @return O aluno encontrado ou null se não for encontrado.
     */
    Aluno buscar(String nome);

    /**
     * Retorna uma lista com todos os alunos do repositório.
     *
     * @return A lista de alunos.
     */
    List<Aluno> listar();
}