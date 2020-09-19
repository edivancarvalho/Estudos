package br.com.abc.introducao.controlefluxo;

/**
 *
 * @author edivan
 */
public class ExericioControleFluxo1 {
    /*
    crier uma variavel salario e imrime seu imposto;
    impost:
    salario < 1000 5%
    salario >= 1000 && ssalario < 2000 10%
    salario >= 2000 & salario < 4000 15%
    salario > 5000 20%
    */
    public static void main(String[] args) {
        double salario = 3500d;
        double imposto = 0;
        if (salario < 1000){
            imposto = salario * 0.05;
        }
        else if (salario >= 1000 && salario < 2000){
            imposto = salario * 0.10;
        }
        else if (salario >= 2000 && salario < 4000){
            imposto = salario * 0.15;
        }else{
            imposto = salario * 0.20;
        }
        System.out.println(imposto);
    }
    
}
