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
    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario() {
    }
    // prints
    public void print(){
        System.out.println("=====\t Relatorio de Seminario \t=====");
        System.out.println("Titulo: "+this.titulo);
        System.out.println("Professor: " + this.professor.getNome());
        System.out.println("Local: " + this.local.getRua()+ "Bairro: " + this.local.getBairro());
        System.out.println("Alunos participantes");
        for(Aluno aluno : alunos){
            System.out.println(aluno.getNome());
        }
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
