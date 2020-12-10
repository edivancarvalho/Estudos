
package persistencia;

import model.Matriculados;

public class OrdenacaoSituacaoCursoNome extends MatriculadosPer {

    public OrdenacaoSituacaoCursoNome(String nome) {
        super(nome);
    }
    @Override
    public  boolean ePrimeiro(Matriculados mat1, Matriculados mat2){
        if(mat1.getSituacao().equalsIgnoreCase(mat2.getSituacao())) {
            if (mat1.getCurso().equalsIgnoreCase(mat2.getCurso())){
                return mat1.getNome().compareToIgnoreCase(mat2.getNome()) <= 0;
            } else {
                return mat1.getCurso().compareToIgnoreCase(mat2.getCurso()) <= 0;
            } 
        }else {
           return mat1.getSituacao().compareToIgnoreCase(mat2.getSituacao()) <= 0;
                }
        
    }
    
}

