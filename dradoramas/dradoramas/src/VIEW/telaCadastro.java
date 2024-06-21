package VIEW;

import DAO.UsuarioDAO;
import DTO.UsuarioDTO;

public class telaCadastro extends javax.swing.JFrame {

    public telaCadastro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtsenha = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtnome = new javax.swing.JTextField();
        txtgenero = new javax.swing.JTextField();
        txtidade = new javax.swing.JTextField();
        prosseguir = new javax.swing.JButton();
        CADASTRO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(430, 932));
        getContentPane().setLayout(null);

        txtsenha.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtsenha.setBorder(null);
        txtsenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsenhaActionPerformed(evt);
            }
        });
        getContentPane().add(txtsenha);
        txtsenha.setBounds(50, 790, 330, 30);

        txtemail.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtemail.setBorder(null);
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        getContentPane().add(txtemail);
        txtemail.setBounds(50, 690, 330, 20);

        txtnome.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtnome.setBorder(null);
        txtnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtnome);
        txtnome.setBounds(50, 470, 330, 30);

        txtgenero.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtgenero.setBorder(null);
        txtgenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtgeneroActionPerformed(evt);
            }
        });
        getContentPane().add(txtgenero);
        txtgenero.setBounds(240, 580, 140, 20);

        txtidade.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtidade.setBorder(null);
        txtidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidadeActionPerformed(evt);
            }
        });
        getContentPane().add(txtidade);
        txtidade.setBounds(50, 580, 150, 20);

        prosseguir.setBackground(new java.awt.Color(252, 18, 76));
        prosseguir.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        prosseguir.setForeground(new java.awt.Color(255, 255, 255));
        prosseguir.setText("PROSSEGUIR");
        prosseguir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        prosseguir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prosseguirActionPerformed(evt);
            }
        });
        getContentPane().add(prosseguir);
        prosseguir.setBounds(160, 840, 120, 30);

        CADASTRO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/image/dra. doramas app/2.png"))); // NOI18N
        getContentPane().add(CADASTRO);
        CADASTRO.setBounds(0, 0, 430, 932);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtsenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsenhaActionPerformed

    private void txtnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomeActionPerformed

    private void txtgeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtgeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtgeneroActionPerformed

    private void txtidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidadeActionPerformed

    private void prosseguirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prosseguirActionPerformed
        String nome, idade, genero, email, senha;

        nome = txtnome.getText();  
        idade = txtidade.getText();  
        genero = txtgenero.getText();  
        email = txtsenha.getText();  
        senha = txtsenha.getText();  

    UsuarioDTO objusuariodto = new UsuarioDTO();
        objusuariodto.setnome(nome);
        objusuariodto.setidade(idade); 
        objusuariodto.setgenero(genero);
        objusuariodto.setemail(email);
        objusuariodto.setsenha(senha);

    UsuarioDAO objusuariodao = new UsuarioDAO();
    objusuariodao.cadastrarUsuario(objusuariodto);

        telaLogin objTelaLogin = new telaLogin();
            objTelaLogin.setVisible(true);
            dispose();
    }//GEN-LAST:event_prosseguirActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

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
            java.util.logging.Logger.getLogger(telaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CADASTRO;
    private javax.swing.JButton prosseguir;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtgenero;
    private javax.swing.JTextField txtidade;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextField txtsenha;
    // End of variables declaration//GEN-END:variables
}
