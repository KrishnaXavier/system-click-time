package application;

import java.awt.Color;
import javax.swing.JToggleButton;

/**
 *
 * @author Krishna Pessoal
 */
public class ConfigurationWindow extends javax.swing.JFrame {    
    public static Configuration config;
    private static JToggleButton[] configsBtn;
    private static boolean[] configs;
    
    public ConfigurationWindow() {
        config = new Configuration();
        initComponents();
        getContentPane().setBackground(new Color(241,242,242));
        setResizable(false);
        configsBtn = new  JToggleButton[]{enableSystem, primary, doublePrimary, secondary, drag};        
        styleButton(configsBtn);                               
    }            
    
    private void styleButton(JToggleButton[] button){
        for(int i=0; i < button.length; i++){
            button[i].setBorderPainted(false);            
            button[i].setFocusPainted(false);    
        }
    }
    
    private static void control(int id){
        resetSelected();
        configsBtn[id].setSelected(true);        
        resetStatus();
        
        switch (id) {            
            case 1:
                config.setStatusClickPrimary(true);
                break;
            case 2:                
                config.setStatusClickPrimaryDouble(true);
                break;
            case 3:
                config.setStatusClickSecondary(true);
                break;     
            case 4:
                config.setStatusClickDrag(true);
                break;               
        }        
        console();
    }
    
    private static void resetSelected(){
        for(int i=1; i < configsBtn.length; i++){
            configsBtn[i].setSelected(false);                        
        }
    }
    
    private static void resetStatus(){
        config.setStatusClickPrimary(false);
        config.setStatusClickPrimaryDouble(false);
        config.setStatusClickSecondary(false);        
        config.setStatusClickDrag(false);
    }
    
    private static void enableBtn(boolean status){        
        for(int i=1; i < configsBtn.length; i++){
            configsBtn[i].setEnabled(status);                        
        }                
    }
    
    private static void console(){
        System.out.println("statusTimeClick: "+config.isStatusTimeClick());
        System.out.println("statusClickPrimary: "+config.isStatusClickPrimary());
        System.out.println("statusClickSecondary: "+config.isStatusClickSecondary());
        System.out.println("statusClickPrimaryDouble: "+config.isStatusClickPrimaryDouble());
        System.out.println("statusClickDrag: "+config.isStatusClickDrag());
        System.out.println("------------------------------------------");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        time = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        doublePrimary = new javax.swing.JToggleButton();
        primary = new javax.swing.JToggleButton();
        secondary = new javax.swing.JToggleButton();
        enableSystem = new javax.swing.JToggleButton();
        drag = new javax.swing.JToggleButton();
        confirmTime = new javax.swing.JButton();

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

        time.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        time.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        time.setText("3");
        getContentPane().add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 70, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("System of Click for Time");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 21, 580, 37));

        doublePrimary.setBackground(new java.awt.Color(204, 204, 204));
        doublePrimary.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        doublePrimary.setText("Double Primary Click");
        doublePrimary.setEnabled(false);
        doublePrimary.setFocusable(false);
        doublePrimary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doublePrimaryActionPerformed(evt);
            }
        });
        getContentPane().add(doublePrimary, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 231, 199, 40));

        primary.setBackground(new java.awt.Color(204, 204, 204));
        primary.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        primary.setText("Primary Click (left)");
        primary.setEnabled(false);
        primary.setFocusable(false);
        primary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primaryActionPerformed(evt);
            }
        });
        primary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                primaryKeyPressed(evt);
            }
        });
        getContentPane().add(primary, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 185, 199, 40));

        secondary.setBackground(new java.awt.Color(204, 204, 204));
        secondary.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        secondary.setText("Secondary Click (right)");
        secondary.setEnabled(false);
        secondary.setFocusable(false);
        secondary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secondaryActionPerformed(evt);
            }
        });
        getContentPane().add(secondary, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 185, 199, 40));

        enableSystem.setBackground(new java.awt.Color(204, 204, 204));
        enableSystem.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        enableSystem.setText("Enable");
        enableSystem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enableSystemActionPerformed(evt);
            }
        });
        getContentPane().add(enableSystem, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 210, -1));

        drag.setBackground(new java.awt.Color(204, 204, 204));
        drag.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        drag.setText("Drag");
        drag.setEnabled(false);
        drag.setFocusable(false);
        drag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dragActionPerformed(evt);
            }
        });
        getContentPane().add(drag, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 231, 199, 40));

        confirmTime.setBackground(new java.awt.Color(204, 204, 204));
        confirmTime.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        confirmTime.setText("Confirm Time");
        confirmTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmTimeActionPerformed(evt);
            }
        });
        getContentPane().add(confirmTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 170, 40));

        setSize(new java.awt.Dimension(616, 439));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void enableSystemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enableSystemActionPerformed
        boolean selected = enableSystem.isSelected();
        config.setStatusTimeClick(selected);
        if(selected)
            enableBtn(true);                        
        else{
            resetSelected();
            resetStatus();
            enableBtn(false);            
        }
        console();
            
    }//GEN-LAST:event_enableSystemActionPerformed

    private void primaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primaryActionPerformed
        control(1);
    }//GEN-LAST:event_primaryActionPerformed

    private void doublePrimaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doublePrimaryActionPerformed
        control(2);
    }//GEN-LAST:event_doublePrimaryActionPerformed

    private void secondaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secondaryActionPerformed
        control(3);
    }//GEN-LAST:event_secondaryActionPerformed

    private void primaryKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_primaryKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_primaryKeyPressed

    private void dragActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dragActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dragActionPerformed

    private void confirmTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmTimeActionPerformed
        config.setTimeClick(Integer.parseInt(time.getText()) * 1000);
    }//GEN-LAST:event_confirmTimeActionPerformed

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
    private javax.swing.JButton confirmTime;
    private static javax.swing.JToggleButton doublePrimary;
    private static javax.swing.JToggleButton drag;
    private static javax.swing.JToggleButton enableSystem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private static javax.swing.JToggleButton primary;
    private static javax.swing.JToggleButton secondary;
    private static javax.swing.JTextField time;
    // End of variables declaration//GEN-END:variables
}
