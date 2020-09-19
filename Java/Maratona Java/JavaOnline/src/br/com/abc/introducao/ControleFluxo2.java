package br.com.abc.introducao;

/**
 * Operado Ternario
 *
 * @author edivan
 */
public class ControleFluxo2 {

    public static void main(String[] args) {
        
        int idade = 20;
        String status = "";
        String status2 = "";
        
        if (idade < 18){
            status = " não Adulto";
        }else{
            status = "Adulto";
        }
        System.out.println(status);
        
        // mesmo codigo usando o ternario
        status2 = idade < 18 ? "Não Adulto" : "Adulto"; // sempre dever seguir a logica do booleano;
        System.out.println(status2);
    }

}
