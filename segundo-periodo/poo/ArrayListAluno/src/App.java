import java.util.ArrayList;
import java.util.List;
import repositories.ArrayListAlunoRepository;
import contracts.iAlunoRepository;
import exceptions.AlunoNaoEncontradoException;
import exceptions.MatriculaInvalidaException;
import models.Aluno;


/**
 * Classe principal que contém o método main para executar o programa.
 */
public class App {
    /**
     * Método principal que inicia a execução do programa.
     * 
     * @param args Os argumentos de linha de comando.
     */
    /**
     * Método principal que inicia a execução do programa.
     * 
     * @param args Os argumentos de linha de comando passados para o programa.
     */
    public static void main(String[] args) {
        iAlunoRepository alunoRepository = new ArrayListAlunoRepository();

        List<Aluno> alunos = new ArrayList<>();

        try {
            adicionarAlunos(alunos);
        } catch (AlunoNaoEncontradoException | MatriculaInvalidaException e) {
            e.printStackTrace();
        }

        for (Aluno aluno : alunos) {
            try {
                if (aluno.getMatricula().length() != 10) {
                    throw new MatriculaInvalidaException("Matrícula inválida, deve ter 10 números");
                }
                alunoRepository.adicionar(aluno);
            } catch (MatriculaInvalidaException e) {
                e.printStackTrace();
            }
        }

        List<Aluno> alunosListados = alunoRepository.listar();
        for (Aluno aluno : alunosListados) {
            System.out.println("Nome: " + aluno.getNome() + ", Matricula: " + aluno.getMatricula());
        }

        try {
            Aluno aluno = alunoRepository.buscar("Aluno 3");
            if (aluno == null) {
                throw new AlunoNaoEncontradoException("Aluno não encontrado");
            }
            System.out.println("Aluno encontrado: " + aluno.getNome());
        } catch (AlunoNaoEncontradoException e) {
            e.printStackTrace();
        }

        try {
            Aluno alunoToRemove = alunoRepository.buscar("Aluno 6");
            if (alunoToRemove == null) {
                throw new AlunoNaoEncontradoException("Aluno não encontrado");
            }
            alunoRepository.remover(alunoToRemove);
        } catch (AlunoNaoEncontradoException e) {
            e.printStackTrace();
        }

        List<Aluno> remainingAlunos = alunoRepository.listar();
        for (Aluno remainingAluno : remainingAlunos) {
            System.out.println("Nome: " + remainingAluno.getNome() + ", Matricula: " + remainingAluno.getMatricula());
        }
    }

    /**
     * Adiciona alunos à lista de alunos.
     * 
     * @param alunos A lista de alunos.
     * @throws AlunoNaoEncontradoException Se ocorrer um erro ao adicionar um aluno.
     * @throws MatriculaInvalidaException Se a matrícula do aluno for inválida.
     */
    public static void adicionarAlunos(List<Aluno> alunos) throws AlunoNaoEncontradoException, MatriculaInvalidaException {
        alunos.add(new Aluno("Aluno 1", "1234567890"));
        alunos.add(new Aluno("Aluno 2", "3435496343"));
        alunos.add(new Aluno("Aluno 3", "2352354242"));
        alunos.add(new Aluno("Aluno 4", "4353443243"));
        alunos.add(new Aluno("Aluno 5", "3454543523"));
    }
}