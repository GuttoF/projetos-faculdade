package exceptions;

/**
 * Exceção lançada quando uma matrícula é inválida.
 */
public class MatriculaInvalidaException extends Exception {
    /**
     * Constrói uma nova exceção com a mensagem especificada.
     * 
     * @param message a mensagem de erro
     */
    public MatriculaInvalidaException(String message) {
        super(message);
    }
}