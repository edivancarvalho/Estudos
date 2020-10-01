package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author edivan
 */
public class Conexao {
    public static void main(String[] args) {
        System.out.println("o");
    }

    private static Connection conexao = null;

    public static Connection getConexao() {
        try {
            /*
                String driver = "com.mysql.jdbc.Driver";
                String url = "jdbc:mysql://localhost:3306/usuario";
                String user = "root";
                String password = "";
             */
            String driver = "org.postgresql.Driver";
            String url = "jdbc:postgresql://192.168.200.14:5432/acam";
            String user = "postgres";
            String password = "suporte";

            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return conexao;

    }

    com.sun.jdi.connect.spi.Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
