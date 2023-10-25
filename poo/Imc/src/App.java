import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Calculadora IMC");
            System.out.println("----------------------------");

            System.out.print("Digite o Seu Nome: ");
            String nome = scan.nextLine();

            System.out.print("Digite a Sua Idade: ");
            int idade = scan.nextInt();

            System.out.print("Digite a Sua Altura(Em Metros): ");
            double altura = scan.nextDouble();

            System.out.print("Digite o Seu Peso(Kg): ");
            double peso = scan.nextDouble();

            scan.nextLine();
            System.out.print("Digite o Seu Sexo(M ou F): ");
            char sexo = scan.nextLine().charAt(0);
            System.out.println();

            Pessoa pessoa = new Pessoa(nome, idade, altura, peso, sexo);
            pessoa.imprimeIMC();

            System.out.print("Deseja sair do programa (S para sair)? ");
            String resposta = scan.nextLine();
            if (resposta.equals("S")) {
                break; // Sai do loop
            }

            scan.close();
            
        }
    }

}