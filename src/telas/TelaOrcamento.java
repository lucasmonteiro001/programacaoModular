/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import codigos.Orcamento;
import com.MySQLConnector.MySQLConnector;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author f6770459
 */
public class TelaOrcamento extends javax.swing.JFrame {
    
    /**
     * Declaracao de atributos
     */
    int numOS = 0;
    int numOrcamento = 0;

    /**
     * Instancia novo objeto da classe Orcamento
     */
    //public static Orcamento orc = new Orcamento();

    /**
     * Creates new form TelaOrcamento
     */
    public TelaOrcamento() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelOrcamento = new javax.swing.JLabel();
        labelNumOS = new javax.swing.JLabel();
        textNumOrcamento = new javax.swing.JTextField();
        buttonVisualizaOrcamento = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        textNumOS = new javax.swing.JTextField();
        buttonCancelaOrcamento = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Acesso ao modulo de Orcamento");
        setResizable(false);

        labelOrcamento.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        labelOrcamento.setForeground(new java.awt.Color(0, 0, 255));
        labelOrcamento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelOrcamento.setText("Orçamento");
        labelOrcamento.setToolTipText("Tela de Consulta e Alteração de Orçamento");

        labelNumOS.setText("Nº Ordem de Servico:");

        textNumOrcamento.setToolTipText("Informe o numero do orcamento para realizar as alteracoes");
        textNumOrcamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNumOrcamentoActionPerformed(evt);
            }
        });

        buttonVisualizaOrcamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/sim.jpg"))); // NOI18N
        buttonVisualizaOrcamento.setText("Visualiza / Elabora Orcamento");
        buttonVisualizaOrcamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVisualizaOrcamentoActionPerformed(evt);
            }
        });

        jLabel1.setText("Nº Orcamento:");

        textNumOS.setToolTipText("Informe o numero da OS para realizar a pesquisa");
        textNumOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNumOSActionPerformed(evt);
            }
        });

        buttonCancelaOrcamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/nao.png"))); // NOI18N
        buttonCancelaOrcamento.setText("Cancela");
        buttonCancelaOrcamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelaOrcamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(buttonCancelaOrcamento)
                        .addGap(76, 76, 76))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(buttonVisualizaOrcamento)
                        .addGap(14, 14, 14))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelNumOS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textNumOS))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textNumOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(labelOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelOrcamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNumOS)
                    .addComponent(textNumOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textNumOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(buttonVisualizaOrcamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonCancelaOrcamento)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonVisualizaOrcamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVisualizaOrcamentoActionPerformed
        // TODO add your handling code here:
        String mensagem;
        String stringNumOS = textNumOS.getText();
        String stringNumOrcamento = textNumOrcamento.getText();
        
        if (stringNumOS.isEmpty() && stringNumOrcamento.isEmpty()) {
            mensagem = "Favor preencher um dos campos: \"Numero da OS\" ou"
                + " \"Numero do Orcamento\"";
            JOptionPane.showMessageDialog(null, mensagem, "Dados Ausentes", 
                JOptionPane.ERROR_MESSAGE);
        }
        else if (!stringNumOS.isEmpty() && stringNumOrcamento.isEmpty()) {
            // mensagem = "num OS = " + numOS + "\nnumOrcamento = " + numOrcamento;
            // JOptionPane.showMessageDialog(null, mensagem);
            
            /**
             * Checa se existe orcamento para a ordem de servico informada
             */
            try {
                String executeQuerySQL = ("SELECT idOrcamento FROM orcamento WHERE "
                        + "idOS = " + stringNumOS);
                PreparedStatement stmt = MySQLConnector.conn.prepareStatement(executeQuerySQL);
                ResultSet resultado = stmt.executeQuery(executeQuerySQL);
                
                while(resultado.next())
                    numOrcamento = resultado.getInt("idOrcamento");
                
                if(numOrcamento != 0) {
                    JOptionPane.showMessageDialog(null, "Ja existe orcamento para "
                            + "essa Ordem de Servico.\nSera aberto o modulo de"
                            + " alteracao de orcamento!", "Existe Orcamento Cadastrado", 
                            JOptionPane.WARNING_MESSAGE);
                    
                    new TelaAlterarOrcamento().setVisible(true);
                
                } else {
                    JOptionPane.showMessageDialog(null, "Nao ha orcamento para "
                            + "essa Ordem de Servico.\nSera aberto um novo"
                            + " orcamento!", "Sem Orcamento Cadastrado", 
                            JOptionPane.WARNING_MESSAGE);
                    numOS = Integer.parseInt(stringNumOS);
                
                    Orcamento.setNumeroOS(numOS);
                    new TelaElaborarOrcamento().setVisible(true);  
                }
                resultado.close();
                
            } catch(Exception e) {
                e.printStackTrace();
            }             
        }
        this.dispose();  
    }//GEN-LAST:event_buttonVisualizaOrcamentoActionPerformed

    private void buttonCancelaOrcamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelaOrcamentoActionPerformed
        new TelaOpcoes().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonCancelaOrcamentoActionPerformed

    private void textNumOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNumOSActionPerformed
        if(evt.getSource() == textNumOS) {
            if (!textNumOS.getText().isEmpty()) {
                numOS = Integer.parseInt(textNumOS.getText());
                buttonVisualizaOrcamentoActionPerformed(evt);
            } 
        }
    }//GEN-LAST:event_textNumOSActionPerformed

    private void textNumOrcamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNumOrcamentoActionPerformed
        if(evt.getSource() == textNumOrcamento) {
            if(!textNumOrcamento.getText().isEmpty()) {
                numOrcamento = Integer.parseInt(textNumOrcamento.getText());
                buttonVisualizaOrcamentoActionPerformed(evt);
            }
        }
    }//GEN-LAST:event_textNumOrcamentoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaOrcamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaOrcamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaOrcamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaOrcamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaOrcamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelaOrcamento;
    private javax.swing.JButton buttonVisualizaOrcamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelNumOS;
    private javax.swing.JLabel labelOrcamento;
    private javax.swing.JTextField textNumOS;
    private javax.swing.JTextField textNumOrcamento;
    // End of variables declaration//GEN-END:variables
}
