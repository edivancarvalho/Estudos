package br.com.edivan.aula20;

/**
 *
 * @author edivan
 */
public class MatrizTridimensional {

    public static void main(String[] args) {

        int[][][] matrizTridimensionl = new int[3][3][3];

        for (int i = 0; i < matrizTridimensionl.length; i++) {
            for (int j = 0; j < matrizTridimensionl[i].length; j++) {
                for (int k = 0; k < matrizTridimensionl[i][j].length; k++) {
                    System.out.println("i = " + i + " | j = " + j + " | k = " + k); // para ver;
                    matrizTridimensionl[i][j][k] = i + j + k;
                }
            }
        }
        int soma = 0;
        int somaPares = 0;
        int somaImpares = 0;
        for (int i = 0; i < matrizTridimensionl.length; i++) {
            for (int j = 0; j < matrizTridimensionl[i].length; j++) {
                for (int k = 0; k < matrizTridimensionl[i][j].length; k++) {
                    soma += matrizTridimensionl[i][j][k];

                    if (matrizTridimensionl[i][j][k] % 2 == 0) {
                        somaPares += matrizTridimensionl[i][j][k];
                    } else {
                        somaImpares += matrizTridimensionl[i][j][k];
                    }
                }
            }
        }
        System.out.println("Soma total: " + soma);
        System.out.println("Soma pares: " + somaPares);
        System.out.println("Soma impares: " + somaImpares);

    }
}
