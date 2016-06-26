package telas;

import com.MySQLConnector.MySQLConnector;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import codigos.Cliente;

public class TelaOrdemServico extends javax.swing.JFrame {
  
    public TelaOrdemServico() {
        initComponents();
        try{
            String verificahabilidades = "select habilidade from habilidade";
            PreparedStatement preparedStatement = MySQLConnector.conn.prepareStatement(verificahabilidades);

            ResultSet rs = preparedStatement.executeQuery();            
            if(rs != null)
            {
                while (rs.next())
                {
                   habilidadeOS.addItem(rs.getString(1));
                }
            }
            rs.close();
            } catch (Exception e) {
            e.printStackTrace();
        }
        try{
            String verificaStatus = "select status from status";
            PreparedStatement preparedStatement = MySQLConnector.conn.prepareStatement(verificaStatus);

            ResultSet rs = preparedStatement.executeQuery();            
            if(rs != null)
            {
                while (rs.next())
                {
                   statusOS.addItem(rs.getString(1));
                }
            }
            rs.close();
            } catch (Exception e) {
            e.printStackTrace();
        }
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        statusOS = new javax.swing.JComboBox<>();
        dataOS = new javax.swing.JTextField();
        nrOS = new javax.swing.JTextField();
        nomeCliente = new javax.swing.JTextField();
        habilidadeOS = new javax.swing.JComboBox<>();
        servicoOS = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        anotacoesOS = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        confirmaCliente = new javax.swing.JToggleButton();
        cpfCliente = new javax.swing.JFormattedTextField();
        telCliente = new javax.swing.JFormattedTextField();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
        });

        jLabel1.setText("OS");

        jLabel2.setText("Dados do Cliente:");

        jLabel3.setText("Habilidade Desejada");

        jLabel4.setText("Descrição Serviço:");

        jLabel5.setText("Status OS");

        jLabel6.setText("Data OS");

        statusOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusOSActionPerformed(evt);
            }
        });

        dataOS.setText("Data OS");
        dataOS.setEnabled(false);

        nrOS.setText("Nr OS");
        nrOS.setEnabled(false);
        nrOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nrOSActionPerformed(evt);
            }
        });

        nomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeClienteActionPerformed(evt);
            }
        });

        habilidadeOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                habilidadeOSActionPerformed(evt);
            }
        });

        servicoOS.setText("Digite aqui a descrição do serviço desejado");
        servicoOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                servicoOSActionPerformed(evt);
            }
        });

        jLabel7.setText("Anotações");

        anotacoesOS.setText("Anotações Gerais");
        anotacoesOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anotacoesOSActionPerformed(evt);
            }
        });

        jButton1.setText("Salvar Solicitação");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Nome");

        jLabel9.setText("CPF");

        jLabel10.setText("Telefone");

        confirmaCliente.setText("Clique aqui para confirmar os dados do Cliente");
        confirmaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmaClienteActionPerformed(evt);
            }
        });

        try {
            cpfCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cpfCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfClienteActionPerformed(evt);
            }
        });

        try {
            telCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(servicoOS, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(31, 31, 31)
                                        .addComponent(nrOS, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(dataOS, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(statusOS, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(anotacoesOS, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(telCliente))
                            .addComponent(nomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(confirmaCliente)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(habilidadeOS, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(statusOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nrOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(dataOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(cpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(confirmaCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(habilidadeOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(servicoOS, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(anotacoesOS, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void refreshScreen(){
        try{
            //setando a tela com os dados após eventual alteração
            String verificaClienteSQL = "select * from cliente where cpf = " + "(?)";
            PreparedStatement preparedStatement = MySQLConnector.conn.prepareStatement(verificaClienteSQL);
            preparedStatement.setString(1, this.cpfCliente.getText());            
            ResultSet rs = preparedStatement.executeQuery();  
            if (rs.next()){
                this.cpfCliente.setText(rs.getString("cpf"));
                this.nomeCliente.setText(rs.getString("nomeCliente"));
                this.telCliente.setText(rs.getString("telefoneCliente"));
            }  
            this.repaint();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            String insertTableSQL = "INSERT INTO ordemservico"
                        + "(idCliente, idHabilidade, descricaoServico, idStatus, dataOS, anotacoesOS "
                        + ") VALUES"
                        + "(?,?,?,?,?,?)";
            PreparedStatement preparedStatement = MySQLConnector.conn.prepareStatement(insertTableSQL);
            
            //pegando id cliente
            String verificaIdClienteSQL = "select idCliente from cliente where cpf = " + "(?)";
            PreparedStatement preparedStatementCliente = MySQLConnector.conn.prepareStatement(verificaIdClienteSQL);
            preparedStatementCliente.setString(1, this.cpfCliente.getText());
            ResultSet rs = preparedStatementCliente.executeQuery(); 
            if(rs != null && rs.next()){
                System.out.println(rs.getInt("idCliente"));
                preparedStatement.setInt(1, rs.getInt("idCliente"));
            }
            rs.close();
            
            //pegando id habilidade
            String verificaIdHabilidadeSQL = "select idHabilidade from habilidade where habilidade = " + "(?)";
            PreparedStatement preparedStatementHabilidade = MySQLConnector.conn.prepareStatement(verificaIdHabilidadeSQL);
            preparedStatementHabilidade.setString(1, this.habilidadeOS.getItemAt(0));
            ResultSet rsHabilidade = preparedStatementHabilidade.executeQuery();  
            if(rsHabilidade != null && rsHabilidade.next()){
                System.out.println(rsHabilidade.getInt("idHabilidade"));
                preparedStatement.setInt(2, rsHabilidade.getInt("idHabilidade"));
            }
            rsHabilidade.close();
            
            preparedStatement.setString(3, this.servicoOS.getText());
            
            //pegando id status
            String verificaIdStatusSQL = "select idStatus from status where status = " + "(?)";
            PreparedStatement preparedStatementStatus = MySQLConnector.conn.prepareStatement(verificaIdStatusSQL);
            preparedStatementStatus.setString(1, this.statusOS.getItemAt(0));
            ResultSet rsStatus = preparedStatementStatus.executeQuery();
            if(rsStatus != null && rsStatus.next()){
                System.out.println(rsStatus.getInt("idStatus"));
                preparedStatement.setInt(4, rsStatus.getInt("idStatus"));
            }
            rsStatus.close();
                       
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
            Date date = new Date();
            String dateformated = dateFormat.format(date);
            System.out.println(dateformated);   
            preparedStatement.setString(5, dateformated);
            
            preparedStatement.setString(6, this.anotacoesOS.getText());

            preparedStatement.executeUpdate();
            }
        catch (Exception e) {
            e.printStackTrace();
        }
        
        JOptionPane.showMessageDialog(this, "Solicitação cadastrada com sucesso. Em breve um de nossos técnicos"
                + " entrará em contato");
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void servicoOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_servicoOSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_servicoOSActionPerformed

    private void anotacoesOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anotacoesOSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anotacoesOSActionPerformed

    private void nomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeClienteActionPerformed

    private void confirmaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmaClienteActionPerformed
        try{
            String verificaClienteSQL = "select * from cliente where cpf = " + "(?)";
            PreparedStatement preparedStatement = MySQLConnector.conn.prepareStatement(verificaClienteSQL);
            preparedStatement.setString(1, this.cpfCliente.getText());
            
            ResultSet rs = preparedStatement.executeQuery();            
            if (!rs.next()){
                String mensagem = "O cliente de cpf " +this.cpfCliente.getText() +" não está cadastrado." +
                         "Você será direcionado para a tela de cadastro de cliente antes de prosseguir com a Solicitação." ;
                JOptionPane.showMessageDialog(null, mensagem, "Cliente não cadastrado", 
                JOptionPane.ERROR_MESSAGE);
                new TelaCadastrarCliente().setVisible(true);
            }else{
                Cliente cliente = new Cliente(rs.getInt("idCliente"), rs.getString("cpf"), rs.getString("identidade"),
                rs.getString("nomeCliente"), rs.getDate("dataNascimento"), rs.getString("emailCliente"),
                rs.getString("enderecoCliente"), rs.getString("telefoneCliente"));
                TelaAlterarCliente telaAlterarCliente = new TelaAlterarCliente(cliente);
                telaAlterarCliente.setVisible(true);               
                }                      
        } catch (Exception e) {
            e.printStackTrace();
        }
        //finally{
          //  this.refreshScreen();
        //}
    }//GEN-LAST:event_confirmaClienteActionPerformed

    private void nrOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nrOSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nrOSActionPerformed

    private void statusOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusOSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusOSActionPerformed

    private void habilidadeOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_habilidadeOSActionPerformed
        
    }//GEN-LAST:event_habilidadeOSActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
    }//GEN-LAST:event_formFocusGained

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        this.refreshScreen();
    }//GEN-LAST:event_formMouseExited

    private void cpfClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfClienteActionPerformed

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
            java.util.logging.Logger.getLogger(TelaOrdemServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaOrdemServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaOrdemServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaOrdemServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaOrdemServico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anotacoesOS;
    private javax.swing.JToggleButton confirmaCliente;
    private javax.swing.JFormattedTextField cpfCliente;
    private javax.swing.JTextField dataOS;
    private javax.swing.JComboBox<String> habilidadeOS;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nomeCliente;
    private javax.swing.JTextField nrOS;
    private javax.swing.JTextField servicoOS;
    private javax.swing.JComboBox<String> statusOS;
    private javax.swing.JFormattedTextField telCliente;
    // End of variables declaration//GEN-END:variables
}
