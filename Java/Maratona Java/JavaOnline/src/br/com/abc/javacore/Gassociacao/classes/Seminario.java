package br.com.abc.javacore.Gassociacao.classes;

/**
 *
 * @author edivan
 */
public class Seminario {

    private String titulo;
    // seminario tem varios alunos
    private Aluno[] alunos;

    private Professor professor;
    private Local local;
// contrutores;

    public Seminario() {
    }

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    // prints
    public void print() {
        System.out.println("=====\t Relatorio de Seminario \t=====");
        System.out.println("Titulo: " + this.titulo);
        

        if(this.professor != null){
            System.out.println("Professor "+this.professor.getNome() );
        }else{
            System.out.println("Nenhum profesor cadastrado para esse seminario");
        }
        
        if (this.local != null) {
            System.out.println("Local: " + this.local.getRua() + "Bairro: " + this.local.getBairro());
        } else {
            System.out.println("nenhum local cadastrado par aesse seminario");
        }

        if (alunos != null && alunos.length != 0) {
            System.out.println("Alunos participantes");
            for (Aluno aluno : alunos) {
                System.out.println(aluno.getNome());
            }
            return;
        }
        System.out.println("Nenhum Aluuno cadastrado.");

    }

// gets e sets
    public Aluno[] getAlunos() {
        return alunos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

}
