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
import model.bean.Armazenamento;

/**
 *
 * @author Avell G1511 FIRE V3
 */
public class ArmazenamentoDAO {
    private Connection con = null;

    public ArmazenamentoDAO() {
        con = ConnectionFactory.getConnection();
    }
    public boolean insert(Armazenamento armazenamento){
        
        String sql = "insert into Armazenamento (modelo, marca, capacidade,cache,taxaTransferencia) values (?,?,?,?,?)";
        
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, armazenamento.getModelo());
            stmt.setString(2, armazenamento.getMarca());
            stmt.setInt(3, armazenamento.getCapacidade());
            stmt.setInt(4, armazenamento.getCache());
            stmt.setFloat(5, armazenamento.getTaxaTransferencia());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.print("Erro: " + ex);
            return false;            
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
