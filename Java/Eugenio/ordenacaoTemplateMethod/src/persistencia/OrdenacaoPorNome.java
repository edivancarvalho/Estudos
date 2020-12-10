
package persistencia;

import model.Matriculados;

public class OrdenacaoPorNome extends MatriculadosPer {

    public OrdenacaoPorNome(String nome) {
        super(nome);
    }
    @Override
    public  boolean ePrimeiro(Matriculados mat1, Matriculados mat2){
        if(mat1.getNome().compareToIgnoreCase(mat2.getNome()) <= 0) return true;
        else return false;
    }
    
}
