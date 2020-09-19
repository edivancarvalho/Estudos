package br.com.abc.javacore.introducaometodos.classes;

/**
 *
 * @author edivan
 */
public class Estudante {

    private String nome;
    private int idade;
    private double[] notas;

    public void print() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);

        if (this.notas != null) {
            for (double nota : this.notas) {
                System.out.print(nota + " ");
            }
        }
    }

    public void tirarMedia() {
        // validação de notas null no Array;
        // caso a media nao exita;
        if (this.notas == null) {
            System.out.println("esse aluuno não possui notas");
            return;
        }

        double media = 0;
        for (double nota : this.notas) {
            media += nota;
        }
        media = media / this.notas.length;

        if (media > 6) {
            System.out.println("\nA média é " + media + " situação: Aprovado");
            return;
        }
        System.out.println("\nA média é " + media + " situação: Reprovado");
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("Você precisa de uma Idade maior ou igual a ZERO");
            return;
        }
        this.idade = idade;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public double[] getNotas() {
        return this.notas;
    }

}
