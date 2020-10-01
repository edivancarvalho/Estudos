package controller;

import dao.Conexao;
import dao.UsuarioDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Usuario;
import view.TelaFormCadastro;

/**
 *
 * @author edivan
 */
// aqui é feita a regra de negocio;
public class FormCadastroController {
    private TelaFormCadastro view;

    public FormCadastroController(TelaFormCadastro view) {
        this.view = view;
    }
    public void salvaUsuario(){
        
        
        
        String cUsuario = view.getjTextFieldUsuario().getText();
        String cSenha = view.getjPasswordFieldSenha().getText();
        
        Usuario usuario = new Usuario(cUsuario, cSenha);
        try {
            // buscando a conexao no banco;
            Connection conexao = new Conexao().getConnection();
            UsuarioDAO usuarioDao = new UsuarioDAO(conexao);

            usuarioDao.insert(usuario);
            // Quando a conexao esta dentro do try o java já se encaregar de fechar a conexao;
            
            JOptionPane.showMessageDialog(null, "usuario salvo com sucesso!");

        } catch (SQLException ex) {
            Logger.getLogger(TelaFormCadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
