package br.com.abc.javacore.Gassociacao.classes;

/**
 *
 * @author edivan
 */
public class Professor {
    private String nome;
    private String especialidade;

    private Seminario[] seminarios;
    public Professor() {
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }
// ======= print
    public void print(){
        System.out.println("=====\t Relatorio de Professor \t=====");
        System.out.println("Nome: "+ this.nome);
        System.out.println("Especialidade: "+ this.especialidade);
        System.out.printf("Seminarios participantes: ");
        for (Seminario semimario : seminarios){
            System.out.println(semimario.getTitulo() + " ");
        }
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
    
    
}
