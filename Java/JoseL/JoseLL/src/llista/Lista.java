package llista;

/**
 *
 * @author edivan
 */
public class Lista {

    private final int MAXTAM;//final (constante)
    private int array[];
    private int ultimo;

    //contrutor
    public Lista(int tamanho) {
        if (tamanho <= 0) {
            throw new RuntimeException("Tamanho tem que ser maior que zero");
        }
        MAXTAM = tamanho;
        array = new int[MAXTAM];
        ultimo = -1;
    }

    public boolean listaVazia() {
        return ultimo == -1;
//        if(ultimo == -1)
//            return true;
//        return false;
    }

    public boolean listaCheia() {
        return ultimo + 1 == MAXTAM;
    }

    //quantidade de elementos armezanados na lista
    public int listaTamanho() {
        return ultimo + 1;
    }

    //insere início ==> inserir o elemento na posição zero e deslocar o demais para frente
    public void insereInicio(int elemento) {
        if (listaCheia()) {
            throw new RuntimeException("Lista Cheia");
        }
        ultimo++;
        for (int i = ultimo; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = elemento;
    }

    public void insereFim(int elemento) {
        if (listaCheia()) {
            throw new RuntimeException("Lista Cheia");
        }
        //ultimo++;
        array[++ultimo] = elemento;
    }

    public void inserePosicao(int posicao, int elemento) {
        if (listaCheia()) {
            throw new RuntimeException("Lista Cheia");
        }
        if (posicao < 0 || posicao > ultimo + 1) {
            throw new RuntimeException("Lista inválida");
        }
        ultimo++;
        for (int i = ultimo; i > posicao; i--) {
            array[i] = array[i - 1];
        }
        array[posicao] = elemento;
    }

    public void removePosicao(int posicao) {
        if (listaVazia()) {
            throw new RuntimeException("Lista vazia");
        }
        if (posicao < 0 || posicao > ultimo) {
            throw new RuntimeException("Lista inválida");
        }
    }

    public void removeFim() {
        if (listaVazia()) {
            throw new RuntimeException("Lista Vazia");
        }
        ultimo--;
    }

    public int getInicio() {
        if (listaVazia()) {
            throw new RuntimeException("Lista Vazia");
        }
        return array[0];
    }

    public int getPosicao(int posicao) {
        if (listaVazia()) {
            throw new RuntimeException("Lista Vazia");
        }
        if (posicao < 0 || posicao > ultimo) {
            throw new RuntimeException("Lista invalida");
        }
        return array[posicao];
    }

    // torna a lista vazia
    public void destroi() {
        ultimo = -1;
    }

    //mostra a lista
    public void mostraLista() {
        if (listaVazia()) {
            System.out.println("Lista Vazia");
        } else {
            System.out.println("Elementos da lista");
            for (int i = 0; i <= ultimo; i++) {
                System.out.printf("%d\t", array[i]);
            }
            System.out.println("");
        }
    }

}
