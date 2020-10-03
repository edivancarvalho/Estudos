package br.com.abc.javacore.Hheranca.classes;

/**
 *
 * @author edivan
 */
//           Funcionario  é uma  Pessoa
public class Funcionario extends Pessoa {

    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * Usando uma SubEscrita de Metodo é quando a classe atual sobreescreve o
     * metodo que é Herdado da classe pai. tipo: public void print(){} - aqui
     * nesse caso o metodo irár sobeEscrever o metodo que receber do pai, mais
     * para isso precisa ter o mesmo nome
     *
     * public void print(String valor){} mesmo nome "print" e quantidade de
     * paramentros diferentes
     *
     *
     */
    /*Agora para esta imprimindo o salario da classe funcionario, iremos usar o
    a sobre-escrita de metodo junto com o Super;
    Super = Usar o metodo da classe pai
     */
    public void print() {
        super.print();
        System.out.println("Salário: " + this.salario);
        printReciboPagamento();
    }

    public void printReciboPagamento() {
        /* para usar o super.nome → foi preciso mudar o modificador de acessso na 
classe pessoas para protected */
        System.out.println("Eu " + super.nome + " Recebi o pagamento de "
                + this.salario);
    }

}
