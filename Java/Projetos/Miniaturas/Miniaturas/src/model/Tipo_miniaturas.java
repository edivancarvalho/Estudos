package model;

/**
 *
 * @author edivan
 */
public class Tipo_miniaturas {
    private int iden;
    private String tipo;

    Miniaturas miniatuuras = new Miniaturas(iden, tipo, tipo, tipo, tipo, tipo, iden);
    
    public Tipo_miniaturas() {
    }

    public Tipo_miniaturas(int iden, String tipo) {
        this.iden = iden;
        this.tipo = tipo;
    }

    public int getIden() {
        return iden;
    }

    public void setIden(int iden) {
        this.iden = iden;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Miniaturas getMiniatuuras() {
        return miniatuuras;
    }

    public void setMiniatuuras(Miniaturas miniatuuras) {
        this.miniatuuras = miniatuuras;
    }
    
    public void print(){
        System.out.println("------\tTipo de Miniatura \t------");
        System.out.println("Iden: " + this.iden+ ", Tipo: "+ this.tipo);
        
        
    }
    
}
