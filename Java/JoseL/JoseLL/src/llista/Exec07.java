
package llista;

public class Exec07 {
    private final int MAXTAM;
    private int array[];
    private int ultimo;

    public Exec07(int tamanho) {
        if (tamanho <= 0) {
            throw new RuntimeException("Tamanho tem que ser maior que zero");
        }
        MAXTAM = tamanho;
        array = new int[MAXTAM];
        ultimo = -1;
    }

    public boolean listaVazia() {
        return ultimo == -1;
    }

    public boolean listaCheia() {
        return ultimo + 1 == MAXTAM;
    }

    public int listaTamanho() {
        return ultimo + 1;
    }

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
        array[++ultimo] = elemento;
    }

    public void inserePosicao(int posicao, int elemento) {
        if (listaCheia()) {
            throw new RuntimeException("Lista Cheia");
        }
        if (posicao < 0 || posicao > ultimo + 1) {
            throw new RuntimeException("Posição inválida");
        }
        ultimo++;
        for (int i = ultimo; i > posicao; i--) {
            array[i] = array[i - 1];
        }
        array[posicao] = elemento;
    }

    public void removeInicio() {
        if (listaVazia()) {
            throw new RuntimeException("Lista Vazia");
        }
        for (int i = 0; i < ultimo; i++) {
            array[i] = array[i + 1];
        }
        ultimo--;
    }

    public void removeFim() {
        if (listaVazia()) {
            throw new RuntimeException("Lista Vazia");
        }
        ultimo--;
    }

    public void removePosicao(int posicao) {
        if (listaVazia()) {
            throw new RuntimeException("Lista Vazia");
        }
        if (posicao < 0 || posicao > ultimo) {
            throw new RuntimeException("Posição inválida");
        }
        for (int i = posicao; i < ultimo; i++) {
            array[i] = array[i + 1];
        }
        ultimo--;
    }

    public boolean removeElemento(int elemento) {
        int pos = buscaElemento(elemento);
        if (pos == -1) {
            return false;
        }
        removePosicao(pos);
        return true;
    }

    public int buscaElemento(int elemento) {
        for (int i = 0; i <= ultimo; i++) {
            if (array[i] == elemento) {
                return i;
            }
        }
        return -1;
    }

    public int getInicio() {
        if (listaVazia()) {
            throw new RuntimeException("Lista Vazia");
        }
        return array[0];
    }

    public int getFim() {
        if (listaVazia()) {
            throw new RuntimeException("Lista Vazia");
        }
        return array[ultimo];
    }

    public int getPosicao(int posicao) {
        if (listaVazia()) {
            throw new RuntimeException("Lista Vazia");
        }
        if (posicao < 0 || posicao > ultimo) {
            throw new RuntimeException("Posição inválida");
        }
        return array[posicao];
    }

    public void destroi() {
        ultimo = -1;
    }

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

    public int buscaBinaria(int[] itens, int elemento) {
        int inicio = 0, meio = 0, fim = itens.length - 1, posi = 0;
        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            if (itens[meio] == elemento) {
                return meio;
            } else if (itens[meio] < elemento) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        if (listaVazia())
            return -1;
        return -1;
    }

    public static void main(String[] args) {
        Exec07 lista = new Exec07(6);
        lista.insereFim(2);
        lista.insereFim(5);
        lista.insereFim(22);
        lista.insereFim(220);
        lista.insereFim(230);
        lista.insereFim(930);
        int posicao = lista.buscaBinaria(lista.array, 930);
        lista.mostraLista();
        System.out.println(posicao);
        lista.removePosicao(posicao);
        System.out.println("-------------");
        lista.mostraLista();
    }
}
