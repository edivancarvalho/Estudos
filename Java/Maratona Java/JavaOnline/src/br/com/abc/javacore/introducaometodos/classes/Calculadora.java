package br.com.abc.javacore.introducaometodos.classes;

/**
 *
 * @author edivan
 */
public class Calculadora {

    // void ; apenas executa o codigo sem retorno;
    public void somaDoisNumeros() {
        System.out.println(5 + 5);
    }

    public void subtraiDoisNumeros() {
        System.out.println(5 - 5);
    }

    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    // dever haver um retorno "return"
    public double divideDoisNumeros(double num1, double num2) { // nao poder ter divisao por zero.
        // primeira forma
        if (num2 != 0) {
            return num1 / num2;
        }
        return 0;
    }

    public void imprimeDoisNumerosDividos(double num1, double num2) {
        if (num2 != 0) {
            System.out.println(num1 / num2);
            return; // o return pode ser usado assim com ; somente com void.
        }
        System.out.println("Não é possivel dividir por 0.");
    }

}
