package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Usuario;

/**
 *
 * @author edivan
 */
public class UsuarioDAO {

    private final Connection connection;

    public UsuarioDAO(Connection connection) {
        this.connection = connection;
    }

    public void insert(Usuario usuario) throws SQLException {
        // o insert esta protegido com ataque de SQLInject
        String sql = "insert into login(login,senha) values(?,?); ";

        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, usuario.getUsuario());
        statement.setString(1, usuario.getSenha());
        statement.execute();
        // ↓ Aqui não é bom fechar a conexao;
        //  connection.close();

    }
    public void update(Usuario usuario) throws SQLException{
        // o insert esta protegido com ataque de SQLInject
        String sql = "update login set login = ?, senha = ? where id = ? ";

        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, usuario.getUsuario());
        statement.setString(1, usuario.getSenha());
        statement.setInt(3, usuario.getId());
        statement.execute();
    }

    public boolean existeNoBancoUsuarioESenha(Usuario usuario) throws SQLException {
        // ↓ com a linha abaixo a tela de login fica vulneravel a SQLinject
        //String sql = "select * from login where login= '"+usuario.getUsuario()+"' and senha = '"+usuario.getSenha()+"' ";
        // select * from login where login= '' or 1=1-- ' and senha = '
        // ' or 1=1--
        //admin' 1=1--      →onde admin é o usuario;
        // ↓↓↓→Correção do ataque a SQL Inject
        String sql = "select * from login where login=? and senha = ?";

        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, usuario.getUsuario());
        statement.setString(2, usuario.getSenha());
        //̉←↓↓↓ 
        
        statement.execute();
        // ↓ pegar as informações que vem do banco.
        ResultSet resulset = statement.getResultSet();

//        if (resulset.next()) {
//            return true;
//        } else {
//            return false;
//        }
        return resulset.next();
    }

}
