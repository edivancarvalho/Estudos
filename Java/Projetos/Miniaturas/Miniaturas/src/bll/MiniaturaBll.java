package bll;

import dao.MiniaturaDao;
import java.sql.ResultSet;
import model.Miniaturas;

/**
 *
 * @author edivan
 */
public class MiniaturaBll {

    // chama clase MiniaturaDao
    private MiniaturaDao miniDao;

    // Construtor recebendo a conexao através do  MiniDao pelo Objeto →MiniaturasDao;
    public MiniaturaBll() {
        miniDao = new MiniaturaDao();
    }

    public String AdicionarMiniatura(Miniaturas mini) {
        String resultado = "";

        if (mini.getModelo().isEmpty() || mini.getEdicao().isEmpty() || mini.getValor().isEmpty()) {
            resultado = "Preenchar todos os campos obrigatorios";
        } else {
            resultado = miniDao.inserirMiniatura(mini);
        }
        return resultado;
    }

    public ResultSet consultarMiniaturaPorNome(String nome) {
        // fazer validação
        ResultSet rs = null;
        rs = miniDao.consultarMiniaturaPorNome(nome);
        return rs;
    }
}
