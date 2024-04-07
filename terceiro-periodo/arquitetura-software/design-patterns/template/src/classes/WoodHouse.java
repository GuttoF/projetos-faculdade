package classes;

public class WoodHouse extends HouseConstructor {

    @Override
    protected void buildStructure() {
        System.out.println("Construindo estrutura com madeira.");
    }

    @Override
    protected void buildWalls() {
        System.out.println("Construindo paredes de madeira.");
    }

    @Override
    protected void paint() {
        System.out.println("Pintando a casa com uma cor de madeira natural.");
    }

    @Override
    protected void decorate() {
        System.out.println("Decorando a casa com móveis de madeira.");
    }
}
