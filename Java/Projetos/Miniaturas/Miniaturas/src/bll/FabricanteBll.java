package bll;

import dao.FabricanteDao;
import java.util.List;
import model.Fabricantes;

/**
 *
 * @author edivan
 */
public class FabricanteBll {

    // chama a classe FabricanteDAo
    private FabricanteDao fabDao;

    // Construtor recebendo a conexao atravez da fabDao pelo objeto fabricanteDao;
    public FabricanteBll() {
        fabDao = new FabricanteDao();
    }

    public void adicionarFabricante(Fabricantes objfab) throws Exception {
        fabDao.addFabricante(objfab);

    }

    public void removerFabricante(Fabricantes objfab) throws Exception {
        fabDao.deleteFabricante(objfab.getIden());

    }

    public void alterarFabricante(Fabricantes objfab) throws Exception {
        fabDao.updateFabricante(objfab);

    }

    public List<Fabricantes> consultarFabricantes() throws Exception {
        return fabDao.getAllFabricantes();
    }

    public Fabricantes consultarFabricantesPorId(int id) throws Exception {
        return fabDao.getFabricanteById(id);
    }

    // fazer validação
}
