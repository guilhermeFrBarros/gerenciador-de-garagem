package view;

import dao.Conexao;
import dao.VendasDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Vendas;
import org.postgresql.util.PSQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author guilherme barros
 */
public class TelaPesqVendas extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaPesquisaClient
     */
    private String escolha;
    public TelaPesqVendas() {
        initComponents();
        DefaultTableModel tabela = (DefaultTableModel) tbPesquisa.getModel();
        tbPesquisa.setRowSorter(new TableRowSorter(tabela));
        
        
    }

    private void readJTable(){
        Connection conexão;
        escolha = boxEscolha.getSelectedItem().toString();
        
        DefaultTableModel tabela = (DefaultTableModel) tbPesquisa.getModel();
        
        tabela.setNumRows(0);
        
           
        try {
            conexão = new Conexao().getConnection();
            VendasDAO vendaDAO = new VendasDAO(conexão);
            
            for(Vendas vend: vendaDAO.pesquisaVendas(txtPesquisa1.getText(), escolha)){
               //for( Veiculo vc: veiculoDAO.pesquisaVeiculo(txtNomeClient.getText(), escolha))     
                    tabela.addRow(new Object[]{
                        vend.getId(),
                        vend.getCpfFuncionario(),
                        vend.getCpfComparador(),
                        vend.getPlaca(),
                        vend.getValorDaVenda(),
                        vend.getLocal(),
                        vend.getDataDaVenda()
                        
                         /*   for( Veiculo vc: veiculoDAO.pesquisaVeiculo(txtNomeClient.getText(), escolha)){
                tabela.addRow(new Object[]{
                    vc.getPlaca(),
                    vc.getModelo(),
                    vc.getMarca(),
                    vc.getCor(),
                    vc.getQuilometragem(),
                    vc.getPreco(),
                    vc.getPrecoMinimoDeVenda()
                });
            }*/
                            
                    });
                }
                
            
          
        } catch (PSQLException ERROR2){
            JOptionPane.showMessageDialog(null, "Selecione o id ou marca, etc");
                                            
                                     
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro BANCO Pesq");
            Logger.getLogger(TelaPesqVendas.class.getName()).log(Level.SEVERE, null, ex);
        }
                
                
                
                
           
          
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPainelCadClient = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        txtPesquisa1 = new javax.swing.JTextField();
        boxEscolha = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btPesqVendas_____ = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbPesquisa = new javax.swing.JTable();

        setClosable(true);

        jPainelCadClient.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pagina de Pesquisa Vendas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        boxEscolha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        boxEscolha.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "selecione", "Id", "CPFCliente", "CPFFuncionario", "DataDaVenda" }));
        boxEscolha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxEscolhaActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Pesquisar:");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("Por:");

        btPesqVendas_____.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btPesqVendas_____.setText("Pesquisar");
        btPesqVendas_____.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesqVendas_____ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btPesqVendas_____)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(txtPesquisa1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(boxEscolha, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(51, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPesquisa1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boxEscolha, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(btPesqVendas_____)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        tbPesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "CPF do Funcionario", "CPF do Comprador", "Placa do Carro", "Valor da venda", "Cidade", "Data da Venda"
            }
        ));
        jScrollPane2.setViewportView(tbPesquisa);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPainelCadClientLayout = new javax.swing.GroupLayout(jPainelCadClient);
        jPainelCadClient.setLayout(jPainelCadClientLayout);
        jPainelCadClientLayout.setHorizontalGroup(
            jPainelCadClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPainelCadClientLayout.setVerticalGroup(
            jPainelCadClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPainelCadClientLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(221, 221, 221))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPainelCadClient, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPainelCadClient, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boxEscolhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxEscolhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxEscolhaActionPerformed

    private void btPesqVendas_____ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesqVendas_____ActionPerformed
        
        
        readJTable();
        
        
    }//GEN-LAST:event_btPesqVendas_____ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxEscolha;
    private javax.swing.JButton btPesqVendas_____;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPainelCadClient;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbPesquisa;
    private javax.swing.JTextField txtPesquisa1;
    // End of variables declaration//GEN-END:variables
}
