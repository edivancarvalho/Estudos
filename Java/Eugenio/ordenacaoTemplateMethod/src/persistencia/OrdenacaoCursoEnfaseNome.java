
package persistencia;

import model.Matriculados;

public class OrdenacaoCursoEnfaseNome extends MatriculadosPer {

    public OrdenacaoCursoEnfaseNome(String nome) {
        super(nome);
    }
    @Override
    public  boolean ePrimeiro(Matriculados mat1, Matriculados mat2){
        if(mat1.getCurso().equalsIgnoreCase(mat2.getCurso())) {
            if (mat1.getEnfase().equalsIgnoreCase(mat2.getEnfase())){
                return mat1.getNome().compareToIgnoreCase(mat2.getNome()) <= 0;
            } else {
                return mat1.getEnfase().compareToIgnoreCase(mat2.getEnfase()) <= 0;
            } 
        }else {
           return mat1.getCurso().compareToIgnoreCase(mat2.getCurso()) <= 0;
                }
        
    }
    
    
}
