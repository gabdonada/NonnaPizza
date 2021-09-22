/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aluno
 */
public class VerPedido extends javax.swing.JFrame {
 DefaultTableModel dtm = new DefaultTableModel(
            new Object[][]{},
            new Object[]{"ID_cliente", "nome_cliente", "sabores_pizza", "tamanho_pizza"});
    /**
     * Creates new form VerPedido
     */
    public VerPedido() {
        initComponents();
        setSize(357,510);
    }
    private void buscar(){
         try {          
             

            ArrayList<Pizzas> piz = new ArrayList<>();

            //Recebendo o ArrayList cheio em produtos
            piz = buscarPed();

            for (int i = 0; i < piz.size(); i++) {
                dtm.addRow(new String[]{
                    String.valueOf(piz.get(i).getId()),
                    String.valueOf(piz.get(i).getSabor())
                     
                   
                });
            }//fecha for

            /* Adicionando o modelo de tabela 
             com os dados na tabela produto */
            jTable1.setModel(dtm);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    this,
                    "Erro ao carregar tabela: " + e.getMessage());
        }//fecha catch
    }
         public ArrayList<Pizzas> buscarPed() throws SQLException {

        Connection con = Conecta.getConexao();
        Statement stat = con.createStatement();

      try {
            
            String sql;
          
            sql = "select * from venda;";

            ArrayList<Pizzas> piz = new ArrayList<>();
            ResultSet rs = stat.executeQuery(sql);
            
            while (rs.next()) {
                Pizzas p = new Pizzas();

                p.setSabor(rs.getString("idvenda"));
                p.setSabor(rs.getString("sabor"));
                p.setSabor(rs.getString("valor"));
                
                
       
                piz.add(p);
            }
            return piz;

        } catch (SQLException e) {
            throw new SQLException("Erro ao buscar funcionarios! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Ver Pedido");
        setIconImage(new ImageIcon(getClass().getResource("/img/Botão.png")).getImage());
        setLocation(new java.awt.Point(250, 150));
        getContentPane().setLayout(null);

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idvenda", "idcliente", "tamanho", "sabor", "valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setToolTipText("Tabela com o pedido  ");
        jTable1.setGridColor(new java.awt.Color(102, 102, 102));
        jTable1.setSelectionBackground(new java.awt.Color(51, 153, 0));
        jScrollPane1.setViewportView(jTable1);

        jDesktopPane1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 80, 340, 150);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Finalizar");
        jButton1.setToolTipText("Finalizar o sistema");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(0));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jDesktopPane1.add(jButton1);
        jButton1.setBounds(240, 400, 90, 30);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Voltar");
        jButton2.setToolTipText("Voltar para tela anterior");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(0));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton2);
        jButton2.setBounds(70, 400, 70, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel2.setText("Pedido:");
        jDesktopPane1.add(jLabel2);
        jLabel2.setBounds(150, 50, 50, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/TelaCardapio.png"))); // NOI18N
        jDesktopPane1.add(jLabel1);
        jLabel1.setBounds(-170, -90, 560, 590);

        getContentPane().add(jDesktopPane1);
        jDesktopPane1.setBounds(-10, 0, 400, 590);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     hide();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(VerPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VerPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
