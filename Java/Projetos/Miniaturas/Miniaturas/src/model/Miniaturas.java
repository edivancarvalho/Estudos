package model;

/**
 *
 * @author edivan
 */
public class Miniaturas {

    private int iden;
    private String modelo;
    private String ano;
    private String observacoes;
    private String edicao;
    private String escala;
    private String valor;

    private Fabricantes[] fabricantes;
    private Tipo_Miniaturas[] tipo_miniaturas;
    private Temas[] temas;
    private Fotos[] fotos;

    public Miniaturas() {
    }

    public Miniaturas(int iden, String modelo, String ano, String observacoes, String edicao, String escala, String valor) {
        this.iden = iden;
        this.modelo = modelo;
        this.ano = ano;
        this.observacoes = observacoes;
        this.edicao = edicao;
        this.escala = escala;
        this.valor = valor;
    }
//-------------------------- print

    public void print() {
        System.out.println("====\tMiniaturas \t====");
        System.out.println("Iden: "
                + this.iden
                + ", Modelo: " + this.modelo
                + ", Ano: " + this.ano
                + ", Observações: " + this.observacoes
                + ", Edição: " + this.edicao
                + ", Escala: " + this.escala
                + ", Valor R$ " + this.valor);
    }

    public int getIden() {
        return iden;
    }

    public void setIden(int iden) {
        this.iden = iden;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public String getEscala() {
        return escala;
    }

    public void setEscala(String escala) {
        this.escala = escala;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Fabricantes[] getFabricantes() {
        return fabricantes;
    }

    public void setFabricantes(Fabricantes[] fabricantes) {
        this.fabricantes = fabricantes;
    }

    public Tipo_Miniaturas[] getTipo_miniaturas() {
        return tipo_miniaturas;
    }

    public void setTipo_miniaturas(Tipo_Miniaturas[] tipo_miniaturas) {
        this.tipo_miniaturas = tipo_miniaturas;
    }

    public Temas[] getTemas() {
        return temas;
    }

    public void setTemas(Temas[] temas) {
        this.temas = temas;
    }

    public Fotos[] getFotos() {
        return fotos;
    }

    public void setFotos(Fotos[] fotos) {
        this.fotos = fotos;
    }

}
