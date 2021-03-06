package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import model.AdministradorModel;
import util.Conexao;
import util.ICRUD_GENERIC;

/**
 *
 * @author edivan
 */
public class AdministradorDal implements ICRUD_GENERIC {

    private Connection conexao;
    AdministradorModel administradorModel;

    public AdministradorDal() throws Exception {
        conexao = Conexao.getInstance().getConnection();
    }

    @Override
    public void add(Object objeto) throws Exception {
        administradorModel = (AdministradorModel) objeto;
        String sql = "INSERT INTO administrador (adm_nome, adm_senha)"
                + "VALUES (? , ?)";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setObject(1, administradorModel.getAdministrador_nome());
        ps.setObject(2, administradorModel.getAdministrador_senha());
        ps.executeUpdate();
    }

    @Override
    public void delete(int n) throws Exception {
        String sql = "DELETE FROM administrador WHERE adm_idem =?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setObject(1, n);
        ps.executeUpdate();
    }

    @Override
    public void update(Object objeto) throws Exception {
        String sql = "UPDATE administrador SET adm_nome =?, adm_senha=?"
                + " WHERE adm_idem =?";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setObject(1, administradorModel.getAdministrador_nome());
        ps.setObject(2, administradorModel.getAdministrador_senha());
        ps.setObject(3, administradorModel.getAdministrador_idem());
        ps.executeUpdate();
    }

    @Override
    public Iterator getAll() throws Exception {
        String sql = "SELECT * FROM administrador";
        List<AdministradorModel> list = new ArrayList<>();
        Statement st = conexao.createStatement();;
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            administradorModel = new AdministradorModel();

            administradorModel.setAdministrador_idem(rs.getInt("adm_idem"));
            administradorModel.setAdministrador_nome(rs.getString("adm_nome"));
            administradorModel.setAdministrador_senha(rs.getString("adm_senha"));

            list.add(administradorModel);

        }

        return list.iterator();
    }

    @Override
    public Object getById(int n) throws Exception {
        String sql = "SELECT * FROM administrador WHERE adm_idem=?";

        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setObject(1, n);
        ResultSet rs = preparedStatement.executeQuery();

        if (rs.next()) {
            administradorModel = new AdministradorModel();

            administradorModel.setAdministrador_idem(rs.getInt("adm_idem"));
            administradorModel.setAdministrador_nome(rs.getString("adm_nome"));
            administradorModel.setAdministrador_senha(rs.getString("adm_senha"));
        }
        return administradorModel;

    }

    @Override
    public Object getByNome(String nome) throws Exception {
        String sql = "SELECT * FROM administrador WHERE adm_nome=?";

        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setObject(1, nome);
        ResultSet rs = preparedStatement.executeQuery();

        if (rs.next()) {
            administradorModel = new AdministradorModel();

            administradorModel.setAdministrador_idem(rs.getInt("adm_idem"));
            administradorModel.setAdministrador_nome(rs.getString("adm_nome"));
            administradorModel.setAdministrador_senha(rs.getString("adm_senha"));
        }
        return administradorModel;
    }

}
