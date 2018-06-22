/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import javax.swing.JOptionPane;
import model.bean.Memoria;
import model.dao.MemoriaDAO;

/**
 *
 * @author gabriel
 */
public class MemoriaController {
    public boolean inserir(String modelo, String marca, String tipo, String frequencia,String tamanho) throws AlertaException {
        String msg;
        /*
        if(modelo.isEmpty()||marca.isEmpty()||tipo.isEmpty()||frequencia.isEmpty()||tamanho.isEmpty()){
            msg = "Por favor preencha todos os campos.";
            alertaBox(msg);
            throw new AlertaException(msg);
        }*/
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
        //Campo tipo
        if(tipo.length() > 255){
            msg = "O campo tipo não pode exceder 255 caracteres.";
            throw new AlertaException(msg);
        }else if(tipo.isEmpty()){
            msg = "O campo tipo não pode estar vázio.";
            throw new AlertaException(msg);
        }
        //Campo Frequencia
        if(!frequencia.matches("[0-9]*")){
            msg = "O campo frequencia não pode conter letras.";
            throw new AlertaException(msg);
        }else if(frequencia.isEmpty()){
            msg = "O campo frequencia não pode estar vázio.";
            throw new AlertaException(msg);
        }
        //Campo Tamanho
        if(!tamanho.matches("[0-9]*")){
            msg = "O campo tamanho não pode conter letras.";
            throw new AlertaException(msg);
        }else if(tamanho.isEmpty()){
            msg = "O campo tamanho não pode estar vázio.";
            throw new AlertaException(msg);
        }         
        Memoria ram = new Memoria();
        MemoriaDAO ramDAO = new MemoriaDAO(); 

        ram.setModelo(modelo);
        ram.setMarca(marca);
        ram.setTipo(tipo);
        ram.setFrequenciaMemoria(Float.parseFloat(frequencia));
        ram.setTamanho(Integer.parseInt(tamanho));

        ramDAO.insert(ram);
        return true;
    }
}
