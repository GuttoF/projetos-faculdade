public class Pessoa {

    public String nome;
    public int idade;
    public double altura;
    public double peso;
    public char sexo;

    Pessoa(String nome, int idade, double altura, double peso, char sexo) {
    this.nome = nome;
    this.idade = idade;
    this.altura = altura;
    this.peso = peso;
    this.sexo = sexo;
  }

  public double calcIMC(){
    return peso / (altura * altura);
  }

  public void imprimeIMC(){

    double imc = Math.round(this.calcIMC());
    String classificação;

    if(imc <= 18.5){
      classificação = "Você Está Abaixo do Peso Normal";

    } else if(imc > 18.5 && imc <= 25){
      classificação = "Você Está no Peso Ideal";

    } else if(imc > 25 && imc < 30){
      classificação = "Você Está Acima do Peso";

    } else{
      classificação = "Você Está Obeso";
    }

    System.out.println("Suas Informações");
    System.out.println("-----------------------");
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
    System.out.println("Altura: " + altura);
    System.out.println("Peso: " + peso);
    System.out.println("Sexo: " + sexo);
    System.out.println("IMC: " + imc);
    System.out.println("Classificação: " + classificação);
    System.out.println();
  }
}