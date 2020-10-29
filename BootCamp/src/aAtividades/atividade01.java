package aAtividades;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class atividade01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Scanner sc = new Scanner(System.in);
        int a, l;
        a = 1;
        l = 0;
        System.out.println("Digite o tamanho do lado do quadrado");
        int lado = sc.nextInt();
        while (l <= lado) {

            while (a <= lado) {

                if ((l == 1) || (l == lado)) {
                    System.out.print("* ");
                    a++;
                } else {
                    if ((a == 1) || (a == lado)) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                    a++;
                }
            }
            System.out.println("");
            l++;
            a = 1;
        }

    }

}
