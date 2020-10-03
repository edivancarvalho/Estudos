package br.com.abc.javacore.Jmodificadorfinal.test;

import br.com.abc.javacore.Jmodificadorfinal.classes.Carro;

/**
 *
 * @author edivan
 */
public class CarroTest {
    public static void main(String[] args) {
        Carro c = new Carro();
        System.out.println(c.getComprador());
        
        c.getComprador().setNome("Kuririn");
        System.out.println(c.getComprador());
        
        
        
    }
    
}
