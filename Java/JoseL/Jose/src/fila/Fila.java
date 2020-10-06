package fila;

/**
 *
 * @author edivan
 */
public class Fila {

    private int tamanho;
    private int inicio;
    private int fim;
    private int array[];
    private int quantidadeDeElementos;

    public Fila() {
        this(10); // chama o construtor com paramento
    }

    public Fila(int tamanho) {
        if (tamanho <= 0) {
            throw new RuntimeException("tamanho tem que ser marios que zero");
        }

        this.tamanho = tamanho;
        this.array = new int[tamanho];
        inicio = 0;
        fim = 0;
        quantidadeDeElementos = 0;

    }

    public boolean empty() {
        return quantidadeDeElementos == 0;
    }

    public int size() {
        return quantidadeDeElementos;
    }

    //enfileirar
    public void enqueue(int elemento) {
        if (quantidadeDeElementos == tamanho) {
            throw new RuntimeException("Tela cheia");
        }
        array[fim] = elemento;

        fim = (fim + 1) % tamanho; // resto da divisao é zero;
        quantidadeDeElementos++;

    }

    // desfileira
    public void dequeue() {
        if (empty()) {
            throw new RuntimeException("Tela vazia");
        }
        inicio = (inicio + 1) % tamanho;
        quantidadeDeElementos--;

    }
    public int peek(){
        return array[inicio];
    }
    // destroi
    public void destroy(){
        inicio = 0;
        fim  = 0;
        quantidadeDeElementos = 0;
    }

}
