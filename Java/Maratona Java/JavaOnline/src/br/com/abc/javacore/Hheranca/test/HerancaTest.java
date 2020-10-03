package br.com.abc.javacore.Hheranca.test;

import br.com.abc.javacore.Hheranca.classes.Endereco;
import br.com.abc.javacore.Hheranca.classes.Funcionario;
import br.com.abc.javacore.Hheranca.classes.Pessoa;

/**
 *
 * @author edivan
 */
public class HerancaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Edivan");
        pessoa.setCpf("13241324123");
        
        Endereco end = new Endereco();
        end.setBairro("Bairro 1");
        end.setRua("sao pedro");
        
        
        pessoa.setEndereco(end);
        pessoa.print();
        System.out.println("----------------");
        
        Funcionario fun = new Funcionario();
        fun.setNome("Jose belo");
        fun.setCpf("123413412");
        fun.setSalario(4500.00);
        fun.setEndereco(end);
        
        fun.print();
    }
    
}
