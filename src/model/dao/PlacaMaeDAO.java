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
import model.bean.PlacaMae;

/**
 *
 * @author Avell G1511 FIRE V3
 */
public class PlacaMaeDAO {
    private Connection con = null;

    public PlacaMaeDAO() {
        con = ConnectionFactory.getConnection();
    }
    
    public boolean save(PlacaMae placamae){
        
        String sql = "insert into PlacaMae (modelo, marca, nrSlot,tipoMemoria,consumoPlacamae,socket,limitacaoMemoria) values (?,?,?,?,?,?,?)";
        
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, placamae.getModelo());
            stmt.setString(2,placamae.getMarca());
            stmt.setInt(3,placamae.getNrSlot());
            stmt.setString(4,placamae.getTipoMemoria());
            stmt.setInt(5,placamae.getConsumoPlacamae());
            stmt.setString(6,placamae.getSocket());
            stmt.setInt(7,placamae.getLimitacaoMemoriaPlacaMae());

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

