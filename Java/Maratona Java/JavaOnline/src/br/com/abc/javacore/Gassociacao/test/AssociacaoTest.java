package br.com.abc.javacore.Gassociacao.test;

import br.com.abc.javacore.Gassociacao.classes.Aluno;
import br.com.abc.javacore.Gassociacao.classes.Local;
import br.com.abc.javacore.Gassociacao.classes.Professor;
import br.com.abc.javacore.Gassociacao.classes.Seminario;

/**
 *
 * @author edivan
 */
public class AssociacaoTest {

    public static void main(String[] args) {
        Aluno aluno = new Aluno("Edivan Carvalho", 32);
        Aluno aluno2 = new Aluno("Edivan", 22);
        Seminario seminario = new Seminario("Segurança da informação");

        Professor professor = new Professor("Jose", "POO");
        Local local = new Local("Rua 107, ", "Vila Nova");

        aluno.setSeminario(seminario);
        aluno2.setSeminario(seminario);

        seminario.setProfessor(professor);
        seminario.setLocal(local);
        seminario.setAlunos(new Aluno[]{aluno, aluno2});

        Seminario[] semArray = new Seminario[1];
        semArray[0] = seminario;
        professor.setSeminarios(semArray);
        
        seminario.print();
        professor.print();

    }

}
