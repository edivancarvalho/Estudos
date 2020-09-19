package br.com.abc.introducao;

/**
 *
 * @author edivan
 */
public class Array2 {

    public static void main(String[] args) {

        // byte, short, int, long, float, double = 0;
        // char '\u0000' = ' '
        // boolean = false;
        // reference null;
        int[] idades = new int[3];
        char[] nome = new char[3];
        String[] nomes = new String[3];
        
        System.out.println("Idade 1: " + idades[0]);
        System.out.println("Idade 2: " + idades[1]);
        System.out.println("Idade 3: " + idades[2]);

        System.out.println("Nome 1: " + nome[0]);
        System.out.println("Nome 2: " + nome[1]);
        System.out.println("Nome 3: " + nome[2]);

        nomes[0] = "Edivan";
        nomes[1] = "jose";
        nomes[2] = "van";
        // nomes.lengt; mostra o tamanho do array;
        for (int i = 0; i < nomes.length; i++) {
            System.out.println((i + 1)+ " Nome: " + nomes[i]);
        }

    }

}
