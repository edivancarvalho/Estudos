package br.com.abc.javacore.Csobrecargametodos.classes;

/**
 *
 * @author edivan
 */
public class Funcionario {

    private String nome;
    private String cpf;
    private double salario;
    private String rg;

    // criando construtor
    public Funcionario(String nome, String cpf, double salario, String rg) {
        System.out.println("Dentro do construtor");
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.rg = rg;
    }

    public Funcionario() {

    }

    // Sobrecarga de metodos
    public void init(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public void init(String nome, String cpf, double salario, String rg) {
        init(nome, cpf, salario);
        this.rg = rg;
    }
    
    // Metodo Imprime
    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.salario);
        System.out.println(this.rg);
    }

    // Set's e Get's
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
