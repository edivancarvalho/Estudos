package br.com.abc.javacore.introducaometodos.test;

import br.com.abc.javacore.introducaometodos.classes.Calculadora;

/**
 *
 * @author edivan
 */
public class CalculadoraTest {
    public static void main(String[] args) {
        
        Calculadora calculadora = new Calculadora();
        
        calculadora.somaDoisNumeros();  // metodos usa --> ();
        calculadora.subtraiDoisNumeros();
        calculadora.multiplicaDoisNumeros(5, 5);
        
        System.out.println("Divisão de dois números:");
        
        System.out.println(calculadora.divideDoisNumeros(20, 4));
        double resultado = calculadora.divideDoisNumeros(20, 0);
        System.out.println(resultado);
        
        // chama metodo void;
        System.out.println("\nImprimir dois numeros");
        calculadora.imprimeDoisNumerosDividos(20, 5);
        System.out.println("Continuando a exec");
        
//        int [] numeros = new int []{1,2,3,4,5};
//        calculadora.somaArray(numeros);
        
        int [] numeros = {1,2,3,4,5};
        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(1,2,3,4,5);
    }
    
}
