package br.com.abc.javacore.Fmodificadoestatico.test;

import br.com.abc.javacore.Fmodificadoestatico.classes.Cliente;


/**
 *
 * @author edivan
 */
public class ClienteTest {

    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();
        Cliente c3 = new Cliente();
        System.out.println("Exibindo quantidade de parcelas possiveis");
        // Mostra um array de parcelas
//        for (int parcela : c1.getParcela()){
//            System.out.print(parcela + " ");
//        }
        System.out.println("tamanho: " + Cliente.getParcelas().length);

    }

}
