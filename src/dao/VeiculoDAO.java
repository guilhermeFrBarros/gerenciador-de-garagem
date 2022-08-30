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

import model.Veiculo;

/**
 *
 * @author guilherme barros
 */
public class VeiculoDAO {
    private final Connection connection;

    public VeiculoDAO(Connection connection) {
        this.connection = connection;
    }

    
public void insertVeculo(Veiculo novoVeiculo) throws SQLException{
    
    
    String sqlInsert = "insert into Veiculo (placa, modelo, marca, ano,"
                        + " valorDaCompraVeiculo, cor, kmsRd,"
                        + " tipoDeVeiculo, valorMinimoDeVenda)"
                        + " values('" 
                        +novoVeiculo.getPlaca()+"', '"+novoVeiculo.getModelo()
                        +"', '"+novoVeiculo.getMarca()+"', " +novoVeiculo.getAno()+", "
                        +novoVeiculo.getPreco()+", '"+novoVeiculo.getCor()
                        +"', "+novoVeiculo.getQuilometragem()+", '"
                        +novoVeiculo.getTipo()+"', "+novoVeiculo.getPrecoMinimoDeVenda()+");";

            PreparedStatement  statement = connection.prepareStatement(sqlInsert);
            statement.execute();
            
            connection.close(); 
            
}
public List<Veiculo> pesquisaVeiculo(String caixaPesq, String selecioPesq ) throws SQLException{
        
        
        
        String sql = "Select * From veiculo where "+selecioPesq+" = "
                + "'"+caixaPesq+"';";
        List<Veiculo> veiculos = new ArrayList<>();
        
         
            PreparedStatement  statement = connection.prepareStatement(sql);
            statement.execute();
            
            
            ResultSet rs = statement.getResultSet();
        
        while(rs.next()){
            Veiculo veic = new Veiculo();
            
            veic.setPlaca(rs.getString("placa"));
            veic.setModelo(rs.getString("modelo"));
            veic.setMarca(rs.getString("marca"));
            veic.setAno(Integer.parseInt(rs.getString("ano")));
            veic.setPreco(Integer.parseInt(rs.getString("valordacompraveiculo")));
            veic.setCor(rs.getString("cor"));
            veic.setQuilometragem(Integer.parseInt(rs.getString("Kmsrd")));
            veic.setTipo("tipodeveiculo");
            veic.setPrecoMinimoDeVenda(Float.parseFloat(rs.getString("valorMinimoDeVenda")));
           
            veiculos.add(veic);
            
        }
        
           
        
        
        return veiculos;
        
    }



public void alteraRegistroCliente( Veiculo vl, String placa) throws SQLException{
        
        //String sexo = String.valueOf(cl.getSexo());
        
        float valorMinini = (float) (vl.getPreco() * 1.2);
        
        String sql = "UPDATE" +
                    " veiculo" +
                    " SET "
                    + " modelo = ?,"
                    + " placa = ?,"
                    + " marca = ?,"
                    + " ano = ?,"
                    + " valorDaCompraVeiculo = ?,"
                    + " Kmsrd = ?, "
                    + " tipodeveiculo =  ?, "
                    + " cor = ?,"
                    + " valorMinimoDeVenda = ?"
                    + "WHERE placa = ?;";
            
       
            
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, vl.getModelo());
            st.setString(2, vl.getPlaca());
            st.setString(3, vl.getMarca());
            st.setInt(4, vl.getAno());
            st.setInt(5, vl.getPreco());
            st.setInt(6, vl.getQuilometragem());
            st.setString(7, vl.getTipo());
            st.setString(8, vl.getCor());
            st.setFloat(9, valorMinini);
            st.setString(10, placa);
            
            st.execute();

            
            
      
        
        
    }


 public void alteraRegistroVeiculo( String placa) throws SQLException{
        
        
        
        String sql = "DELETE FROM veiculo" +
        " WHERE placa = ?; ";
         PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, placa);
            
            st.execute();
        
    }


}

