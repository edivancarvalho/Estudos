package br.com.abc.javacore.introducaometodos.test;

import br.com.abc.javacore.introducaometodos.classes.Estudante;

/**
 *
 * @author edivan
 */
public class EstudanteTest {

    public static void main(String[] args) {

        Estudante estudante = new Estudante();
        estudante.setNome("Edivan");
        estudante.setIdade(-1);
        estudante.setNotas(new double[]{1, 7, 3});
        estudante.print();
        estudante.tirarMedia();
    }

}
