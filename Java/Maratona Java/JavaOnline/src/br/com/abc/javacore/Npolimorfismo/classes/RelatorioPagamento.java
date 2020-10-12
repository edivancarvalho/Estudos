package br.com.abc.javacore.Npolimorfismo.classes;

/**
 *
 * @author edivan
 */
public class RelatorioPagamento {
//    public void relatorioPagamentoGerente(Gerente gerente){
//        System.out.println("Gerando relatorio de pagamentos para a gerencia");
//        gerente.calcularPagamento();
//        System.out.println("Nome: " + gerente.getNome());
//        System.out.println("Salário desse mês: " + gerente.getSalario());        
//    }
//    
//    public void relatorioPagamentoVendedor(Vendedor vendedor){
//        System.out.println("Gerando relatorio de pagamentos para vendedores");
//        vendedor.calcularPagamento();
//        System.out.println("Nome: " + vendedor.getNome());
//        System.out.println("Salário desse mês: " + vendedor.getSalario());        
//    }

//usando o polimorfismo
    public void relatorioPagamentoGenerico(Funcionario funcionario) {
        System.out.println("Gerando relatorio de pagamentos");
        funcionario.calcularPagamento();
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salário desse mês: " + funcionario.getSalario());
//        usando catc
        if (funcionario instanceof Gerente) {
            Gerente g = (Gerente) funcionario;
            System.out.println("Participação nos lucros : " + g.getPnl());
        }
        if (funcionario instanceof Vendedor) {
            Vendedor v = (Vendedor) funcionario;
            System.out.println("Total vendas: " + v.getTotalVendas());
        }

    }

}
