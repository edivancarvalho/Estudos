package br.com.abc.javacore.Hheranca.classes;

/**
 *
 * @author edivan
 */
public class Pessoa {
    protected String nome;
    protected String cpf;    
    protected Endereco endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public void print(){
        System.out.println("Nome: "+ this.nome);
        System.out.println("CPF: "+ this.cpf);
        System.out.println("End: "+ this.endereco.getBairro());
    }
}
