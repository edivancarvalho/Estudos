package singleton;

/**
 * Usar se quando queremos que a classe tenha uma única instancia.
 * @author edivan
 */

public class Singleton {

    private static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public Singleton() {
    }

}
