/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.*;
import dao.ModuloConexao;
import java.text.DateFormat;
import javax.swing.JOptionPane;
import java.util.Date;

/**
 *
 * @author edivan
 */
public class TelaPrincipal1 extends javax.swing.JFrame {

    //Usando conexao dal
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public void logar() {

    }

    /**
     * Creates new form Tela
     */
    public TelaPrincipal1() {
        initComponents();
        conexao = ModuloConexao.conector();
    }

//    private void consulta() {
//        String sql = "select * from tbusuarios where iduser=?";
//        try {
//
//            pst = conexao.prepareStatement(sql);
//            // pst.setString(1, txtId.getText());
//            rs = pst.executeQuery();
//            if (rs.next()) {
//                //   txtUsuario.setText(rs.getString(2));
//                System.out.println(rs.getString(2));
//            } else {
//            }
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "vamos ver!!");
//        }
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUsuario = new javax.swing.JLabel();
        desktop = new javax.swing.JDesktopPane();
        lblData = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menu = new javax.swing.JMenu();
        MenuCliente = new javax.swing.JMenuItem();
        menUsuarios = new javax.swing.JMenuItem();
        MenRel = new javax.swing.JMenu();
        menRelSer = new javax.swing.JMenuItem();
        MenAJu = new javax.swing.JMenu();
        MenAjuSobre = new javax.swing.JMenuItem();
        MenOpc = new javax.swing.JMenu();
        MenOpcSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Cadastro1");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        lblUsuario.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        lblUsuario.setText("Usuario");

        desktop.setPreferredSize(new java.awt.Dimension(830, 681));

        lblData.setText("Data");

        Menu.setText("Cadastro");

        MenuCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        MenuCliente.setText("Cliente");
        MenuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuClienteActionPerformed(evt);
            }
        });
        Menu.add(MenuCliente);

        menUsuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        menUsuarios.setText("Usuarios");
        menUsuarios.setEnabled(false);
        menUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menUsuariosActionPerformed(evt);
            }
        });
        Menu.add(menUsuarios);

        jMenuBar1.add(Menu);

        MenRel.setText("Relatorio");

        menRelSer.setText("Serviços");
        menRelSer.setEnabled(false);
        MenRel.add(menRelSer);

        jMenuBar1.add(MenRel);

        MenAJu.setText("Ajudar");

        MenAjuSobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        MenAjuSobre.setText("Sobre");
        MenAjuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenAjuSobreActionPerformed(evt);
            }
        });
        MenAJu.add(MenAjuSobre);

        jMenuBar1.add(MenAJu);

        MenOpc.setText("Opções");

        MenOpcSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        MenOpcSair.setText("Sair");
        MenOpcSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenOpcSairActionPerformed(evt);
            }
        });
        MenOpc.add(MenOpcSair);

        jMenuBar1.add(MenOpc);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 816, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 789, Short.MAX_VALUE)
                        .addComponent(lblData)))
                .addGap(50, 50, 50)
                .addComponent(lblUsuario)
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblData)
                    .addComponent(lblUsuario))
                .addGap(49, 49, 49))
        );

        setSize(new java.awt.Dimension(966, 707));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuClienteActionPerformed
        // chama a tela cliente
        TelaCliente tcliente = new TelaCliente();
        tcliente.setVisible(true);
        desktop.add(tcliente);
        
    }//GEN-LAST:event_MenuClienteActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // substituem a data pela data atual do sistema
        Date data = new Date();
        DateFormat formatador = DateFormat.getDateInstance(DateFormat.SHORT);
        lblData.setText(formatador.format(data));
        //lblData.setText(data.toString());


    }//GEN-LAST:event_formWindowActivated

    private void MenOpcSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenOpcSairActionPerformed
        int sair = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION) {
            System.exit(0);
        }


    }//GEN-LAST:event_MenOpcSairActionPerformed

    private void MenAjuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenAjuSobreActionPerformed
        // chamando a tela sobre;
        TelaSobre sobre = new TelaSobre();
        sobre.setVisible(true);
    }//GEN-LAST:event_MenAjuSobreActionPerformed

    private void menUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menUsuariosActionPerformed
        // abre o form TelaUusuario dentro do desktop 
        TelaUsuario tusuario = new TelaUsuario();
        tusuario.setVisible(true);
        desktop.add(tusuario);
    }//GEN-LAST:event_menUsuariosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenAJu;
    private javax.swing.JMenuItem MenAjuSobre;
    private javax.swing.JMenu MenOpc;
    private javax.swing.JMenuItem MenOpcSair;
    private javax.swing.JMenu MenRel;
    private javax.swing.JMenu Menu;
    private javax.swing.JMenuItem MenuCliente;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblData;
    public static javax.swing.JLabel lblUsuario;
    public static javax.swing.JMenuItem menRelSer;
    public static javax.swing.JMenuItem menUsuarios;
    // End of variables declaration//GEN-END:variables
}
