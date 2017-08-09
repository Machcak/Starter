package pl.bzowski.starter;

/**
 *
 * @author mbzowski
 */
public class Starter {

    public static void main(String... args) {
        System.out.println("Starter");
        PropertiesReader propertiesReader = new PropertiesReader();
        System.out.println(propertiesReader.getAppVersion());
    }

}
