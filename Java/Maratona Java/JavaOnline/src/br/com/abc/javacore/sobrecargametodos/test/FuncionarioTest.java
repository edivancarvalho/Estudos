package br.com.abc.javacore.sobrecargametodos.test;

import br.com.abc.javacore.sobrecargametodos.classes.Funcionario;

/**
 *
 * @author edivan
 */
public class FuncionarioTest {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        funcionario.init("Edivan Carvalho", "444.555.786-90", 5000, "345245-87");
        funcionario.imprime();
    }

}
