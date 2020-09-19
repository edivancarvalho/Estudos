package br.com.abc.javacore.introducaometodos.test;

import br.com.abc.javacore.introducaometodos.classes.Professor2;

/**
 *
 * @author edivan
 */
public class ProfessorTest {

    public static void main(String[] args) {

        Professor2 prof2 = new Professor2();
        
        prof2.cpf = "111.111.111-11";
        prof2.matricular = "11DF";
        prof2.nome = "Edivan Carvalho";
        prof2.rg = "35673";

        Professor2 prof3 = new Professor2();
        prof3.cpf = "222.111.111-21";
        prof3.matricular = "1Fsdf";
        prof3.nome = "jose Carvalho";
        prof3.rg = "35673";

        prof2.imprime();
        prof3.imprime();

    }

}
