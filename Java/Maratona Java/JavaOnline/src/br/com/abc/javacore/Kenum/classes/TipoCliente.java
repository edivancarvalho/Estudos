package br.com.abc.javacore.Kenum.classes;

/**
 *
 * @author edivan
 */
public enum TipoCliente {
    PESSOA_FISICA(1), PESSOA_JURIDICA(2);

    private int tipo;

    private TipoCliente(int tipo) {
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
    }
    
}
