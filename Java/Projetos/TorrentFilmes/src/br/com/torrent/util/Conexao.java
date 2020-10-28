package br.com.torrent.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static Conexao conexao = null;
    private static Connection conect = null;

    private Conexao() {
    }

    public static Conexao getInstance() {
        if (conexao == null) {
            conexao = new Conexao();
        }
        return conexao;
    }

    public Connection getConnection() throws Exception {
        if (conect == null) {
            try {
                String driver = "org.postgresql.Driver";
                String url = "jdbc:postgresql://192.168.15.25:5432/tfilmes";
                // teste  teste
                String usuario = "postgres"; 
                String password = "maria123";
                Class.forName(driver);
                conect = DriverManager.getConnection(url, usuario, password);
            } catch (Exception e) {
                throw new Exception("Erro ao conectar no Banco de dados! ");
            }
        }
        return conect;
    }

    public static void closeConnection() throws Exception {
        if (conect != null) {
            try {
                conect.close();
            } catch (SQLException e) {
                throw new Exception("Erro ao fechar conexao");
            }
        }
    }

    public static void closeStatement(Statement st) throws Exception {
        if (st != null) {
            try {
                st.close();
            } catch (Exception e) {
                throw new Exception("Erro ao fechar statement");
            }
        }
    }

    public static void closeResultSet(ResultSet rs) throws Exception {
        if (rs != null) {
            try {
                rs.close();
            } catch (Exception e) {
                throw new Exception("Erro ao fechar resultSet");
            }
        }
    }
}
