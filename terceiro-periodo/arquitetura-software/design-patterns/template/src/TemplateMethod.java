import classes. *;

public class TemplateMethod {
    public static void main(String[] args) {
        HouseConstructor casaDeTijolos = new BrickHouse();
        HouseConstructor casaDeMadeira = new WoodHouse();

        System.out.println("Construindo uma casa de tijolos:");
        casaDeTijolos.buildHouse();

        System.out.println("\nConstruindo uma casa de madeira:");
        casaDeMadeira.buildHouse();
    }
}
