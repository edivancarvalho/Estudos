package br.com.abc.javacore.Bintroducaometodos.classes;

import br.com.abc.javacore.Bintroducaometodos.classes.Professor2.*;

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
    
    // quando esta na mesma classe usar-se o this e nao o -->
    // public void imprime(Professor2 profImprime){}
    public void imprime(){
        System.out.println("-----------------");
        System.out.println(this.cpf);
        System.out.println(this.matricular);
        System.out.println(this.nome);
        System.out.println(this.rg);
    }
    
}
