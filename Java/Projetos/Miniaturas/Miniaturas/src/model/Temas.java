package model;

/**
 *
 * @author edivan
 */
public class Temas {

    private int iden;
    private String nome;

    public Temas() {
    }

    public Temas(int iden, String nome) {
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
        System.out.println("----\tTemas \t----");
        System.out.println("Iden: " + this.iden + ", Nome: " + this.nome);
        System.out.println("-----------------------------");
    }

}
