package br.com.abc.javacore.Eblocodeinicializacao.classes;

/**
 *
 * @author edivan
 */
public class Cliente {

    // 1° - Alocado espaço na memoria para o objeto que será criado;
    // 2° - cada atributo de classe é criado e inicializado com seus valores default
    // ou valores explicitos
    // 3° - Bloco de inicialização e executado;
    // 4° - O contrutor é executado;
    private int[] parcelas;

    // Bloco de inicialização
    {
        parcelas = new int[100];
        System.out.println("Dentro do Bloco de Inicialização");
        for (int i = 1; i <= 100; i++){
            parcelas[i-1] = i;
        }
        
    }
    
    // Contrutores
    public Cliente() {
       
    }

    public int[] getParcela() {
        return parcelas;
    }

    public void setParcela(int[] parcela) {
        this.parcelas = parcela;
    }

}
