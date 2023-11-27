import java.util.List;


public class App {
    public static void main(String[] args) throws Exception {
        // Instaciando a classe ArrayListAlunoRepository com interface
        iAlunoRepository repo = new ArrayListAlunoRepository();

        // Adicionar 5 alunos
        repo.adicionar(new Aluno("Ana", "11111"));
        repo.adicionar(new Aluno("Bia", "12222"));
        repo.adicionar(new Aluno("Carlos", "13333"));
        repo.adicionar(new Aluno("Daniel", "14444"));
        repo.adicionar(new Aluno("Eduardo", "15555"));

        // Listar os alunos
        System.out.println("Lista de Alunos:");
        List<Aluno> alunos = repo.listar();
        for (Aluno aluno : alunos) {
            System.out.println("Nome: " + aluno.getNome() + ", Matrícula: " + aluno.getMatricula());
        }

        // Buscar e retornar um aluno da lista
        Aluno alunoBusca = repo.buscar("Bia");
        System.out.println("Aluno buscado: " + alunoBusca.getNome() + " e " + alunoBusca.getMatricula());

        // Remover um aluno da lista
        Aluno alunoRemover = new Aluno("Bia", "12222");
        repo.remover(alunoRemover);

        // Listar os alunos restantes
        System.out.println("\nLista de Alunos Atualizada:");
        alunos = repo.listar();
        for (Aluno aluno : alunos) {
            System.out.println("Nome: " + aluno.getNome() + ", Matrícula: " + aluno.getMatricula());
        }
    }
}
