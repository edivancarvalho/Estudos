/*
 * Crier uma classe que calcule uma determinada porcentagem de um dado salário
 */
package br.com.edivan.logica;

/**
 *
 * @author edivan
 */
public class CalculadoraImposto {
    public static void main(String[] args) {
        
        float salario = 2500.00F;
        float porcentagem = 0.3F; // = 30%
        float porcentagemDosalario = salario * porcentagem;
        System.out.println(porcentagemDosalario);
        
        
    }
    
}
