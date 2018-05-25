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
import model.bean.Memoria;

/**
 *
 * @author Avell G1511 FIRE V3
 */
public class MemoriaDAO {
    private Connection con = null;

    public MemoriaDAO() {
        con = ConnectionFactory.getConnection();
    }
    
    public boolean insert(Memoria memoria){
        
        String sql = "insert into memoria (modelo, marca, tipo,frequenciaMemoria,tamanho) values (?,?,?,?,?)";
        
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, memoria.getModelo());
            stmt.setString(2, memoria.getMarca());
            stmt.setString(3, memoria.getTipo());
            stmt.setFloat(4, memoria.getFrequenciaMemoria());
            stmt.setInt(5, memoria.getTamanho());
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

