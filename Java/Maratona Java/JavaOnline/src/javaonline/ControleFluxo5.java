package javaonline;

/**
 *
 * @author edivan
 */
public class ControleFluxo5 {

    public static void main(String[] args) {
        // dado um valor de um carro, descubra quantas vezes ele pode ser parcelado
        // porem as parcelas noa poder ser menores do que 1000;

        double valorTotal = 30000;

        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            
//            // ---- modelo 01
//            if (valorParcela >= 1000) {
//                System.out.println("Parcela" + parcela + " R$ " + valorParcela);
//
//            } else {
//                System.out.println("Saindo do laço");
//                break;
//            }
//            System.out.println("Fora do laço");
//            //--- fim modelo 01
            if (valorParcela < 1000){
                break;
            }
            System.out.println("Parcela" + parcela + " R$ " + valorParcela);
        }
    }

}
