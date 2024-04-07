import classes.ConfigurationApi;

public class Singleton {
    public static void main(String[] args) {
        var configuration = ConfigurationApi.getInstance();
        var configuration2 = ConfigurationApi.getInstance();

        System.out.println(configuration);
        System.out.println(configuration2);
    }
}
