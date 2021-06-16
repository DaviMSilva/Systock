/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import DAO.UsuariosDAO;
import javax.swing.JOptionPane;
import object.Usuario;

/**
 *
 * @author ACER
 */
public class login extends javax.swing.JFrame {
    
    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        setLocationRelativeTo(this);
        
        
        
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
        LabelPassword = new javax.swing.JLabel();
        TextUser = new javax.swing.JTextField();
        LabelUser = new javax.swing.JLabel();
        BtnLogin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        PasswordFieldLogin = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        LabelPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LabelPassword.setText("Senha:");

        TextUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextUserFocusLost(evt);
            }
        });
        TextUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextUserKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextUserKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextUserKeyTyped(evt);
            }
        });

        LabelUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LabelUser.setText("Usuário:");

        BtnLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnLogin.setMnemonic(10);
        BtnLogin.setText("Login");
        BtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLoginActionPerformed(evt);
            }
        });
        BtnLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BtnLoginKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Systock");

        PasswordFieldLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(153, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(LabelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(LabelUser, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TextUser, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                .addComponent(PasswordFieldLogin)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(126, 126, 126)
                            .addComponent(BtnLogin)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(156, 156, 156))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelUser))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelPassword)
                    .addComponent(PasswordFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BtnLogin)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLoginActionPerformed
        
        
        if(TextUser.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Existem campos obrigatorios em branco");
        }
        else{
            try {
                Usuario user = new Usuario();
                user.setUserLogin(TextUser.getText());
                
                user.setUserPassword(String.valueOf(PasswordFieldLogin.getPassword()));
                UsuariosDAO DAO = new UsuariosDAO();
                
                new menu().setVisible(true);
                    this.dispose();
                
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Usuario e/ou Senha incorreto(s)");
            }
        }

// TODO add your handling code here:
    }//GEN-LAST:event_BtnLoginActionPerformed

    private void PasswordFieldLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordFieldLoginActionPerformed

    private void TextUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextUserKeyTyped

        
        // TODO add your handling code here:
    }//GEN-LAST:event_TextUserKeyTyped

    private void TextUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextUserFocusLost
   
        // TODO add your handling code here:
    }//GEN-LAST:event_TextUserFocusLost

    private void TextUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextUserKeyPressed
           // TODO add your handling code here:
    }//GEN-LAST:event_TextUserKeyPressed

    private void TextUserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextUserKeyReleased
         int pos = TextUser.getCaretPosition();
         TextUser.setText(TextUser.getText().toUpperCase());
         TextUser.setCaretPosition(pos);
        // TODO add your handling code here:
    }//GEN-LAST:event_TextUserKeyReleased

    private void BtnLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BtnLoginKeyPressed
        
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnLoginKeyPressed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnLogin;
    private javax.swing.JLabel LabelPassword;
    private javax.swing.JLabel LabelUser;
    private javax.swing.JPasswordField PasswordFieldLogin;
    private javax.swing.JTextField TextUser;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
