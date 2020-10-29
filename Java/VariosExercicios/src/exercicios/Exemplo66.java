package exercicios;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Exemplo66 {

    public static void main(String[] args) {
        Scanner rs = new Scanner(System.in);

        int[][] g = new int[6][2];
        double prod;

        try {
            for (int i = 0; i < 6; i++) {
                prod = 1;
                for (int j = 0; j < 2; j++) {
                    System.out.println("Entre com o valoes de G-" + i + ", " + j);
                    g[i][j] = Integer.parseInt(rs.nextLine());
                    prod = prod * g[i][j];
                }
                System.out.println("Linha-" + i + ": " + Math.sqrt(prod));
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro durante a leitura");
        }
    }
}
