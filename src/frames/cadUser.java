/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import DAO.UsuariosDAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import object.Usuario;

/**
 *
 * @author ACER
 */
public class cadUser extends javax.swing.JFrame {

    /**
     * Creates new form cadUser
     */
    public cadUser() {
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

        alterar = new javax.swing.JFrame();
        painelBusca = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        textCadProdBusca = new javax.swing.JTextField();
        btnBusca = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaBusca = new javax.swing.JTable();
        btnSelect = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        labelCadUserNome = new javax.swing.JLabel();
        textCadUserNome = new javax.swing.JTextField();
        labelCadUserNome1 = new javax.swing.JLabel();
        labelCadUserNome2 = new javax.swing.JLabel();
        labelCadUserNome3 = new javax.swing.JLabel();
        textCadUserLogin = new javax.swing.JTextField();
        textCadUserPassword = new javax.swing.JPasswordField();
        textCadUserPasswordConfirm = new javax.swing.JPasswordField();
        textCod = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnUserSalvar = new javax.swing.JButton();
        btnUserAlterar = new javax.swing.JButton();
        btnUserLimparExcluir = new javax.swing.JButton();

        alterar.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        alterar.setResizable(false);

        painelBusca.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Digite nome ou n??mero do Usuarios: (em branco para todos)");

        btnBusca.setText("Buscar");
        btnBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaActionPerformed(evt);
            }
        });

        tabelaBusca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod", "Nome", "Login"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaBusca.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabelaBusca.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tabelaBusca);

        btnSelect.setText("Selecionar");
        btnSelect.setEnabled(false);
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelBuscaLayout = new javax.swing.GroupLayout(painelBusca);
        painelBusca.setLayout(painelBuscaLayout);
        painelBuscaLayout.setHorizontalGroup(
            painelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBuscaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelBuscaLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBuscaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(painelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(painelBuscaLayout.createSequentialGroup()
                                .addComponent(textCadProdBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBusca)))
                        .addGap(84, 84, 84))))
            .addGroup(painelBuscaLayout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(btnSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        painelBuscaLayout.setVerticalGroup(
            painelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBuscaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(painelBuscaLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnBusca))
                    .addGroup(painelBuscaLayout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textCadProdBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSelect)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout alterarLayout = new javax.swing.GroupLayout(alterar.getContentPane());
        alterar.getContentPane().setLayout(alterarLayout);
        alterarLayout.setHorizontalGroup(
            alterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alterarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelBusca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        alterarLayout.setVerticalGroup(
            alterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alterarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("cadastro de usuario");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de Usu??rio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        labelCadUserNome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelCadUserNome.setText("Nome:");

        textCadUserNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCadUserNomeActionPerformed(evt);
            }
        });
        textCadUserNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textCadUserNomeKeyReleased(evt);
            }
        });

        labelCadUserNome1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelCadUserNome1.setText("Login:");

        labelCadUserNome2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelCadUserNome2.setText("Senha:");

        labelCadUserNome3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelCadUserNome3.setText("Confirmar Senha:");

        textCadUserLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCadUserLoginActionPerformed(evt);
            }
        });
        textCadUserLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textCadUserLoginKeyReleased(evt);
            }
        });

        textCadUserPasswordConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCadUserPasswordConfirmActionPerformed(evt);
            }
        });

        textCod.setEditable(false);
        textCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCodActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Cod:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(textCadUserPasswordConfirm, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(labelCadUserNome, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCadUserNome1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCadUserNome2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textCadUserNome, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textCadUserLogin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(labelCadUserNome3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textCadUserPassword, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textCod, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelCadUserNome))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(textCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textCadUserNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelCadUserNome1)
                .addGap(2, 2, 2)
                .addComponent(textCadUserLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelCadUserNome2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textCadUserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(labelCadUserNome3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textCadUserPasswordConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnUserSalvar.setText("SALVAR");
        btnUserSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserSalvarActionPerformed(evt);
            }
        });

        btnUserAlterar.setText("ALTERAR");
        btnUserAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserAlterarActionPerformed(evt);
            }
        });

        btnUserLimparExcluir.setText("LIMPAR");
        btnUserLimparExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserLimparExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btnUserSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(btnUserAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUserLimparExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnUserAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUserSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUserLimparExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUserSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserSalvarActionPerformed
        // TODO add your handling code here:
        if(textCadUserNome.getText().equals("") || textCadUserLogin.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Nome e Login n??o podem estar em Branco");
          
        }else{
            if(!String.valueOf(textCadUserPassword.getPassword()).equals( String.valueOf(textCadUserPasswordConfirm.getPassword()) )){
                JOptionPane.showMessageDialog(null, "As senhas devem ser iguais");
            }
            else{
                Usuario user = new Usuario();
                UsuariosDAO dao = new UsuariosDAO();
                
                user.setUserName(textCadUserNome.getText());
                user.setUserLogin(textCadUserLogin.getText());
                user.setUserPassword(String.valueOf(textCadUserPassword.getPassword()));
                
                dao.save(user);
                limpar();
            }
        }
        
    }//GEN-LAST:event_btnUserSalvarActionPerformed

    private void btnUserAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserAlterarActionPerformed
        // TODO add your handling code here:
        this.alterar.setSize(610, 334);
        this.alterar.setLocationRelativeTo(this);
        this.alterar.setVisible(true);
        
        
    }//GEN-LAST:event_btnUserAlterarActionPerformed

    private void textCadUserNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCadUserNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCadUserNomeActionPerformed

    private void textCadUserLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCadUserLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCadUserLoginActionPerformed

    private void textCadUserPasswordConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCadUserPasswordConfirmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCadUserPasswordConfirmActionPerformed

    private void textCadUserNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCadUserNomeKeyReleased
        // TODO add your handling code here:
        int pos = textCadUserNome.getCaretPosition();
         textCadUserNome.setText(textCadUserNome.getText().toUpperCase());
         textCadUserNome.setCaretPosition(pos);
    }//GEN-LAST:event_textCadUserNomeKeyReleased

    private void textCadUserLoginKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCadUserLoginKeyReleased
        // TODO add your handling code here:
        int pos = textCadUserLogin.getCaretPosition();
         textCadUserLogin.setText(textCadUserLogin.getText().toUpperCase());
         textCadUserLogin.setCaretPosition(pos);
    }//GEN-LAST:event_textCadUserLoginKeyReleased

    private void btnUserLimparExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserLimparExcluirActionPerformed
        // TODO add your handling code here:
        if(textCod.getText().equals("")){
            limpar();
        }
        else{
            try {
                int r = JOptionPane.showConfirmDialog(null, "Deseja excluir o item de Codigo "+ textCod.getText()+ "?");
                /*
                   0 ==sim
                   1 ==nao
                   2 == cancelar
                */
                if(r ==0){
                    //chamada a fun??ao de excluir
                    Usuario p = new Usuario();
                    UsuariosDAO dao = new UsuariosDAO();
                    p.setIdUser(Integer.parseInt(textCod.getText()));
                    
                    dao.deleteCod(p);
                    limpar();
                    this.btnUserLimparExcluir.setText("LIMPAR");
                }
                if(r ==1){
                    //do nothing
                }
                if(r ==2){
                    this.btnUserLimparExcluir.setText("LIMPAR");
                    limpar();
                }
            } catch (Exception e) {
            }
        }
        
    }//GEN-LAST:event_btnUserLimparExcluirActionPerformed

    private void btnBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaActionPerformed
        // TODO add your handling code here:
        if(textCadProdBusca.getText().equals("")){
            UsuariosDAO DAO = new UsuariosDAO();
            DefaultTableModel model = (DefaultTableModel) tabelaBusca.getModel();
            model.setNumRows(0);
            try {
                for (Usuario u : DAO.getUsuarios()){
                    // adiciona a tabela
                    model.addRow(new Object[]{u.getIdUser(), u.getUserName(), u.getUserLogin()});
                    tabelaBusca.setRowSelectionInterval(0, 0);
                    this.btnSelect.setEnabled(true);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);

            }
        }else{

        }

        jScrollPane1.setViewportView(tabelaBusca);
    }//GEN-LAST:event_btnBuscaActionPerformed

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
        // TODO add your handling code here:
        try {
            Usuario user = new Usuario();
            UsuariosDAO dao = new UsuariosDAO();
            Object obj = this.tabelaBusca.getValueAt(tabelaBusca.getSelectedRow(), 0);
            String id = obj.toString();
            
            user.setIdUser(Integer.parseInt(id));

            for(Usuario u: dao.procuraCod(user)){
                textCod.setText(String.valueOf(user.getIdUser()));
                textCadUserLogin.setText(u.getUserLogin());
                textCadUserNome.setText(u.getUserName());
                textCadUserPassword.setText(u.getUserPassword());
                textCadUserPasswordConfirm.setText(u.getUserPassword());
                

            }
            this.btnUserLimparExcluir.setText("EXCLUIR");
            this.alterar.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e,"erro",0);
        }

    }//GEN-LAST:event_btnSelectActionPerformed

    private void textCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCodActionPerformed

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
            java.util.logging.Logger.getLogger(cadUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame alterar;
    private javax.swing.JButton btnBusca;
    private javax.swing.JButton btnSelect;
    private javax.swing.JButton btnUserAlterar;
    private javax.swing.JButton btnUserLimparExcluir;
    private javax.swing.JButton btnUserSalvar;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCadUserNome;
    private javax.swing.JLabel labelCadUserNome1;
    private javax.swing.JLabel labelCadUserNome2;
    private javax.swing.JLabel labelCadUserNome3;
    private javax.swing.JPanel painelBusca;
    private javax.swing.JTable tabelaBusca;
    private javax.swing.JTextField textCadProdBusca;
    private javax.swing.JTextField textCadUserLogin;
    private javax.swing.JTextField textCadUserNome;
    private javax.swing.JPasswordField textCadUserPassword;
    private javax.swing.JPasswordField textCadUserPasswordConfirm;
    private javax.swing.JTextField textCod;
    // End of variables declaration//GEN-END:variables
    public void limpar(){
        textCadUserLogin.setText("");
        textCadUserNome.setText("");
        textCadUserPassword.setText("");
        textCadUserPasswordConfirm.setText("");
        textCod.setText("");
    }

}
