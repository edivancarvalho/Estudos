package br.com.abc.introducao.controlefluxo;

/**
 *
 * @author edivan
 */
public class ControleFluxo6 {
    // usando o continue;
    public static void main(String[] args) {
        // dado um valor de um carro, descubra quantas vezes ele pode ser parcelado
        // porem as parcelas noa poder ser menores do que 1000;

        double valorTotal = 30000;
        
        for (int parcela = (int) valorTotal; parcela >=1; parcela--){
            double valorParcela = valorTotal / parcela;
            if (valorParcela <= 1000){
            continue;
                // o codigo do sout não será executando nunca com o continue;
                //System.out.println(" vaiiii");
            }
            System.out.println("Parcela" + parcela + " R$ " + valorParcela); 
        }
    }
    
}
