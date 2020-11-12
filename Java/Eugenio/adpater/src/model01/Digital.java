package model01;

/**
 *
 * @author edivan
 */
public class Digital {

    private String ligar = "Ligando com a Digital";
    private String desligar = "Desligando com a Digital";

    public Digital() {
    }
    
    public String ligar(String Digital){
        if (Digital.equals("1")){
            return ligar;
        }else{
            System.out.println("Erro ao ligar com a Digital");
        }
        return null;
    }
    
    public String desligar(String Digital){
        if (Digital.equals("1")){
            return desligar;
        }else{
            System.out.println("Erro ao desligar com a Digital");
        }
        return null;
    }
}
