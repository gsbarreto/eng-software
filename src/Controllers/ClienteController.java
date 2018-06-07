/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import javax.swing.JOptionPane;
import model.bean.Cliente;
import model.dao.ClienteDAO;

/**
 *
 * @author gabriel
 */
public class ClienteController {
    public boolean inserir(String nome,String email,String emailConf,String senha, String senhaConf) throws AlertaException{
            String msg;
            if(email.isEmpty()||senha.isEmpty()||nome.isEmpty()||senhaConf.isEmpty()||emailConf.isEmpty()){
                msg = "Campos vázios";
                alertaBox(msg);
                throw new AlertaException(msg);
            }
            
            if(nome.length() > 50){
                msg = "O campo nome não pode exceder 50 caracteres.";
                alertaBox(msg);
                throw new AlertaException(msg);
            }
            if(email.length() > 50){
                msg = "O campo email não pode exceder 50 caracteres.";
                alertaBox(msg);
                throw new AlertaException(msg);
            }
            if(senha.length() > 50){
                msg = "O campo senha não pode exceder 50 caracteres.";
                alertaBox(msg);
                throw new AlertaException(msg);
            }
            
            
            
            String regex = "[A-Za-z0-9\\._-]+@[A-Za-z]+\\.[A-Za-z]+";
            if(email.matches(regex)){            
                //System.err.println("cad");
                if ((email.equals(emailConf))&&(senha.equals(senhaConf))){

                    Cliente c = new Cliente();
                    ClienteDAO cli = new ClienteDAO();            

                    c.setNome(nome);
                    c.setEmail(email);
                    c.setSenha(senha);         

                    cli.save(c);
                    alertaBox("Usuario cadastrado com sucesso.");
                    return true;
                }else{
                    msg = "Email ou Senha não são iguais";
                    alertaBox(msg);
                    throw new AlertaException(msg);
                }            
            }else{
                msg = "Formato do campo email incorreto";
                alertaBox(msg);
                throw new AlertaException(msg);
            }
    }
    
    public void alertaBox(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }
}
