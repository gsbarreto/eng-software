/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connetion.ConnectionFactory;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
    
    public boolean save(Cliente cliente){
        
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
    
    
    
    public Cliente getCliente(String email, String senha){
        String sql = "select * from usuario where email LIKE ? and senha LIKE ?";
        
        PreparedStatement stmt = null;
        try{
            System.out.println(email);
            
            if(email == null || senha == null || email.trim().equals("") || senha.trim().equals("")){
                return null;
            }
            
            stmt = con.prepareStatement(sql);
            stmt.setString(1, "%"+email+"%");
            stmt.setString(2, "%"+senha+"%");
            ResultSet rs = stmt.executeQuery();
            
            if(rs.next()){
                Cliente cli = new Cliente(rs.getString("nome"),rs.getString("email"),rs.getString("senha"));
            
                return cli;
            }else{
                return null;
            }        

        }catch(SQLException ex){
            return null;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<Cliente> getClientes(){
        String sql = "select * from usuario";
        ArrayList<Cliente> lista = new ArrayList<Cliente>();
        PreparedStatement stmt = null;
        try{
            stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            
            while(rs.next()){
                Cliente cli = new Cliente(rs.getString("nome"),rs.getString("email"),rs.getString("senha"));
                lista.add(cli);
            }

            return lista;           
            
            
        }catch(SQLException ex){
            System.out.println("Erro: ");
            return null;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    
     
}
