package br.com.abc.javacore.Dsobrecargaconstrutores.test;


import br.com.abc.javacore.Dsobrecargaconstrutores.classes.Estudante;

/**
 *
 * @author edivan
 */
public class EstudanteTest {

    public static void main(String[] args) {
        
        Estudante estudante = new Estudante("232", "Edivan", new double[]{8, 9, 7},"20/09/2020");
        estudante.imprimir();
    }

}
