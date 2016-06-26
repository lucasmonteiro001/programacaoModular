/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import com.MySQLConnector.MySQLConnector;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Luisa
 */
public class TelaGridTecnico extends javax.swing.JFrame {

    
    public TelaGridTecnico() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        matriculaTecnico = new javax.swing.JTextField();
        buscarOS = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaOSTecnico = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaOSsemTecnico = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nr de Matricula");

        matriculaTecnico.setText("Insira aqui seu número de matrícula");
        matriculaTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matriculaTecnicoActionPerformed(evt);
            }
        });

        buscarOS.setText("Buscar OS");
        buscarOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarOSActionPerformed(evt);
            }
        });

        tabelaOSTecnico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Número da OS", "Data OS", "Status OS", "Nome do Cliente", "Habilidade Desejada"
            }
        ));
        jScrollPane1.setViewportView(tabelaOSTecnico);

        jLabel2.setText("Ordens em Atendimento:");

        jLabel3.setText("Ordens sem Técnico:");

        tabelaOSsemTecnico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Número da OS", "Data OS", "Status da OS", "Nome do Cliente", "Habilidade Desejada"
            }
        ));
        jScrollPane2.setViewportView(tabelaOSsemTecnico);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(matriculaTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(buscarOS)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(matriculaTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buscarOS)
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void matriculaTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matriculaTecnicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_matriculaTecnicoActionPerformed

    private void buscarOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarOSActionPerformed
        try{
            Integer idTecnico = 0;
            Integer idHabilidade = 0;
            
            //pegando id tecnico
            String verificaIdTecnicoSQL = "select idTecnico, idHabilidade from tecnico where matriculaTecnico = " + "(?)";
            PreparedStatement preparedStatementTecnico = MySQLConnector.conn.prepareStatement(verificaIdTecnicoSQL);
            preparedStatementTecnico.setString(1, this.matriculaTecnico.getText());
            ResultSet rs = preparedStatementTecnico.executeQuery(); 
            if(rs != null && rs.next()){
                idTecnico = rs.getInt("idTecnico");
                idHabilidade = rs.getInt("idHabilidade");
            }            
       
            //pegando os em atendimento
            //nrOS, dtOS, statusOS, Nome do Cliente, habilidade desejada
            String selectTableSQLOS = "Select idOS, idTecnico, idCliente, idHabilidade,"
                    + " idStatus, dataOS from ordemservico where idTecnico = " + "(?)";
            PreparedStatement preparedStatement = MySQLConnector.conn.prepareStatement(selectTableSQLOS);
            preparedStatement.setInt(1, idTecnico);
            ResultSet rsOS = preparedStatement.executeQuery(); 
            
            //inicializando a tabela
            int row = 0;
            //populando tabela
            while(rsOS.next()){                
                this.tabelaOSTecnico.setValueAt(rsOS.getInt("idOS"), row, 0);
                this.tabelaOSTecnico.setValueAt(rsOS.getDate("dataOS"), row, 1);
                String verificaIdStatusSQL = "select status from status where idStatus = " + "(?)";
                PreparedStatement preparedStatementStatus = MySQLConnector.conn.prepareStatement(verificaIdStatusSQL);
                preparedStatementStatus.setInt(1, rsOS.getInt("idStatus"));
                ResultSet rsStatus = preparedStatementStatus.executeQuery(); 
                if(rsStatus != null && rsStatus.next()){
                    this.tabelaOSTecnico.setValueAt(rsStatus.getString("status"), row, 2);
                }  
                String verificaIdClienteSQL = "select nomeCliente from cliente where idCliente = " + "(?)";
                PreparedStatement preparedStatementCliente = MySQLConnector.conn.prepareStatement(verificaIdClienteSQL);
                preparedStatementCliente.setInt(1, rsOS.getInt("idCliente"));
                ResultSet rsCliente = preparedStatementCliente.executeQuery(); 
                if(rsCliente != null && rsCliente.next()){
                    this.tabelaOSTecnico.setValueAt(rsCliente.getString("nomeCliente"), row, 3);
                }
                String verificaIdHabilidadeSQL = "select habilidade from habilidade where idHabilidade = " + "(?)";
                PreparedStatement preparedStatementHabilidade = MySQLConnector.conn.prepareStatement(verificaIdHabilidadeSQL);
                preparedStatementHabilidade.setInt(1, rsOS.getInt("idHabilidade"));
                ResultSet rsHabilidade = preparedStatementHabilidade.executeQuery(); 
                if(rsHabilidade != null && rsHabilidade.next()){
                    this.tabelaOSTecnico.setValueAt(rsHabilidade.getString("habilidade"), row, 4);
                }                
                row++;
            }
            
            String selectTableSQLOSsemTecnico = "Select idOS, idTecnico, idCliente, idHabilidade,"
                    + " idStatus, dataOS from ordemservico where idHabilidade = " + "(?)" +
                    "and idTecnico is null limit 4";
            PreparedStatement preparedStatementstecnico = MySQLConnector.conn.prepareStatement(selectTableSQLOSsemTecnico);
            preparedStatementstecnico.setInt(1, idHabilidade);
            ResultSet rsOSsTecnico = preparedStatementstecnico.executeQuery(); 
            
            row = 0;
            //populando tabela
            while(rsOSsTecnico.next()){  
                this.tabelaOSsemTecnico.setValueAt(rsOSsTecnico.getInt("idOS"), row, 0);
                this.tabelaOSsemTecnico.setValueAt(rsOSsTecnico.getDate("dataOS"), row, 1);
                String verificaIdStatusSQL = "select status from status where idStatus = " + "(?)";
                PreparedStatement preparedStatementStatus = MySQLConnector.conn.prepareStatement(verificaIdStatusSQL);
                preparedStatementStatus.setInt(1, rsOSsTecnico.getInt("idStatus"));
                ResultSet rsStatus = preparedStatementStatus.executeQuery(); 
                if(rsStatus != null && rsStatus.next()){
                    this.tabelaOSsemTecnico.setValueAt(rsStatus.getString("status"), row, 2);
                }  
                String verificaIdClienteSQL = "select nomeCliente from cliente where idCliente = " + "(?)";
                PreparedStatement preparedStatementCliente = MySQLConnector.conn.prepareStatement(verificaIdClienteSQL);
                preparedStatementCliente.setInt(1, rsOSsTecnico.getInt("idCliente"));
                ResultSet rsCliente = preparedStatementCliente.executeQuery(); 
                if(rsCliente != null && rsCliente.next()){
                    this.tabelaOSsemTecnico.setValueAt(rsCliente.getString("nomeCliente"), row, 3);
                }
                String verificaIdHabilidadeSQL = "select habilidade from habilidade where idHabilidade = " + "(?)";
                PreparedStatement preparedStatementHabilidade = MySQLConnector.conn.prepareStatement(verificaIdHabilidadeSQL);
                preparedStatementHabilidade.setInt(1, rsOSsTecnico.getInt("idHabilidade"));
                ResultSet rsHabilidade = preparedStatementHabilidade.executeQuery(); 
                if(rsHabilidade != null && rsHabilidade.next()){
                    this.tabelaOSsemTecnico.setValueAt(rsHabilidade.getString("habilidade"), row, 4);
                }                
                row++;
            }
            
            rs.close();

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_buscarOSActionPerformed

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
            java.util.logging.Logger.getLogger(TelaGridTecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGridTecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGridTecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGridTecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGridTecnico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarOS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField matriculaTecnico;
    private javax.swing.JTable tabelaOSTecnico;
    private javax.swing.JTable tabelaOSsemTecnico;
    // End of variables declaration//GEN-END:variables
}
