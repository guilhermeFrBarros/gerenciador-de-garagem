
package view;

import dao.Conexao;
import dao.FuncionarioDAO;
import dao.VeiculoDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Funcionario;
import model.Veiculo;

/**
 *
 * @author guilherme barros
 */
public class TelaCadVeiculo extends javax.swing.JInternalFrame {

    private String tipo = "";
    private int nCaract =0;
    
    public TelaCadVeiculo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        txtModelo = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtKms = new javax.swing.JTextField();
        txtPreco = new javax.swing.JTextField();
        btSalvarVeiculo_____ = new javax.swing.JButton();
        boxTipo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        txtAno = new javax.swing.JFormattedTextField();

        setClosable(true);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de Veiculo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Modelo:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Ano:");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Pre??o de Compra:");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Marca:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Cor:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Quilometragem:");

        btSalvarVeiculo_____.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btSalvarVeiculo_____.setText("Salvar");
        btSalvarVeiculo_____.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarVeiculo_____ActionPerformed(evt);
            }
        });

        boxTipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        boxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AUTOMOVEL", "MOTO" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Tipo:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Placa:");

        try {
            txtAno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
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
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCor)
                                .addComponent(txtModelo, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                                .addComponent(jLabel18)
                                .addComponent(jLabel16)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPreco)
                                .addComponent(txtPlaca))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtKms, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtMarca)
                            .addComponent(txtAno)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 60, Short.MAX_VALUE))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btSalvarVeiculo_____, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtModelo, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                            .addComponent(txtAno))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtKms, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(boxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btSalvarVeiculo_____, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarVeiculo_____ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarVeiculo_____ActionPerformed
        tipo = boxTipo.getSelectedItem().toString();
        
        
        
        nCaract = txtPlaca.getText().replace(" ", "").length();
        if( nCaract > 5 && nCaract <8){
                
                nCaract = txtModelo.getText().replace(" ", "").length();
                if(nCaract > 0){
                    
                    nCaract = txtAno.getText().replace(" ", "").length();
                    if(nCaract == 4 && (Integer.parseInt(txtAno.getText()) > 1800) ){
                        
                        nCaract = txtPreco.getText().replace(" ", "").length();
                        if( nCaract >2 && nCaract <9){
                            
                            nCaract = txtCor.getText().replace(" ", "").length();
                            if( nCaract > 0){
                                
                                nCaract = txtKms.getText().replace(" ", "").length();
                                if(nCaract >0  && nCaract < 6){
                                    
                                    nCaract = tipo.length();
                                    if( nCaract >0){
                                        
                                        
                                            
                                            
                                                               // senha1 = txtSenha1;
                                                                
                                            
                                                Veiculo novoVeiculo = new Veiculo ( txtModelo.getText(),
                                                  Integer.parseInt(txtPreco.getText()),
                                                  Integer.parseInt(txtAno.getText()),
                                                  txtCor.getText(),
                                                  txtMarca.getText(),
                                                  Integer.parseInt(txtKms.getText()),
                                                  txtPlaca.getText(),
                                                  tipo
                                                );


                                                try {
                                                    Connection conex??o = new Conexao().getConnection();
                                                    VeiculoDAO veiculoDAO = new VeiculoDAO(conex??o);
                                                    veiculoDAO.insertVeculo(novoVeiculo);
                                                    JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!");


                                                } catch (SQLException ex) {
                                                    Logger.getLogger(TelaCadVeiculo.class.getName()).log(Level.SEVERE, null, ex);
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
        
        
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_btSalvarVeiculo_____ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxTipo;
    private javax.swing.JButton btSalvarVeiculo_____;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JFormattedTextField txtAno;
    private javax.swing.JTextField txtCor;
    private javax.swing.JTextField txtKms;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration//GEN-END:variables
}
