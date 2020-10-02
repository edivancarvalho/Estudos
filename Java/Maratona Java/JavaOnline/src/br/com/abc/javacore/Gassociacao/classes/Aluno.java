package br.com.abc.javacore.Gassociacao.classes;

/**
 *
 * @author edivan
 */
public class Aluno {

    private String nome;
    private int idade;
    // aluno pode esta 1 seminario;
    private Seminario seminario;

    public Aluno() {
    }

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
// prints ====================================

    public void print() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (this.seminario != null) {
            System.out.println("Seminario inscrito: " + this.seminario.getTitulo());
        } else {
            System.out.println("Aluno não esta incrito em nenhum seminario");

        }
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
