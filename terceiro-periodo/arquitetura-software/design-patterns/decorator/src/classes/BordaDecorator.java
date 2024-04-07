package classes;

public class BordaDecorator extends Decorator {
    public BordaDecorator(Component componente) {
        super(componente);
    }

    @Override
    public void draw() {
        super.draw();
        adicionarBorda();
    }

    private void adicionarBorda() {
        System.out.println("BordaDecorator: Adicionando borda ao componente.");
    }
}
