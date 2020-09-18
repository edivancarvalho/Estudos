package javaonline;
// Swicth

/**
 *
 * @author edivan
 */
public class ControleFluxo3 {

    public static void main(String[] args) {
        // char , int, byte, enum e string
        byte dia = 5;

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Qaurta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
        }
        char sexo = 'v';
        switch (sexo ){
           
            case 'F':
                System.out.println("Feminino");break;
            case 'M':
                System.out.println("Masculino");break;
            default:
                System.out.println("opção invalida");break;
                
        }
    }

}
