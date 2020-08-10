package br.com.edivan.aula20.labs;

import java.util.Random;

/**
 *
 * @author edivan
 */
public class Exer01 {

    public static void main(String[] args) {

        int[][] numerosAleatorios = new int[4][4];

        Random numeroRandom = new Random();

        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                numerosAleatorios[i][j] = numeroRandom.nextInt(200);
            }
        }

        int maior = 0;
        int linha = 0;
        int col = 0;
        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                if (numerosAleatorios[i][j] > maior) {
                    maior = numerosAleatorios[i][j];
                    linha = i;
                    col = j;
                }
            }
        }
        // Conferir os valores gerados
        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                System.out.print(numerosAleatorios[i][j] + "  ");
            }
            System.out.println();
        }
        // Resultado final
        System.out.println("Maior Valor = " + maior);
        System.out.println("Linha = " + linha);
        System.out.println("Coluna = " + col);
    }

}
