package br.com.abc.introducao;

/**
 *
 * @author edivan
 */
public class OperadoresAtribuicao {
    public static void main(String[] args) {
        
        // operadores de atribuição
        // ==, -=, +=, /=, %=
        int salario = 1800;
        
        // salario = salario + 1800; a mesma coisa que abaixo;
        salario += 1800;
        
        salario *= 0.1; // 10% do salario
        salario = salario + (int) (salario * 0.1); // salario + 10%
        
        int numero = 11;
        numero %= 2; // para saber o resto do valor 11;
        
        System.out.println(salario);
        System.out.println(numero);
    }
    
}
