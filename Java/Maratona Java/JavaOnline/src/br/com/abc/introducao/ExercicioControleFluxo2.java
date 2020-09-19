package br.com.abc.introducao;

/**
 *
 * @author edivan
 */
public class ExercicioControleFluxo2 {
    public static void main(String[] args) {
        // crier um switch que dado um valor de 1 a 7
        // considerando 1 domingo se é dia util ou final de semana;
        
        byte dia = 1;
        String util = "Util";
        String fin = "Final de Semana";
        switch(dia){
            
            case 1: case 7:
                System.out.println(fin);break;
                
            case 2: case 3: case 4: case 5: case 6:
               System.out.println(util); break;
            
            default:
                System.out.println("opção invalida");break;
                   
        }
    }
    
}
