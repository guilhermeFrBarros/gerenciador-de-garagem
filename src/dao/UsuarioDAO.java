/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Pessoa;


/**
 *
 * @author guilherme barros
 */
public class UsuarioDAO {
    private final Connection connection;

    public UsuarioDAO(Connection connection) {
        this.connection = connection;
    }
    
   public void insert(Pessoa usuario) throws SQLException{
      
            
           
            
           /*
            String sql = "insert into usuario(nome, email) values (?, ?)";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1,usuario.getNome());
            st.setString(2, usuario.getEmail());
            st.executeUpdate();
            */
            String sql = "insert into usuario (codigo, nome, email) values('" 
                        +usuario.getCpf()+"', '"+usuario.getNome()+"', '"
                        +usuario.getEmail()+"');";

            PreparedStatement  statement = connection.prepareStatement(sql);
            statement.execute();
           
            connection.close(); 
       
    }
   
}  
