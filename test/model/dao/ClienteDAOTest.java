/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import model.bean.Cliente;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Avell G1511 FIRE V3
 */
public class ClienteDAOTest {
    
    public ClienteDAOTest() {
    }

    @Test
    public void insertMethod() {
        Cliente cli = new Cliente("Luca","12331@21321.com","senha123");
        ClienteDAO dao = new ClienteDAO();
        
        if (dao.save(cli)){
            System.out.println("Objeto salvo com sucesso!");
        }else{
            fail("Erro ao salvar");
        }
        
    }
    
    //TESTE PARA FALHO PARA PASSAGENS DE PARAMETROS INVALIDOS
    /*@Ignore
    @Test
    public void insertMethodFail() {
        Cliente cli = new Cliente("Luca",123,"senha123");
        ClienteDAO dao = new ClienteDAO();
        
        if (dao.save(cli)){
            System.out.println("Objeto salvo com sucesso!");
        }else{
            fail("Erro ao salvar");
        }
        
    }*/
    
}
