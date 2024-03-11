package exceptions;

/**
 * Exceção lançada quando um aluno não é encontrado.
 */
public class AlunoNaoEncontradoException extends Exception {
    /**
     * Construtor que recebe uma mensagem de erro.
     * 
     * @param message a mensagem de erro
     */
    public AlunoNaoEncontradoException(String message) {
        super(message);
    }
}
