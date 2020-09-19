package br.com.abc.introducao.arrays;

/**
 *
 * @author edivan
 */
public class Arrays6 {
    public static void main(String[] args) {
        
//        int [][] dias = new int [3][];
//        dias [0] = new int [2];
//        dias [1] = new int []{1,2,3};
//        dias [2] = new int[4];
        // outra forma do array;
        
        int [][] dias = {{0,0},{1,2,3},{0,0,0,0}}; // essa aqui;
        
        //Qual é o valor da posicao [1][2] = 3;
        for (int[] arr : dias ){
            for (int num : arr){
                System.out.println(num);
            }
        }
    }
    
}
