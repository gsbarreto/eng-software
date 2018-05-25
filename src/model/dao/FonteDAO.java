/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connetion.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.bean.Fonte;

/**
 *
 * @author Avell G1511 FIRE V3
 */
public class FonteDAO {
     private Connection con = null;

    public FonteDAO() {
        con = ConnectionFactory.getConnection();
    }
    
    public boolean save(Fonte fonte){
        
        String sql = "insert into fonte (modelo, marca, potencia,certificado) values (?,?,?,?)";
        
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, fonte.getModelo());
            stmt.setString(2, fonte.getMarca());
            stmt.setInt(3, fonte.getPotencia());
            stmt.setString(4, fonte.getCertificado());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.print("Erro: "+ex);
            return false;            
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
