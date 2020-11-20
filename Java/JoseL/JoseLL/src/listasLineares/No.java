package listasLineares;

/**
 *
 * @author edivan
 */
public class No {

    private String informacao;
    private No proximo;

    public No(String informacao, No proximo) {
        this.informacao = informacao;
        this.proximo = proximo;
    }

    public String getInformacao() {
        return informacao;
    }

    public void setInformacao(String informacao) {
        this.informacao = informacao;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
    
    
}
