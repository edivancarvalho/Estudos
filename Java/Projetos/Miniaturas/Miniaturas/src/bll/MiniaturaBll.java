package bll;

import dao.MiniaturaDao;
import java.sql.ResultSet;
import java.util.List;
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

    public void adicionarMiniatura(Miniaturas mini) throws Exception {
        //validarMiniatura(mini);
        miniDao.inserirMiniatura(mini);
    }

    public void excluirMiniatura(int id) throws Exception {
        miniDao.deleteMiniatura(id);

    }

    public void alterarMiniatura(Miniaturas mini) throws Exception {
        validarMiniatura(mini);
        miniDao.updateMiniatura(mini);
    }

    public List<Miniaturas> consultarMiniaturas() throws Exception {
        return miniDao.getAllMiniaturas();
    }

    public Miniaturas consultarMiniaturaById(int id) throws Exception {
        return miniDao.getMiniaturaById(id);
    }

    public void validarMiniatura(Miniaturas mini) throws Exception {

        if (mini.getModelo().isEmpty() || mini.getEdicao().isEmpty() || mini.getValor().isEmpty()) {
            throw new Exception("Preenchar todos os campos obrigatorios");
        }
        if(mini.getValor().equals("0")){
            throw new Exception("O valor não poder ser menor que ZERO");
        }
    }

    public ResultSet consultarMiniaturaPorNome(String nome) {
        // fazer validação
        ResultSet rs = null;
        rs = miniDao.consultarMiniaturaPorNome(nome);
        return rs;
    }
}
