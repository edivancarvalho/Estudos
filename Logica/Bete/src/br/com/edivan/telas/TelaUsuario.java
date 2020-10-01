/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.edivan.telas;

import java.sql.*;
import br.com.edivan.util.Conexao;
import javax.swing.JOptionPane;

/**
 * Aula 13
 *
 * @author edivan
 */
public class TelaUsuario extends javax.swing.JInternalFrame {

    // usando a variavel conexao do DAL
    Connection conexao = null;
    // criando variaveis especiais para conexão com o banco
    // prepared Statement e ResultSet são frameworks do pacote java.sql
    // serverm para prepara e executar as instruções SQL
    PreparedStatement pst = null;
    ResultSet rs = null; // rs = resultado;

    public TelaUsuario() {
        initComponents();
        conexao = Conexao.conector();
    }

    // Metodo para consulta usuarios;
    private void consultar() {
        String sql = "select * from tbusuarios where iduser=?";
        // Sempre quando usar o banco usar o TRY; e fechar o banco;
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtUsuarioId.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
                txtUsuarioNome.setText(rs.getString(2));
                txtUsuarioFone.setText(rs.getString(3));
                txtUsuarioLogin.setText(rs.getString(4));
                txtUsuarioSenha.setText(rs.getString(5));
                // a linha abaixo de refere ao combobox
                cboUsuarioPerfil.setSelectedItem(rs.getString(6));

            } else {
                JOptionPane.showMessageDialog(null, "Usuário não cadastrado");
                // as linhas abaixo "limpam" os campos
                txtUsuarioNome.setText(null);
                txtUsuarioFone.setText(null);
                txtUsuarioLogin.setText(null);
                txtUsuarioSenha.setText(null);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    // Metódo para adicionar usuarios
    private void adicionar() {
        String sql = "insert into tbusuarios(iduser,usuario,fone,login,senha,perfil) values(?,?,?,?,?,?)";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtUsuarioId.getText());
            pst.setString(2, txtUsuarioNome.getText());
            pst.setString(3, txtUsuarioFone.getText());
            pst.setString(4, txtUsuarioLogin.getText());
            pst.setString(5, txtUsuarioSenha.getText());
            pst.setString(6, cboUsuarioPerfil.getSelectedItem().toString());
// validação dos campos obrigatorios;
            if ((txtUsuarioId.getText().isEmpty()) || (txtUsuarioNome.getText().isEmpty()) || (txtUsuarioLogin.getText().isEmpty()) || (txtUsuarioSenha.getText().isEmpty())) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios");
            } else {

                // a linha abaixo atualizar a tabela usuario com os dados do formulário.
                // a estrutura abaixo é usada para confirmar a inserção dos dados na tabela
                int adicionado = pst.executeUpdate();
                // a linha abaixo server de apoio ao entendimento da lógica;
                //System.out.println(adicionado);
                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Usuário adicionado com sucesso");
                    txtUsuarioId.setText(null);
                    txtUsuarioNome.setText(null);
                    txtUsuarioFone.setText(null);
                    txtUsuarioLogin.setText(null);
                    txtUsuarioSenha.setText(null);

                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    // Criando o metódo para alterar os dados do usuarios;
    private void alterar() {
        String sql = "update tbusuarios set usuario=?,fone=?,login=?,senha=?,perfil=? where iduser=?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtUsuarioNome.getText());
            pst.setString(2, txtUsuarioFone.getText());
            pst.setString(3, txtUsuarioLogin.getText());
            pst.setString(4, txtUsuarioSenha.getText());
            pst.setString(5, cboUsuarioPerfil.getSelectedItem().toString());
            pst.setString(6, txtUsuarioId.getText());

            if ((txtUsuarioId.getText().isEmpty()) || (txtUsuarioNome.getText().isEmpty()) || (txtUsuarioLogin.getText().isEmpty()) || (txtUsuarioSenha.getText().isEmpty())) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios");
            } else {

                // a linha abaixo atualizar a tabela usuario com os dados do formulário.
                // a estrutura abaixo é usada para confirmar a alteraçao dos dados na tabela
                int adicionado = pst.executeUpdate();
                // a linha abaixo server de apoio ao entendimento da lógica;
                //System.out.println(adicionado);
                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Dados do usuário alterados com sucesso");
                    txtUsuarioId.setText(null);
                    txtUsuarioNome.setText(null);
                    txtUsuarioFone.setText(null);
                    txtUsuarioLogin.setText(null);
                    txtUsuarioSenha.setText(null);

                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    // Criando metodo resposavel pela remoção de usuarios;
    private void remover(){
        // A estrutura abaixo confirma a remoção do usuario;
        int confirma = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja remover este usuário", "Atenção",JOptionPane.YES_NO_OPTION );
        if (confirma == JOptionPane.YES_OPTION){
            String sql = "delete from tbusuarios where iduser=?";
            try {
                pst = conexao.prepareStatement(sql);
                pst.setString(1,txtUsuarioId.getText());
                int apagado = pst.executeUpdate();
                if (apagado > 0){
                    JOptionPane.showMessageDialog(null, "Usuário removido com sucesso");
                    txtUsuarioId.setText(null);
                    txtUsuarioNome.setText(null);
                    txtUsuarioFone.setText(null);
                    txtUsuarioLogin.setText(null);
                    txtUsuarioSenha.setText(null);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUsuarioId = new javax.swing.JTextField();
        txtUsuarioNome = new javax.swing.JTextField();
        txtUsuarioLogin = new javax.swing.JTextField();
        txtUsuarioSenha = new javax.swing.JTextField();
        cboUsuarioPerfil = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtUsuarioFone = new javax.swing.JTextField();
        btnUsuarioCreate = new javax.swing.JButton();
        btnUsuarioRead = new javax.swing.JButton();
        btnUsuarioUpdate = new javax.swing.JButton();
        btnUsuarioDelete = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Usuários");
        setPreferredSize(new java.awt.Dimension(802, 631));

        jLabel1.setText("ID *");

        jLabel2.setText("N ome *");

        jLabel3.setText("Login *");

        jLabel4.setText("Senha *");

        jLabel5.setText("Perfil *");

        cboUsuarioPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "user", "admin" }));

        jLabel6.setText("Fone");

        btnUsuarioCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infox/icones/create.png"))); // NOI18N
        btnUsuarioCreate.setToolTipText("Adicionar");
        btnUsuarioCreate.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnUsuarioCreate.setPreferredSize(new java.awt.Dimension(80, 80));
        btnUsuarioCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioCreateActionPerformed(evt);
            }
        });

        btnUsuarioRead.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infox/icones/read.png"))); // NOI18N
        btnUsuarioRead.setToolTipText("Consultar");
        btnUsuarioRead.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnUsuarioRead.setPreferredSize(new java.awt.Dimension(80, 80));
        btnUsuarioRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioReadActionPerformed(evt);
            }
        });

        btnUsuarioUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infox/icones/update.png"))); // NOI18N
        btnUsuarioUpdate.setToolTipText("Alterar");
        btnUsuarioUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnUsuarioUpdate.setPreferredSize(new java.awt.Dimension(80, 80));
        btnUsuarioUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioUpdateActionPerformed(evt);
            }
        });

        btnUsuarioDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infox/icones/delete.png"))); // NOI18N
        btnUsuarioDelete.setToolTipText("Deletar");
        btnUsuarioDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnUsuarioDelete.setPreferredSize(new java.awt.Dimension(80, 80));
        btnUsuarioDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioDeleteActionPerformed(evt);
            }
        });

        jLabel7.setText("* Campos Obrigatórios");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtUsuarioId, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7))
                    .addComponent(txtUsuarioNome, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsuarioSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                            .addComponent(txtUsuarioFone))
                        .addGap(119, 119, 119)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboUsuarioPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsuarioLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(71, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnUsuarioCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(btnUsuarioRead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(btnUsuarioUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(btnUsuarioDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnUsuarioCreate, btnUsuarioDelete, btnUsuarioRead, btnUsuarioUpdate});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUsuarioId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUsuarioNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtUsuarioLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtUsuarioFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtUsuarioSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboUsuarioPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUsuarioCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUsuarioRead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUsuarioDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUsuarioUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(107, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnUsuarioCreate, btnUsuarioDelete, btnUsuarioRead, btnUsuarioUpdate});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUsuarioReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioReadActionPerformed
        // chamando o metodo consultar;
        consultar();
    }//GEN-LAST:event_btnUsuarioReadActionPerformed

    private void btnUsuarioCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioCreateActionPerformed
        // chamando o metódo adicionar;
        adicionar();
    }//GEN-LAST:event_btnUsuarioCreateActionPerformed

    private void btnUsuarioUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioUpdateActionPerformed
        // chamando o metódo alterar;
        alterar();
    }//GEN-LAST:event_btnUsuarioUpdateActionPerformed

    private void btnUsuarioDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioDeleteActionPerformed
        // Chamando o metódo remover;
        remover();
    }//GEN-LAST:event_btnUsuarioDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUsuarioCreate;
    private javax.swing.JButton btnUsuarioDelete;
    private javax.swing.JButton btnUsuarioRead;
    private javax.swing.JButton btnUsuarioUpdate;
    private javax.swing.JComboBox<String> cboUsuarioPerfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtUsuarioFone;
    private javax.swing.JTextField txtUsuarioId;
    private javax.swing.JTextField txtUsuarioLogin;
    private javax.swing.JTextField txtUsuarioNome;
    private javax.swing.JTextField txtUsuarioSenha;
    // End of variables declaration//GEN-END:variables
}
