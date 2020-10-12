package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Fabricantes;
import model.Tipo_Miniaturas;

/**
 *
 * @author edivan
 */
public class Tipo_MiniaturaDao {
    private Connection conexao;
    
    public Tipo_MiniaturaDao() {
        conexao = ModuloConexao.conector();
    }
    
    public void addTipo_Miniatura(Tipo_Miniaturas tminiaturas) throws Exception {
        String sql = "INSERT INTO fabricantes(fab_nome) VALUES (?)";
        try {

            PreparedStatement preparedStatement = conexao.prepareStatement(sql);

            preparedStatement.setString(1, tminiaturas.getTipo());
            preparedStatement.executeUpdate();

        } catch (SQLException erro) {
            throw new Exception("Ocorreu um erro ao adicionar este registro\n"
                    + erro.getMessage());
        }
    }

    public void deleteTipo_Miniatura(int id) throws Exception {
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

    public void updateTipo_Miniatura(Tipo_Miniaturas tminiaturas) throws Exception {
        String sql = "UPDATE fabricantes SET fab_nome=? WHERE fab_iden=?";
        try {
            PreparedStatement preparedStatement
                    = conexao.prepareStatement(sql);

            preparedStatement.setString(1, tminiaturas.getTipo());
            preparedStatement.setInt(2, tminiaturas.getIden());
            preparedStatement.executeUpdate();

        } catch (Exception erro) {
            throw new Exception("Ocorreu um erro ao alterar este registro\n"
                    + erro.getMessage());
        }

    }

    public List<Tipo_Miniaturas> getAllTipo_miniatura() throws Exception {
        List<Tipo_Miniaturas> listTipo_miniaturas = new ArrayList<Tipo_Miniaturas>();
        String sql = "SELECT * FROM fabricantes";
        try {
            Statement statement = conexao.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                
                Tipo_Miniaturas tminiaturas = new Tipo_Miniaturas();
                tminiaturas.setIden(rs.getInt("fab_iden"));
                tminiaturas.setTipo(rs.getString("fab_nome"));

                listTipo_miniaturas.add(tminiaturas);
                
            }
        } catch (Exception erro) {
            throw new Exception("Ocorreu um erro ao consultar os registros de fabricantes\n"
                    + erro.getMessage());
        }
        return listTipo_miniaturas;
    }

    public Tipo_Miniaturas getTipo_miniaturaById(int id) throws Exception {
        
        Tipo_Miniaturas tminiaturas = new Tipo_Miniaturas();
        String sql = "SELECT * FROM fabricantes WHERE fab_iden=?";
        try {
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                tminiaturas.setIden(rs.getInt("fab_iden"));
                tminiaturas.setTipo(rs.getString("fab_nome"));
            }
        } catch (Exception erro) {
            throw new Exception("Ocorreu um erro ao buscar este registro de fabricantes\n"
                    + erro.getMessage());
        }
        return tminiaturas;
    }
}
