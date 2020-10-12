package br.com.abc.javacore.Npolimorfismo.test;

import br.com.abc.javacore.Npolimorfismo.classes.Funcionario;
import br.com.abc.javacore.Npolimorfismo.classes.Gerente;
import br.com.abc.javacore.Npolimorfismo.classes.RelatorioPagamento;
import br.com.abc.javacore.Npolimorfismo.classes.Vendedor;

/**
 *
 * @author edivan
 */
public class PolimorfismoTest {

    public static void main(String[] args) {
        Gerente g = new Gerente("Edivan", 6500, 2000);
        Vendedor v = new Vendedor("joao", 2300, 1200);
        RelatorioPagamento relatorio = new RelatorioPagamento();
//        relatorio.relatorioPagamentoGerente(g);
//        System.out.println("------------------------");
//        relatorio.relatorioPagamentoVendedor(v);

        relatorio.relatorioPagamentoGenerico(g);
        relatorio.relatorioPagamentoGenerico(v);

        
    }

}
