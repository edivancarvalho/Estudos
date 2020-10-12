package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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

    public String inserirMiniatura(Miniaturas mini) {

        PreparedStatement pst;
        String resultado;

        //String sql = "insert into miniaturas (min_iden, min_modelo, min_ano, min_observacoes, min_edicao, min_escala, min_valor) values(DEFAULT,?,?,?,?,?,?)";
        //String sql = "insert into miniaturas  values(DEFAULT,?,?,?,?,?,?)";

        String sql = "insert into miniaturas values(DEFAULT,?,?,?,?,?,?,1,1,1)";
        // INSERT INTO tbusuarios VALUES(DEFAULT,'edivan','6200000','edivan','edivan');
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, mini.getModelo());
            pst.setString(2, mini.getAno());
            pst.setString(3, mini.getObservacoes());
            pst.setString(4, mini.getEdicao());
            pst.setString(5, mini.getEscala());
            pst.setString(6, mini.getValor());
            //pst.setString(7, 

//      ----    adicionar o 3 paramentros do banco de Dados ←↓→←↓→←↓→←↓←↓→←↓→
            //pst.setString(5, cbo.getSelectedItem().toString());
            // confirma a inserção dos dados na tabela
            int adicionado = pst.executeUpdate(); // pst.execute retorna o valor 1 quando esta ok.              
            if (adicionado == 1) {
                resultado = "Miniatura inserida com sucesso!";
            } else {
                resultado = "Falha, ao inserir miniatura";
            }
        } catch (SQLException e) {
            resultado = e.getMessage();
        }
        return resultado;
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

}
