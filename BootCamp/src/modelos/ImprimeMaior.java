package modelos;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class ImprimeMaior {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um numero:");
        int n1 = scan.nextInt();
        System.out.print("Digite outro numero:");
        int n2 = scan.nextInt();
        System.out.printf("O maior numero é: %d", n1 > n2 ? n1 : n2);
    }
}
