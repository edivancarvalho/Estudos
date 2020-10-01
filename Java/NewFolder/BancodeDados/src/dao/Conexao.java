package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author edivan
 */
public class Conexao {
    public Connection getConnection() throws SQLException{
        Connection conexao = DriverManager.getConnection("jdbc:postgresql://192.168.1.150:5432/bdbete","postgres", "suporte");
        // rede local casa 192.168.1.150 | trabalho 192.168.200.150
        return conexao;
    }
    

//    private static Connection conexao = null;
//
//    public static Connection getConexao() {
//        try {
//            /*
//                String driver = "com.mysql.jdbc.Driver";
//                String url = "jdbc:mysql://localhost:3306/usuario";
//                String user = "root";
//                String password = "";
//             */
//            String driver = "org.postgresql.Driver";
//            String url = "jdbc:postgresql://192.168.200.14:5432/acam";
//            String user = "postgres";
//            String password = "suporte";
//
//            Class.forName(driver);
//            conexao = DriverManager.getConnection(url, user, password);
//
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        return conexao;
//
//    }

}
