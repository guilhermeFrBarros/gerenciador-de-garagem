/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author guilherme barros
 */
public class Conexao {
    
    private final String DBNAME = "trabFinalDesktop";
    private final String URL = "jdbc:postgresql://localhost:5432/"+DBNAME;
    private final String LOGIN = "postgres";
    private final String SENHA = "postgre88";
    
    public Connection getConnection() throws SQLException{
        Connection conexao = DriverManager.getConnection(URL, LOGIN, SENHA);
        return conexao;
    }
        
}
