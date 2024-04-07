package classes;

public abstract class Decorator implements Component {
    protected Component componente;

    public Decorator(Component componente) {
        this.componente = componente;
    }

    public void draw() {
        componente.draw();
    }
}
