package aAtividades;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class atividade02 {

    public static void main(String[] args) {
        Scanner rs = new Scanner(System.in);
        int a, l = 0;

        System.out.println("Digite a altura ");
        a = rs.nextInt();
        System.out.println("Digite a Largura ");
        l = rs.nextInt();
        imprimir(a, l);
    }

    private static void imprimir(int a, int l) {
        for (int i = a; i >= 1; i--) {
            for (int j = l; j >= i; j--) {
                System.out.printf("*");
            }
            System.out.println("");
        }
    }

}
