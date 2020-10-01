package controller;

import dao.Conexao;
import dao.UsuarioDAO;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Usuario;
import view.TelaLogin;
import view.TelaMenu;

/**
 *
 * @author edivan
 */
public class LoginController {

    private TelaLogin view;

    public LoginController(TelaLogin view) {
        this.view = view;
    }

    public void autenticar() throws SQLException {
        // 1° buscar usuario da View
        // 2° verificar se existe no banco de dados;
        // 3°  se exister direcionar para Menu;

        // 1° 
        String cUsuario = view.getjTextFieldUsuario().getText();
        String cSenha = view.getjPasswordFieldSenha().getText();

        Usuario usuarioAutenticar = new Usuario(cUsuario, cSenha);

        // 2°
        Connection conexao = new Conexao().getConnection();
        UsuarioDAO usuarioDao = new UsuarioDAO(conexao);

        boolean existe = usuarioDao.existeNoBancoUsuarioESenha(usuarioAutenticar);

        //3° se existe direcionar para o Menu
        if (existe) {
            TelaMenu teladeMenu = new TelaMenu();
            teladeMenu.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(view, "usuario ou senha invalido!");
        }

    }

}
