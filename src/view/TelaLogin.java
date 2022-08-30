
package view;

import com.sun.glass.events.KeyEvent;
import dao.Conexao;
import dao.FuncionarioDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Funcionario;


public class TelaLogin extends javax.swing.JFrame {
    
    private String usuario;
    private String senha;
    private boolean existe;
    
    public TelaLogin() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnTelaLogin = new javax.swing.JPanel();
        lbLogin = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        lbSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        btEntrar_____ = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela Login");
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnTelaLogin.setBackground(new java.awt.Color(255, 255, 255));
        pnTelaLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbLogin.setText("CPF:");
        pnTelaLogin.add(lbLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 100, 30));

        txtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginActionPerformed(evt);
            }
        });
        pnTelaLogin.add(txtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, 296, 30));

        lbSenha.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbSenha.setText("Senha:");
        pnTelaLogin.add(lbSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, -1, -1));

        txtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSenhaKeyPressed(evt);
            }
        });
        pnTelaLogin.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, 296, 30));

        btEntrar_____.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btEntrar_____.setText("Entrar");
        btEntrar_____.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntrar_____ActionPerformed(evt);
            }
        });
        pnTelaLogin.add(btEntrar_____, new org.netbeans.lib.awtextra.AbsoluteConstraints(667, 425, 130, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LogoSample_ByTailorBrands (2).png"))); // NOI18N
        pnTelaLogin.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 190, 80));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/top-10-manutenção-mais-vendidos.jpg"))); // NOI18N
        pnTelaLogin.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 0, 1290, 890));

        jPanel1.add(pnTelaLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 560));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("LOGIN DO ADIMINISTRADOR:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, 243, 37));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 560));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    
    
    public String CpfFunBt( String cpf){
        cpf = txtLogin.getText(); 
        
        return cpf;
         
         
         
    }
    private void btEntrar_____ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntrar_____ActionPerformed
        usuario = txtLogin.getText();
        senha = new String(txtSenha.getPassword());
        
        if(this.checkLogin(txtLogin.getText(), new String(txtSenha.getPassword()) ) ){
            TelaPrincipalAdm telPrinc = new TelaPrincipalAdm();
            telPrinc.setVisible(true);
            dispose();
            JOptionPane.showMessageDialog(null, "Bem Vindo Administrador!");
            //dispose();
        }
        else{
            Funcionario funcioanrioAutenticar = new Funcionario(txtLogin.getText(), senha);
                
            try {
                Connection conexão = new Conexao().getConnection();
                FuncionarioDAO funconarioDAO = new FuncionarioDAO(conexão);
                
                
                existe = funconarioDAO.autenticarFuncionario(funcioanrioAutenticar);
                if(existe){
                    TelaPriFun telPrincF = new TelaPriFun();
                    telPrincF.setVisible(true);
                    dispose();
                    JOptionPane.showMessageDialog(null, "Bem Vindo Usuario Cpf:  "+ txtLogin.getText());
                }
                else{
                    JOptionPane.showMessageDialog(null, "Usuario e senha invalidos");

                }
             
            } catch (SQLException ex) {
                Logger.getLogger(TelaLogin.class.getName()).log(Level.SEVERE, null, ex);
                 JOptionPane.showMessageDialog(null, "Erro no Banco");
            }
        }

        /**
        *if( txtLogin.getText().equals("usuario10")&& txtSenha.getText().equals("1234")){
            *    TelaPrincipal1 telPrinc = new TelaPrincipal1();
            *    telPrinc.setVisible(true);
            *    JOptionPane.showMessageDialog(null, "Bem Vindo!");
            *    dispose();
            *
            *           // getJanMotComb().setVisible(true);
            *}else{
            *
            *   JOptionPane.showMessageDialog(null, "Acesso negado!");
            *}
        */
    }//GEN-LAST:event_btEntrar_____ActionPerformed

    private void txtSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyPressed
        // TODO add your handling code here:

        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(this.checkLogin(txtLogin.getText(), new String(txtSenha.getPassword()) ) ){
                TelaPrincipalAdm telPrinc = new TelaPrincipalAdm();
                telPrinc.setVisible(true);
                JOptionPane.showMessageDialog(null, "Bem Vindo!");
            }
            else{
                JOptionPane.showMessageDialog(null, "Acesso negado!");

            }

        }
    }//GEN-LAST:event_txtSenhaKeyPressed

    private void txtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginActionPerformed

    }//GEN-LAST:event_txtLoginActionPerformed

    public boolean checkLogin(String login, String senha){
        
        return login.equals("888.888.000-00") && senha.equals("1234");
        
    }
    
   
    
    public static void main(String args[]){
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEntrar_____;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbLogin;
    private javax.swing.JLabel lbSenha;
    private javax.swing.JPanel pnTelaLogin;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
