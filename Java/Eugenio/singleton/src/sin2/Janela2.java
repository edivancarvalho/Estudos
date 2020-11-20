package sin2;

/**
 *
 * @author edivan
 */
public class Janela2 {
    private static Janela2 instancia;

    public Janela2() {
    }
    
    public static synchronized Janela2 getInstance(){
        if (instancia == null){
           instancia = new Janela2();
        }
        return instancia;
    }

    boolean Abrir() {
        System.out.println("aberto");
        return Abrir();
    }
}
