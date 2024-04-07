import classes. * ;

public class Implementation {
    public static void main(String[] args) {
        Component textField = new TextField(100, 20);
        Component bordaDecorada = new BordaDecorator(textField);
        Component scrollEBordaDecorada = new ScrollDecorator(bordaDecorada);

        System.out.println("TextField sem decoradores:");
        textField.draw();

        System.out.println("\nTextField com borda:");
        bordaDecorada.draw();

        System.out.println("\nTextField com borda e scroll:");
        scrollEBordaDecorada.draw();
    }
}
