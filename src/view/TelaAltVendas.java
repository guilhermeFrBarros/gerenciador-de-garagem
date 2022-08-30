/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.Conexao;
import dao.VendasDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Vendas;
import org.postgresql.util.PSQLException;

/**
 *
 * @author guilherme barros
 */
public class TelaAltVendas extends javax.swing.JInternalFrame {

    public TelaAltVendas() {
        initComponents();
    }

        private String escolha;
      private void read(){
        Connection conexão;
        escolha = "Id";
        
        
        
    
        
           
        try {
            conexão = new Conexao().getConnection();
            VendasDAO vendaDAO = new VendasDAO(conexão);
            
            for(Vendas vend: vendaDAO.pesquisaVendas(txtPesq.getText(), escolha)){
               //for( Veiculo vc: veiculoDAO.pesquisaVeiculo(txtNomeClient.getText(), escolha))     
                   
                        
                        txtCpfFun.setText(vend.getCpfFuncionario()); 
                        txtCpfClient.setText(vend.getCpfComparador()); 
                        txtPlaca.setText(vend.getPlaca());  
                        txtValor.setText(Integer.toString(vend.getValorDaVenda())); 
                        txtLocal.setText(vend.getLocal()); 
                        txtData.setText(vend.getDataDaVenda());
                        
                       
                }
                
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro BANCO ");
            Logger.getLogger(TelaAltVendas.class.getName()).log(Level.SEVERE, null, ex);
        }
                
                
                
                
           
          
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        txtPlaca = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtData = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCpfClient = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        btSalvarAlt____ = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtLocal = new javax.swing.JTextField();
        txtCpfFun = new javax.swing.JFormattedTextField();
        txtValor = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        txtPesq = new javax.swing.JTextField();
        btPesq_____ = new javax.swing.JButton();

        setClosable(true);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Editar Cadastro de Vendas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 20))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Placa:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Dia da Venda");

        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Cpf do Funcionario:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Cpf do Comprador:");

        try {
            txtCpfClient.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Valor da Venda do Veiculo:");

        btSalvarAlt____.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btSalvarAlt____.setText("Salvar");
        btSalvarAlt____.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarAlt____ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Local:");

        try {
            txtCpfFun.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtLocal)
                        .addComponent(jLabel16)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(txtCpfClient, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtCpfFun)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(txtData, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                    .addComponent(jLabel17)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(btSalvarAlt____, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtValor))
                .addGap(54, 54, 54))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtCpfFun)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txtCpfClient, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(btSalvarAlt____, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79))))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisar Id", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 20))); // NOI18N

        btPesq_____.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btPesq_____.setText("Pesquisar");
        btPesq_____.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesq_____ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPesq_____, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btPesq_____, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarAlt____ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarAlt____ActionPerformed
        
        String tipo;
        int nCaract;
        
        
        
        nCaract = txtCpfFun.getText().replace(" ", "").length();
        if( nCaract == 14){
                
                nCaract = txtCpfClient.getText().replace(" ", "").length();
                if(nCaract == 14 ){
                    
                    nCaract = txtLocal.getText().replace(" ", "").length();
                    
                    if(nCaract > 0){
                        nCaract = txtData.getText().replace(" ", "").length();
                        if( nCaract >5){
                            
                            nCaract = txtPlaca.getText().replace(" ", "").length();
                            if(nCaract > 5 && nCaract <8){
                                
                                nCaract = txtValor.getText().replace(" ", "").length();
                                if(( nCaract >2 && nCaract <9)){
                                    
                                   
                                        
                                                   
                                            Vendas novoVenda = new Vendas(txtPlaca.getText(),
                                                    txtCpfFun.getText(),
                                                    txtCpfClient.getText(),
                                                    txtLocal.getText(),
                                                    txtData.getText(),
                                                    Integer.parseInt(txtValor.getText())
                                                                                                                    
                                            );


                                        try {
                                            Connection conexão = new Conexao().getConnection();
                                            VendasDAO vendasDAO = new VendasDAO(conexão);
                                            boolean existe;
                                            existe = vendasDAO.autenticarCpfFuncionario(novoVenda);
                                            if(existe){
                                                
                                                existe = vendasDAO.autenticarCpfComaprador(novoVenda);
                                                if(existe){
                                                    
                                                    existe = vendasDAO.autenticarCpfPlaca(novoVenda);
                                                    if(existe){
                                                        
                                                        existe = vendasDAO.autenticarValorMinimoDeVenda(novoVenda);
                                                        if(existe){
                                                            
                                                             vendasDAO.alteraRegistroVenda(novoVenda, Integer.parseInt(txtPesq.getText()));
                                                              JOptionPane.showMessageDialog(null, "Venda alterada com Sucesso!");
                                                        }
                                                        else{
                                                            JOptionPane.showMessageDialog(null, "Valor Da Venda Abaixo do minimo Permitido!");
                                                        }
                                                    }
                                                    else{
                                                        JOptionPane.showMessageDialog(null, "Placa do Veiculo não Cadastrada");
                                                    }
                                                }
                                                else{
                                                    JOptionPane.showMessageDialog(null, "Cpf do Cliente não encontrado");
                                                }
                                            }
                                            else{
                                                JOptionPane.showMessageDialog(null, "Cpf do Funcionario não encontrado");
                                            }
                                        
                                        } catch (PSQLException ERROR){
                                            JOptionPane.showMessageDialog(null, "Falha no Cadastrado- Placa ja Cadastarada em Venda!");
                                            
                                        } catch (SQLException ex) {
                                            Logger.getLogger(TelaCadVendas.class.getName()).log(Level.SEVERE, null, ex);
                                            JOptionPane.showMessageDialog(null, "Falha no Cadastrado- ERRO BANCO!");
                                        }

                                                            
                                    
                                }
                                else{
                                    JOptionPane.showMessageDialog(null, "Insira um Preço Valido!"); 
                                }
                            }
                            else{
                                JOptionPane.showMessageDialog(null, "Insira a Placa Corretamente");
                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Insira a da Data da venda Corretamente!");
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Insira Uma Cidade Corretamente"); 
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Insira um CPF valido do Comprador!");
                } 
                
        }else{
           JOptionPane.showMessageDialog(null, "Insira um CPF valido do Vendedor!"); 
        }
         
        
        
        
        
    }//GEN-LAST:event_btSalvarAlt____ActionPerformed

    private void btPesq_____ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesq_____ActionPerformed
        
        read();
    }//GEN-LAST:event_btPesq_____ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btPesq_____;
    private javax.swing.JButton btSalvarAlt____;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JFormattedTextField txtCpfClient;
    private javax.swing.JFormattedTextField txtCpfFun;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtLocal;
    private javax.swing.JTextField txtPesq;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
