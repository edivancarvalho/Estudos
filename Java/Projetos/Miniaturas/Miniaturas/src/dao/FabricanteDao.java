package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Fabricantes;

/**
 *
 * @author edivan
 */
public class FabricanteDao {

    private Connection conexao;

    public FabricanteDao() {
        conexao = ModuloConexao.conector();
    }
    
    public void addFabricante(Fabricantes fabricante) throws Exception {
        String sql = "INSERT INTO fabricantes(fab_nome) VALUES (?)";
        try {

            PreparedStatement preparedStatement = conexao.prepareStatement(sql);

            preparedStatement.setString(1, fabricante.getNome());
            preparedStatement.executeUpdate();

        } catch (SQLException erro) {
            throw new Exception("Ocorreu um erro ao adicionar este registro\n"
                    + erro.getMessage());
        }
    }

    public void deleteFabricante(int id) throws Exception {
        String sql = "DELETE FROM fabricantes WHERE fab_iden=?";
        try {

            PreparedStatement preparedStatement
                    = conexao.prepareStatement(sql);

            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();

        } catch (SQLException erro) {
            throw new Exception("Ocorreu um erro ao deletar este registro!\n"
                    + erro.getMessage());
        }
    }

    public void updateFabricante(Fabricantes fabricante) throws Exception {
        String sql = "UPDATE fabricantes SET fab_nome=? WHERE fab_iden=?";
        try {
            PreparedStatement preparedStatement
                    = conexao.prepareStatement(sql);

            preparedStatement.setString(1, fabricante.getNome());
            preparedStatement.setInt(2, fabricante.getIden());
            preparedStatement.executeUpdate();

        } catch (Exception erro) {
            throw new Exception("Ocorreu um erro ao alterar este registro\n"
                    + erro.getMessage());
        }

    }

    public List<Fabricantes> getAllFabricantes() throws Exception {
        List<Fabricantes> listFabricantes = new ArrayList<Fabricantes>();
        String sql = "SELECT * FROM fabricantes";
        try {
            Statement statement = conexao.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                Fabricantes fabricante = new Fabricantes();
                fabricante.setIden(rs.getInt("fab_iden"));
                fabricante.setNome(rs.getString("fab_nome"));

                listFabricantes.add(fabricante);
                
            }
        } catch (Exception erro) {
            throw new Exception("Ocorreu um erro ao consultar os registros de fabricantes\n"
                    + erro.getMessage());
        }
        return listFabricantes;
    }

    public Fabricantes getFabricanteById(int id) throws Exception {
        Fabricantes fabricante = new Fabricantes();
        String sql = "SELECT * FROM fabricantes WHERE fab_iden=?";
        try {
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                fabricante.setIden(rs.getInt("fab_iden"));
                fabricante.setNome(rs.getString("fab_nome"));
            }
        } catch (Exception erro) {
            throw new Exception("Ocorreu um erro ao buscar este registro de fabricantes\n"
                    + erro.getMessage());
        }
        return fabricante;
    }

}
