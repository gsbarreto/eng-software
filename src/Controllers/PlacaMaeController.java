/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import javax.swing.JOptionPane;
import model.bean.PlacaMae;
import model.dao.PlacaMaeDAO;

/**
 *
 * @author gabriel
 */
public class PlacaMaeController {
    public boolean inserir(String modelo,String marca,String nrSlots,String tipo,String consumo,String socket,String limite) throws AlertaException {
                String msg;
                
                if(modelo.isEmpty()||marca.isEmpty()||nrSlots.isEmpty()||tipo.isEmpty()||consumo.isEmpty()||socket.isEmpty()||limite.isEmpty()){
                    msg = "Por favor preencha todos os campos.";
                    alertaBox(msg);
                    throw new AlertaException(msg);
                }
                //Campo Modelo
                if(modelo.length() > 255){
                    msg = "O campo modelo não pode exceder 255 caracteres.";
                    alertaBox(msg);
                    throw new AlertaException(msg);
                }else if(modelo.isEmpty()){
                    msg = "O campo modelo não pode estar vázio.";
                    alertaBox(msg);
                    throw new AlertaException(msg);
                }
                //Campo Marca
                if(marca.length() > 255){
                    msg = "O campo marca não pode exceder 255 caracteres.";
                    alertaBox(msg);
                    throw new AlertaException(msg);
                }else if(marca.isEmpty()){
                    msg = "O campo marca não pode estar vázio.";
                    alertaBox(msg);
                    throw new AlertaException(msg);
                }
                //Campo Nr Slots Placa mae
                if(!nrSlots.matches("[0-9]*")){
                    msg = "O campo numero de slots não pode conter letras.";
                    alertaBox(msg);
                    throw new AlertaException(msg);
                }else if(nrSlots.isEmpty()){
                    msg = "O campo numero de slots não pode estar vázio.";
                    alertaBox(msg);
                    throw new AlertaException(msg);
                }
                //Campo Tipo Memoria
                if(tipo.length() > 255){
                    msg = "O campo tipo de memoria não pode exceder 255 caracteres.";
                    alertaBox(msg);
                    throw new AlertaException(msg);
                }else if(tipo.isEmpty()){
                    msg = "O campo tipo de memoria não pode estar vázio.";
                    alertaBox(msg);
                    throw new AlertaException(msg);
                }
                //Campo Consumo
                if(!consumo.matches("[0-9]*")){
                    msg = "O campo consumo não pode conter letras.";
                    alertaBox(msg);
                    throw new AlertaException(msg);
                }else if(consumo.isEmpty()){
                    msg = "O campo consumo não pode estar vázio.";
                    alertaBox(msg);
                    throw new AlertaException(msg);
                }
                //Campo Tipo Socket
                if(socket.length() > 255){
                    msg = "O campo socket não pode exceder 255 caracteres.";
                    alertaBox(msg);
                    throw new AlertaException(msg);
                }else if(socket.isEmpty()){
                    msg = "O campo socket não pode estar vázio.";
                    alertaBox(msg);
                    throw new AlertaException(msg);
                }
                //Campo Limitacao Memoria
                if(!limite.matches("[0-9]*")){
                    msg = "O campo limite de memoria suporatada não pode conter letras.";
                    alertaBox(msg);
                    throw new AlertaException(msg);
                }else if(limite.isEmpty()){
                    msg = "O campo limite de memoria suporatada não pode estar vázio.";
                    alertaBox(msg);
                    throw new AlertaException(msg);
                }
                            
                PlacaMae motherboard = new PlacaMae();
                PlacaMaeDAO motherboardDAO = new PlacaMaeDAO(); 

                motherboard.setModelo(modelo);
                motherboard.setMarca(marca);
                motherboard.setNrSlot(Integer.parseInt(nrSlots));
                motherboard.setTipoMemoria(tipo);
                motherboard.setConsumoPlacamae(Integer.parseInt(consumo));
                motherboard.setSocket(socket);
                motherboard.setLimitacaoMemoriaPlacaMae(Integer.parseInt(limite));       

                motherboardDAO.save(motherboard);
                alertaBox("Placa mae cadastrada com sucesso.");
                return true;
               
    }
    
    public void alertaBox(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }
}
