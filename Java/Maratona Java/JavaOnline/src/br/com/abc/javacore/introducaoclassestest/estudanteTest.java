package br.com.abc.javacore.introducaoclassestest;

import br.com.abc.javacore.introducaoclasses.Estudante;

/**
 *
 * @author edivan
 */
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
