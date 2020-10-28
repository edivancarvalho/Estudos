package llista;

/**
 *
 * @author edivan
 */
public class TesteLista {
    public static void main(String[] args) {
        
        Lista lista = new Lista(10);
        lista.insereInicio(4);
        lista.insereInicio(3);
        lista.insereInicio(2);
        lista.insereInicio(1);
        
        lista.mostraLista();
        lista.inserePosicao(3,10);
        lista.mostraLista();
    }
    
}
