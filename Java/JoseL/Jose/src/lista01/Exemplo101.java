package lista01;

/**
 *
 * @author edivan
 */
public class Exemplo101 {
    public static void main(String[] args) {
        ListaSimples101 Slit = new ListaSimples101();
        Slit.insereNo_fim(new IntNoSimples(1));
        Slit.insereNo_fim(new IntNoSimples(3));
        Slit.insereNo_fim(new IntNoSimples(5));
        Slit.insereNo_fim(new IntNoSimples(7));
        
        System.out.println("Primeiro valor: " +Slit.primeiro.valor);
        System.out.println("" + Slit.primeiro.prox.valor);
        System.out.println("numero: "+Slit.numero_nos);
        System.out.println("Segundo valor: "+Slit.ultimo.valor);
        
    }
    
}
