
package persistencia;

import model.Matriculados;


public class OrdenacaoPorSobrenome extends MatriculadosPer{
    
    public OrdenacaoPorSobrenome(String nome) {
        super(nome);
    }

   
    @Override
    public boolean ePrimeiro(Matriculados mat1, Matriculados mat2) {
        String[] nome1 = mat1.getNome().split(" ");
        String sobrenome1 = nome1[nome1.length - 1];
        String[] nome2 = mat2.getNome().split(" ");
        String sobrenome2 = nome2[nome2.length - 1];

        if (sobrenome1.equalsIgnoreCase("junior") || sobrenome1.equalsIgnoreCase("neto") || sobrenome1.equalsIgnoreCase("filho")) {
            sobrenome1 = nome1[nome1.length - 2];
        }

        if (sobrenome2.equalsIgnoreCase("junior") || sobrenome2.equalsIgnoreCase("neto") || sobrenome2.equalsIgnoreCase("filho")) {
            sobrenome2 = nome2[nome2.length - 2];
        }

        return sobrenome1.compareToIgnoreCase(sobrenome2) <= 0;
    }
}
