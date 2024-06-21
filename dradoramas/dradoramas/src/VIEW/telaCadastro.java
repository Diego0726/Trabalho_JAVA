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

        email = new javax.swing.JTextField();
        nome = new javax.swing.JTextField();
        genero = new javax.swing.JTextField();
        idade = new javax.swing.JTextField();
        senha = new javax.swing.JPasswordField();
        prosseguir = new javax.swing.JButton();
        CADASTRO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(430, 932));
        setMinimumSize(new java.awt.Dimension(430, 932));
        getContentPane().setLayout(null);

        email.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        email.setBorder(null);
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        getContentPane().add(email);
        email.setBounds(50, 690, 330, 20);

        nome.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        nome.setBorder(null);
        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });
        getContentPane().add(nome);
        nome.setBounds(50, 470, 330, 30);

        genero.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        genero.setBorder(null);
        genero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generoActionPerformed(evt);
            }
        });
        getContentPane().add(genero);
        genero.setBounds(240, 580, 140, 20);

        idade.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        idade.setBorder(null);
        idade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idadeActionPerformed(evt);
            }
        });
        getContentPane().add(idade);
        idade.setBounds(50, 580, 150, 20);

        senha.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        senha.setBorder(null);
        getContentPane().add(senha);
        senha.setBounds(50, 790, 330, 30);

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

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

    private void generoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_generoActionPerformed

    private void idadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idadeActionPerformed

    private void prosseguirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prosseguirActionPerformed
        String nome, idade, genero, email, senha;

        nome = txtNome.getText();  
        idade = txtIdade.getText();  
        genero = txtGenero.getText();  
        email = txtEmail.getText();  
        senha = txtSenha.getText();  

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
    private javax.swing.JTextField email;
    private javax.swing.JTextField genero;
    private javax.swing.JTextField idade;
    private javax.swing.JTextField nome;
    private javax.swing.JButton prosseguir;
    private javax.swing.JPasswordField senha;
    // End of variables declaration//GEN-END:variables
}
