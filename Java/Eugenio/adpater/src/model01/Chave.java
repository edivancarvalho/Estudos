package model01;

/**
 *
 * @author edivan
 */
public class Chave implements Dispositivo {

    String ligar = "ligar";
    String Desligar = "Desligar";

    public Chave() {
    }

    @Override
    public String ligar(String chave) {
        if (chave.equals("0")) {
            return ligar;
        } else {
            System.out.println("Erro ao ligar com a Chave");
        }
        return null;
    }

    @Override
    public String desligar(String chave) {
        if (chave.equals("0")) {
            return Desligar;
        } else {
            System.out.println("Erro ao ligar com a Chave");
        }
        return null;
    }

}
