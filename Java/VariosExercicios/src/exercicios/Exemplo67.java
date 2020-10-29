package exercicios;

import java.util.Scanner;

public class Exemplo67 {

    public static void main(String[] args) {
        Scanner rs = new Scanner(System.in);
        final int nProvas = 3;
        final int nAlunos = 30;
        float NotaProva[][] = new float[nAlunos][nProvas];
        float MediaAlunos[] = new float[nAlunos];
        float MediaProvas[] = new float[nProvas];
        float Soma;
        
        try {
            for (int i = 0; i < nAlunos; i++) {
                Soma = 0;
                for (int j = 0; j < nProvas; j++) {
                    System.out.println("Entre com a nota do aluno-" + i + " Nota- " + j);
                    NotaProva[i][j] = rs.nextFloat();
                    Soma = Soma + NotaProva[i][j];
                    MediaAlunos[i] = Soma / nProvas;
                }
            }
            for (int j = 0; j < nProvas; j++) {
                Soma = 0;
                for (int i = 0; i < nAlunos; i++) {
                    Soma = Soma + NotaProva[i][j];
                    MediaProvas[j] = Soma / nAlunos;
                }
            }
            for (int i = 0; i < nAlunos; i++) {
                System.out.println("Media do Aluno-" + i + ": " + MediaAlunos[i]);
            }
            
            for (int i = 0; i < nProvas; i++) {
                System.out.println("Media da Prova-" + i + ": " + MediaProvas[i]);
            }
        } catch (Exception e) {
            System.out.println("ocorreu um erro durante a leitura!");
        }
    }
}
