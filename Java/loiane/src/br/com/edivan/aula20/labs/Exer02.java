/**
 * Gere e imprima uma matriz M 10x10 com valores aleatórios entre
 * 0-9. Após isso indique qual é o maior e o menor valor da linha 5 e
 * qual é o maior e o menor valor da coluna 7.
 */
package br.com.edivan.aula20.labs;

import java.util.Random;

/**
 *
 * @author edivan
 */
public class Exer02 {

    public static void main(String[] args) {

        int[][] numerosAleatorios = new int[10][10];

        Random numeroRandom = new Random();

        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                numerosAleatorios[i][j] = numeroRandom.nextInt(100);
            }
        }

        // Conferir os valores gerados
        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                System.out.print(numerosAleatorios[i][j] + "  ");
            }
            System.out.println();
        }

        // maior e menor valor da linha 5;
        int maiorL5 = 0;
        int menorL5 = 101; // o ideal é usar o: Integer.MAX_VALUE;
        int linha5 = 5;
        for (int i = 0; i < numerosAleatorios[linha5].length; i++) {
            if (numerosAleatorios[linha5][i] > maiorL5) {
                maiorL5 = numerosAleatorios[linha5][i];
            }
            if (numerosAleatorios[linha5][i] < menorL5) {
                menorL5 = numerosAleatorios[linha5][i];
            }
        }
        System.out.println("Maior valor da linha 5 = " + maiorL5);
        System.out.println("Menor valor da linha 5 = " + menorL5);
        
        // maior e menor da coluna 7
        int maiorC7 = 0;
        int menorC7 = 101; // o ideal é usar o: Integer.MAX_VALUE;
        int col7 = 7;
        for (int i = 0; i < numerosAleatorios[col7].length; i++) {
            if (numerosAleatorios[i][col7] > maiorC7) {
                maiorC7 = numerosAleatorios[i][col7];
            }
            if (numerosAleatorios[i][col7] < menorC7) {
                menorC7 = numerosAleatorios[i][col7];
            }
        }
        System.out.println("Maior valor da coluna 7 = " + maiorC7);
        System.out.println("Menor valor da coluna 7 = " + menorC7);
    }

}
