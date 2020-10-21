package CmodelosRepaticao;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class ExemploWhile {

    public static void main(String[] args) {
        int status = 0;
        Scanner scan = new Scanner(System.in);

        while (status != 1) {
            System.out.print("Digite um inteiro:");
            int n1 = scan.nextInt();
            System.out.print("Digite outro inteiro:");
            int n2 = scan.nextInt();
            System.out.printf("\nSoma: %d \ndigite 1 para sair, "
                    + "qualquer outro numero para continuar", n1 + n2);
            status = scan.nextInt();
        }
    }
}
