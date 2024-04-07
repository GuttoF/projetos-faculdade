package classes;

public class BrickHouse extends HouseConstructor {

    @Override
    protected void buildStructure() {
        System.out.println("Construindo estrutura com aço.");
    }

    @Override
    protected void buildWalls() {
        System.out.println("Adicionando tijolos nos pilares de concreto.");
    }

    @Override
    protected void paint() {
        System.out.println("Pintando com cores escolhidas pelo cliente.");
    }

    @Override
    protected void decorate() {
        System.out.println("Decorando a casa com cortinas clássicas e móveis industriais.");
    }
}