package br.com.abc.javacore.Aintroducaoclasses.test;

import br.com.abc.javacore.Aintroducaoclasses.classes.Professor;

/**
 *
 * @author edivan
 */
public class ProfessorTest {

    public static void main(String[] args) {

        Professor professor = new Professor();        
        professor.nome = "Edivan Carvalho";
        professor.matricular = 390303;
        professor.rg = 341234;
        
        professor.cpf = 11111111111L;
        Professor professor2 =  new Professor();
        professor2.nome = "Jose da silva";
        professor2.matricular = 3411;
        professor2.rg = 1234123;
        professor2.cpf = 22233344490L;
        
        System.out.println("----------------");
        System.out.println(professor.matricular);
        System.out.println(professor.nome);
        System.out.println(professor.rg);
        System.out.println(professor.cpf);
        
        System.out.println("----------------");
        System.out.println(professor2.matricular);
        System.out.println(professor2.nome);
        System.out.println(professor2.rg);
        System.out.println(professor2.cpf);
    }

}
