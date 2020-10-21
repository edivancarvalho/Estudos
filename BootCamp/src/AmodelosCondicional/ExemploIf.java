package AmodelosCondicional;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class ExemploIf {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a idade:");
        int idade = scan.nextInt();
        if (idade >= 16) {
            System.out.println("Pode votar");
        } else {
            System.out.println("Não pode votar");
        }
    }
}
