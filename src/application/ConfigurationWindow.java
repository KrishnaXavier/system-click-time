/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author Krishna Pessoal
 */
public class ConfigurationWindow extends javax.swing.JFrame {

    /**
     * Creates new form ConfigurationWindow
     */
    public ConfigurationWindow() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        drag = new javax.swing.JToggleButton();
        doublePrimary = new javax.swing.JToggleButton();
        primary = new javax.swing.JToggleButton();
        secondary = new javax.swing.JToggleButton();
        jToggleButton1 = new javax.swing.JToggleButton();

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("System of Click for Time");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(600, 400));
        setMinimumSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Time for Click (seconds)");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 352, 580, 37));

        jTextField1.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("3");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 308, 120, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("System of Click for Time");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 21, 580, 37));

        drag.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        drag.setText("Drag");
        drag.setFocusable(false);
        getContentPane().add(drag, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 231, 199, 40));

        doublePrimary.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        doublePrimary.setText("Double Primary Click");
        doublePrimary.setFocusable(false);
        getContentPane().add(doublePrimary, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 231, 199, 40));

        primary.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        primary.setText("Primary Click (left)");
        primary.setFocusable(false);
        getContentPane().add(primary, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 185, 199, 40));

        secondary.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        secondary.setText("Secondary Click (right)");
        secondary.setFocusable(false);
        getContentPane().add(secondary, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 185, 199, 40));

        jToggleButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jToggleButton1.setText("Enable");
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 210, -1));

        setSize(new java.awt.Dimension(616, 439));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ConfigurationWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfigurationWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfigurationWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfigurationWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfigurationWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton doublePrimary;
    private javax.swing.JToggleButton drag;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton primary;
    private javax.swing.JToggleButton secondary;
    // End of variables declaration//GEN-END:variables
}
