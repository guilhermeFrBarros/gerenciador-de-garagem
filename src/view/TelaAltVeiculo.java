/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.Conexao;
import dao.VeiculoDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Veiculo;

/**
 *
 * @author guilherme barros
 */
public class TelaAltVeiculo extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaAltVeiculo
     */
    public TelaAltVeiculo() {
        initComponents();
    }

    private void read(){ 
        Connection conexão;
        
        
        try {
            conexão = new Conexao().getConnection();
            VeiculoDAO veiculoDAO = new VeiculoDAO(conexão);
            
            for( Veiculo vc: veiculoDAO.pesquisaVeiculo(txtPesqPl.getText(), "placa")){
                
                 txtModelo.setText(vc.getPlaca());   
                 txtPrecoVeiculo.setText(Integer.toString(vc.getPreco()));   
                 txtMarca2.setText(vc.getMarca());
                 txtCorA.setText(vc.getCor()); 
                 txtAno.setText(Integer.toString(vc.getAno()));
                 txtKm.setText(Integer.toString(vc.getQuilometragem() ));   
                  txtModelo.setText(vc.getModelo());
                  txtPlaca.setText(vc.getPlaca());
                    
              
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não Encontrado!");
            Logger.getLogger(TelaAltVeiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        txtModelo = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtAno = new javax.swing.JTextField();
        txtMarca2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCorA = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtKm = new javax.swing.JTextField();
        txtPrecoVeiculo = new javax.swing.JTextField();
        btSalvarAlt_V = new javax.swing.JButton();
        boxTipo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        txtPesqPl = new javax.swing.JTextField();
        btPesqPl____ = new javax.swing.JButton();

        setClosable(true);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Editar Cadastro de Veiculo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Modelo:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Ano:");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Preço de Compra:");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Marca:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Cor:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Quilometragem:");

        btSalvarAlt_V.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btSalvarAlt_V.setText("Salvar");
        btSalvarAlt_V.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarAlt_VActionPerformed(evt);
            }
        });

        boxTipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        boxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AUTOMOVEL", "MOTO" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Tipo:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Placa:");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisar Placa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        btPesqPl____.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btPesqPl____.setText("Pesquisar");
        btPesqPl____.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesqPl____ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btPesqPl____, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPesqPl, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPesqPl, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btPesqPl____, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btSalvarAlt_V, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCorA)
                            .addComponent(txtModelo, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                            .addComponent(jLabel18)
                            .addComponent(jLabel16)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecoVeiculo)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53))
                            .addComponent(txtPlaca))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtKm, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtAno)
                            .addComponent(txtMarca2)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAno, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel19)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel18)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMarca2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txtCorA, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txtKm, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(boxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSalvarAlt_V, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarAlt_VActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarAlt_VActionPerformed
        
        String tipo;
        tipo = boxTipo.getSelectedItem().toString();
        
        int nCaract;
        
        nCaract = txtPlaca.getText().replace(" ", "").length();
        if( nCaract > 5 && nCaract <8){
                
                nCaract = txtModelo.getText().replace(" ", "").length();
                if(nCaract > 0){
                    
                    nCaract = txtAno.getText().replace(" ", "").length();
                    if(nCaract == 4 && (Integer.parseInt(txtAno.getText()) > 1800) ){
                        
                        nCaract = txtPrecoVeiculo.getText().replace(" ", "").length();
                        if( nCaract >2 && nCaract <9){
                            
                            nCaract = txtCorA.getText().replace(" ", "").length();
                            if( nCaract > 0){
                                
                                nCaract = txtKm.getText().replace(" ", "").length();
                                if(nCaract >0  && nCaract < 6){
                                    
                                    nCaract = tipo.length();
                                    if( nCaract >0){
                                        
                                        
                                            
                                            
                                                               // senha1 = txtSenha1;
                                                                
                                            
                                                Veiculo novoVeiculo = new Veiculo ( txtModelo.getText(),
                                                  Integer.parseInt(txtPrecoVeiculo.getText()),
                                                  Integer.parseInt(txtAno.getText()),
                                                  txtCorA.getText(),
                                                  txtMarca2.getText(),
                                                  Integer.parseInt(txtKm.getText()),
                                                  txtPlaca.getText(),
                                                  tipo
                                                );


                                                try {
                                                    Connection conexão = new Conexao().getConnection();
                                                    VeiculoDAO veiculoDAO = new VeiculoDAO(conexão);
                                                    veiculoDAO.alteraRegistroCliente(novoVeiculo, txtPesqPl.getText());
                                                    JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!");


                                                } catch (SQLException ex) {
                                                    Logger.getLogger(TelaAltVeiculo.class.getName()).log(Level.SEVERE, null, ex);
                                                    JOptionPane.showMessageDialog(null, "Falha no Cadastrado!");
                                                }
                                                            
                                    }    
                                    else{
                                        JOptionPane.showMessageDialog(null, "Insira Uma Cidade Corretamente!"); 
                   
                                    }
                                }
                                else{
                                    JOptionPane.showMessageDialog(null, "Insira uma quantidade e Kms aceitavel!"); 
                                }
                            }
                            else{
                                JOptionPane.showMessageDialog(null, "Insira uma Cor!");
                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Insira o valor da compra corretamente!");
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Insira um Ano valido!"); 
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Insira um modelo corretamente!");
                } 
                
        }else{
           JOptionPane.showMessageDialog(null, "Insira uma placa valida\n Ex: BRA2E19 !"); 
        }
    }//GEN-LAST:event_btSalvarAlt_VActionPerformed

    private void btPesqPl____ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesqPl____ActionPerformed
        
        
        read();
        
        
        
        
    }//GEN-LAST:event_btPesqPl____ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxTipo;
    private javax.swing.JButton btPesqPl____;
    private javax.swing.JButton btSalvarAlt_V;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtCorA;
    private javax.swing.JTextField txtKm;
    private javax.swing.JTextField txtMarca2;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPesqPl;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtPrecoVeiculo;
    // End of variables declaration//GEN-END:variables
}
