package lista01;

/**
 *
 * @author edivan
 */
public class ListaSimples101 {

    IntNoSimples primeiro, ultimo;
    int numero_nos;

    ListaSimples101() {
        primeiro = ultimo = null;
        numero_nos = 0;
    }

    void insereNo_fim(IntNoSimples novoNo) {
        novoNo.prox = null;
        if (primeiro == null) {
            primeiro = novoNo;
        }
        if (ultimo != null) {
            ultimo.prox = novoNo;
            
        }
        ultimo = novoNo;
        numero_nos++;
    }

}
