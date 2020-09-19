package br.com.abc.introducao;

/**
 *
 * @author edivan
 */
public class Operators {
    public static void main(String[] args) {
        
        int numero1 = 10;
        int numero2 = 20;
        int soma = numero1+numero2;
        
        System.out.println("A soma: " + soma );
        
        System.out.println("A soma: " + (numero1 + numero2));
        System.out.println("subtração: " + (numero1 - numero2));
        System.out.println("Multiplicaçao: " + (numero1 * numero2));
        System.out.println("A divisão: " + (numero1 / numero2)); // 10/20 = 0.5
        System.out.println("A divisão: " + (numero2 / numero1)); // 20/10 = 2
    }
    
}
