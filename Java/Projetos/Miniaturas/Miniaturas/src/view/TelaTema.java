package view;

import bll.TemaBll;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Temas;

/**
 *
 * @author edivan
 */
public class TelaTema extends javax.swing.JInternalFrame {

    
    Temas tema = new Temas();
    TemaBll temaBll = new TemaBll();

    /**
     * Creates new form TelaTema
     */
    public TelaTema() {
        initComponents();
    }

    private void consultarTemas(List<Temas> lista) throws Exception {
        
        DefaultTableModel modelo = (DefaultTableModel) tableTemas.getModel();
        modelo.setNumRows(0);
        
        for (int pos = 0; pos < lista.size(); pos++) {
            String[] linha = new String[2];
            Temas aux = lista.get(pos);
            linha[0] = aux.getIden() + "";
            linha[1] = aux.getNome() + "";
            modelo.addRow(linha);

        }
    }

    private void limpaCampos() {
        txtTemId.setText("");
        txtTemNome.setText("");
    }

    private void preencheCampos(int id) throws Exception {

        try {
            if (id > 0) {
                tema = temaBll.consultaTemasPorId(id);
                txtTemId.setText(id + "");
                txtTemNome.setText(tema.getNome());
                btnTemaSalvar.setLabel("Editar");
            } else {
                btnTemaSalvar.setLabel("Salvar");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
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
        txtTemNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTemId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableTemas = new javax.swing.JTable();
        btnTemaSalvar = new javax.swing.JButton();
        btnTemaExcluir = new javax.swing.JButton();
        btnTemaConsultar = new javax.swing.JButton();
        btnTemaNovo = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Temas");
        setPreferredSize(new java.awt.Dimension(562, 347));

        jLabel1.setText("Temas");

        jLabel2.setText("ID");

        tableTemas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Temas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableTemas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableTemasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableTemas);
        if (tableTemas.getColumnModel().getColumnCount() > 0) {
            tableTemas.getColumnModel().getColumn(0).setMinWidth(50);
            tableTemas.getColumnModel().getColumn(0).setPreferredWidth(50);
            tableTemas.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        btnTemaSalvar.setText("Salvar");
        btnTemaSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTemaSalvarActionPerformed(evt);
            }
        });

        btnTemaExcluir.setText("Excluir");
        btnTemaExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTemaExcluirActionPerformed(evt);
            }
        });

        btnTemaConsultar.setText("Consultar");
        btnTemaConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTemaConsultarActionPerformed(evt);
            }
        });

        btnTemaNovo.setText("Novo");
        btnTemaNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTemaNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTemNome)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtTemId, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTemaSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTemaExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTemaConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTemaNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTemId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTemNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTemaConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTemaNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTemaExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTemaSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        setBounds(0, 0, 562, 344);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTemaNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTemaNovoActionPerformed
        limpaCampos();
        txtTemNome.requestFocus();
        btnTemaSalvar.setLabel("Salvar");
    }//GEN-LAST:event_btnTemaNovoActionPerformed

    private void btnTemaSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTemaSalvarActionPerformed
        try {
            tema.setNome(txtTemNome.getText());
            if (btnTemaSalvar.getLabel().equals("Salvar")) {
                temaBll.adicionarTema(tema);
                JOptionPane.showMessageDialog(null, "Tema inserido com sucesso.");
            } else {
                temaBll.alterarTema(tema);
            }
            consultarTemas(temaBll.consultarTemas());
            limpaCampos();

        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnTemaSalvarActionPerformed

    private void btnTemaExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTemaExcluirActionPerformed
        try {
            temaBll.removerTema(temaBll.consultaTemasPorId(tema.getIden()));
            limpaCampos();
            consultarTemas(temaBll.consultarTemas());
        } catch (Exception e) {
            e.getMessage();
        }
    }//GEN-LAST:event_btnTemaExcluirActionPerformed

    private void btnTemaConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTemaConsultarActionPerformed
        try {
            consultarTemas(temaBll.consultarTemas());

        } catch (Exception e) {
            e.getMessage();
        }
    }//GEN-LAST:event_btnTemaConsultarActionPerformed

    private void tableTemasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableTemasMouseClicked
        int linha = tableTemas.getSelectedRow();
        Integer codigo = Integer.parseInt(tableTemas.getValueAt(linha, 0).toString());
        try {
            preencheCampos((int) codigo);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao preencher campo");
        }
    }//GEN-LAST:event_tableTemasMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTemaConsultar;
    private javax.swing.JButton btnTemaExcluir;
    private javax.swing.JButton btnTemaNovo;
    private javax.swing.JButton btnTemaSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableTemas;
    private javax.swing.JTextField txtTemId;
    private javax.swing.JTextField txtTemNome;
    // End of variables declaration//GEN-END:variables
}
