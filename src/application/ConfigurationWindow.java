package application;

import java.awt.Color;
import javax.swing.JToggleButton;

/**
 *
 * @author Krishna Pessoal
 */
public class ConfigurationWindow extends javax.swing.JFrame {    
    private static int     timeClick                = 3000;
    private static boolean statusTimeClick          = false;     
    private static boolean statusClickPrimary       = false;  /* Button Left Mouse          */
    private static boolean statusClickSecondary     = false; /* Button Right Mouse          */
    private static boolean statusClickPrimaryDouble = false; /* Button Left Double Mouse    */
    private static boolean statusClickDrag          = false; /* Function Drag Itens/Folder  */
    private static JToggleButton[] configsBtn;
    private static boolean[] configs;
    
    public ConfigurationWindow() {
        initComponents();
        getContentPane().setBackground(new Color(241,242,242));
        setResizable(false);
        configsBtn = new JToggleButton[]{enableSystem, primary, doublePrimary, secondary, drag};        
        styleButton(configsBtn);                               
    }

    public static void setTimeClick(int timeClick) {
        ConfigurationWindow.timeClick = timeClick;
    }

    public static void setStatusTimeClick(boolean statusTimeClick) {
        ConfigurationWindow.statusTimeClick = statusTimeClick;
    }

    public static void setStatusClickPrimary(boolean statusClickPrimary) {
        ConfigurationWindow.statusClickPrimary = statusClickPrimary;
    }

    public static void setStatusClickSecondary(boolean statusClickSecondary) {
        ConfigurationWindow.statusClickSecondary = statusClickSecondary;
    }

    public static void setStatusClickPrimaryDouble(boolean statusClickPrimaryDouble) {
        ConfigurationWindow.statusClickPrimaryDouble = statusClickPrimaryDouble;
    }

    public static void setStatusClickDrag(boolean statusClickDrag) {
        ConfigurationWindow.statusClickDrag = statusClickDrag;
    }

    public static int getTimeClick() {
        return timeClick;
    }

    public static boolean isStatusTimeClick() {
        return statusTimeClick;
    }

    public static boolean isStatusClickPrimary() {
        return statusClickPrimary;
    }

    public static boolean isStatusClickSecondary() {
        return statusClickSecondary;
    }

    public static boolean isStatusClickPrimaryDouble() {
        return statusClickPrimaryDouble;
    }

    public static boolean isStatusClickDrag() {
        return statusClickDrag;
    }        
    
    private void styleButton(JToggleButton[] button){
        for(int i=0; i < button.length; i++){
            button[i].setBorderPainted(false);            
            button[i].setFocusPainted(false);    
        }
    }
    
    private void control(int id){
        resetSelected();
        configsBtn[id].setSelected(true);        
        resetStatus();
        
        switch (id) {
            case 0:
                statusTimeClick = true;
                break;
            case 1:
                statusClickPrimary  = true;
                break;
            case 2:
                statusClickSecondary = true;
                break;
            case 3:
                statusClickPrimaryDouble = true;
                break;     
            case 4:
                statusClickDrag = true;
                break;               
        }        
        console();
    }
    
    private void resetSelected(){
        for(int i=1; i < configsBtn.length; i++){
            configsBtn[i].setSelected(false);                        
        }
    }
    
    private void resetStatus(){
        statusClickPrimary = statusClickSecondary = statusClickPrimaryDouble = statusClickDrag = false;
    }
    
    private void enableBtn(boolean status){        
        for(int i=1; i < configsBtn.length; i++){
            configsBtn[i].setEnabled(status);                        
        }        
    }
    
    private void console(){
        System.out.println("statusTimeClick: "+statusTimeClick);
        System.out.println("statusClickPrimary: "+statusClickPrimary);
        System.out.println("statusClickSecondary: "+statusClickSecondary);
        System.out.println("statusClickPrimaryDouble: "+statusClickPrimaryDouble);
        System.out.println("statusClickDrag: "+statusClickDrag);
        System.out.println("------------------------------------------");
    }

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
        enableSystem = new javax.swing.JToggleButton();

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

        setSize(new java.awt.Dimension(616, 439));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void enableSystemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enableSystemActionPerformed
        boolean selected = enableSystem.isSelected();        
        statusTimeClick = selected;
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

    private void dragActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dragActionPerformed
        control(4);
    }//GEN-LAST:event_dragActionPerformed

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
    private javax.swing.JToggleButton enableSystem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton primary;
    private javax.swing.JToggleButton secondary;
    // End of variables declaration//GEN-END:variables
}
