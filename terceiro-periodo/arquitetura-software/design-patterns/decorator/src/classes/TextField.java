package classes;

public class TextField implements Component {
    private int largura, altura;

    public TextField(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public void draw() {
        System.out.println("TextField: " + largura + ", " + altura);
    }
}
