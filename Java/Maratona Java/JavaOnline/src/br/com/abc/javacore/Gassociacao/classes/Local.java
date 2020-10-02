package br.com.abc.javacore.Gassociacao.classes;

/**
 *
 * @author edivan
 */
public class Local {
    private String rua;
    private String bairro;

    public Local() {
    }

    public Local(String rua, String bairro) {
        this.rua = rua;
        this.bairro = bairro;
    }
//================== print
    public void print(){
        System.out.println("Rua: " + this.rua);
        System.out.println("Bairro: " + this.bairro);
    }
    
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    
    
    
}
