public class App {
    public static void main(String[] args) throws Exception {
        
        AlunoMonitoria alunoM = new AlunoMonitoria();

        alunoM.nome = "Fulano";
        alunoM.matricula = 12345;
        alunoM.valorBolsa = 2323.24;
        alunoM.disciplina = "Matemática";

        System.out.println(alunoM.toString());

        AlunoIniciacaoCientifica alunoI = new AlunoIniciacaoCientifica();

        alunoI.nome = "Ciclano";
        alunoI.matricula = 54321;
        alunoI.valorBolsa = 2323.24;
        alunoI.tituloProjeto = "Projeto importante";

        System.out.println(alunoI.toString());
    }
}
