package bll;

import dao.Tipo_MiniaturaDao;
import java.util.List;
import model.Tipo_Miniaturas;

/**
 *
 * @author edivan
 */
public class Tipo_MiniaturaBll {
    
    // chama a classe FabricanteDAo
    private Tipo_MiniaturaDao fabDao;

    // Construtor recebendo a conexao atravez da fabDao pelo objeto fabricanteDao;
    public Tipo_MiniaturaBll() {
        fabDao = new Tipo_MiniaturaDao();
    }

    public void adicionarTipo_Miniatura(Tipo_Miniaturas objtipo_miniaturas) throws Exception {
        fabDao.addTipo_Miniatura(objtipo_miniaturas);

    }

    public void removerTipo_Miniatura(Tipo_Miniaturas objtipo_miniaturas) throws Exception {
        fabDao.deleteTipo_Miniatura(objtipo_miniaturas.getIden());

    }

    public void alterarTipo_Miniatura(Tipo_Miniaturas objtipo_miniaturas) throws Exception {
        fabDao.updateTipo_Miniatura(objtipo_miniaturas);

    }

    public List<Tipo_Miniaturas> consultarTipo_Miniaturas() throws Exception {
        return fabDao.getAllTipo_miniatura();
    }

    public Tipo_Miniaturas consultaTipo_MiniaturasPorId(int id) throws Exception {
        return fabDao.getTipo_miniaturaById(id);
    }

    // fazer validação
}
