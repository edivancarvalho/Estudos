package br.com.abc.javacore.Kenum.test;

import br.com.abc.javacore.Kenum.classes.Cliente;
import br.com.abc.javacore.Kenum.classes.TipoCliente;

/**
 *
 * @author edivan
 */
public class ClienteTest {
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente("Edivan", TipoCliente.PESSOA_FISICA);
        System.out.println(cliente);
    }
    
}
