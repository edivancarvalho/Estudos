package br.com.abc.introducao.controlefluxo;

/**
 *
 * @author edivan
 */
// controle de fluxo for, while, do while;
public class ControleFluxo4 {

    public static void main(String[] args) {

        int contador = 11;

        // se usar quando vc nao tem certeza qantas vezes dever ser repetido um pedaço de codigo;
        // esse primeiro precisa ser validado como true;
        while (contador < 10) {
            System.out.println(contador++);
            //contador++;
        }

        // usar se quando vc saber quantas vezes sera repetido; tipo < 10;
        // esse não precisar se validado;
        contador = 0;
        do {
            System.out.println("dentro do do while: " + contador++);
        } while (contador < 10);

        // usando o for
        for (int i = 0; i < 10; i++) {
            System.out.println("Valor de i é: " + i);
            if (i == 5) {
                break;
            }

        }
        // o breack so poder ser usando detro dos seguintes fluxo:
        // swicth, while, do while e For.
    }

}
