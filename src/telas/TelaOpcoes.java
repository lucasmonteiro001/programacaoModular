
package telas;

import com.MySQLConnector.MySQLConnector;
import com.MySQLConnector.MySQLConnector;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class TelaOpcoes extends javax.swing.JFrame {

    public TelaOpcoes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuCliente = new javax.swing.JMenu();
        menuCadastrarCliente = new javax.swing.JMenuItem();
        alterarDadosCliente = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        cadastrarNovaHabilidade = new javax.swing.JMenuItem();
        menuOS = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        menuOrcamento = new javax.swing.JMenu();
        menuVisualizaOrcamento = new javax.swing.JMenuItem();
        menuManutencao = new javax.swing.JMenu();
        menuTabelaMaterial = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenu();
        menuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Módulo de Atendimento - Faz Consertos");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Módulo de Atendimento");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Emperesa Faz Consertos");

        menuCliente.setText("Cliente");
        menuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuClienteActionPerformed(evt);
            }
        });

        menuCadastrarCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menuCadastrarCliente.setText("Cadastrar Cliente");
        menuCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarClienteActionPerformed(evt);
            }
        });
        menuCliente.add(menuCadastrarCliente);

        alterarDadosCliente.setText("Alterar dados do Cliente");
        alterarDadosCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarDadosClienteActionPerformed(evt);
            }
        });
        menuCliente.add(alterarDadosCliente);

        menuBar.add(menuCliente);

        jMenu1.setText("Técnico");

        jMenuItem3.setText("Cadastrar Técnico");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        cadastrarNovaHabilidade.setText("Cadastrar Nova Habilidade");
        cadastrarNovaHabilidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarNovaHabilidadeActionPerformed(evt);
            }
        });
        jMenu1.add(cadastrarNovaHabilidade);

        menuBar.add(jMenu1);

        menuOS.setText("Ordem de Servico");

        jMenuItem1.setText("Criar ordem de serviço");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuOS.add(jMenuItem1);

        jMenuItem2.setText("Exibir OS Técnico");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuOS.add(jMenuItem2);

        menuBar.add(menuOS);

        menuOrcamento.setText("Orcamento");

        menuVisualizaOrcamento.setText("Orcamento");
        menuVisualizaOrcamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVisualizaOrcamentoActionPerformed(evt);
            }
        });
        menuOrcamento.add(menuVisualizaOrcamento);

        menuBar.add(menuOrcamento);

        menuManutencao.setText("Manutencao");

        menuTabelaMaterial.setText("Tabela Material");
        menuTabelaMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTabelaMaterialActionPerformed(evt);
            }
        });
        menuManutencao.add(menuTabelaMaterial);

        menuBar.add(menuManutencao);

        menuSair.setText("Sair");

        menuItemSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        menuItemSair.setText("Sair");
        menuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSairActionPerformed(evt);
            }
        });
        menuSair.add(menuItemSair);

        menuBar.add(menuSair);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel2)))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(284, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarClienteActionPerformed
        
       new TelaCadastrarCliente().setVisible(true);

    }//GEN-LAST:event_menuCadastrarClienteActionPerformed

    private void menuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuClienteActionPerformed

    private void menuOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOSActionPerformed
        
    }//GEN-LAST:event_menuOSActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new TelaOrdemServico().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void alterarDadosClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarDadosClienteActionPerformed
        // TODO add your handling code here:
        String nomeCliente = JOptionPane.showInputDialog("Digite o nome do cliente para alterar");
        
        while(nomeCliente.equals("")) {
            nomeCliente = JOptionPane.showInputDialog("Digite o nome do cliente para alterar");
        }
        
        try {
                       
            String buscaCliente = "SELECT * FROM cliente where nomeCliente = \"" + nomeCliente + "\"";
            Statement st = MySQLConnector.conn.createStatement();
            ResultSet rs = st.executeQuery(buscaCliente);
         
            if(rs.next() == false) {
                    JOptionPane.showMessageDialog(this, "Cliente não encontrado");
                    return;
                }else{
                    new TelaAlterarCliente(rs).setVisible(true);
                    }
        } catch (Exception e) {
            e.printStackTrace();
        }

        
    }//GEN-LAST:event_alterarDadosClienteActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new TelaGridTecnico().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void menuVisualizaOrcamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVisualizaOrcamentoActionPerformed
        new TelaOrcamento().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuVisualizaOrcamentoActionPerformed

    private void menuTabelaMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTabelaMaterialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuTabelaMaterialActionPerformed

    private void menuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuItemSairActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        new TelaCadastrarTecnico().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void cadastrarNovaHabilidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarNovaHabilidadeActionPerformed
        new TelaCadastrarHabilidade().setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastrarNovaHabilidadeActionPerformed

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
            java.util.logging.Logger.getLogger(TelaOpcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaOpcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaOpcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaOpcoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaOpcoes().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem alterarDadosCliente;
    private javax.swing.JMenuItem cadastrarNovaHabilidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem menuCadastrarCliente;
    private javax.swing.JMenu menuCliente;
    private javax.swing.JMenuItem menuItemSair;
    private javax.swing.JMenu menuManutencao;
    private javax.swing.JMenu menuOS;
    private javax.swing.JMenu menuOrcamento;
    private javax.swing.JMenu menuSair;
    private javax.swing.JMenuItem menuTabelaMaterial;
    private javax.swing.JMenuItem menuVisualizaOrcamento;
    // End of variables declaration//GEN-END:variables
}
