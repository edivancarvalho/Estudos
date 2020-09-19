package br.com.abc.introducao.controlefluxo;

/**
 *
 * @author edivan
 */
public class ControleFluxo1 {
    public static void main(String[] args) {
        
        int idade = 20;
        float salario = 2000;
        boolean c = false;
        boolean d = false;
        
        String categoria = "";
        
        if (c = true) {
            System.out.println("Imprimir verdadeiro");
            
        }
        if (d == true) {
            System.out.println("c é falso");
            
        }
        
        if (idade > 18){
            System.out.println("Entrou no IF");
        }else{
            System.out.println("Nao pode entra no clube");
        }
        //-------------------------------------------------
        if (idade > 15){
            categoria = "infantil";
        }
        else if (idade >=15 && idade <18){
            categoria = "Juvenil";
        }
        else{
            categoria = "Adulto";
        }
        System.out.println(categoria);
        
    }
}
