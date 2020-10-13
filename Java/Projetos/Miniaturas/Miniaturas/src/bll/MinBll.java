
package bll;

import dao.MinDao;
import java.sql.ResultSet;
import model.Miniaturas;

/**
 *
 * @author edivan
 */
public class MinBll {
    private MinDao minDao;
    
    // Construtor recebendo a conexao através do  MiniDao pelo Objeto →MiniaturasDao;
    public MinBll() {
        minDao = new MinDao();
    }

    public String AdicionarMiniatura(Miniaturas mini) {
        String resultado = "";

        if (mini.getModelo().isEmpty() || mini.getEdicao().isEmpty() || mini.getValor().isEmpty()) {
            resultado = "Preenchar todos os campos obrigatorios";
        } else {
            resultado = minDao.inserirMiniatura(mini);
        }
        return resultado;
    }

    public ResultSet consultarMiniaturaPorNome(String nome) {
        // fazer validação
        ResultSet rs = null;
        rs = minDao.consultarMiniaturaPorNome(nome);
        return rs;
    }
    
}
