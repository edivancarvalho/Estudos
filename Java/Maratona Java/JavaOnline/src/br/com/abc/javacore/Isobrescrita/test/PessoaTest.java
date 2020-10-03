package br.com.abc.javacore.Isobrescrita.test;

import br.com.abc.javacore.Isobrescrita.classes.Pessoa;

/**
 *
 * @author edivan
 */
public class PessoaTest {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Joaquina na esquina");
        p.setIdade(300);
        System.out.println(p);
        
        Pessoa p2 = new Pessoa();
        p2.setNome("Joao na esquina");
        p2.setIdade(450);
        System.out.println(p2);
    }
}
