package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Temas;

/**
 *
 * @author edivan
 */
public class TemaDao {

    private Connection conexao;

    public TemaDao() {
        conexao = ModuloConexao.conector();
    }

    public void addTemas(Temas tema) throws Exception {
        String sql = "INSERT INTO temas(tem_nome) VALUES (?)";
        try {

            PreparedStatement preparedStatement = conexao.prepareStatement(sql);

            preparedStatement.setString(1, tema.getNome());
// ---------------------------------------------------------------
            
            preparedStatement.executeUpdate();

        } catch (SQLException erro) {
            throw new Exception("Ocorreu um erro ao adicionar este registro\n"
                    + erro.getMessage());
        }
    }

    public void deleteTemas(int id) throws Exception {
        String sql = "DELETE FROM temas WHERE tem_iden=?";
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

    public void updateTemas(Temas tema) throws Exception {
        String sql = "UPDATE temas SET tem_nome=? WHERE tem_iden=?";
        try {
            PreparedStatement preparedStatement
                    = conexao.prepareStatement(sql);

            preparedStatement.setString(1, tema.getNome());
            preparedStatement.setInt(2, tema.getIden());
            preparedStatement.executeUpdate();

        } catch (Exception erro) {
            throw new Exception("Ocorreu um erro ao alterar este registro\n"
                    + erro.getMessage());
        }

    }

    public List<Temas> getAllTemas() throws Exception {
        List<Temas> listTemas = new ArrayList<Temas>();
        String sql = "SELECT * FROM temas";
        try {
            Statement statement = conexao.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {

                Temas tema = new Temas();
                tema.setIden(rs.getInt("tem_iden"));
                tema.setNome(rs.getString("tem_nome"));

                listTemas.add(tema);

            }
        } catch (Exception erro) {
            throw new Exception("Ocorreu um erro ao consultar os registros de fabricantes\n"
                    + erro.getMessage());
        }
        return listTemas;
    }

    public Temas getTemasById(int id) throws Exception {
        
        Temas tema = new Temas();
        String sql = "SELECT * FROM temas WHERE tem_iden=?";
        
        try {
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                tema.setIden(rs.getInt("tem_iden"));
                tema.setNome(rs.getString("tem_nome"));
            }
        } catch (Exception erro) {
            throw new Exception("Ocorreu um erro ao buscar este registro de Temas\n"
                    + erro.getMessage());
        }
        return tema;
    }
}
