/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import javax.swing.JOptionPane;
import model.bean.Processador;
import model.dao.ProcessadorDAO;

/**
 *
 * @author gabriel
 */
public class ProcessadorController {
    public boolean inserir(String marca,String modelo,String numNucleos,String numThreads,String frequencia,String cache,String socket) throws AlertaException{
                String msg;
                if(marca.isEmpty()||modelo.isEmpty()||numNucleos.isEmpty()||numThreads.isEmpty()||frequencia.isEmpty()||cache.isEmpty()||socket.isEmpty()){
                    msg = "Por favor preencha todos os campos.";
                    alertaBox(msg);
                    throw new AlertaException(msg);
                }
                //Campo Marca
                if(!marca.matches("[0-9]*")){
                    msg = "O campo consumo não pode conter letras.";
                    alertaBox(msg);
                    throw new AlertaException(msg);
                }else if(marca.isEmpty()){
                    msg = "O campo consumo não pode estar vázio.";
                    alertaBox(msg);
                    throw new AlertaException(msg);
                }
                //Campo Nr Nucleos
                if(numNucleos.length() > 255){
                    msg = "O campo socket não pode exceder 255 caracteres.";
                    alertaBox(msg);
                    throw new AlertaException(msg);
                }else if(numNucleos.isEmpty()){
                    msg = "O campo socket não pode estar vázio.";
                    alertaBox(msg);
                    throw new AlertaException(msg);
                }
                //Campo Modelo
                if(!modelo.matches("[0-9]*")){
                    msg = "O campo consumo não pode conter letras.";
                    alertaBox(msg);
                    throw new AlertaException(msg);
                }else if(modelo.isEmpty()){
                    msg = "O campo consumo não pode estar vázio.";
                    alertaBox(msg);
                    throw new AlertaException(msg);
                }
                //Campo Nr Threads
                if(numThreads.length() > 255){
                    msg = "O campo socket não pode exceder 255 caracteres.";
                    alertaBox(msg);
                    throw new AlertaException(msg);
                }else if(numThreads.isEmpty()){
                    msg = "O campo socket não pode estar vázio.";
                    alertaBox(msg);
                    throw new AlertaException(msg);
                }
                //Campo Frequencia
                if(frequencia.length() > 255){
                    msg = "O campo socket não pode exceder 255 caracteres.";
                    alertaBox(msg);
                    throw new AlertaException(msg);
                }else if(frequencia.isEmpty()){
                    msg = "O campo socket não pode estar vázio.";
                    alertaBox(msg);
                    throw new AlertaException(msg);
                }
                //Campo Cache
                if(!cache.matches("[0-9]*")){
                    msg = "O campo consumo não pode conter letras.";
                    alertaBox(msg);
                    throw new AlertaException(msg);
                }else if(cache.isEmpty()){
                    msg = "O campo consumo não pode estar vázio.";
                    alertaBox(msg);
                    throw new AlertaException(msg);
                }
                //Campo Socket
                if(socket.length() > 255){
                    msg = "O campo socket não pode exceder 255 caracteres.";
                    alertaBox(msg);
                    throw new AlertaException(msg);
                }else if(socket.isEmpty()){
                    msg = "O campo socket não pode estar vázio.";
                    alertaBox(msg);
                    throw new AlertaException(msg);
                }
                
                Processador proc = new Processador();
                ProcessadorDAO procDAO = new ProcessadorDAO();
                proc.setMarca(marca);
                proc.setNumNucleos(Integer.parseInt(numNucleos));
                proc.setModelo(modelo);
                proc.setNumThread(Integer.parseInt(numThreads));
                proc.setFrequenciaProcessador(Float.parseFloat(frequencia));
                proc.setCacheProcessador(Integer.parseInt(cache));
                proc.setSocketProcessador(socket);

                procDAO.insert(proc);
                alertaBox("Processador cadastrado com sucesso.");
                
                return true;
    }
    
    public void alertaBox(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }
}
