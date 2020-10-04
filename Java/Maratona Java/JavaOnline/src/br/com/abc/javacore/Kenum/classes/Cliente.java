package br.com.abc.javacore.Kenum.classes;

/**
 *
 * @author edivan
 */
public class Cliente {

    // Criando segundo modelo de enumeração
    public enum TipoPagamento {
        AVISTA, APRAZO;
    }

    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipo() {
        return tipoCliente;
    }

    public void setTipo(TipoCliente tipo) {
        this.tipoCliente = tipo;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    
    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", tipo=" + tipoCliente + ", tipoPagamento=" + tipoPagamento + 
                ", numero=" +tipoCliente.getTipo();
    }

    

}
