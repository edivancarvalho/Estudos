package model;

public class Matriculados {

    //Atributos
    private String nome;
    private String curso;
    private String situacao;
    private String enfase;

    //Metodos
    public Matriculados(String nome, String curso, String situacao, String enfase) {
        this.nome = nome;
        this.curso = curso;
        this.situacao = situacao;
        this.enfase = enfase;
    }

    public Matriculados(String str) {
        String[] vetor = str.split(";");
        this.nome = vetor[0];
        this.curso = vetor[1];
        this.situacao = vetor[2];
        this.enfase = vetor[3];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getEnfase() {
        return enfase;
    }

    public void setEnfase(String enfase) {
        this.enfase = enfase;
    }

}
