package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Miniaturas;

/**
 *
 * @author edivan
 */
public class MiniaturaDao {

    private Connection conexao;

    public MiniaturaDao() {
        conexao = ModuloConexao.conector();
    }

    TemaDao temDao = new TemaDao();

    public void inserirMiniatura(Miniaturas mini) {

        PreparedStatement pst;
        String resultado;

        String sql = "insert into miniaturas (min_modelo, min_ano, min_observacoes, min_edicao, min_escala, min_valor,min_fab_iden,min_tipm_iden,min_tem_iden) values(?,?,?,?,?,?,?,?,?)";
        //String sql = "insert into miniaturas values(DEFAULT,?,?,?,?,?,?,?,?,?)";
        // INSERT INTO tbusuarios VALUES(DEFAULT,'edivan','6200000','edivan','edivan');
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, mini.getModelo());
            pst.setString(2, mini.getAno());
            pst.setString(3, mini.getObservacoes());
            pst.setString(4, mini.getEdicao());
            pst.setString(5, mini.getEscala());
            pst.setString(6, mini.getValor());
            pst.setInt(7, mini.getFabricantes().getIden());
            pst.setInt(8, mini.getTemas().getIden());
            pst.setInt(9, mini.getTipo_miniaturas().getIden());

            // confirma a inserção dos dados na tabela
            int adicionado = pst.executeUpdate(); // pst.execute retorna o valor 1 quando esta ok.                          
            System.out.println("Gravação do banco OK!");
            if (adicionado == 1) {
                resultado = "Miniatura inserida com sucesso!";
            } else {
                resultado = "Falha, ao inserir miniatura";
            }
        } catch (SQLException e) {
            resultado = e.getMessage();
        }

    }

    public void deleteMiniatura(int id) throws Exception {
        String sql = "DELETE FROM miniaturas WHERE min_iden=?";
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

    public void updateMiniatura(Miniaturas mini) throws Exception {
        String sql = "UPDATE miniaturas SET min_modelo=?, min_ano=?, min_observacoes=?, min_edicao=?, min_escala=?, min_valor=?, min_fab_iden=?,min_tmin_iden=?,min_tem_iden=? WHERE min_iden=?";

        try {
            PreparedStatement pst;
            String resultado;

            pst = conexao.prepareStatement(sql);

            pst.setString(1, mini.getModelo());
            pst.setString(2, mini.getAno());
            pst.setString(3, mini.getObservacoes());
            pst.setString(4, mini.getEdicao());
            pst.setString(5, mini.getEscala());
            pst.setString(6, mini.getValor());
            pst.setInt(7, mini.getFabricantes().getIden());
            pst.setInt(8, mini.getTemas().getIden());
            pst.setInt(9, mini.getTipo_miniaturas().getIden());
            pst.setInt(10, mini.getIden());

            pst.executeUpdate();

        } catch (Exception erro) {
            throw new Exception("Ocorreu um erro ao alterar este registro\n"
                    + erro.getMessage());
        }

    }

    public List<Miniaturas> getAllMiniaturas() throws Exception {
        List<Miniaturas> listMiniaturas = new ArrayList<Miniaturas>();
        String sql = "SELECT * FROM miniaturas";
        try {
            Statement statement = conexao.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                Miniaturas mini = new Miniaturas();
                mini.setIden(rs.getInt("min_iden"));
                mini.setModelo(rs.getString("min_modelo"));
                mini.setAno(rs.getString("min_ano"));
                mini.setObservacoes(rs.getString("min_observacoes"));
                mini.setEdicao(rs.getString("min_edicao"));
                mini.setEscala(rs.getString("min_escala"));
                mini.setValor(rs.getString("min_valor"));

                FabricanteDao fab = new FabricanteDao();
                mini.setFabricantes(fab.getFabricanteById(rs.getInt("min_fab_iden")));

                Tipo_MiniaturaDao tip = new Tipo_MiniaturaDao();
                mini.setTipo_miniaturas(tip.getTipo_miniaturaById(rs.getInt("min_tipm_iden")));

                TemaDao tem = new TemaDao();
                mini.setTemas(tem.getTemasById(rs.getInt("min_tem_iden")));

                listMiniaturas.add(mini);

            }
        } catch (Exception erro) {
            throw new Exception("Ocorreu um erro ao consultar os registros de Miniaturas\n"
                    + erro.getMessage());
        }
        return listMiniaturas;
    }

    public Miniaturas getMiniaturaById(int id) throws Exception {
        Miniaturas mini = new Miniaturas();
        String sql = "SELECT * FROM miniaturas WHERE min_iden=?";
        try {
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                mini.setIden(rs.getInt("min_iden"));
                mini.setModelo(rs.getString("min_modelo"));
                mini.setAno(rs.getString("min_ano"));
                mini.setObservacoes(rs.getString("min_observacoes"));
                mini.setEdicao(rs.getString("min_edicao"));
                mini.setEscala(rs.getString("min_escala"));
                mini.setValor(rs.getString("min_valor"));

                FabricanteDao fab = new FabricanteDao();
                mini.setFabricantes(fab.getFabricanteById(rs.getInt("min_fab_iden")));

                Tipo_MiniaturaDao tip = new Tipo_MiniaturaDao();
                mini.setTipo_miniaturas(tip.getTipo_miniaturaById(rs.getInt("min_tipm_iden")));

                TemaDao tem = new TemaDao();
                mini.setTemas(tem.getTemasById(rs.getInt("min_tem_iden")));
            }
        } catch (Exception erro) {
            throw new Exception("Ocorreu um erro ao buscar este registro de fabricantes\n"
                    + erro.getMessage());
        }
        return mini;
    }

    public ResultSet consultarMiniaturaPorNome(String nome) {
        ResultSet rs = null;

        String sql = "select * from miniaturas where min_modelo like ?";
        PreparedStatement pst;

        try {
            pst = conexao.prepareStatement(sql);
            // passado o conteudo da caixa de pesquisa para o ?
            // atenção ao "%" - continuação da String sql
            pst.setString(1, nome + "%");
            rs = pst.executeQuery();

        } catch (Exception e) {
        }
        return rs;
    }

    public void preencherFabricantes() {

    }

}
