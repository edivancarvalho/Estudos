package br.com.abc.javacore.Aintroducaoclasses.test;

import br.com.abc.javacore.Aintroducaoclasses.classes.Estudante;

/**
 *
 * @author edivan
 */
// conceito de coesao no EM BOO;
// uma classe fazer uma determinado função no codigo;
public class estudanteTest {
    public static void main(String[] args) {
        
        Estudante joao = new Estudante();
        joao.nome = "joao";
        joao.matricula = "1212";
        joao.idade = 15;
        
        System.out.println(joao.nome);
        System.out.println(joao.matricula);
        System.out.println(joao.idade);
    }
    
}
