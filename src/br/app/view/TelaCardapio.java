package br.app.telas;
// autor: @ingrydf12
// https://github.com/ingrydf12

import java.sql.*;
import br.app.conexoa.ModuloConexao;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class TelaCardapio extends javax.swing.JFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null; //exibe o resultado da conexão
    
    private void filtroComida(){
        String sql = "select * from tbpratos where categoria = 'comida'";
        
        try {
                pst = conexao.prepareStatement(sql);
                rs=pst.executeQuery();
                
            tblCardapio.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (Exception e) {
                
                JOptionPane.showMessageDialog(null, e);
            }  
        }
    
        private void filtroBebidas(){
        String sql = "select * from tbacomp where categoria = 'bebidas'";
        
            try {
                pst = conexao.prepareStatement(sql);
                rs=pst.executeQuery();
                
                tblCardapio.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (Exception e) {
                
                JOptionPane.showMessageDialog(null, e);
            }  
        }
        
            private void filtroEntradas(){
        String sql = "select * from tbpratos where categoria = 'entradas'";
        
            try {
                pst = conexao.prepareStatement(sql);
                rs=pst.executeQuery();
                
                tblCardapio.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (Exception e) {
                
                JOptionPane.showMessageDialog(null, e);
            }  
        }
            
            private void filtroSobremesa(){
        String sql = "select * from tbacomp where categoria = 'sobremesa'";
        
            try {
                pst = conexao.prepareStatement(sql);
                rs=pst.executeQuery();
                
                tblCardapio.setModel(DbUtils.resultSetToTableModel(rs));
                
            } catch (Exception e) {
                
                JOptionPane.showMessageDialog(null, "Não encontrado");
            }  
        }
            
            private void filtroSaladas(){
        String sql = "select * from tbacomp where categoria = 'saladas'";
        
            try {
                pst = conexao.prepareStatement(sql);
                rs=pst.executeQuery();
                
                tblCardapio.setModel(DbUtils.resultSetToTableModel(rs));
                
            } catch (Exception e) {
                
                JOptionPane.showMessageDialog(null, e);
            }  
        }
            
    
    public TelaCardapio() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        try {
            conexao = ModuloConexao.conector(); //CHAMANDO O MÉTODO CONECTOR
        } catch (SQLException ex) {
            Logger.getLogger(TelaCardapio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        RadioButtonBeb = new javax.swing.JRadioButton();
        RadioButtonCom = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        RadioButtonEnt = new javax.swing.JRadioButton();
        RadioButtonSalad = new javax.swing.JRadioButton();
        RadioButtonSob = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCardapio = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(231, 231, 231));

        jLabel1.setText("Filtrar por:");

        RadioButtonBeb.setText("Bebidas");
        RadioButtonBeb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonBebActionPerformed(evt);
            }
        });

        RadioButtonCom.setText("Comidas");
        RadioButtonCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonComActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/app/imagens/logobaratie.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Myanmar Text", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CARDÁPIO DIGITAL");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 7, Short.MAX_VALUE))
        );

        RadioButtonEnt.setText("Entradas");
        RadioButtonEnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonEntActionPerformed(evt);
            }
        });

        RadioButtonSalad.setText("Saladas");
        RadioButtonSalad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonSaladActionPerformed(evt);
            }
        });

        RadioButtonSob.setText("Sobremesas");
        RadioButtonSob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonSobActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        tblCardapio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Descrição", "Quantidade", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCardapio);

        jButton1.setText("Adicionar ao carrinho");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1)
                        .addComponent(RadioButtonEnt))
                    .addComponent(RadioButtonSob)
                    .addComponent(RadioButtonBeb)
                    .addComponent(RadioButtonSalad)
                    .addComponent(RadioButtonCom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE)
                        .addGap(25, 25, 25))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RadioButtonEnt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RadioButtonCom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RadioButtonBeb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RadioButtonSalad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RadioButtonSob))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jButton1)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RadioButtonComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonComActionPerformed
       filtroComida();
    }//GEN-LAST:event_RadioButtonComActionPerformed

    private void RadioButtonBebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonBebActionPerformed
        filtroBebidas();
    }//GEN-LAST:event_RadioButtonBebActionPerformed

    private void RadioButtonEntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonEntActionPerformed
       filtroEntradas();
    }//GEN-LAST:event_RadioButtonEntActionPerformed

    private void RadioButtonSobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonSobActionPerformed
        filtroSobremesa();
    }//GEN-LAST:event_RadioButtonSobActionPerformed

    private void RadioButtonSaladActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonSaladActionPerformed
        filtroSaladas();
    }//GEN-LAST:event_RadioButtonSaladActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCardapio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCardapio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCardapio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCardapio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCardapio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RadioButtonBeb;
    private javax.swing.JRadioButton RadioButtonCom;
    private javax.swing.JRadioButton RadioButtonEnt;
    private javax.swing.JRadioButton RadioButtonSalad;
    private javax.swing.JRadioButton RadioButtonSob;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblCardapio;
    // End of variables declaration//GEN-END:variables
}
