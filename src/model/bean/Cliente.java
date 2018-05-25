/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author Avell G1511 FIRE V3
 */
public class Cliente {
    
    private int idCli;
    private String nome;
    private String email;
    private String senha;
    
    public Cliente(){     
        this.email = "";
        this.nome = "";
        this.senha = "";
    }
    
    public Cliente(String nome, String email, String senha){        
        this.nome=nome;
        this.email=email;
        this.senha=senha;
    }

    public int getIdCli() {
        return idCli;
    }

    public void setIdCli(int idCli) {
        this.idCli = idCli;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
