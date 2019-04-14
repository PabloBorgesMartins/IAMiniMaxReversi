package ia.minimax.reversi.view;

import javax.swing.ImageIcon;

public class InicializaicaoView extends javax.swing.JFrame {

    public InicializaicaoView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        experiente = new javax.swing.JButton();
        moderado = new javax.swing.JButton();
        iniciante = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reversi - O Jogo");
        setIconImage(new ImageIcon(getClass().getResource("/ia/minimax/reversi/img/icone_reversi.png")).getImage());
        getContentPane().setLayout(null);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(1843, 40, 50, 31);

        experiente.setText("Exeperiente");
        experiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                experienteActionPerformed(evt);
            }
        });
        getContentPane().add(experiente);
        experiente.setBounds(530, 420, 100, 30);

        moderado.setText("Moderado");
        moderado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moderadoActionPerformed(evt);
            }
        });
        getContentPane().add(moderado);
        moderado.setBounds(300, 420, 100, 30);

        iniciante.setText("Iniciante");
        iniciante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicianteActionPerformed(evt);
            }
        });
        getContentPane().add(iniciante);
        iniciante.setBounds(70, 420, 100, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ia/minimax/reversi/img/reversi.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 720, 550);

        setSize(new java.awt.Dimension(737, 509));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inicianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicianteActionPerformed
        System.out.println("Botão Iniciante clicado");
        Interface chamaInterface = new Interface();
        chamaInterface.setVisible(true);
        dispose();
    }//GEN-LAST:event_inicianteActionPerformed

    private void moderadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moderadoActionPerformed
        System.out.println("Botão Moderado clicado");
        Interface chamaInterface = new Interface();
        chamaInterface.setVisible(true);
        dispose();
    }//GEN-LAST:event_moderadoActionPerformed

    private void experienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_experienteActionPerformed
        System.out.println("Botão Experiente clicado");
        Interface chamaInterface = new Interface();
        chamaInterface.setVisible(true);
        dispose();
    }//GEN-LAST:event_experienteActionPerformed

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
            java.util.logging.Logger.getLogger(InicializaicaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicializaicaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicializaicaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicializaicaoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicializaicaoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton experiente;
    private javax.swing.JButton iniciante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton moderado;
    // End of variables declaration//GEN-END:variables
}
