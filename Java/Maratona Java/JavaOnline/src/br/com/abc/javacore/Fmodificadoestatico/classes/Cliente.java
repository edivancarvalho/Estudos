package br.com.abc.javacore.Fmodificadoestatico.classes;

/**
 *
 * @author edivan
 */
public class Cliente {
    // 0° - Bloco de inicialização estatico é executada quuando a JVM carregar a classe (Executando apenas 1 vez)
    // 1° - Alocado espaço na memoria para o objeto que será criado;
    // 2° - cada atributo de classe é criado e inicializado com seus valores default
    // ou valores explicitos
    // 3° - Bloco de inicialização e executado;
    // 4° - O contrutor é executado;
    private static int[] parcelas;

    // Bloco de inicialização 
    // com static ele somente executa somente uma vez;
    static {
        parcelas = new int[100];
        System.out.println("Dentro do Bloco de Inicialização Estatico");
        for (int i = 1; i <= 100; i++) {
            parcelas[i - 1] = i;
        }
    }

    // Contrutores
    public Cliente() {
    }
    public static int[] getParcelas() {
        return parcelas;
    }
}
