package br.com.abc.javacore.sobrecargametodos.classes;

/**
 *
 * @author edivan
 */
public class Funcionario {

    private String nome;
    private String cpf;
    private double salario;
    private String rg;

    public void init(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }
    
    // sobrecarga de metodo;https://youtu.be/uq4O__CGPdo?list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL
    public void init(String nome, String cpf, double salario, String rg) {
        init(nome, cpf, salario);
        this.rg = rg;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.salario);
        System.out.println(this.rg);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getRg() {
        return this.rg;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public double getsalario() {
        return this.salario;
    }
}
