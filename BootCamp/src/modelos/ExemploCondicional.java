package modelos;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class ExemploCondicional {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a nota:");
        int nota = scan.nextInt();
        System.out.printf("\n%s %s", "O aluno foi", (nota >= 5 ? "aprovado\n"
                : "reprovado\n"));
    }
}
