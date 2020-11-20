package sin2;

/**
 *
 * @author edivan
 */
public class Janela {

    private static final Janela INSTANCE = new Janela();
    private static final String teste = "Olá";

    public static final String Singleton = "esse eu vejo fora";

    private Janela() {
        // operações de inicialização de classe
    }

    public static Janela getInstance() {
        return INSTANCE;
    }

    public static void Abrir() {
        System.out.println("abriu a janela...");
    }

    public static void Fechar() {
        System.out.println("Fechou a janela...");
    }

}
