/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import javax.swing.JOptionPane;
import model.bean.Armazenamento;
import model.dao.ArmazenamentoDAO;

/**
 *
 * @author gabriel
 */
public class ArmazenamentoController{
    public boolean inserir(String modelo,String marca,String capacidade,String cache,String taxa) throws AlertaException{
                String msg;
               
                //Campo Modelo
                if(modelo.length() > 255){
                    msg = "O campo modelo não pode exceder 255 caracteres.";
                    throw new AlertaException(msg);
                }else if(modelo.isEmpty()){
                    msg = "O campo modelo não pode estar vázio.";
                    throw new AlertaException(msg);
                }
                //Campo Marca
                if(marca.length() > 255){
                    msg = "O campo marca não pode exceder 255 caracteres.";
                    throw new AlertaException(msg);
                }else if(marca.isEmpty()){
                    msg = "O campo marca não pode estar vázio.";
                    throw new AlertaException(msg);
                }
                //Campo Capacidade
                if(!capacidade.matches("[0-9]*")){
                    msg = "O campo capacidade não pode conter letras.";
                    throw new AlertaException(msg);
                }else if(capacidade.isEmpty()){
                    msg = "O campo capacidade não pode estar vázio.";
                    throw new AlertaException(msg);
                }
                //Campo Cache
                if(!cache.matches("[0-9]*")){
                    msg = "O campo cache não pode conter letras.";
                    throw new AlertaException(msg);
                }else if(cache.isEmpty()){
                    msg = "O campo cache não pode estar vázio.";
                    throw new AlertaException(msg);
                }
                //Campo Taxa de Transferencia
                if(!taxa.matches("[0-9]*")){
                    msg = "O campo taxa de transferencia não pode conter letras.";
                    throw new AlertaException(msg);
                }else if(taxa.isEmpty()){
                    msg = "O campo taxa de transferencia não pode estar vázio.";
                    throw new AlertaException(msg);
                }
                
                Armazenamento hd = new Armazenamento();
                ArmazenamentoDAO hdDAO = new ArmazenamentoDAO(); 

                hd.setModelo(modelo);
                hd.setMarca(marca);
                hd.setCapacidade(Integer.parseInt(capacidade));
                hd.setCache(Integer.parseInt(cache));
                hd.setTaxaTransferencia(Float.parseFloat(taxa));             


                hdDAO.insert(hd);
                return true;
            
    }
}
