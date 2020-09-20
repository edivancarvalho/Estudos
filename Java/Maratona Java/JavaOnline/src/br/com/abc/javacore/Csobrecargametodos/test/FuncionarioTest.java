package br.com.abc.javacore.Csobrecargametodos.test;

import br.com.abc.javacore.Csobrecargametodos.classes.Funcionario;

/**
 *
 * @author edivan
 */
public class FuncionarioTest {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Edivan Carvalho", "444.555.786-90", 5000, "345245-87");
        Funcionario funcionario2 = new Funcionario();
        
        funcionario.imprime();
        funcionario2.imprime();
    }

}
