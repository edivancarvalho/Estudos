package br.com.abc.javacore.Eblocodeinicializacao.test;

import br.com.abc.javacore.Eblocodeinicializacao.classes.Cliente;

/**
 *
 * @author edivan
 */
public class ClienteTest {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        System.out.println("Exibindo quantidade de parcelas possiveis");
        // Mostra um array de parcelas
        for (int parcela : cliente.getParcela()){
            System.out.print(parcela + " ");
        }
    }

}
