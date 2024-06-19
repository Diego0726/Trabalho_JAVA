/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

/**
 *
 * @author Pichau
 */
public class telaDorama extends javax.swing.JFrame {

    /**
     * Creates new form telaDorama
     */
    public telaDorama() {
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

        episodio = new javax.swing.JTextArea();
        plataforma = new javax.swing.JTextArea();
        nomeDorama = new javax.swing.JTextArea();
        observacao = new javax.swing.JTextArea();
        generoDorama = new javax.swing.JTextArea();
        temporada = new javax.swing.JTextArea();
        voltarLista2 = new javax.swing.JButton();
        CADASTRAR = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(430, 932));
        setMinimumSize(new java.awt.Dimension(430, 932));
        getContentPane().setLayout(null);

        episodio.setColumns(20);
        episodio.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        episodio.setRows(5);
        episodio.setBorder(null);
        getContentPane().add(episodio);
        episodio.setBounds(240, 620, 150, 20);

        plataforma.setColumns(20);
        plataforma.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        plataforma.setRows(5);
        plataforma.setBorder(null);
        getContentPane().add(plataforma);
        plataforma.setBounds(50, 510, 150, 30);

        nomeDorama.setColumns(20);
        nomeDorama.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        nomeDorama.setRows(5);
        nomeDorama.setBorder(null);
        getContentPane().add(nomeDorama);
        nomeDorama.setBounds(50, 410, 330, 20);

        observacao.setColumns(20);
        observacao.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        observacao.setRows(5);
        observacao.setBorder(null);
        getContentPane().add(observacao);
        observacao.setBounds(50, 730, 330, 100);

        generoDorama.setColumns(20);
        generoDorama.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        generoDorama.setRows(5);
        generoDorama.setBorder(null);
        getContentPane().add(generoDorama);
        generoDorama.setBounds(240, 510, 140, 30);

        temporada.setColumns(20);
        temporada.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        temporada.setRows(5);
        temporada.setBorder(null);
        getContentPane().add(temporada);
        temporada.setBounds(50, 620, 150, 20);

        voltarLista2.setBackground(new java.awt.Color(252, 18, 76));
        voltarLista2.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        voltarLista2.setForeground(new java.awt.Color(255, 255, 255));
        voltarLista2.setText("VOLTAR");
        voltarLista2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        voltarLista2.setMaximumSize(new java.awt.Dimension(71, 22));
        voltarLista2.setMinimumSize(new java.awt.Dimension(71, 22));
        voltarLista2.setPreferredSize(new java.awt.Dimension(71, 22));
        voltarLista2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarLista2ActionPerformed(evt);
            }
        });
        getContentPane().add(voltarLista2);
        voltarLista2.setBounds(170, 860, 90, 30);

        CADASTRAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/image/dra. doramas app/VERLISTA.png"))); // NOI18N
        getContentPane().add(CADASTRAR);
        CADASTRAR.setBounds(0, 0, 430, 932);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarLista2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarLista2ActionPerformed
        
    }//GEN-LAST:event_voltarLista2ActionPerformed

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
            java.util.logging.Logger.getLogger(telaDorama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaDorama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaDorama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaDorama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaDorama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CADASTRAR;
    private javax.swing.JTextArea episodio;
    private javax.swing.JTextArea generoDorama;
    private javax.swing.JTextArea nomeDorama;
    private javax.swing.JTextArea observacao;
    private javax.swing.JTextArea plataforma;
    private javax.swing.JTextArea temporada;
    private javax.swing.JButton voltarLista2;
    // End of variables declaration//GEN-END:variables
}
