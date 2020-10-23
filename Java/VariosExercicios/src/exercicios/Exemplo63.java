package exercicios;

import java.util.Scanner;

/**
 * efetue a leitura de cinco elementos para um vetor A. no final, apresentar a
 * soma de todos os elementos que sejam ímpares.
 *
 * @author edivan
 */
public class Exemplo63 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("efetue a leitura de cinco elementos para um vetor A. no final, apresentar a soma de todos os elementos que sejam ímpares.\n\n");

        final int tamanho = 5;
        int vetor[] = new int[tamanho];

        try {
            for (int i = 0; i < tamanho; i++) {
                System.out.println("Qual o numero? ");
                vetor[i] = entrada.nextInt();
            }
            int soma = 0;
            for (int i = 0; i < tamanho; i++) {
                if (vetor[i] % 2 != 0) {
                    soma = soma + vetor[i];
                }

            }
            System.out.println();
            System.out.println("Soma = " + soma);
        } catch (Exception e) {
            System.out.println("ocorreu um erro durante a leitura !");
        }
    }

}
