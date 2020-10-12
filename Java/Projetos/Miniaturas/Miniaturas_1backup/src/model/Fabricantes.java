package model;

/**
 *
 * @author edivan
 */
public class Fabricantes {
    private int iden;
    private String nome;
    
    Miniaturas miniaturas = new Miniaturas(iden, nome, nome, nome, nome, nome, iden);

    public Fabricantes() {
    }

    public Fabricantes(int iden, String nome) {
        this.iden = iden;
        this.nome = nome;
    }

    public int getIden() {
        return iden;
    }

    public void setIden(int iden) {
        this.iden = iden;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Miniaturas getMiniaturas() {
        return miniaturas;
    }

    public void setMiniaturas(Miniaturas miniaturas) {
        this.miniaturas = miniaturas;
    }
    
    public void print(){
        System.out.println("----\t FABRICANTES \t----");
        System.out.println("Iden: "+this.iden+", Nome: "+this.nome);
    }
    
}
