/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import DAO.DoramaDAO;
import DTO.DoramaDTO;
import DTO.Sessao;
import DTO.UsuarioDTO;
import javax.swing.JOptionPane;

/**
 *
 * @author Pichau
 */
public class telaAdicionarDorama extends javax.swing.JFrame {

    /**
     * Creates new form telaAdicionarDorama
     */
    public telaAdicionarDorama() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtobservacao = new javax.swing.JTextField();
        txtepisodio = new javax.swing.JTextField();
        nomeDorama = new javax.swing.JTextField();
        txtplataforma = new javax.swing.JTextField();
        txttemporada = new javax.swing.JTextField();
        generoDorama = new javax.swing.JTextField();
        btnadicionar = new javax.swing.JButton();
        CADASTRAR = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtobservacao.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtobservacao.setBorder(null);
        txtobservacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtobservacaoActionPerformed(evt);
            }
        });
        getContentPane().add(txtobservacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 730, 330, 100));

        txtepisodio.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtepisodio.setBorder(null);
        txtepisodio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtepisodioActionPerformed(evt);
            }
        });
        getContentPane().add(txtepisodio, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 620, 150, 20));

        nomeDorama.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        nomeDorama.setBorder(null);
        nomeDorama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeDoramaActionPerformed(evt);
            }
        });
        getContentPane().add(nomeDorama, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 330, 20));

        txtplataforma.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txtplataforma.setBorder(null);
        txtplataforma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtplataformaActionPerformed(evt);
            }
        });
        getContentPane().add(txtplataforma, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 150, 30));

        txttemporada.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        txttemporada.setBorder(null);
        txttemporada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttemporadaActionPerformed(evt);
            }
        });
        getContentPane().add(txttemporada, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 620, 150, 20));

        generoDorama.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        generoDorama.setBorder(null);
        generoDorama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generoDoramaActionPerformed(evt);
            }
        });
        getContentPane().add(generoDorama, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 510, 140, 30));

        btnadicionar.setBackground(new java.awt.Color(252, 18, 76));
        btnadicionar.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        btnadicionar.setForeground(new java.awt.Color(255, 255, 255));
        btnadicionar.setText("ADICIONAR");
        btnadicionar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnadicionar.setMaximumSize(new java.awt.Dimension(71, 22));
        btnadicionar.setMinimumSize(new java.awt.Dimension(71, 22));
        btnadicionar.setPreferredSize(new java.awt.Dimension(71, 22));
        btnadicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadicionarActionPerformed(evt);
            }
        });
        getContentPane().add(btnadicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 860, 90, 30));

        CADASTRAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/image/dra. doramas app/5.png"))); // NOI18N
        getContentPane().add(CADASTRAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeDoramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeDoramaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeDoramaActionPerformed

    private void txtepisodioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtepisodioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtepisodioActionPerformed

    private void txtplataformaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtplataformaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtplataformaActionPerformed

    private void txttemporadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttemporadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttemporadaActionPerformed

    private void txtobservacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtobservacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtobservacaoActionPerformed

    private void generoDoramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generoDoramaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_generoDoramaActionPerformed

    private void btnadicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadicionarActionPerformed
        String plataforma, nome, genero, temp, eps, observacao;
        
        plataforma = txtplataforma.getText();
        nome = nomeDorama.getText();
        genero = generoDorama.getText();
        temp = txttemporada.getText();
        eps = txtepisodio.getText();
        observacao = txtobservacao.getText();
        String usuario_email = Sessao.getUsuario_email();
        System.out.println("Email recuperado da sessão: " + usuario_email);
        
        
        if (usuario_email == null || usuario_email.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Erro: Usuário não está logado corretamente.");
         return;
}
        
        DoramaDTO objdoramadto = new DoramaDTO();
            objdoramadto.setPlataforma(plataforma);
            objdoramadto.setNome(nome);
            objdoramadto.setGenero(genero);
            objdoramadto.setTemp(temp);
            objdoramadto.setEps(eps);
            objdoramadto.setObservacao(observacao);
            objdoramadto.setUsuario_email(usuario_email);
               
        DoramaDAO objdoramadao = new DoramaDAO();   
        objdoramadao.cadastrarDorama(objdoramadto);
        
        telaDorama objTelaDorama = new telaDorama();
            objTelaDorama.setVisible(true);
            dispose();
        
    }//GEN-LAST:event_btnadicionarActionPerformed

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
            java.util.logging.Logger.getLogger(telaAdicionarDorama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaAdicionarDorama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaAdicionarDorama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaAdicionarDorama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaAdicionarDorama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CADASTRAR;
    private javax.swing.JButton btnadicionar;
    private javax.swing.JTextField generoDorama;
    private javax.swing.JTextField nomeDorama;
    private javax.swing.JTextField txtepisodio;
    private javax.swing.JTextField txtobservacao;
    private javax.swing.JTextField txtplataforma;
    private javax.swing.JTextField txttemporada;
    // End of variables declaration//GEN-END:variables

}
