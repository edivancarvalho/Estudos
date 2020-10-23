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
        int x, y;
        x = 1;
        y = 1;
        System.out.println("Digite o tamanho do lado do quadrado");
        int lado = sc.nextInt();
        while (y <= lado) {

            while (x <= lado) {

                if ((y == 1) || (y == lado)) {
                    System.out.print("* ");
                    x++;
                } else {
                    if ((x == 1) || (x == lado)) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                    x++;
                }
            }
            System.out.println("");
            y++;
            x = 1;
        }

    }

}
