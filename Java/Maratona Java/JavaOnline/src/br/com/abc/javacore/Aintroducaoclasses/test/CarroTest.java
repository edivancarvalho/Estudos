package br.com.abc.javacore.Aintroducaoclasses.test;

import br.com.abc.javacore.Aintroducaoclasses.classes.Carro;

/**
 *
 * @author edivan
 */
public class CarroTest {

    public static void main(String[] args) {
        Carro carro = new Carro();
        
        carro.modelo = "Fusca";
        carro.placa = "QWE768D";
        carro.velocidadeMaxima = 123f;
        System.out.println(carro.modelo);
        System.out.println(carro.placa);
        System.out.println(carro.velocidadeMaxima);
    }

}
