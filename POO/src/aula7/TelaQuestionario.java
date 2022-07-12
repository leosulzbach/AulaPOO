package aula7;

import ferramentas.Globais;
import javax.swing.JOptionPane;
import modelos.Questionario;

/**
 *
 * @author jonasdhein
 */
public class TelaQuestionario extends javax.swing.JFrame {

    /**
     * Creates new form TelaQuestionario
     */
    
    //declaração das variáveis da tela
    Questionario[] vetorQuestoes = new Questionario[3];
    int cont = -1;
    int acertos = 0;
            
    public TelaQuestionario() {
        initComponents();
        
        Questionario objQuestao = new Questionario();
        objQuestao.setPergunta("Quais destes é um animal?");
        objQuestao.setRespostaA("5");
        objQuestao.setRespostaB("cachorro");
        objQuestao.setRespostaC("cadeira");
        objQuestao.setRespostaCorreta('B');
        
        vetorQuestoes[0] = objQuestao;
        
        objQuestao = new Questionario();
        objQuestao.setPergunta("São tipos de variáveis");
        objQuestao.setRespostaA("int, double");
        objQuestao.setRespostaB("ynt, double");
        objQuestao.setRespostaC("Stryng, float");
        objQuestao.setRespostaCorreta('A');
        
        vetorQuestoes[1] = objQuestao;
        
        objQuestao = new Questionario();
        objQuestao.setPergunta("Exemplo de IDEs");
        objQuestao.setRespostaA("Windows e paint");
        objQuestao.setRespostaB("GitHub e Google");
        objQuestao.setRespostaC("NetBeans e Visual Studio Code");
        objQuestao.setRespostaCorreta('C');
        
        vetorQuestoes[2] = objQuestao;
        
        fazerPergunta();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        btnAvancar = new javax.swing.JButton();
        lblPergunta = new javax.swing.JLabel();
        rbtAlternativaA = new javax.swing.JRadioButton();
        rbtAlternativaB = new javax.swing.JRadioButton();
        rbtAlternativaC = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Questionário");

        btnAvancar.setText("Avançar");
        btnAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvancarActionPerformed(evt);
            }
        });

        lblPergunta.setText("Qual a pergunta?");

        buttonGroup1.add(rbtAlternativaA);
        rbtAlternativaA.setText("jRadioButton1");

        buttonGroup1.add(rbtAlternativaB);
        rbtAlternativaB.setText("jRadioButton2");

        buttonGroup1.add(rbtAlternativaC);
        rbtAlternativaC.setText("jRadioButton3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAvancar))
                    .addComponent(lblPergunta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbtAlternativaA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbtAlternativaB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbtAlternativaC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addComponent(lblPergunta)
                .addGap(18, 18, 18)
                .addComponent(rbtAlternativaA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtAlternativaB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtAlternativaC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(btnAvancar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvancarActionPerformed
        
        boolean altA = rbtAlternativaA.isSelected();//verifica se está selecionado       
        boolean altB = rbtAlternativaB.isSelected();//verifica se está selecionado   
        boolean altC = rbtAlternativaC.isSelected();//verifica se está selecionado

        //Validar se uma alternativa está marcada
        if(altA || altB || altC){
            //validar a resposta primeiro
            
            // E a resposta correta
            //da pertunta é igual a 'A' ==> ACERTOU
            if(altA && vetorQuestoes[cont].getRespostaCorreta() == 'A'){
                Globais.exibirMensagem("Acertou");
                acertos++;
            }else if(altB && vetorQuestoes[cont].getRespostaCorreta() == 'B'){
                Globais.exibirMensagem("Acertou");
                acertos++;
            }else if(altC && vetorQuestoes[cont].getRespostaCorreta() == 'C'){
                Globais.exibirMensagem("Acertou");
                acertos++;
            }else{
                 Globais.exibirMensagem("Errou");
            }
            
            fazerPergunta();
            
        }else{
            Globais.exibirMensagem("Escolha uma alternativa");
        }
        
    }//GEN-LAST:event_btnAvancarActionPerformed

    private void fazerPergunta(){
        
        buttonGroup1.clearSelection();
        
        cont++;     
        if(cont < vetorQuestoes.length){
            lblPergunta.setText(vetorQuestoes[cont].getPergunta());
            rbtAlternativaA.setText(vetorQuestoes[cont].getRespostaA());
            rbtAlternativaB.setText(vetorQuestoes[cont].getRespostaB());
            rbtAlternativaC.setText(vetorQuestoes[cont].getRespostaC());
        }else{
            //CASO CHEGUE AQUI, TERMINOU O QUESTIONÁRIO
            Globais.exibirMensagem("Total de acertos: " + acertos + " de " + vetorQuestoes.length);
            System.exit(0);//feha o programa
        }
    }
    
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
            java.util.logging.Logger.getLogger(TelaQuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaQuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaQuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaQuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaQuestionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvancar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblPergunta;
    private javax.swing.JRadioButton rbtAlternativaA;
    private javax.swing.JRadioButton rbtAlternativaB;
    private javax.swing.JRadioButton rbtAlternativaC;
    // End of variables declaration//GEN-END:variables
}