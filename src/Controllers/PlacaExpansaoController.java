/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import javax.swing.JOptionPane;
import model.bean.PlacaExpansao;
import model.dao.PlacaExpansaoDAO;

/**
 *
 * @author gabriel
 */
public class PlacaExpansaoController {
    public boolean inserir(String nome,String marca,String cuda,String frequencia,String memoria,String consumo) throws AlertaException{
        String msg;

        //Campo Nome
        if(nome.length() > 255){
            msg = "O campo nome não pode exceder 255 caracteres.";
            throw new AlertaException(msg);
        }else if(nome.isEmpty()){
            msg = "O campo nome não pode estar vázio.";
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
        //Campo CUDA
        if(!cuda.matches("[0-9]*")){
            msg = "O campo nucleo cuda não pode conter letras.";
            throw new AlertaException(msg);
        }else if(cuda.isEmpty()){
            msg = "O campo nucleo cuda não pode estar vázio.";
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
        //Campo Memoria
        if(!memoria.matches("[0-9]*")){
            msg = "O campo memoria não pode conter letras.";
            throw new AlertaException(msg);
        }else if(memoria.isEmpty()){
            msg = "O campo memoria não pode estar vázio.";
            throw new AlertaException(msg);
        }
        //Campo Consumo
        if(!consumo.matches("[0-9]*")){
            msg = "O campo consumo não pode conter letras.";
            throw new AlertaException(msg);
        }else if(consumo.isEmpty()){
            msg = "O campo consumo não pode estar vázio.";
            throw new AlertaException(msg);
        }

        PlacaExpansao pe = new PlacaExpansao();
        PlacaExpansaoDAO peDAO = new PlacaExpansaoDAO(); 

        pe.setNome(nome);
        pe.setMarca(marca);
        pe.setNucleosCUDA(Integer.parseInt(cuda));
        pe.setFrequenciaCORE(Float.parseFloat(frequencia));
        pe.setMemoria(Integer.parseInt(memoria));
        pe.setConsumo(Integer.parseInt(consumo));

        peDAO.insert(pe);
        return true;
    }
}
