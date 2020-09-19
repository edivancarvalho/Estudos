/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.abc.introducao.arrays;

/**
 *
 * @author edivan
 */
public class Array3 {
    public static void main(String[] args) {
        int[] numeros1 = new int [5];
        int[] numeros2 = {1, 2, 3, 4, 5}; // tamanho é 5, mais o index é de 0 a 4;
        int[] numeros3 = new int[]{1,2,3,4,5};
        
        // usando o for normal;
        for (int i = 0; i < numeros2.length; i++){
            System.out.println(numeros2[i]);
        }
        
        // usando [for each] = ele faz a mesma coisa que o for normal;
        for (int aux : numeros2){
            System.out.println(aux);
        }
        
        
    }
}
