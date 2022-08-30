
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

import model.Vendas;

/**
 *
 * @author guilherme barros
 */
public class VendasDAO {
    private final Connection connection;

    public VendasDAO(Connection connection) {
        this.connection = connection;
    }
    
    
    public void insertVenda(Vendas venda) throws SQLException{
    
        String sqlInsert = "insert into Vendas (cpfFuncionario, cpfCliente, dataDaVenda,"
                        + " placaCarro, "+ "valorVeiculonavenda, cidade, comissoesFun)"
                        + " values('" 
                        +venda.getCpfFuncionario()+"', '"+venda.getCpfComparador()
                        +"', '"+venda.getDataDaVenda()+"', '"
                        +venda.getPlaca()+"', "+venda.getValorDaVenda()
                        +", '"+venda.getLocal()+"', "+venda.getComissoes()+");";

            PreparedStatement  statement = connection.prepareStatement(sqlInsert);
            statement.execute();
            
            connection.close();
    }

    public boolean autenticarCpfFuncionario(Vendas venda) throws SQLException {
        String sql = "Select * From funcionario where cpf ='"+venda.getCpfFuncionario()+"';";
         
        PreparedStatement  statement = connection.prepareStatement(sql);
        statement.execute();
        
        ResultSet resultSet = statement.getResultSet();
        
        
            return resultSet.next();
               
    }
    public boolean autenticarCpfComaprador(Vendas venda) throws SQLException {
         String sql = "Select * From cliente where cpf ='"+venda.getCpfComparador()+"';";
         
        PreparedStatement  statement = connection.prepareStatement(sql);
        statement.execute();
        
        ResultSet resultSet = statement.getResultSet();
        
        
            return resultSet.next();
               
    }
    
    public boolean autenticarCpfPlaca(Vendas venda) throws SQLException {
         String sql = "Select * From Veiculo where placa ='"+venda.getPlaca()+"';";
         
        PreparedStatement  statement = connection.prepareStatement(sql);
        statement.execute();
        
        ResultSet resultSet = statement.getResultSet();
        
        
            return resultSet.next();
               
    }
    
    public boolean autenticarValorMinimoDeVenda(Vendas venda) throws SQLException {
         String sql = "Select * From veiculo where valorMinimoDeVenda <= "+venda.getValorDaVenda()
                 + "and placa = '"+venda.getPlaca()+"';";
         
        PreparedStatement  statement = connection.prepareStatement(sql);
        statement.execute();
        
        ResultSet resultSet = statement.getResultSet();
        
        
            return resultSet.next();
               
       
    }
    
     public boolean autenticarId(Vendas venda) throws SQLException {
         String sql = "Select * From vendas where id = "+venda.getId()+ ";";
         
        PreparedStatement  statement = connection.prepareStatement(sql);
        statement.execute();
        
        ResultSet resultSet = statement.getResultSet();
        
        
            return resultSet.next();
               
       
    }
    
   
     public boolean autenticarPlacaVenda(Vendas venda) throws SQLException {
         String sql = "Select * From Vendas where placacarro ='"+venda.getPlaca()+"';";
         
        PreparedStatement  statement = connection.prepareStatement(sql);
        statement.execute();
        
        ResultSet resultSet = statement.getResultSet();
        
        
            return resultSet.next();
               
    }
     
public List<Vendas> pesquisaVendas(String caixaPesq, String selecaoPesq ) throws SQLException{
        
        String sql;
        
        
        if( selecaoPesq.equals("Id") ){
            int id = Integer.parseInt(caixaPesq);
            
             sql = "Select * From vendas where id = "
                +id+";";
        }
        else{
        
            sql = "Select * From vendas where "+selecaoPesq+" = "
                    + "'"+caixaPesq+"';";
        }
        
        
        
        List<Vendas> listVendas = new ArrayList<>();
        
        
            PreparedStatement  statement = connection.prepareStatement(sql);
            statement.execute();
            
            
            ResultSet rs = statement.getResultSet();
            
            while(rs.next()){
                Vendas vend= new Vendas();
            
                vend.setId(Integer.parseInt(rs.getString("id")));
                vend.setPlaca(rs.getString("placacarro"));
                vend.setCpfFuncionario(rs.getString("cpffuncionario"));
                vend.setCpfComparador(rs.getString("cpfcliente"));
                vend.setDataDaVenda(rs.getString("datadavenda"));
                vend.setPlaca(rs.getString("placacarro"));
                vend.setLocal(rs.getString("cidade"));
                vend.setValorDaVenda(Integer.parseInt(rs.getString("valorVeiculoNaVenda")));
           
            listVendas.add(vend);
            
        }
        
           
        
        
        return listVendas;
        
    }



public void alteraRegistroVenda( Vendas vd, int id) throws SQLException{
        
       
        
        String sql = "UPDATE" +
                    " vendas" +
                    " SET "
                    + " placacarro = ?,"
                    + " cpffuncionario = ?,"
                    + " cpfcliente = ?,"
                    + " cidade = ?,"
                    + " valorVeiculoNaVenda = ?,"
                    + " dataDaVenda = ?"
                    
                    + "WHERE id = ?;";
            
       
            
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1,vd.getPlaca());
            st.setString(2, vd.getCpfFuncionario());
            st.setString(3, vd.getCpfComparador());
            st.setString(4, vd.getLocal());
            st.setInt(5, vd.getValorDaVenda());
            st.setString(6, vd.getDataDaVenda());

            st.setInt(7, id);
            
            
            st.execute();

            
            
      
        
        
    }


    public void alteraRegistroCl( int id) throws SQLException{
        
         
        
        String sql = "DELETE FROM vendas" +
        " WHERE id = ?; ";
         PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);
            
            st.execute();
        
    }

    
}
