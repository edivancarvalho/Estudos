package modelosSwitch;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class ExemploSwitch {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um numero de 1 a 5: ");
        int num = scan.nextInt();
        switch (num) {
            case 1:
                System.out.println("Número UM");
                break;
            case 2:
                System.out.println("Número DOIS");
                break;
            case 3:
                System.out.println("Número TRÊS");
                break;
            case 4:
                System.out.println("Número QUATRO");
                break;
            case 5:
                System.out.println("Número CINCO");
                break;
            default:
                System.out.println("Número incorreto");
        }
    }
}
