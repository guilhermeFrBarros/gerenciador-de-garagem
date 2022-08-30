/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Funcionario;
import model.Vendas;

/**
 *
 * @author guilherme barros
 */
public class FuncionarioDAO {
    private final Connection connection;

    public FuncionarioDAO(Connection connection) {
        this.connection = connection;
    }

    
    
    public void insertFuncionario(Funcionario funcionario) throws SQLException{
         
           /*
            String sql = "insert into usuario(nome, email) values (?, ?)";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1,usuario.getNome());
            st.setString(2, usuario.getEmail());
            st.executeUpdate();
            */
            
       
            String sql = "insert into funcionario (cpf, nome, dataDeNacimento, "
                    + " sexo, Bairro, Rua, cep, cidade, numeroCasa,"
                    + " telefone, celular, email, funcao, senha )"
                    + " values('" 
                        +funcionario.getCpf()+"', '"+funcionario.getNome()+"', '"
                        +funcionario.getDataDeNacimento()+"', '"
                        +funcionario.getSexo()+"', '"+funcionario.getBairro()
                        +"', '"+funcionario.getRua()+"', '"+funcionario.getCep()
                        +"', '"+funcionario.getCidade()+"', "+funcionario.getNumeroCasa()
                        +", '"+funcionario.getTelefone()+"', '"+funcionario.getCelular()+"', '"
                        +funcionario.getEmail()
                        +"', '"+funcionario.getFuncao()+"', "
                        +"MD5('"+funcionario.getSenha()+"')"+");";

            PreparedStatement  statement = connection.prepareStatement(sql);
            statement.execute();
            
            connection.close(); // testar sem isso depois
            
        
           
            
    }

    public boolean autenticarFuncionario(Funcionario funcioanrio) throws SQLException {
         String sql = "Select * From funcionario where cpf ='"+funcioanrio.getCpf()+"' and"
         + " senha = md5('"+funcioanrio.getSenha()+"');";
         
        PreparedStatement  statement = connection.prepareStatement(sql);
        statement.execute();
        
        ResultSet resultSet = statement.getResultSet();
        
        
            return resultSet.next();
               
       
    }
    
    
    public List<Funcionario> pesquisaFunciaonario(String caixaPesq, String selecioPesq ) throws SQLException{
        
        
        
        String sql = "Select * From funcionario where "+selecioPesq+" = "
                + "'"+caixaPesq+"';";
        List<Funcionario> funcionarios = new ArrayList<>();
        
        
            PreparedStatement  statement = connection.prepareStatement(sql);
            statement.execute();
            
            
            ResultSet rs = statement.getResultSet();
        
        while(rs.next()){
            Funcionario fc = new Funcionario("", "");
            
            fc.setNome(rs.getString("nome"));
            fc.setCpf(rs.getString("cpf"));
            fc.setDataDeNacimento(rs.getString("dataDeNacimento"));
            fc.setSexo(rs.getString("Sexo").charAt(0));
            fc.setCidade(rs.getString("Cidade"));
            fc.setBairro(rs.getString("Bairro"));
            fc.setRua(rs.getString("Rua"));
            fc.setNumeroCasa(rs.getInt("numeroCasa"));
            fc.setTelefone(rs.getString("Telefone"));
            fc.setCelular(rs.getString("celular"));
            fc.setEmail(rs.getString("email"));
            fc.setCep(rs.getString("cep"));
            fc.setFuncao(rs.getString("funcao"));
            
            funcionarios.add(fc);
            
        }
        
           
        
        
        return funcionarios;
        
    }
    
    
     public List<Vendas> pesquisaComissoes(String caixaPesq) throws SQLException{
        
        
        
        String sql = "Select nome, cpffuncionario, datadavenda, comissoesfun "
                + "  From vendas,funcionario where cpffuncionario = cpf and"
                + " cpffuncionario = '"+caixaPesq+"';";
        List<Vendas> vendas = new ArrayList<>();
        
        
            PreparedStatement  statement = connection.prepareStatement(sql);
            statement.execute();
            
            
            ResultSet rs = statement.getResultSet();
        
        while(rs.next()){
            Vendas vd = new Vendas();
            
            vd.setNomeVendedor(rs.getString("nome"));
            vd.setCpfFuncionario(rs.getString("cpffuncionario"));
            vd.setDataDaVenda(rs.getString("datadavenda"));
            vd.setComissoes(rs.getFloat("comissoesfun"));
            
            
            vendas.add(vd);
            
        }
        
           
        
        
        return vendas;
        
    }
    
    
    public void alteraRegistroFun( Funcionario fun, String cpf) throws SQLException{
        
        String sexo = String.valueOf(fun.getSexo());
        
        String sql = "UPDATE" +
                    " funcionario" +
                    " SET "
                    + " nome = ?,"
                    + " dataDeNacimento = ?,"
                    + " Sexo = ?,"
                    + " cidade = ?,"
                    + " Bairro = ?,"
                    + " rua = ?, "
                    + " numeroCasa =  ?, "
                    + " Telefone = ?,"
                    + " email = ?,"
                    + " cep = ?,"
                    + " funcao = ?,"
                    + " senha = MD5(?),"
                    + " cpf = ?"
                    + "WHERE cpf = ?;";
            
       
            
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1,fun.getNome());
            st.setString(2, fun.getDataDeNacimento());
            st.setString(3, sexo);
            st.setString(4, fun.getCidade());
            st.setString(5, fun.getBairro());
            st.setString(6, fun.getRua());
            st.setInt(7, fun.getNumeroCasa());
            st.setString(8, fun.getTelefone());
            st.setString(9, fun.getEmail());
            st.setString(10,fun.getCep());
            st.setString(11, fun.getFuncao());
            st.setString(12, fun.getSenha());
            st.setString(13, fun.getCpf());
            st.setString(14, cpf);
            
            st.execute();

            
          
    }
    
    public void alteraRegistroFun( String cpf) throws SQLException{
        
        
        
        String sql = "DELETE FROM funcionario" +
        " WHERE cpf = ?; ";
         PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, cpf);
            
            st.execute();
        
    }
    
    
 
    
}   

