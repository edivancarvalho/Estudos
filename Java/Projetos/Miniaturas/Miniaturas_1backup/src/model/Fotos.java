package model;

/**
 *
 * @author edivan
 */
public class Fotos {
    private int iden;
    private String caminho;
    private String descricao;
    
    Miniaturas miniaturas = new Miniaturas(iden, caminho, caminho, descricao, descricao, descricao, iden);

    public Fotos(int iden, String caminho, String descricao) {
        this.iden = iden;
        this.caminho = caminho;
        this.descricao = descricao;
    }

    public Fotos() {
    }

    public int getIden() {
        return iden;
    }

    public void setIden(int iden) {
        this.iden = iden;
    }

    public String getCaminho() {
        return caminho;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Miniaturas getMiniaturas() {
        return miniaturas;
    }

    public void setMiniaturas(Miniaturas miniaturas) {
        this.miniaturas = miniaturas;
    }
    
    public void print(){
        System.out.println("-----\tFotos \t------");
        System.out.println("Iden "+this.iden+", Caminho: "+this.caminho+", Descrição: "+this.descricao);
    }
    
}
