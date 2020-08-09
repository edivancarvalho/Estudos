package br.com.edivan.aula20;

/**
 *
 * @author edivan
 */
public class Matrizes {

    public static void main(String[] args) {

        double[][] notasAlunos = new double[3][4]; // 30 alunos e 4 notas;

        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 7;
        notasAlunos[0][2] = 9;
        notasAlunos[0][3] = 9.5;

        notasAlunos[1][0] = 9;
        notasAlunos[1][1] = 7;
        notasAlunos[1][2] = 8;
        notasAlunos[1][3] = 7.5;

        notasAlunos[2][0] = 6;
        notasAlunos[2][1] = 9;
        notasAlunos[2][2] = 8;
        notasAlunos[2][3] = 8.5;

        for (int i = 0; i < notasAlunos.length; i++) {
            //System.out.println(notasAlunos[i] + " ");
            for (int j = 0; j < notasAlunos[i].length; j++) {
                System.out.print(notasAlunos[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println();
        notasAlunos[1][3] = 10; // mudando a nota do aluno;

        for (int i = 0; i < notasAlunos.length; i++) {
            for (int j = 0; j < notasAlunos[i].length; j++) {
                System.out.print(notasAlunos[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println();
        // calculado  a media do aluno
        System.out.println("Calculado a média de cada aluno");

        double soma = 0;
        for (int i = 0; i < notasAlunos.length; i++) {

            soma = 0;
            for (int j = 0; j < notasAlunos[i].length; j++) {
                soma += notasAlunos[i][j];
            }
            System.out.println("Média do aluno: " + i + " é = " + (soma / 4));
            
        }
        System.out.println();
        double[] notasAluno1 = {10, 10, 10, 10};

        double[][] notasAlunos2 = {{7, 7, 7, 7}, {10, 10, 10, 10}};
        
        System.out.println("Output da matrix notasAlunos2");
        
        for (int i = 0; i < notasAlunos2.length; i++) {
            for (int j = 0; j < notasAlunos2[i].length; j++) {
                System.out.print(notasAlunos2[i][j] + " ");

            }
            System.out.println();
        }
    }
}
