package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
        statement.setString(2, usuario.getSenha());
        statement.execute();
        // ↓ Aqui não é bom fechar a conexao;
        //  connection.close();

    }

    public void update(Usuario usuario) throws SQLException {
        // o insert esta protegido com ataque de SQLInject
        String sql = "update login set login = ?, senha = ? where id = ? ";

        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, usuario.getUsuario());
        statement.setString(2, usuario.getSenha());
        statement.setInt(3, usuario.getId());
        statement.execute();
    }

    public void isertOrUpdate(Usuario usuario) throws SQLException {
        if (usuario.getId() > 0) {
            update(usuario);
        } else {
            insert(usuario);
        }
    }

    public void delete(Usuario usuario) throws SQLException {
        // delete já esta protegido com ataque de SQLInject
        String sql = "delete from login where id = ? ";

        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setInt(1, usuario.getId());
        statement.execute();
    }

    public ArrayList<Usuario> selectAll() throws SQLException {
        // Mostra todos os login
        String sql = "select * from login";
        PreparedStatement statement = connection.prepareStatement(sql);
//      ↓ aqui chama o metodo pesquisa.
        return pesquisa(statement);

    }

    private ArrayList<Usuario> pesquisa(PreparedStatement statement) throws SQLException {
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

        statement.execute();
        // pegar todos os resuultado vindo do sql
        ResultSet resultSet = statement.getResultSet();
        // enquanto tive uma nova linha da tabela
        while (resultSet.next()) {
            // pega a linha "id" e salva na variavel id e assim por diante;
            int id = resultSet.getInt("id");
            String login = resultSet.getString("login");
            String senha = resultSet.getString("senha");

            Usuario usuarioComdadosDoBanco = new Usuario(id, senha, senha);
            usuarios.add(usuarioComdadosDoBanco);
        }
        return usuarios;
    }

    public Usuario selectPorId(Usuario usuario) throws SQLException {
        String sql = "select * from login where id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setInt(1, usuario.getId());

//        ArrayList<Usuario> usuarios = pesquisa(statement);
//        return usuarios.get(0);
//  ou fazer assim
        return pesquisa(statement).get(0);

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
