/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import DAO.FornecedoresDAO;
import DAO.ProdutosDAO;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import object.Fornecedor;
import object.Produto;

/**
 *
 * @author ACER
 */
public class cadProd extends javax.swing.JFrame {

    /**
     * Creates new form cadProd
     */
    public cadProd() {
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
        jLabel1 = new javax.swing.JLabel();
        textProdNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textProdValidade = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        textProdDesc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textProdNomeForne = new javax.swing.JTextField();
        textProdNumForne = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textQnt = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        textTotal = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        textValUni = new javax.swing.JTextField();
        textCod = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnProdSalvar = new javax.swing.JButton();
        btnProdAlterar = new javax.swing.JButton();
        btnProdLimparExcluir = new javax.swing.JButton();

        alterar.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        alterar.setResizable(false);

        painelBusca.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Digite nome ou n??mero do Produto: (em branco para todos)");

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
                "Cod", "Nome", "Validade", "Cod Forne", "Qnt", "Val Uni", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
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
                    .addComponent(jScrollPane1)
                    .addGroup(painelBuscaLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(painelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(painelBuscaLayout.createSequentialGroup()
                                .addComponent(textCadProdBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBusca)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBuscaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(189, 189, 189))
        );
        painelBuscaLayout.setVerticalGroup(
            painelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBuscaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(3, 3, 3)
                .addGroup(painelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBusca)
                    .addComponent(textCadProdBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de Produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Nome:");

        textProdNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textProdNomeActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Validade:");

        try {
            textProdValidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textProdValidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textProdValidadeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Descri????o:");

        textProdDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textProdDescActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Fornecedor:");

        textProdNomeForne.setEditable(false);
        textProdNomeForne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textProdNomeForneActionPerformed(evt);
            }
        });

        textProdNumForne.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        textProdNumForne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textProdNumForneActionPerformed(evt);
            }
        });
        textProdNumForne.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textProdNumForneKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Valor uni.");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Quantidade:");

        textQnt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        textQnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textQntActionPerformed(evt);
            }
        });
        textQnt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textQntKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Total:");

        textTotal.setEditable(false);
        textTotal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0"))));
        textTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTotalActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("R$:");

        textValUni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textValUniActionPerformed(evt);
            }
        });
        textValUni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textValUniKeyReleased(evt);
            }
        });

        textCod.setEditable(false);
        textCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCodActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Cod:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(textProdNome, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textProdValidade, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textProdDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(textProdNumForne, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textProdNomeForne))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(textValUni, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textQnt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(textCod, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(383, 383, 383)
                            .addComponent(jLabel2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(textCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textProdNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textProdValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textProdDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textProdNomeForne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textProdNumForne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textQnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(textValUni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnProdSalvar.setText("SALVAR");
        btnProdSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdSalvarActionPerformed(evt);
            }
        });

        btnProdAlterar.setText("ALTERAR");
        btnProdAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdAlterarActionPerformed(evt);
            }
        });

        btnProdLimparExcluir.setText("LIMPAR");
        btnProdLimparExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdLimparExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btnProdSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(btnProdAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnProdLimparExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnProdAlterar, btnProdLimparExcluir, btnProdSalvar});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnProdAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProdSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProdLimparExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnProdAlterar, btnProdLimparExcluir, btnProdSalvar});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textProdNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textProdNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textProdNomeActionPerformed

    private void textProdValidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textProdValidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textProdValidadeActionPerformed

    private void textProdDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textProdDescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textProdDescActionPerformed

    private void textProdNomeForneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textProdNomeForneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textProdNomeForneActionPerformed

    private void textProdNumForneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textProdNumForneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textProdNumForneActionPerformed

    private void textQntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textQntActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textQntActionPerformed

    private void textTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTotalActionPerformed

    private void btnProdAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdAlterarActionPerformed
        // TODO add your handling code here:
        this.alterar.setSize(650, 340);
        this.alterar.setLocationRelativeTo(this);
        this.alterar.setVisible(true);
        
    }//GEN-LAST:event_btnProdAlterarActionPerformed

    private void textQntKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textQntKeyReleased
        // TODO add your handling code here:
        double val;
        val = Double.parseDouble(textValUni.getText())*Integer.parseInt(textQnt.getText());
        textTotal.setText(String.format("%s",val));
    }//GEN-LAST:event_textQntKeyReleased

    private void textProdNumForneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textProdNumForneKeyReleased
        // busca no banco o fornecedor de acordo com o codgo:
            try {
                Fornecedor forne = new Fornecedor();
                forne.setIdForne(Integer.parseInt(textProdNumForne.getText()));
                
                FornecedoresDAO dao =new FornecedoresDAO();
                for(Fornecedor f : dao.procuraCod(forne) ){
                   textProdNomeForne.setText(f.getNomeForne()); 
                }
                
                
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Valor indicado deve ser um N??mero Inteir!", "Aviso", JOptionPane.WARNING_MESSAGE);
            }
        
    }//GEN-LAST:event_textProdNumForneKeyReleased

    private void btnProdSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdSalvarActionPerformed
        // TODO add your handling code here:
        if(textProdNome.getText().equals("")||textProdNumForne.equals("") || textValUni.equals("") || textQnt.equals("")){
            JOptionPane.showMessageDialog(null, "Campos obrigatorios em Branco");
           
        }
        else{
            if(textCod.getText().equals("")){
                try {
                // falta ajeitar a data ;
                
                SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
                Produto p = new Produto();
                p.setNome(textProdNome.getText());
                p.setDesc(textProdDesc.getText());
                p.setQnt(Integer.parseInt(textQnt.getText()));
                p.setValUni(Double.parseDouble(textValUni.getText()));
                p.setValTotal(p.getQnt()*p.getValUni());
                p.setCodFor(Integer.parseInt(textProdNumForne.getText()));
               
                p.setValidade(textProdValidade.getText());
                
                ProdutosDAO dao = new ProdutosDAO();
                dao.save(p);
                limpar();
               
                
                
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "existem campos preenchidos incorretamente", "Aviso", JOptionPane.WARNING_MESSAGE);
                }
            }
            else{
                int r = JOptionPane.showConfirmDialog(null,"Deseja Realizar as altera????es no cadastro?");
                //0 = sim
                //1 = n??o
                //2 = cancelar
                if(r == 0 ){
                    try {
                        Produto p = new Produto();
                        ProdutosDAO dao =new ProdutosDAO();

                        p.setCod(Integer.parseInt(textCod.getText()));
                        p.setNome(textProdNome.getText());
                        p.setDesc(textProdDesc.getText());
                        p.setQnt(Integer.parseInt(textQnt.getText()));
                        p.setValUni(Double.parseDouble(textValUni.getText()));
                        p.setValTotal(p.getQnt()*p.getValUni());
                    
                        p.setCodFor(Integer.parseInt(textProdNumForne.getText()));
                        p.setValidade(textProdValidade.getText());
                   
                        dao.update(p);
                   
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "erro java " +e);
                    }
                }
                if(r == 1){
                    //do nothing
                }
                if(r ==2){
                    limpar();
                }
            }
        }
    }//GEN-LAST:event_btnProdSalvarActionPerformed

    private void textValUniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textValUniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textValUniActionPerformed

    private void textValUniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textValUniKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_textValUniKeyReleased

    private void btnProdLimparExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdLimparExcluirActionPerformed
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
                    Produto p = new Produto();
                    ProdutosDAO dao = new ProdutosDAO();
                    p.setCod(Integer.parseInt(textCod.getText()));
                    
                    dao.deleteCod(p);
                    limpar();
                    this.btnProdLimparExcluir.setText("LIMPAR");
                }
                if(r ==1){
                    //do nothing
                }
                if(r ==2){
                    this.btnProdLimparExcluir.setText("LIMPAR");
                    limpar();
                }
            } catch (Exception e) {
            }
        }
       
    }//GEN-LAST:event_btnProdLimparExcluirActionPerformed

    private void btnBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaActionPerformed
        // TODO add your handling code here:
        if(textCadProdBusca.getText().equals("")){
            ProdutosDAO DAO = new ProdutosDAO();
            DefaultTableModel model = (DefaultTableModel) tabelaBusca.getModel();
            model.setNumRows(0);
            try {
                for (Produto p : DAO.getProdutos()){
                    // adiciona a tabela
                    model.addRow(new Object[]{p.getCod(),p.getNome(),p.getValidade(),p.getCodFor(),p.getQnt(),p.getValUni(),p.getValTotal()});
                    tabelaBusca.setRowSelectionInterval(0, 0);
                    this.btnSelect.setEnabled(true);
                }
            } catch (SQLException ex) {
                
            }
        }else{
            
        }
        
jScrollPane1.setViewportView(tabelaBusca);
    }//GEN-LAST:event_btnBuscaActionPerformed

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
        // TODO add your handling code here:
        try {
            Produto prod = new Produto();
            ProdutosDAO dao = new ProdutosDAO();
            
            Object obj = this.tabelaBusca.getValueAt(tabelaBusca.getSelectedRow(), 0);
            String id = obj.toString();
            
            prod.setCod(Integer.parseInt(id));
            
            for(Produto p: dao.procuraCod(prod)){
                
                textProdDesc.setText(p.getDesc());
                textProdNome.setText(p.getNome());
                //textProdNomeForne.setText();
                textProdNumForne.setText(String.valueOf(p.getCodFor()));
                textProdValidade.setText(p.getValidade());
                textQnt.setText(String.valueOf(p.getQnt()));
                textTotal.setText(String.valueOf(p.getValTotal()));
                textValUni.setText(String.valueOf(p.getValUni()));
                textCod.setText(String.valueOf(p.getCod()));
                
                
                
            }
            this.btnProdLimparExcluir.setText("EXCLUIR");
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
            java.util.logging.Logger.getLogger(cadProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadProd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame alterar;
    private javax.swing.JButton btnBusca;
    private javax.swing.JButton btnProdAlterar;
    private javax.swing.JButton btnProdLimparExcluir;
    private javax.swing.JButton btnProdSalvar;
    private javax.swing.JButton btnSelect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel painelBusca;
    private javax.swing.JTable tabelaBusca;
    private javax.swing.JTextField textCadProdBusca;
    private javax.swing.JTextField textCod;
    private javax.swing.JTextField textProdDesc;
    private javax.swing.JTextField textProdNome;
    private javax.swing.JTextField textProdNomeForne;
    private javax.swing.JFormattedTextField textProdNumForne;
    private javax.swing.JFormattedTextField textProdValidade;
    private javax.swing.JFormattedTextField textQnt;
    private javax.swing.JFormattedTextField textTotal;
    private javax.swing.JTextField textValUni;
    // End of variables declaration//GEN-END:variables
    public void limpar(){
        textProdDesc.setText("");
        textProdNome.setText("");
        textProdNomeForne.setText("");
        textProdNumForne.setText("");
        textProdValidade.setText("");
        textQnt.setText("");
        textTotal.setText("");
        textValUni.setText("");
        textCod.setText("");
        
        
    }

}
