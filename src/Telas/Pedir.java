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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aluno
 */
public class Pedir extends javax.swing.JFrame {
DefaultTableModel dtm = new DefaultTableModel(
            new Object[][]{},
            new Object[]{"idpizzas", "sabor_pizza"});
DefaultTableModel dtm2 = new DefaultTableModel(
            new Object[][]{},
            new Object[]{"idcliente", "nome_cliente", "endereco_cliente","telefone_cliente"});
    /**
     * Creates new form Pedir
     */
    public Pedir() {
        initComponents();
        setSize(367,500);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSpinnerqnt = new javax.swing.JSpinner();
        jSpinnersabp = new javax.swing.JSpinner();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBoxTamanho = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setTitle("Gerar Pedido");
        setIconImage(new ImageIcon(getClass().getResource("/img/Botão.png")).getImage());
        setLocation(new java.awt.Point(250, 150));
        getContentPane().setLayout(null);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Pedir");
        jButton2.setToolTipText("Enviar pedido");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(0));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton2);
        jButton2.setBounds(230, 390, 70, 30);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("Voltar");
        jButton3.setToolTipText("Voltar para tela anterior");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(0));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton3);
        jButton3.setBounds(70, 390, 70, 30);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        jLabel3.setText("Sabores por Pizza:");
        jDesktopPane1.add(jLabel3);
        jLabel3.setBounds(10, 60, 130, 20);

        jTable1.setBorder(new javax.swing.border.SoftBevelBorder(0));
        jTable1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Telefone", "Endereço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jDesktopPane1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 290, 330, 90);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Nome do Cliente:");
        jDesktopPane1.add(jLabel2);
        jLabel2.setBounds(20, 250, 110, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        jLabel4.setText("ID:");
        jDesktopPane1.add(jLabel4);
        jLabel4.setBounds(200, 90, 30, 30);

        jSpinnerqnt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jSpinnerqnt.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        jSpinnerqnt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jDesktopPane1.add(jSpinnerqnt);
        jSpinnerqnt.setBounds(140, 90, 50, 30);

        jSpinnersabp.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jSpinnersabp.setModel(new javax.swing.SpinnerNumberModel(1, 1, 4, 1));
        jSpinnersabp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jDesktopPane1.add(jSpinnersabp);
        jSpinnersabp.setBounds(140, 50, 50, 30);

        jTable2.setBorder(new javax.swing.border.SoftBevelBorder(0));
        jTable2.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Sabor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jDesktopPane1.add(jScrollPane2);
        jScrollPane2.setBounds(10, 150, 330, 90);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Sabores Atuais:");
        jDesktopPane1.add(jLabel5);
        jLabel5.setBounds(120, 120, 110, 30);

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        jDesktopPane1.add(jTextField1);
        jTextField1.setBounds(130, 250, 130, 30);

        jComboBoxTamanho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pequena", "Media", "Grande" }));
        jDesktopPane1.add(jComboBoxTamanho);
        jComboBoxTamanho.setBounds(270, 50, 80, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        jLabel6.setText("Quantidade:");
        jDesktopPane1.add(jLabel6);
        jLabel6.setBounds(30, 90, 80, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        jLabel7.setText("Tamanho:");
        jDesktopPane1.add(jLabel7);
        jLabel7.setBounds(200, 50, 70, 30);

        jTextFieldId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jTextFieldId);
        jTextFieldId.setBounds(230, 90, 110, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/TelaCardapio.png"))); // NOI18N
        jDesktopPane1.add(jLabel1);
        jLabel1.setBounds(-180, -90, 570, 580);

        getContentPane().add(jDesktopPane1);
        jDesktopPane1.setBounds(0, 0, 390, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       hide();
    }//GEN-LAST:event_jButton3ActionPerformed
    int criaId;
    int ids;
    public void geraIdVenda(){
        try{
             
             
             ArrayList<Venda> v= new ArrayList();
             
             v =buscaVenda();
             criaId= 1+ids;
             String det = ""+criaId;
             jTextFieldId.setText(det);
             jTextFieldId.setEnabled(false);
             
             
         }catch(Exception e){
             JOptionPane.showMessageDialog(null,
                     "Erro na busca na Interface"+e);
         
         }
    }
    public ArrayList<Venda> buscaVenda()
            throws SQLException{
        com.mysql.jdbc.Connection con=(com.mysql.jdbc.Connection) Conecta.getConexao();
        Statement stat = con.createStatement();
        
        try{
            String sql;
            sql="select idvenda from venda";

            ResultSet rs = stat.executeQuery(sql);
            ArrayList<Venda> v = new ArrayList();
            //enquanto existir próximo valor a ser setado
            while(rs.next()){
                
                ids=(rs.getInt("idvenda"));
                                
            }
            return v;
        }catch(SQLException e){
            throw new SQLException("Erro ao busca IdVenda: "+e);
        }finally{
            con.close();
            stat.close();
        }
    }
               Pizzas p = new Pizzas();
           Cliente c = new Cliente();
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            int linha = jTable2.getSelectedRow();
            int linha2 = jTable1.getSelectedRow();
            if(linha == -1){
                JOptionPane.showMessageDialog(null, "Voce não selecionou um sabor");
            }else if(linha2==-1){
                JOptionPane.showMessageDialog(null, "Voce não selecionou um cliente");
            }else{

            p.setQnt((int) jSpinnerqnt.getValue()); 
            p.setQntSab((int) jSpinnersabp.getValue());
            p.setTamanho((String) jComboBoxTamanho.getSelectedItem());
               // System.out.println(p.getTamanho());
            
            p.setId(Integer.parseInt((String) jTable2.getValueAt(linha,0)));
            p.setSabor((String) jTable2.getValueAt(linha,1));
            c.setId(Integer.parseInt((String) jTable1.getValueAt(linha,0)));
            
            p.setId(p.getId());
            c.setId(c.getId());
            
            int i = 1;
                i = JOptionPane.showConfirmDialog(null, "O valor do pedido é de: "+valorF()+", \n Deseja continuar?");
            if(i==0){
            cadastrarPedido(p);
             int a =JOptionPane.showConfirmDialog(null, "Cadastrado! \n Deseja sair de Cadastro?", " ", JOptionPane.OK_CANCEL_OPTION);
            
      if(a == 0){
          this.dispose();
      }
            }
            }
    }
       catch (Exception ex) {
            JOptionPane.showMessageDialog(
                    rootPane,
                    "Erro! "+ex.getMessage(),
                    "erro",
                    JOptionPane.ERROR_MESSAGE);
       }
                                            

    }//GEN-LAST:event_jButton2ActionPerformed
    /* precisa ser feito */
    public Double valorF(){
        double val = 0;

        if(p.getTamanho().equals("Pequena")){
            val = val + 20;
        }
        if(p.getTamanho().equals("Media")){
            val = val + 30;
        }
        if(p.getTamanho().equals("Grande")){
            val = val + 35;
        }
        val = val * p.getQnt();
        val = val + (p.getQntSab()*3);
        
        return val;
    }
    public void cadastrarPedido(Pizzas p) throws SQLException{

        Connection con = Conecta.getConexao();
        Statement stat = con.createStatement();
        
        try {    
            String sql;

            sql = "insert into venda(idvenda, idcliente, tamanho, sabor, valor) values('"+criaId+"', "+c.getId()+",'"+p.getTamanho()+"', '"+p.getSabor()+"', "+valorF()+")";
             // System.out.println(sql);
            stat.execute(sql);
            
        } catch (SQLException e) {
            throw new SQLException("Erro ao cadastrar Pedido! "+e.getMessage());
        } finally{
            con.close();
            stat.close();
        }//fecha finally
    }
    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        try {
        ArrayList<Cliente> cli = new ArrayList<>();
        cli = buscarCli();
                 
            for (int i = 0; i < cli.size(); i++) {
                dtm2.addRow(new String[]{
                    String.valueOf(cli.get(i).getId()),
                    String.valueOf(cli.get(i).getNome()),
                    String.valueOf(cli.get(i).getTelefone()),
                    String.valueOf(cli.get(i).getEndereco())
                   
                });
            }
            jTable1.setModel(dtm2);
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Erro ao carregar tabela: "+ex);
    }
           
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextFieldIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdActionPerformed
    public void buscar(){
         try {           
             geraIdVenda();
            ArrayList<Pizzas> piz = new ArrayList<>();
            

            //Recebendo o ArrayList cheio em produtos
            piz = buscarSab();
            

            for (int i = 0; i < piz.size(); i++) {
                dtm.addRow(new String[]{
                    String.valueOf(piz.get(i).getId()),
                    String.valueOf(piz.get(i).getSabor())                   
                });
            }
            jTable2.setModel(dtm);


        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    this,
                    "Erro! " + e.getMessage());
        }//fecha catch
    }
    
    public ArrayList<Pizzas> buscarSab() throws SQLException {

        Connection con = Conecta.getConexao();
        Statement stat = con.createStatement();

      try {
            String sql;
            sql = "select * from pizzas";
             

            ArrayList<Pizzas> pizz = new ArrayList<>();
            ResultSet rs = stat.executeQuery(sql);
            
            while (rs.next()) {
                Pizzas p = new Pizzas();
                p.setId(rs.getInt("idpizzas"));
                p.setSabor(rs.getString("sabor_pizza"));

                pizz.add(p);
            }
            return pizz;

        } catch (SQLException e) {
            throw new SQLException("Erro ao buscar Sabores! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }
         }
         
        //Buscando CLiente 
    public ArrayList<Cliente> buscarCli() throws SQLException {

        Connection con = Conecta.getConexao();
        Statement stat = con.createStatement();

      try {
            String sql;
            sql = "select * from cliente where nome_cliente = '"+ jTextField1.getText()+"'";
             

            ArrayList<Cliente> cli = new ArrayList<>();
            ResultSet rs = stat.executeQuery(sql);
            
            while (rs.next()) {
                Cliente c = new Cliente();
                c.setId(rs.getInt("idcliente"));
                c.setNome(rs.getString("nome_cliente"));
                c.setTelefone(rs.getString("telefone_cliente"));
                c.setEndereco(rs.getString("endereco_cliente"));
                
                
                
              
                //Adicionando objeto PessoaVO pVO dentro do ArrayList pessoas
                cli.add(c);
            }//fecha while
            //Retornando o ArrayList com todos objetos
            return cli;

        } catch (SQLException e) {
            throw new SQLException("Erro ao buscar Sabores! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
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
            java.util.logging.Logger.getLogger(Pedir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pedir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pedir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pedir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pedir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBoxTamanho;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinnerqnt;
    private javax.swing.JSpinner jSpinnersabp;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldId;
    // End of variables declaration//GEN-END:variables
}
