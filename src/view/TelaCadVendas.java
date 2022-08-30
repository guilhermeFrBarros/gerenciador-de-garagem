
package view;

import dao.Conexao;
import dao.FuncionarioDAO;
import dao.VendasDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import model.Vendas;

/**
 *
 * @author guilherme barros
 */
public class TelaCadVendas extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaCadVendas
     */
    
    
    private boolean existe;
    
    private int nCaract =0;
    public TelaCadVendas() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        txtPlaca = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtDataVenda = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCpfClient = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        btSalvarVenda__ = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtLocal = new javax.swing.JTextField();
        txtCpfFun = new javax.swing.JFormattedTextField();
        txtPreco = new javax.swing.JTextField();

        setClosable(true);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de Vendas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Placa:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Dia da Venda");

        try {
            txtDataVenda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
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

        btSalvarVenda__.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btSalvarVenda__.setText("Salvar");
        btSalvarVenda__.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarVenda__ActionPerformed(evt);
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
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtLocal)
                            .addComponent(txtPlaca)
                            .addComponent(jLabel16)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(txtCpfClient, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtCpfFun, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel17)
                                .addComponent(txtDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(19, 19, 19))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(9, 9, 9)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(btSalvarVenda__, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDataVenda, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(txtPlaca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPreco, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(txtCpfFun))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txtCpfClient, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btSalvarVenda__, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarVenda__ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarVenda__ActionPerformed
        
        
        
       
        
        nCaract = txtCpfFun.getText().replace(" ", "").length();
        if( nCaract == 14){
                
                nCaract = txtCpfClient.getText().replace(" ", "").length();
                if(nCaract == 14 ){
                    
                    nCaract = txtLocal.getText().replace(" ", "").length();
                    
                    if(nCaract > 0){
                        nCaract = txtDataVenda.getText().replace(" ", "").length();
                        if( nCaract >5){
                            
                            nCaract = txtPlaca.getText().replace(" ", "").length();
                            if(nCaract > 5 && nCaract <8){
                                
                                nCaract = txtPreco.getText().replace(" ", "").length();
                                if(( nCaract >2 && nCaract <9)){
                                    
                                    nCaract = 5;
                                    if( nCaract >0 && nCaract <250){
                                        
                                                   
                                            Vendas novoVenda = new Vendas(txtPlaca.getText(),
                                                    txtCpfFun.getText(),
                                                    txtCpfClient.getText(),
                                                    txtLocal.getText(),
                                                    txtDataVenda.getText(),
                                                    Integer.parseInt(txtPreco.getText()),
                                                   " sdassdsad "                                                              
                                            );


                                        try {
                                            Connection conexão = new Conexao().getConnection();
                                            VendasDAO vendasDAO = new VendasDAO(conexão);
                                            
                                            existe = vendasDAO.autenticarCpfFuncionario(novoVenda);
                                            if(existe){
                                                
                                                existe = vendasDAO.autenticarCpfComaprador(novoVenda);
                                                if(existe){
                                                    
                                                    existe = vendasDAO.autenticarCpfPlaca(novoVenda);
                                                    if(existe){
                                                        
                                                        existe = vendasDAO.autenticarValorMinimoDeVenda(novoVenda);
                                                        if(existe){
                                                            
                                                            existe = vendasDAO.autenticarPlacaVenda(novoVenda);
                                                            if(existe){
                                                                JOptionPane.showMessageDialog(null, "Veiculo Cadastro em uma Venda");
                                                            }
                                                            else{
                                                                vendasDAO.insertVenda(novoVenda);
                                                                JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!");
                                                            }
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

                                        } catch (SQLException ex) {
                                            Logger.getLogger(TelaCadVendas.class.getName()).log(Level.SEVERE, null, ex);
                                            JOptionPane.showMessageDialog(null, "Falha no Cadastrado- ERRO BANCO!");
                                        }

                                                            
                                    }
                                    else{
                                        JOptionPane.showMessageDialog(null, "Insira Uma Observação!"); 
                   
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
         
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_btSalvarVenda__ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSalvarVenda__;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JFormattedTextField txtCpfClient;
    private javax.swing.JFormattedTextField txtCpfFun;
    private javax.swing.JFormattedTextField txtDataVenda;
    private javax.swing.JTextField txtLocal;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration//GEN-END:variables
}
