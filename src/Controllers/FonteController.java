/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import javax.swing.JOptionPane;
import model.bean.Fonte;
import model.dao.FonteDAO;

/**
 *
 * @author gabriel
 */
public class FonteController {
    public boolean inserir(String modelo,String marca,String potencia,String certificado) throws AlertaException{
            String msg;
            
            if(modelo.isEmpty()||marca.isEmpty()||potencia.isEmpty()||certificado.isEmpty()){
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
            //Campo Potencia
            if(!potencia.matches("[0-9]*")){
                msg = "O campo potencia não pode conter letras.";
                alertaBox(msg);
                throw new AlertaException(msg);
            }else if(potencia.isEmpty()){
                msg = "O campo potencia não pode estar vázio.";
                alertaBox(msg);
                throw new AlertaException(msg);
            }
            //Campo Certificado
            if(certificado.length() > 255){
                msg = "O campo certificado não pode exceder 255 caracteres.";
                alertaBox(msg);
                throw new AlertaException(msg);
            }else if(certificado.isEmpty()){
                msg = "O campo certificado não pode estar vázio.";
                alertaBox(msg);
                throw new AlertaException(msg);
            }
            
            Fonte fonte = new Fonte();
            FonteDAO fonteDAO = new FonteDAO();            
            fonte.setModelo(modelo);            
            fonte.setMarca((marca));            
            fonte.setPotencia(Integer.parseInt(potencia)); 
            fonte.setCertificado(certificado);            
            fonteDAO.save(fonte);
            alertaBox("Fonte cadastrada com sucesso");
            return true;
    }
    
    public void alertaBox(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }
}
