/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evm;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author RhIeyAaD
 */
public class AdminPage extends javax.swing.JFrame {

    /**
     * Creates new form AdminPage
     */
    Connection c = null;
    Statement stmt = null;
    public AdminPage() {
        initComponents();
        getContentPane().setBackground(Color.CYAN);
         c=SqlConnector.dbConnector();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        XF = new javax.swing.JTextField();
        YF = new javax.swing.JTextField();
        ZF = new javax.swing.JTextField();
        RF = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(600, 600));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Total Counting...");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(142, 28, 180, 43);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("MR. X");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(90, 74, 60, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("MR. Y");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(300, 74, 60, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("MR. Z");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(90, 185, 70, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("MR. R");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(300, 184, 60, 20);

        XF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XFActionPerformed(evt);
            }
        });
        getContentPane().add(XF);
        XF.setBounds(40, 100, 150, 80);
        getContentPane().add(YF);
        YF.setBounds(239, 100, 160, 80);
        getContentPane().add(ZF);
        ZF.setBounds(39, 210, 150, 90);

        RF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RFActionPerformed(evt);
            }
        });
        getContentPane().add(RF);
        RF.setBounds(240, 210, 160, 90);

        jButton1.setText("LogOut");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(170, 320, 90, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void XFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XFActionPerformed
        // TODO add your handling code here:
        //X
        try{
            stmt = c.createStatement();
      ResultSet rs = stmt.executeQuery( "SELECT * FROM VOTE;" );
            while(rs.next())
            {
                String a=rs.getString("X");
                System.out.println(a);
                XF.setText(a);
                
            }
        }
        catch(Exception e1){
            e1.printStackTrace();
        }
    }//GEN-LAST:event_XFActionPerformed
        private void close(){
        WindowEvent windowClose=new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(windowClose);
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        close();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void RFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RFActionPerformed

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
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField RF;
    private javax.swing.JTextField XF;
    private javax.swing.JTextField YF;
    private javax.swing.JTextField ZF;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
