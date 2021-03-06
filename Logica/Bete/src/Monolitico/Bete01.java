package Monolitico;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author edivan
 */
public class Bete01 extends javax.swing.JFrame {
    
    Bete01 contato;
    static String nome = "";
    static String telefone = "";
    static String email = "";
    
//    Object [][] dados = {
//        {"Edivan Carvalho", "45 6789 1234", "eu@localho.com"},
//        {"jose Carvalho", "45 0000 1234", "eu@localho.com"}
//    };
      
    private void salvarGrid(Bete01 contato) throws  Exception{
        DefaultTableModel model = (DefaultTableModel) jTable_Tabela.getModel();
        
        String[] linha = new String[3];
        linha[0] =  "" + contato.nome.toUpperCase();
        linha[1] =  "" + contato.telefone;
        linha[2] =  "" + contato.email;
        model.addRow(linha);
    }
    
    /**
     * Creates new form Atividade01
     */
    public Bete01() {
        initComponents();  
                
    }

    public void preencherFormularioTela() throws Exception {
        
        String posicaoLinhaNome = jTable_Tabela.getValueAt(jTable_Tabela.getSelectedRow(), 0).toString();
        String posicaoLinhaTel = jTable_Tabela.getValueAt(jTable_Tabela.getSelectedRow(), 1).toString();
        String posicaoLinhaEmail = jTable_Tabela.getValueAt(jTable_Tabela.getSelectedRow(), 2).toString();
        
        jText_Nome.setText(posicaoLinhaNome);
        jText_Tel.setText(posicaoLinhaTel);
        jText_Email.setText(posicaoLinhaEmail);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        campo_Nome = new javax.swing.JLabel();
        campo_Telefone = new javax.swing.JLabel();
        campo_Email = new javax.swing.JLabel();
        jText_Nome = new javax.swing.JTextField();
        jText_Tel = new javax.swing.JTextField();
        jText_Email = new javax.swing.JTextField();
        btn_Salvar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Tabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados de Contato"));

        campo_Nome.setText("Nome");

        campo_Telefone.setText("Telefone");

        campo_Email.setText("Email");

        btn_Salvar.setText("Salvar");
        btn_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campo_Nome)
                    .addComponent(jText_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campo_Telefone)
                    .addComponent(jText_Tel, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jText_Email)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(campo_Email)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                        .addComponent(btn_Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_Nome)
                    .addComponent(campo_Telefone)
                    .addComponent(campo_Email)
                    .addComponent(btn_Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jText_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_Tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabela"));

        jTable_Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Telefone", "Email"
            }
        ));
        jScrollPane1.setViewportView(jTable_Tabela);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
       
    
    private void imprimir(ArrayList<Bete01>lista){
        DefaultTableModel model = (DefaultTableModel) jTable_Tabela.getModel();
        model.setRowCount(0);
        for (int pos = 0; pos < lista.size(); pos++) {
            String[] linha = new String[3];
            contato = lista.get(pos);
            linha[0] = String.valueOf(nome);
            linha[1] = String.valueOf(telefone);
            linha[2] = String.valueOf(email);
            
        }
        
    }
    
    private void btn_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalvarActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tabelaContato = (DefaultTableModel)jTable_Tabela.getModel();
        Object[] dados = {jText_Nome.getText(), jText_Tel.getText(), jText_Email.getText()};
        
        tabelaContato.addRow(dados);             
    }//GEN-LAST:event_btn_SalvarActionPerformed

   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
               
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bete01().setVisible(true);
            }
        });
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Salvar;
    private javax.swing.JLabel campo_Email;
    private javax.swing.JLabel campo_Nome;
    private javax.swing.JLabel campo_Telefone;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Tabela;
    private javax.swing.JTextField jText_Email;
    private javax.swing.JTextField jText_Nome;
    private javax.swing.JTextField jText_Tel;
    // End of variables declaration//GEN-END:variables
}
