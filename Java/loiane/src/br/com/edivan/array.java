package br.com.edivan;

/**
 *
 * @author edivan
 */
public class array {
    public static void main(String[] args) {
        double tempDia01 = 33;
        double tempDia02 = 32.1;
        double tempDia03 = 32.7;
        double tempDia04 = 28;
        double tempDia05 = 22.5;
        double tempDia06 = 15.2;
        
        // usando array
        double[] temperaturas = new double[31];
        temperaturas[0] = 16.4;
        temperaturas[1] = 23.4;
        temperaturas[2] = 34.3;
        temperaturas[3] = 13;
        temperaturas[4] = 33;
        temperaturas[5] = 13.2;
        
        System.out.println("O valor da temperatura do dia 1 è: " + temperaturas[0]);
        // Para saber quantos array existem na variaveis temperaturas
        System.out.println("O tamanho do array: " + temperaturas.length);
        
        System.out.println("Valores do array : ");
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("O valor da temperatura do dia " + (i+1) + " é: " + temperaturas[i]);
        }
        // for para array;
        for (double temp : temperaturas){
            System.out.println(temp);
        }
    }
    
}
