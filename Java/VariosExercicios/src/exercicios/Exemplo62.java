package exercicios;

import java.util.Scanner;
//algoritimo que efetuar a leitura de 10 elementos interios de um vetor Teste01. Vamos contruir um vetor teste02 do mesmo tipo, observando a seguinte regra de formação: se o valor do indice for PAR, o valor do elemneto deverá ser multiplicado por 5, se for IMPAR deverá ser somando por 5. ao final o conteudo dos dois vetores.
/**
 *
 * @author edivan
 */
public class Exemplo62 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int teste01[] = new int[10];
        int teste02[] = new int[10];

        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Qual o numero? ");
                teste01[i] = Integer.parseInt(entrada.next());
            }
            for (int i = 0; i < 10; i++) {
                if (i % 2 == 0) {
                    teste02[i] = teste01[i] * 5;
                } else {
                    teste02[i] = teste01[i] + 5;
                }
            }
            System.out.println();
            System.out.println("Resultado: ");
            
            for (int i = 0; i < 10; i++) {
                System.out.print("teste01[" + i + "]= " + teste01[i] + "\t");
                System.out.println("teste02[" + i + "] = " + teste02[i]);
            }
        } catch (Exception e) {
            System.out.println("ocorreu um erro durante a leitura!2");
        }
    }

}
