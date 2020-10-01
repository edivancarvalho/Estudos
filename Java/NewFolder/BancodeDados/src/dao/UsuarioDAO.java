package dao;

import com.sun.jdi.connect.spi.Connection;
import java.sql.PreparedStatement;
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

        String sql = "insert into usuario(usuario,senha) values('"+ usuario.getUsuario()+"','"+usuario.getSenha()+"'); ";

        PreparedStatement statement = connection.preparedStatement(sql);
        statement.execute();
        connection.close();
    }
}
