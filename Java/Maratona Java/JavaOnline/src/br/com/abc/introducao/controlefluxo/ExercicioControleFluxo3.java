package br.com.abc.introducao.controlefluxo;

/**
 *
 * @author edivan
 */
public class ExercicioControleFluxo3 {

    public static void main(String[] args) {
// Imprima todos os numeros pares de 0 até 100000;

        int valor = 100;

        for (int i = 0; i <= valor; i++) {
            if (i % 2 == 0) { // impar mudar [ i % 2 != 0 ]
                System.out.println("Par: " + i);
            }else{
                System.out.println("Impar: " + i);
            }
        }
        
        
    }

}
