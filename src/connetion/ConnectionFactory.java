/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connetion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Avell G1511 FIRE V3
 */
public class ConnectionFactory {
    
    
    //AQUI CRIA-SE A CONEXAO COM O BANCO, PRECISA-SE INSERIR O NOME DO BD, BEM COMO SEU USER E PASSWORD LOCAIS
    
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/projetoengsoft";
    private static final String USER = "root";
    private static final String PASS = "data93";
    
    
    public static Connection getConnection(){
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("ERRO NA CONEXÃO",ex);
        }
    }
    
    public static void closeConnection(Connection con){
        if (con!=null){
            try {
                con.close();
            } catch (SQLException ex) {
                System.err.println("Erro: "+ex);
            }
        }
    }
    public static void closeConnection(Connection con,PreparedStatement stmt){
        if (stmt!=null){
            try {
                con.close();
            } catch (SQLException ex) {
                System.err.println("Erro: "+ex);
            }
        }
        
        closeConnection(con);
    }
    public static void closeConnection(Connection con,PreparedStatement stmt, ResultSet rs){
        if (rs!=null){
            try {
                rs.close();
            } catch (SQLException ex) {
                System.err.println("Erro: "+ex);
            }
        }
        
        closeConnection(con,stmt);
    }
    
    
}
