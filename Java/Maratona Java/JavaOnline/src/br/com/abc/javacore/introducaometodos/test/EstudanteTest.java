package br.com.abc.javacore.introducaometodos.test;

import br.com.abc.javacore.introducaometodos.classes.Estudante;

/**
 *
 * @author edivan
 */
public class EstudanteTest {
    public static void main(String[] args) {
        
        Estudante estudante = new Estudante();
        estudante.nome = "Edivan";
        estudante.idade = 30;
        estudante.notas = new double[]{9,9,9};
        estudante.print();
        estudante.tirarMedia();
    }
    
}
