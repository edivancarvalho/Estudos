package model;

/**
 *
 * @author edivan
 */
public class Fabricantes {

    private int iden;
    private String nome;

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

    public void print() {
        System.out.println("----\t FABRICANTES \t----");
        System.out.println("Iden: " + this.iden + ", Nome: " + this.nome);
    }
    
    public void setSplitFabricante(String combo){
        String [] dados = combo.split(" - ");
        this.iden = Integer.parseInt(dados[0]);
        this.nome = dados[1];
        
    }
}
