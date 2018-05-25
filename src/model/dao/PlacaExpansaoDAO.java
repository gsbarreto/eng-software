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
import model.bean.PlacaExpansao;

/**
 *
 * @author Avell G1511 FIRE V3
 */
public class PlacaExpansaoDAO {
    private Connection con = null;

    public PlacaExpansaoDAO() {
        con = ConnectionFactory.getConnection();
    }
    
    public boolean insert(PlacaExpansao pe){
        
        String sql = "insert into PlacaExpansao (nome, marca, nucleosCUDA,frequenciaCORE,memoria,consumo) values (?,?,?,?,?,?)";
        
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, pe.getNome());
            stmt.setString(2, pe.getMarca());
            stmt.setInt(3, pe.getNucleosCUDA());
            stmt.setFloat(4, pe.getFrequenciaCORE());
            stmt.setInt(5, pe.getMemoria());
            stmt.setInt(6, pe.getConsumo());
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

