package br.com.abc.javacore.Fmodificadoestatico.classes;

/**
 *
 * @author edivan
 */
public class Carro {

    // velocidade limite deve ser de 240km/h
    private String nome;
    private double velocidadeMaxima;
    // quando é static o variavel se torna da classe e não do objeto;
    private static double velocidadeLimite = 240;

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Carro() {

    }

    public void imprimir() {
        System.out.println("----------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade Maxima: " + this.velocidadeMaxima);
        System.out.println("Velocidade Limite: " + velocidadeLimite);
    }
    // get e set's de variaveis statico →
    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;
    }
    public static double getVelocidadeLimite(){
        return velocidadeLimite;
    }
    // fim de velocidade Limite ←
    
    // Padrao de setś e get's
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
    
}
