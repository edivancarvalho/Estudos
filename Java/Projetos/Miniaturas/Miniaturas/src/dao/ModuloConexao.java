package dao;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author edivan
 */
public class ModuloConexao {
//    public Connection getConnection() throws SQLException{
//        Connection conexao = DriverManager.getConnection("jdbc:postgresql://192.168.1.150:5432/acam","postgres", "suporte");
//        // rede local casa 192.168.1.150 | trabalho 192.168.200.150
//        return conexao;
//    }
    
// Metodo responsável por estabeler a conexão com o banco
    public static  Connection conector(){
        java.sql.Connection conexao = null; 
        // a linha abaixo "chama" o driver
        //String driver = "com.mysql.jdbc.Driver";
        // Armazenando informações referente ao banco
        //String url = "jdbc:mysql://192.168.109.109:3306/dbinfox";
        //String url = "jdbc:mysql://192.168.1.7:3306/dbinfox";
        //String user = "suporte";
        //String password = "123";
        // Estabelecendo a conexão com o banco de dados;
        
        // = Configuração no POstrgrs
        String driver = "org.postgresql.Driver";
        String url = "jdbc:postgresql://192.168.200.150:5432/acam";
        String user = "postgres";
        String password = "suporte";
        // Estabelecendo a conexão com o banco de dados;
        try {
             Class.forName(driver);
             conexao = DriverManager.getConnection(url, user, password);
             return conexao;
        } catch (Exception e) {
            // a linha abaixo werve de apoio para esclarecer o erro
            System.out.println(e);            
            return null;
        }
        
    }

}
