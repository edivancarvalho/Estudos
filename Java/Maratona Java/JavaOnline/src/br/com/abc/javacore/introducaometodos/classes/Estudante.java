package br.com.abc.javacore.introducaometodos.classes;

/**
 *
 * @author edivan
 */
public class Estudante {

    public String nome;
    public int idade;
    public double[] notas;

    public void print() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);

        if (notas != null) {
            for (double nota : notas) {
                System.out.print(nota + " ");
            }
        }
    }

    public void tirarMedia() {
        // validação de notas null no Array;
        // caso a media nao exita;
        if (notas == null) {
            System.out.println("esse aluuno não possui notas");
            return;
        }

        double media = 0;
        for (double nota : notas) {
            media += nota;
        }
        media = media / notas.length;

        if (media > 6) {
            System.out.println("\nA média é " + media + " situação: Aprovado");
            return;
        }
        System.out.println("\nA média é " + media + " situação: Reprovado");
    }

}
