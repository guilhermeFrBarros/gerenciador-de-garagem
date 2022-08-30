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
import model.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author guilherme barros
 */
public class ClienteDAO {
    private final Connection connection;

    public ClienteDAO(Connection connection) {
        this.connection = connection;
    }
     
     public void insertCliente(Cliente cliente) throws SQLException{
         
           /*
            String sql = "insert into usuario(nome, email) values (?, ?)";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1,usuario.getNome());
            st.setString(2, usuario.getEmail());
            st.executeUpdate();
            */
            
       
            String sqlInsert = "insert into cliente (cpf, nome, dataDeNacimento, "
                    + " sexo, Bairro, Rua, cep, cidade, numeroCasa,"
                    + " telefone, celular, email, Profissao)"
                    + " values('" 
                        +cliente.getCpf()+"', '"+cliente.getNome()+"', '"
                        +cliente.getDataDeNacimento()+"', '"
                        +cliente.getSexo()+"', '"+cliente.getBairro()
                        +"', '"+cliente.getRua()+"', '"+cliente.getCep()
                        +"', '"+cliente.getCidade()+"', "+cliente.getNumeroCasa()
                        +", '"+cliente.getTelefone()+"', '"+cliente.getCelular()+"', '"
                        +cliente.getEmail()
                        +"', '"+cliente.getProfissao()+"');";

            PreparedStatement  statement = connection.prepareStatement(sqlInsert);
            statement.execute();
            
            connection.close(); 
            
        
           
            
    }
     
     
     
     
     public List<Cliente> pesquisaCliente(String caixaPesq, String selecioPesq ) throws SQLException{
        
        
        
        String sql = "Select * From cliente where "+selecioPesq+" = "
                + "'"+caixaPesq+"';";
        List<Cliente> clientes = new ArrayList<>();
        
        
            PreparedStatement  statement = connection.prepareStatement(sql);
            statement.execute();
            
            
            ResultSet rs = statement.getResultSet();
        
        while(rs.next()){
            Cliente cl = new Cliente("","");
            
            cl.setNome(rs.getString("nome"));
            cl.setCpf(rs.getString("cpf"));
            cl.setDataDeNacimento(rs.getString("dataDeNacimento"));
            cl.setSexo(rs.getString("Sexo").charAt(0));
            cl.setCidade(rs.getString("Cidade"));
            cl.setBairro(rs.getString("Bairro"));
            cl.setRua(rs.getString("Rua"));
            cl.setNumeroCasa(rs.getInt("numeroCasa"));
            cl.setTelefone(rs.getString("Telefone"));
            cl.setCelular(rs.getString("celular"));
            cl.setEmail(rs.getString("email"));
            cl.setCep(rs.getString("cep"));
            cl.setProfissão(rs.getString("profissao"));
            clientes.add(cl);
            
        }
        
        
        return clientes;
     }     
        
     
     
       public void alteraRegistroCliente( Cliente cl, String cpf) throws SQLException{
        
        String sexo = String.valueOf(cl.getSexo());
        
        String sql = "UPDATE" +
                    " Cliente" +
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
                    + " profissao = ?,"
                    + " cpf = ?"
                    + "WHERE cpf = ?;";
            
       
            
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1,cl.getNome());
            st.setString(2, cl.getDataDeNacimento());
            st.setString(3, sexo);
            st.setString(4, cl.getCidade());
            st.setString(5, cl.getBairro());
            st.setString(6, cl.getRua());
            st.setInt(7, cl.getNumeroCasa());
            st.setString(8, cl.getTelefone());
            st.setString(9, cl.getEmail());
            st.setString(10,cl.getCep());
            st.setString(11, cl.getProfissao());
            st.setString(12, cl.getCpf());
            st.setString(13, cpf);
            
            st.execute();

            
            
      
        
        
    }
       
       
    public void alteraRegistroCl( String cpf) throws SQLException{
        
        
        
        String sql = "DELETE FROM Cliente" +
        " WHERE cpf = ?; ";
         PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, cpf);
            
            st.execute();
        
    }
}
