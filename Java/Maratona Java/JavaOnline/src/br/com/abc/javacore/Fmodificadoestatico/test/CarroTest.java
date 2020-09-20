package br.com.abc.javacore.Fmodificadoestatico.test;

import br.com.abc.javacore.Fmodificadoestatico.classes.Carro;

/**
 *
 * @author edivan
 */
public class CarroTest {

    public static void main(String[] args) {
        Carro.velocidadeLimite = 220;

        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Audi", 275);
        Carro c3 = new Carro("Mercedes", 290);

        c1.imprimir();
        c2.imprimir();
        c3.imprimir();

        System.out.println("#######################");

        c1.imprimir();
        c2.imprimir();
        c3.imprimir();

    }

}
