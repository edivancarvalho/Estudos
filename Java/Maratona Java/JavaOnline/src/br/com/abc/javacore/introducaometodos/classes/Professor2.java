package br.com.abc.javacore.introducaometodos.classes;

import br.com.abc.javacore.introducaometodos.classes.Professor2.*;

/**
 *
 * @author edivan
 */
// crie os seguintes atributos para essa classe;
// nome
// matricula
// rg
//cpf
// crier uma classe de teste para preencher e imprimir os dados desse professor;
public class Professor2 {
    
    public String nome = "";
    public String matricular;
    public String rg;
    public String cpf;
    
    public void imprime(Professor2 profImprime){
        System.out.println("-----------------");
        System.out.println(profImprime.cpf);
        System.out.println(profImprime.matricular);
        System.out.println(profImprime.nome);
        System.out.println(profImprime.rg);
    }
    
}
