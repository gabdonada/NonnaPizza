
package Telas;

import javax.swing.ImageIcon;

/**
 *
 * @authors Jonathan, Arthur e Gabriel at DotTech technologies 2017(C)
 */
public class Desktop extends javax.swing.JFrame {
       TelaCardapio tc = new TelaCardapio();
       String var;

    public String getVar() {
        return var;
    }

    public void setVar(String var) {
        this.var = var;
    }
       
    /**
     * Creates new form Desktop
     */
    public Desktop() {
        initComponents();
        setSize(750,550);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jButton1 = new javax.swing.JButton();
        jLabelNome = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItemIserirSab = new javax.swing.JMenuItem();
        jMenuFuncionarios = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItemCadastroCliente = new javax.swing.JMenuItem();
        jMenuItemCadastroFuncionario = new javax.swing.JMenuItem();

        setTitle("Desktop");
        setIconImage(new ImageIcon(getClass().getResource("/img/Botão.png")).getImage());
        setLocation(new java.awt.Point(150, 150));
        setResizable(false);
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Desconectar");
        jButton1.setToolTipText("Voltar para Login");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(0));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton1);
        jButton1.setBounds(600, 400, 110, 40);

        jLabelNome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelNome.setText("jLabel2");
        jDesktopPane1.add(jLabelNome);
        jLabelNome.setBounds(450, 30, 270, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/TelaPadrão.png"))); // NOI18N
        jDesktopPane1.add(jLabel1);
        jLabel1.setBounds(-140, -30, 1060, 590);

        getContentPane().add(jDesktopPane1);
        jDesktopPane1.setBounds(0, 0, 750, 520);

        jMenuBar1.setBackground(new java.awt.Color(0, 153, 51));

        jMenu1.setBackground(new java.awt.Color(0, 153, 51));
        jMenu1.setText("Pedido");
        jMenu1.setToolTipText("Abrir tela de pedidos");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItem6.setText("Gerar Pedido");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem7.setText("Ver Pedido");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Cardápio");
        jMenu2.setToolTipText("Abrir opções de cardápio");
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItem1.setText("Cardapio");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItemIserirSab.setText("Inserir Sabores");
        jMenu2.add(jMenuItemIserirSab);

        jMenuBar1.add(jMenu2);

        jMenuFuncionarios.setText("Funcionário");
        jMenuFuncionarios.setToolTipText("Abrir gerenciamento de funcionários");
        jMenuFuncionarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItem5.setText("Gerenciar Funcionários");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenuFuncionarios.add(jMenuItem5);

        jMenuBar1.add(jMenuFuncionarios);

        jMenu4.setText("Cadastro");
        jMenu4.setToolTipText("Abrir opções de cadastro");
        jMenu4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItemCadastroCliente.setText("Cliente");
        jMenuItemCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroClienteActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItemCadastroCliente);

        jMenuItemCadastroFuncionario.setText("Funcionário");
        jMenuItemCadastroFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroFuncionarioActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItemCadastroFuncionario);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    String nome;
    public void carregaNome(){
        String var = "Bem vindo, "+nome+"!";
        jLabelNome.setText(var);
    }
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

       tc.autoriza();
       tc.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
         GerenciarFuncionario g = new GerenciarFuncionario();
            
        g.setVisible(true);
        
        
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItemCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroClienteActionPerformed
        Cadastro c = new Cadastro();
        c.determina=1;
        c.Vizualiza();
        c.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadastroClienteActionPerformed

    private void jMenuItemCadastroFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroFuncionarioActionPerformed
       Cadastro c = new Cadastro();
        c.determina=2;
        c.Vizualiza();
        c.setVisible(true); 
    }//GEN-LAST:event_jMenuItemCadastroFuncionarioActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        Pedir p = new Pedir();
        p.buscar();
        p.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        VerPedido v = new VerPedido();
        v.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem7ActionPerformed

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
            java.util.logging.Logger.getLogger(Desktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Desktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Desktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Desktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Desktop().setVisible(true);
            }
        });
    }
    public void funcioLib(){
        if("1".equals(var)){
            jMenuFuncionarios.setVisible(false);
            jMenuItemCadastroFuncionario.setVisible(false);
            jMenuItemIserirSab.setVisible(false);
        }else{
            jMenuFuncionarios.setVisible(true);
            jMenuItemCadastroFuncionario.setVisible(true);
            jMenuItemIserirSab.setVisible(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuFuncionarios;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItemCadastroCliente;
    private javax.swing.JMenuItem jMenuItemCadastroFuncionario;
    private javax.swing.JMenuItem jMenuItemIserirSab;
    // End of variables declaration//GEN-END:variables
}
