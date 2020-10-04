package br.com.abc.javacore.Kenum.classes;

/**
 *
 * @author edivan
 */
public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Fisica"), PESSOA_JURIDICA(2, "Pessoa Juridica"){
        public String getId(){
            return "B";
        }
    };

    private int tipo;
    private String nome;

    private TipoCliente(int tipo, String nome) {
        this.tipo = tipo;
        this.nome = nome;
    }

    // constant especific class body
    
    public String getId(){
        return "A";
    }
    
    public int getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }

}
