import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;


public class App {
    public static void main(String[] args) throws Exception {

        // ArrayList<Integer> numeros = new ArrayList<Integer>();

        // numeros.add(10);
        // numeros.add(25);
        // numeros.add(9);

        // System.out.println("Tamanho da lista: " + numeros.size());

        // for (Integer numero : numeros) {
            // System.out.println(numero);
        // }

        // System.out.println("Primeiro elemento: " + numeros.get(0));
        // System.out.println("Segundo elemento: " + numeros.get(1));

        // numeros.remove(1);

        // System.out.println("Tamanho da lista: " + numeros.size());
        // System.out.println("Segundo elemento: " + numeros);

        ArrayList<String> carros = new ArrayList<String>();
        carros.add("Kwid");
        carros.add("Celta");
        carros.add("Mobi");
        carros.add("Prius");
        carros.add("Civic");

        System.out.println("Lista:" + carros);

        String busca = "Celta";
        for (int i =0; i < carros.size(); i++) {
            if (carros.get(i).equals(busca)) {
        
                System.out.println("Carro encontrado: " + carros.get(i) + "\nÍndice: " + i);
            }
        }
        
        Iterator icarros = carros.iterator();
        while (icarros.hasNext()) {
            System.out.println(icarros.next());
        }
        
        ArrayList<Aluno> alunos = new ArrayList<>();

        Aluno aluno = new Aluno("João", "1232433434");
        Aluno aluno2 = new Aluno("Maria", "1232433434");

        alunos.add(aluno);
        alunos.add(aluno2);

        Iterator<Aluno> ialunos = alunos.iterator();

        while (ialunos.hasNext()) {
            Aluno alunoAtual = ialunos.next();
            System.out.println("Nome: " +alunoAtual.nome);
        }





    }
}
