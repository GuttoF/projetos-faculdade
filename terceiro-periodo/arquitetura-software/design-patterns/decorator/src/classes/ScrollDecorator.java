package classes;

public class ScrollDecorator extends Decorator {
    public ScrollDecorator(Component componente) {
        super(componente);
    }

    @Override
    public void draw() {
        super.draw();
        addScroll();
    }

    private void addScroll() {
        System.out.println("ScrollDecorator: Adicionando scroll ao componente.");
    }
}
