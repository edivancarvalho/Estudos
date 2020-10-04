package br.com.abc.javacore.Lclassesabstratas.test;

import br.com.abc.javacore.Lclassesabstratas.classes.Gerente;
import br.com.abc.javacore.Lclassesabstratas.classes.Vendedor;

/**
 *
 * @author edivan
 */
public class FuncionarioTest {

    public static void main(String[] args) {

        Gerente g = new Gerente("Edivan", "1231-1", 2000);
        Vendedor v = new Vendedor("Camila", "123-1", 1500, 5000);
        g.calcularSalario();
        v.calcularSalario();
        System.out.println(g);
        System.out.println("---------------------------");
        System.out.println(v);

    }

}
