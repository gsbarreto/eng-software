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
import model.bean.Processador;
/**
 *
 * @author Avell G1511 FIRE V3
 */
public class ProcessadorDAO {
    private Connection con = null;
    
    public ProcessadorDAO(){
        con = ConnectionFactory.getConnection();
    }
    
    public boolean insert(Processador processador){
        String sql = "insert into processador (marca, numNucleos, modelo,nrThread,frequenciaProcessador,cacheProcessador,socketProcessador) values (?,?,?,?,?,?,?)";
        
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, processador.getMarca());
            stmt.setInt(2, processador.getNumNucleos());
            stmt.setString(3, processador.getModelo());
            stmt.setInt(4, processador.getNumThread());
            stmt.setFloat(5, processador.getFrequenciaProcessador());
            stmt.setInt(6, processador.getCacheProcessador());
            stmt.setString(7, processador.getSocketProcessador());
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
    
    
    
    

