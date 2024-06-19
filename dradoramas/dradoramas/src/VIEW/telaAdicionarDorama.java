/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

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
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        observacao = new javax.swing.JTextField();
        episodio = new javax.swing.JTextField();
        nomeDorama = new javax.swing.JTextField();
        plataforma = new javax.swing.JTextField();
        temporada = new javax.swing.JTextField();
        generoDorama = new javax.swing.JTextField();
        adicionar = new javax.swing.JButton();
        CADASTRAR = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        observacao.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        observacao.setBorder(null);
        observacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                observacaoActionPerformed(evt);
            }
        });
        getContentPane().add(observacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 730, 330, 100));

        episodio.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        episodio.setBorder(null);
        episodio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                episodioActionPerformed(evt);
            }
        });
        getContentPane().add(episodio, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 620, 150, 20));

        nomeDorama.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        nomeDorama.setBorder(null);
        nomeDorama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeDoramaActionPerformed(evt);
            }
        });
        getContentPane().add(nomeDorama, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 330, 20));

        plataforma.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        plataforma.setBorder(null);
        plataforma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plataformaActionPerformed(evt);
            }
        });
        getContentPane().add(plataforma, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 150, 30));

        temporada.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        temporada.setBorder(null);
        temporada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temporadaActionPerformed(evt);
            }
        });
        getContentPane().add(temporada, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 620, 150, 20));

        generoDorama.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        generoDorama.setBorder(null);
        generoDorama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generoDoramaActionPerformed(evt);
            }
        });
        getContentPane().add(generoDorama, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 510, 140, 30));

        adicionar.setBackground(new java.awt.Color(252, 18, 76));
        adicionar.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        adicionar.setForeground(new java.awt.Color(255, 255, 255));
        adicionar.setText("ADICIONAR");
        adicionar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        adicionar.setMaximumSize(new java.awt.Dimension(71, 22));
        adicionar.setMinimumSize(new java.awt.Dimension(71, 22));
        adicionar.setPreferredSize(new java.awt.Dimension(71, 22));
        adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarActionPerformed(evt);
            }
        });
        getContentPane().add(adicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 860, 90, 30));

        CADASTRAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/image/dra. doramas app/5.png"))); // NOI18N
        getContentPane().add(CADASTRAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeDoramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeDoramaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeDoramaActionPerformed

    private void episodioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_episodioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_episodioActionPerformed

    private void plataformaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plataformaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_plataformaActionPerformed

    private void temporadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temporadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_temporadaActionPerformed

    private void observacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_observacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_observacaoActionPerformed

    private void generoDoramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generoDoramaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_generoDoramaActionPerformed

    private void adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarActionPerformed
        
    }//GEN-LAST:event_adicionarActionPerformed

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
    private javax.swing.JButton adicionar;
    private javax.swing.JTextField episodio;
    private javax.swing.JTextField generoDorama;
    private javax.swing.JTextField nomeDorama;
    private javax.swing.JTextField observacao;
    private javax.swing.JTextField plataforma;
    private javax.swing.JTextField temporada;
    // End of variables declaration//GEN-END:variables
}
