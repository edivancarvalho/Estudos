package view;

import bll.FabricanteBll;
import bll.MiniaturaBll;
import bll.TemaBll;
import bll.Tipo_MiniaturaBll;
import java.sql.*;
import dao.ModuloConexao;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Fabricantes;
import model.Miniaturas;
import model.Temas;
import model.Tipo_Miniaturas;
// recursos da biblioteca rs2xml.jar
import net.proteanit.sql.DbUtils;

/**
 *
 * @author edivan
 */
public class TelaMiniatura extends javax.swing.JInternalFrame {
    
    Miniaturas mini = new Miniaturas();
    MiniaturaBll miniBll = new MiniaturaBll();
    
    FabricanteBll fabBll = new FabricanteBll();
    TemaBll temaBll = new TemaBll();
    Tipo_MiniaturaBll tipoBll = new Tipo_MiniaturaBll();  

    
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    /**
     * Creates new form TelaCliente
     */
    public TelaMiniatura() throws Exception {
        miniBll = new MiniaturaBll();
        initComponents();
        conexao = ModuloConexao.conector();
        // --------
        List<Fabricantes> listaFabricantes = new ArrayList<Fabricantes>();
        listaFabricantes = fabBll.consultarFabricantes();

        cbFabricante.removeAllItems();
        cbFabricante.addItem("< Selecione aqui o fabricante >");
        for (int i = 0; i < listaFabricantes.size(); i++) {
            Fabricantes aux = listaFabricantes.get(i);
            cbFabricante.addItem(aux.getIden() + " - " + aux.getNome().toUpperCase());
        }
        // --------
        List<Tipo_Miniaturas> listaTipoDeMiniaturas = new ArrayList<>();
        listaTipoDeMiniaturas = tipoBll.consultarTipo_Miniaturas();

        cbTipoMini.removeAllItems();
        cbTipoMini.addItem("< Selecione aqui o tipo de miniatura >");
        for (int pos = 0; pos < listaTipoDeMiniaturas.size(); pos++) {
            Tipo_Miniaturas aux = listaTipoDeMiniaturas.get(pos);
            cbTipoMini.addItem(aux.getIden() + " - " + aux.getTipo().toUpperCase());
        }
        // --------
        List<Temas> listaTemas = new ArrayList<>();
        listaTemas = temaBll.consultarTemas();

        cbTema.removeAllItems();
        cbTema.addItem("< Selecione aqui o tema da miniatura >");
        for (int pos = 0; pos < listaTemas.size(); pos++) {
            Temas aux = listaTemas.get(pos);
            cbTema.addItem(aux.getIden() + " - " + aux.getNome().toUpperCase());
        }

    }

    private void consultarMiniaturas(List<Miniaturas> lista) throws Exception {
        DefaultTableModel modelo = (DefaultTableModel) tableMiniatura.getModel();
        //DefaultTableModel modelo = (DefaultTableModel) tblClientes.getModel();
        modelo.setNumRows(0);
        for (int pos = 0; pos < lista.size(); pos++) {
            String[] linha = new String[10];
            Miniaturas aux = lista.get(pos);
            linha[0] = aux.getIden() + "";
            linha[1] = aux.getModelo() + "";
            linha[2] = aux.getEdicao() + "";
            linha[3] = aux.getAno() + "";
            linha[4] = aux.getEscala() + "";
            linha[5] = aux.getValor() + "";
            linha[6] = aux.getObservacoes() + "";
            linha[7] = aux.getFabricantes().getNome() + "";
            linha[8] = aux.getTipo_miniaturas().getTipo()+ "";
            linha[9] = aux.getTemas().getNome()+ "";
            
            modelo.addRow(linha);

        }
    }

    // metodo para pesquisar clientes pelo nome com filtro;
    private void pesquisar_miniatura() {
        rs = miniBll.consultarMiniaturaPorNome(txtCliPesquisar.getText());
        // usando a biblioteca rs2mxl.jar para preencher a tabela 
        tableMiniatura.setModel(DbUtils.resultSetToTableModel(rs));
    }

    private void limpaCampos() {
        txtCliModelo.setText(null);
        txtCliAno.setText(null);
        txtCliObservacoes.setText(null);
        txtCliEdicao.setText(null);
        txtCliEscala.setText(null);
        txtCliValor.setText(null);

        cbFabricante.removeAllItems();
        cbFabricante.addItem("< Selecione aqui o fabricante >");

        cbTipoMini.removeAllItems();
        cbTipoMini.addItem("< Selecione aqui o tipo de miniatura >");

        cbTema.removeAllItems();
        cbTema.addItem("< Selecione aqui o tema da miniatura >");

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
        txtCliPesquisar = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMiniatura = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtCliModelo = new javax.swing.JTextField();
        txtCliAno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCliEdicao = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCliObservacoes = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCliEscala = new javax.swing.JTextField();
        txtCliValor = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField4 = new javax.swing.JTextField();
        btnUploadFoto = new javax.swing.JToggleButton();
        jPanel3 = new javax.swing.JPanel();
        cbTipoMini = new javax.swing.JComboBox<>();
        cbFabricante = new javax.swing.JComboBox<>();
        cbTema = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnMiniSalvar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastro");

        jLabel1.setText("* Campos Obrigatorio");

        txtCliPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCliPesquisarKeyReleased(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/buscar.png"))); // NOI18N
        jLabel9.setText("Pesquisar");

        tableMiniatura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableMiniatura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMiniaturaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableMiniatura);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Miniaturas"));

        jLabel3.setText("Modelo *");

        jLabel4.setText("Ano");

        jLabel6.setText("Edição *");

        jLabel5.setText("Obs° ");

        jLabel7.setText("Escala");

        jLabel8.setText("Valor * ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCliValor)
                            .addComponent(txtCliObservacoes))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtCliModelo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(23, 23, 23)
                        .addComponent(txtCliEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCliAno, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(12, 12, 12))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(34, 34, 34)
                .addComponent(txtCliEscala)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCliModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtCliAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCliEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtCliEscala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCliValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCliObservacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Fotos Upload"));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        btnUploadFoto.setText("Upload foto");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUploadFoto)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUploadFoto)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        cbTipoMini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbTipoMiniMouseClicked(evt);
            }
        });

        cbFabricante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbFabricanteMouseClicked(evt);
            }
        });

        cbTema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbTemaMouseClicked(evt);
            }
        });

        jLabel2.setText("Fabricante");

        jLabel10.setText("Tema");

        jLabel11.setText("Tipo de Miniatura");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbTema, 0, 227, Short.MAX_VALUE)
                    .addComponent(cbTipoMini, javax.swing.GroupLayout.Alignment.TRAILING, 0, 227, Short.MAX_VALUE)
                    .addComponent(cbFabricante, 0, 227, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbTipoMini, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbTema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        btnMiniSalvar.setText("Salvar");
        btnMiniSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMiniSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCliPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel9)
                                .addGap(70, 70, 70)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(btnMiniSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCliPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnMiniSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        setBounds(0, 0, 955, 579);
    }// </editor-fold>//GEN-END:initComponents
    public void setar_Campos() {

        int setar = tableMiniatura.getSelectedRow();

        txtCliModelo.setText(tableMiniatura.getModel().getValueAt(setar, 1).toString());
        txtCliAno.setText(tableMiniatura.getModel().getValueAt(setar, 2).toString());
        txtCliObservacoes.setText(tableMiniatura.getModel().getValueAt(setar, 3).toString());
        txtCliEdicao.setText(tableMiniatura.getModel().getValueAt(setar, 4).toString());
        txtCliEscala.setText(tableMiniatura.getModel().getValueAt(setar, 5).toString());
        txtCliValor.setText(tableMiniatura.getModel().getValueAt(setar, 6).toString());
       
        if (setar > 0){
          btnMiniSalvar.setLabel("Editar");  
        }else{
            btnMiniSalvar.setLabel("Salvar");
        }
          
    }

    public void alterarMiniatura() throws Exception {

        String sql = "UPDATE miniaturas SET min_modelo=?, min_ano=?, min_observacoes=?, min_edicao=?, min_escala=?, min_valor=?, min_fab_iden=?,min_tmin_iden=?,min_tem_iden=? WHERE min_modelo=?";

        //String sql = "UPDATE miniaturas SET min_modelo=?, min_ano=?, min_observacoes=?, min_edicao=?, min_escala=?, min_valor=?, min_fab_iden=?,min_tmin_iden=?,min_tem_iden=? WHERE min_iden=?";
        try {
            PreparedStatement pst;
            String resultado;

            pst = conexao.prepareStatement(sql);

            pst.setString(1, txtCliModelo.getText());
            pst.setString(2, txtCliAno.getText());
            pst.setString(3, txtCliObservacoes.getText());
            pst.setString(4, txtCliEdicao.getText());
            pst.setString(5, txtCliEscala.getText());
            pst.setString(6, txtCliValor.getText());
            pst.setInt(7, mini.getFabricantes().getIden());
            pst.setInt(8, mini.getTemas().getIden());
            pst.setInt(9, mini.getTipo_miniaturas().getIden());
            //pst.setInt(10, mini.getIden());
            pst.setString(10, txtCliModelo.getText());
            
            if (btnMiniSalvar.getLabel().equals("Salvar")){
                miniBll.adicionarMiniatura(mini);
            }else{
                miniBll.alterarMiniatura(mini);
            }

            pst.executeUpdate();
            limpaCampos();

        } catch (Exception erro) {
            throw new Exception("Ocorreu um erro ao alterar este registro\n"
                    + erro.getMessage());
        }

        
    }

    public void preencheCampos(int id) {
        try {
            if (id > 0) {
                mini = miniBll.consultarMiniaturaById(id);
                //mini = miniBll.consultarMiniaturaPorNome();
                txtCliModelo.setText(id + "");
                txtCliModelo.setText(mini.getModelo());

//
                boolean equals = btnMiniSalvar.getLabel().equals("Editar");
                //miniBll.adicionarMiniatura(mini);
                //txtCliModelo.setText(tblClientes.getModel().getValueAt(setar, 1).toString());
            } else {
                btnMiniSalvar.setLabel("Salvar");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

// evento abaixo é do tipo "enquato for digitando"
    private void txtCliPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCliPesquisarKeyReleased
        // chamar o metodo pesquisar miniaturas. 
        pesquisar_miniatura();
    }//GEN-LAST:event_txtCliPesquisarKeyReleased


    private void cbTipoMiniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbTipoMiniMouseClicked

    }//GEN-LAST:event_cbTipoMiniMouseClicked

    private void cbFabricanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbFabricanteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cbFabricanteMouseClicked

    private void cbTemaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbTemaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTemaMouseClicked

    private void tableMiniaturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMiniaturaMouseClicked

        //setar_Campos();
        
// ------------------ ok

        int linha = tableMiniatura.getSelectedRow();
        Integer codigo = Integer.parseInt(tableMiniatura.getValueAt(linha, 0).toString());
        //txtCliModelo.setText(tblClientes.getModel().getValueAt(linha, 1).toString());
        txtCliAno.setText(tableMiniatura.getModel().getValueAt(linha, 2).toString());
        txtCliObservacoes.setText(tableMiniatura.getModel().getValueAt(linha, 3).toString());
        txtCliEdicao.setText(tableMiniatura.getModel().getValueAt(linha, 4).toString());

        txtCliEscala.setText(tableMiniatura.getModel().getValueAt(linha, 5).toString());
        txtCliValor.setText(tableMiniatura.getModel().getValueAt(linha, 6).toString());
        try {
            preencheCampos((int) codigo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao preencher campo");
        }

    }//GEN-LAST:event_tableMiniaturaMouseClicked

    private void btnMiniSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMiniSalvarActionPerformed
        try {
            mini.setModelo(txtCliModelo.getText());
            if(btnMiniSalvar.getLabel().equals("Salvar")){
                miniBll.adicionarMiniatura(mini);
            }else{
                miniBll.alterarMiniatura(mini);
            }
            consultarMiniaturas(miniBll.consultarMiniaturas());
            limpaCampos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Miniatura não cadastrado - telaminiatura");
        }
    }//GEN-LAST:event_btnMiniSalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMiniSalvar;
    private javax.swing.JToggleButton btnUploadFoto;
    private javax.swing.JComboBox<Object> cbFabricante;
    private javax.swing.JComboBox<Object> cbTema;
    private javax.swing.JComboBox<Object> cbTipoMini;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTable tableMiniatura;
    private javax.swing.JTextField txtCliAno;
    private javax.swing.JTextField txtCliEdicao;
    private javax.swing.JTextField txtCliEscala;
    private javax.swing.JTextField txtCliModelo;
    private javax.swing.JTextField txtCliObservacoes;
    private javax.swing.JTextField txtCliPesquisar;
    private javax.swing.JTextField txtCliValor;
    // End of variables declaration//GEN-END:variables
}
