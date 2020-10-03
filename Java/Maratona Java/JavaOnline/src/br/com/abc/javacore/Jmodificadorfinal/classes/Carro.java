package br.com.abc.javacore.Jmodificadorfinal.classes;

/**
 *
 * @author edivan
 */
public class Carro {

    public static final double VELOCIDADE_FINAL = 250;
    public final Comprador COMPRADOR = new Comprador();

    private String nome;
    private String marca;

    @Override
    public String toString() {
        return "Carro{" + "nome=" + nome + ", marca=" + marca + '}';
    }

    public final void print() {
        System.out.println("Imprimindo um carro");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean getComprador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
