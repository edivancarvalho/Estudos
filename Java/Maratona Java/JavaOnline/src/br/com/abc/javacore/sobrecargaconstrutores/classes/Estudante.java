package br.com.abc.javacore.sobrecargaconstrutores.classes;

/**
 *
 * @author edivan
 */
public class Estudante {

    private String matricula;
    private String nome;
    private double[] notas;
    private String dataMatricula;

    // Contrutores
    public Estudante(String matricula, String nome, double[] notas) {
        this.matricula = matricula;
        this.nome = nome;
        this.notas = notas;
    }

    // Sobrecarga de construtor; Estudante ↓
    public Estudante(String matricula, String nome, double[] notas, String dataMatricula) {
        this(matricula, nome, notas);
        this.dataMatricula = dataMatricula;
    }

    public Estudante() {
        System.out.println("Consrutor padrão");
    }

    // Metodos
    public void imprimir() {
        System.out.println(this.nome);
        System.out.println(this.matricula);

        for (double nota : notas) {
            System.out.println(nota + " ");
        }

    }

    // set's e get's

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }
    
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

}
