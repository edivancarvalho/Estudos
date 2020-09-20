package br.com.abc.javacore.Bintroducaometodos.test;

import br.com.abc.javacore.Bintroducaometodos.classes.Calculadora;

/**
 *
 * @author edivan
 */
public class ParametrosTest {
    public static void main(String[] args) {
        
        Calculadora calculadora = new Calculadora();
        int num1 = 5;
        int num2 = 10;
        calculadora.alteraDoisNumeros(num1, num2);
        System.out.println("Dentro do ParametroTeste ");
        System.out.println("num1: "+ num1);
        System.out.println("num2: "+ num2);
        
    }
    
}
