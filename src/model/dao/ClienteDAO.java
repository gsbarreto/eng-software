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
import java.util.*;
import java.sql.ResultSet;
import model.bean.Cliente;

/**
 *
 * @author Avell G1511 FIRE V3
 */
public class ClienteDAO {
    private Connection con = null;

    public ClienteDAO() {
        con = ConnectionFactory.getConnection();
    }
    
    public boolean add(Cliente cliente){
        
        String sql = "insert into usuario (nome, email, senha) values (?,?,?)";
        
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getEmail());
            stmt.setString(3, cliente.getSenha());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.print("Erro: "+ex);
            return false;            
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public boolean update(Cliente cliente){
        
        String sql = "update usuario set nome=?,senha=? where email=?";
        
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getSenha());
            stmt.setString(3, cliente.getEmail());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.print("Erro: "+ex);
            return false;            
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public boolean delete(Cliente cliente){
        
        String sql = "delete from usuario where email=?";
        
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, cliente.getEmail());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.print("Erro: "+ex);
            return false;            
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<Cliente> getClientes(){
        List<Cliente> lista = new ArrayList<Cliente>();
        ResultSet rs = null;
        String sql = "select * from usuario";
        
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Cliente cliente = new Cliente();
                cliente.setIdCli(Integer.valueOf(rs.getString("idUser")));
                cliente.setEmail(rs.getString("email"));
                cliente.setEmail(rs.getString("senha"));
                cliente.setEmail(rs.getString("nome"));
                lista.add(cliente);
            }
            
            rs.close();
            stmt.close();
            
            return lista;
            
        } catch (SQLException ex) {
            System.err.print("Erro: "+ex);
            //Falta adicionar exception
            return null;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    } 
    
    
    
}
