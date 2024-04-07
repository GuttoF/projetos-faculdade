package classes;

public abstract class HouseConstructor {

    public final void buildHouse() {
        buildFoundation();
        buildStructure();
        buildWalls();
        paint();
        decorate();
    }

    private void buildFoundation() {
        System.out.println("Construindo fundação com concreto, ferro e areia.");
    }

    protected abstract void buildStructure();
    protected abstract void buildWalls();
    protected abstract void paint();
    protected abstract void decorate();
}