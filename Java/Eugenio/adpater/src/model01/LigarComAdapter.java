package model01;

/**
 *
 * @author edivan
 */
public class LigarComAdapter implements Dispositivo {

    Digital objeto = new Digital();

    @Override
    public String ligar(String chave) {
        String chaveAdaptadaParaDigital = chave;
         return objeto.ligar(chaveAdaptadaParaDigital);
    }

    @Override
    public String desligar(String chave) {
        String chaveAdaptadaParaDigital = chave;
        return objeto.desligar(chaveAdaptadaParaDigital);
    }

}
