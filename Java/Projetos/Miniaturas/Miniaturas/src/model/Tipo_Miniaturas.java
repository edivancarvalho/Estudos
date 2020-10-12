package model;

/**
 *
 * @author edivan
 */
public class Tipo_Miniaturas {

    private int iden;
    private String tipo;

    public Tipo_Miniaturas() {
    }

    public Tipo_Miniaturas(int iden, String tipo) {
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

    public void print() {
        System.out.println("------\tTipo de Miniatura \t------");
        System.out.println("Iden: " + this.iden + ", Tipo: " + this.tipo);

    }

}
