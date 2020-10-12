package bll;

import dao.TemaDao;
import java.util.List;
import model.Temas;

/**
 *
 * @author edivan
 */
public class TemaBll {

    // chama a classe FabricanteDAo
    private TemaDao temaDao;

    // Construtor recebendo a conexao atravez da fabDao pelo objeto fabricanteDao;
    public TemaBll() {
        temaDao = new TemaDao();
    }

    public void adicionarTema(Temas objtema) throws Exception {

        temaDao.addTemas(objtema);

    }

    public void removerTema(Temas objtema) throws Exception {
        temaDao.deleteTemas(objtema.getIden());

    }

    public void alterarTema(Temas objtema) throws Exception {
        temaDao.updateTemas(objtema);

    }

    public List<Temas> consultarTemas() throws Exception {
        return temaDao.getAllTemas();
    }

    public Temas consultaTemasPorId(int id) throws Exception {
        return temaDao.getTemasById(id);
    }

}
