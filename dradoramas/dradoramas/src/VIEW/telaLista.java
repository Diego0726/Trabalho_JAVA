/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

/**
 *
 * @author Pichau
 */
public class telaLista extends javax.swing.JFrame {

    /**
     * Creates new form telaLista
     */
    public telaLista() {
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

        generoDorama = new javax.swing.JTextArea();
        nomeDorama1 = new javax.swing.JTextArea();
        nomeDorama2 = new javax.swing.JTextArea();
        nomeDorama3 = new javax.swing.JTextArea();
        generoDorama1 = new javax.swing.JTextArea();
        generoDorama2 = new javax.swing.JTextArea();
        verLista = new javax.swing.JButton();
        voltar = new javax.swing.JButton();
        lista = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        generoDorama.setColumns(20);
        generoDorama.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        generoDorama.setRows(5);
        generoDorama.setBorder(null);
        getContentPane().add(generoDorama);
        generoDorama.setBounds(240, 570, 150, 20);

        nomeDorama1.setColumns(20);
        nomeDorama1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        nomeDorama1.setRows(5);
        nomeDorama1.setBorder(null);
        getContentPane().add(nomeDorama1);
        nomeDorama1.setBounds(50, 570, 160, 20);

        nomeDorama2.setColumns(20);
        nomeDorama2.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        nomeDorama2.setRows(5);
        nomeDorama2.setBorder(null);
        getContentPane().add(nomeDorama2);
        nomeDorama2.setBounds(50, 354, 160, 20);

        nomeDorama3.setColumns(20);
        nomeDorama3.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        nomeDorama3.setRows(5);
        nomeDorama3.setBorder(null);
        getContentPane().add(nomeDorama3);
        nomeDorama3.setBounds(50, 460, 160, 20);

        generoDorama1.setColumns(20);
        generoDorama1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        generoDorama1.setRows(5);
        generoDorama1.setBorder(null);
        getContentPane().add(generoDorama1);
        generoDorama1.setBounds(240, 350, 140, 30);

        generoDorama2.setColumns(20);
        generoDorama2.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        generoDorama2.setRows(5);
        generoDorama2.setBorder(null);
        getContentPane().add(generoDorama2);
        generoDorama2.setBounds(240, 460, 140, 20);

        verLista.setBackground(new java.awt.Color(252, 18, 76));
        verLista.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        verLista.setForeground(new java.awt.Color(255, 255, 255));
        verLista.setText("VER LISTA");
        verLista.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        verLista.setMaximumSize(new java.awt.Dimension(71, 22));
        verLista.setMinimumSize(new java.awt.Dimension(71, 22));
        verLista.setPreferredSize(new java.awt.Dimension(71, 22));
        verLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verListaActionPerformed(evt);
            }
        });
        getContentPane().add(verLista);
        verLista.setBounds(170, 810, 90, 30);

        voltar.setBackground(new java.awt.Color(252, 18, 76));
        voltar.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        voltar.setForeground(new java.awt.Color(255, 255, 255));
        voltar.setText("VOLTAR");
        voltar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        voltar.setMaximumSize(new java.awt.Dimension(71, 22));
        voltar.setMinimumSize(new java.awt.Dimension(71, 22));
        voltar.setPreferredSize(new java.awt.Dimension(71, 22));
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });
        getContentPane().add(voltar);
        voltar.setBounds(170, 860, 90, 30);

        lista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/image/dra. doramas app/6.png"))); // NOI18N
        getContentPane().add(lista);
        lista.setBounds(0, 0, 430, 932);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        telaCadastro TelaCadastro = new telaCadastro();
        TelaCadastro.setVisible(true);
        dispose();
    }//GEN-LAST:event_voltarActionPerformed

    private void verListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verListaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verListaActionPerformed

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
            java.util.logging.Logger.getLogger(telaLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaLista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea generoDorama;
    private javax.swing.JTextArea generoDorama1;
    private javax.swing.JTextArea generoDorama2;
    private javax.swing.JLabel lista;
    private javax.swing.JTextArea nomeDorama1;
    private javax.swing.JTextArea nomeDorama2;
    private javax.swing.JTextArea nomeDorama3;
    private javax.swing.JButton verLista;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}