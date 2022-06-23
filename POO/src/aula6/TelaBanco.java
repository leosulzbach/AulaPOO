
package aula6;

import javax.swing.DefaultComboBoxModel;
import modelos.ContaBanco;

public class TelaBanco extends javax.swing.JFrame {
    
    DefaultComboBoxModel model = new DefaultComboBoxModel();
    ContaBanco[] contas = new ContaBanco[3];
    int total = 0;
    
    public TelaBanco() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        pnlCadastroConta = new javax.swing.JPanel();
        txtConta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtAgencia = new javax.swing.JTextField();
        txtTitular = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtSaldo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtChavePix = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtChequeEspecial = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        cmbContas = new javax.swing.JComboBox<>();
        btnRecuperarConta = new javax.swing.JButton();
        lblTitular = new javax.swing.JLabel();
        lblTitularContaBanco = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Terminal Bancário");

        pnlCadastroConta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Crie_Banco", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 14))); // NOI18N

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setText("Agência");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setText("Titular");

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setText("Conta");

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setText("Saldo");

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setText("Cheque especial");

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setText("Chave Pix");

        btnCadastrar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCadastroContaLayout = new javax.swing.GroupLayout(pnlCadastroConta);
        pnlCadastroConta.setLayout(pnlCadastroContaLayout);
        pnlCadastroContaLayout.setHorizontalGroup(
            pnlCadastroContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroContaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCadastroContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCadastroContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnlCadastroContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(pnlCadastroContaLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(pnlCadastroContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtConta, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(pnlCadastroContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addGroup(pnlCadastroContaLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(pnlCadastroContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtChequeEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtChavePix, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15))
            .addGroup(pnlCadastroContaLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlCadastroContaLayout.setVerticalGroup(
            pnlCadastroContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroContaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCadastroContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCadastroContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtChequeEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCadastroContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCadastroContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtChavePix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCadastroContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCadastroContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTitular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        btnRecuperarConta.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnRecuperarConta.setText("RECUPERAR CONTA");
        btnRecuperarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecuperarContaActionPerformed(evt);
            }
        });

        lblTitular.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblTitular.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitular.setText("TITULAR:");

        lblTitularContaBanco.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblTitularContaBanco.setText("...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(pnlCadastroConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbContas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRecuperarConta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTitularContaBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 18, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlCadastroConta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(cmbContas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRecuperarConta, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTitularContaBanco))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRecuperarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecuperarContaActionPerformed

        if (cmbContas.getItemAt(0) != null) {
            ContaBanco objContaRecuperacao = (ContaBanco) cmbContas.getSelectedItem();
            lblTitularContaBanco.setText(objContaRecuperacao.getTitular());
            
        /* if (contas[0] != null) {
        String contaCombo = cmbContas.getSelectedItem().toString();
        ContaBanco conta = localizarContaOrigem(contaCombo);
        txtContas.setText(conta.toString());
        lblTitularContaBanco.setText(conta.getTitular());*/
        }
    }//GEN-LAST:event_btnRecuperarContaActionPerformed
    
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
      
       
         ContaBanco objConta = new ContaBanco(txtAgencia.getText(), 
                txtConta.getText(), 
                txtTitular.getText(), 
                Double.parseDouble(txtSaldo.getText()), 
                Double.parseDouble(txtChequeEspecial.getText()),
                txtChavePix.getText()
                );
             
             
                model.addElement(objConta);
                cmbContas.setModel(model);
             
                lblTitularContaBanco.setText(objConta.getTitular());
                txtAgencia.setText("");
                txtConta.setText("");
                txtTitular.setText("");
                txtSaldo.setText("");
                txtChequeEspecial.setText("");
                txtChavePix.setText("");
        
        
        /* txtContas.setText(objConta.toString());
        cmbContas.addItem(objConta.textoCombo());
        contas[total] = objConta;
        total++; */
        
       
    }//GEN-LAST:event_btnCadastrarActionPerformed
/*private ContaBanco localizarContaOrigem(String codConta){
        for (int i = 0; i < contas.length; i++) {
            if (contas[i].getConta().equals(codConta)) {
                return contas[i];
            }
        }
        return null;
        }*/
    
    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaBanco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnRecuperarConta;
    private javax.swing.JComboBox<String> cmbContas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblTitular;
    private javax.swing.JLabel lblTitularContaBanco;
    private javax.swing.JPanel pnlCadastroConta;
    private javax.swing.JTextField txtAgencia;
    private javax.swing.JTextField txtChavePix;
    private javax.swing.JTextField txtChequeEspecial;
    private javax.swing.JTextField txtConta;
    private javax.swing.JTextField txtSaldo;
    private javax.swing.JTextField txtTitular;
    // End of variables declaration//GEN-END:variables
}

