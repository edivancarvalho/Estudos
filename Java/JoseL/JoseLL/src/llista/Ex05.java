
package llista;

/**
 *
 * @author edivan
 */
public class Ex05 {

    public static void main(String[] args) {
        Lista lista = new Lista(10);
        try {
            for (int i = 0; i < 20; i++) {
                lista.inserePosicao(i, 10 - i);
            }
        } catch (Exception erro) {
            System.out.println(erro.getMessage());
        }
        lista.mostraLista();
        System.out.println("Fim: " + lista.getFim());
        System.out.println("Inicio: " + lista.getInicio());
        System.out.println("Posição: " + lista.getPosicao(9));
        lista.removeElemento(8);
        System.out.println("Após remoção: ");
        lista.mostraLista();
        System.out.println("Tamanho: " + lista.listaTamanho());
    }
}
