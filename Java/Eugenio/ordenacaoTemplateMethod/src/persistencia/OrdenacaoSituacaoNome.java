package persistencia;

import model.Matriculados;

public class OrdenacaoSituacaoNome extends MatriculadosPer {

    public OrdenacaoSituacaoNome(String nome) {
        super(nome);
    }

    @Override
    public boolean ePrimeiro(Matriculados mat1, Matriculados mat2) {
        if (mat1.getSituacao().equalsIgnoreCase(mat2.getSituacao())) {
            return mat1.getNome().compareToIgnoreCase(mat2.getNome()) <= 0;
        } else {
            return mat1.getSituacao().compareToIgnoreCase(mat2.getSituacao()) <= 0;
        }
    }

}
