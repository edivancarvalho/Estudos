package br.com.abc.javacore.Lclassesabstratas.classes;

/**
 *
 * @author edivan
 */
public class Gerente extends Funcionario{

    public Gerente() {
    }

    public Gerente(String nome, String clt, double salario) {
        super(nome, clt, salario);
    }

    @Override
    public void calcularSalario() {
        this.salario = salario + (salario * 0.2);
    }

    @Override
    public void print() {
        
    }
    
    
}
