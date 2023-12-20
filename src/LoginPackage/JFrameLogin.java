/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginPackage;

import home.home;
import RegistPackage.JFrameRegist;
import java.awt.Toolkit;
import javax.swing.JOptionPane;


/**
 *
 * @author User
 */
public class JFrameLogin extends javax.swing.JFrame {

    /**
     * Creates new form JFrameLogin
     */
    public JFrameLogin() {
        initComponents();
        
//        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logout-rounded-down.png")));

          setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("IconLogin.png")));
          

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        sandi = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        BtnReg = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setText("Login Akun");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 90));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Jika belum memiliki akun silahkan klik registrasi");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setText("Username");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, -1, -1));

        nama.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });
        jPanel1.add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 300, -1));

        sandi.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        sandi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sandiActionPerformed(evt);
            }
        });
        jPanel1.add(sandi, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 300, -1));

        login.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 130, -1));

        BtnReg.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        BtnReg.setText("Registrasi");
        BtnReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegActionPerformed(evt);
            }
        });
        jPanel1.add(BtnReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel5.setText("Password");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\sylviagiovani\\src\\sylviagiovani\\Full Stack Designer Female.png")); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 410));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

    private void BtnRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegActionPerformed
       JFrameRegist FrmRegistrasi = new JFrameRegist();
       FrmRegistrasi.show();
       this.hide();
               
    }//GEN-LAST:event_BtnRegActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        if (login.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Kolom Username harus di isi");
            login.requestFocus();
        }
        else if(sandi.getText().equals("")){
            JOptionPane.showConfirmDialog(null, "Kolom Password harus di isi");
            sandi.requestFocus();
        }
        
       
        //
        home home = new home();
        home.show();
        this.hide();
        
    }//GEN-LAST:event_loginActionPerformed

    private void sandiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sandiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sandiActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnReg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton login;
    private javax.swing.JTextField nama;
    private javax.swing.JPasswordField sandi;
    // End of variables declaration//GEN-END:variables
}
