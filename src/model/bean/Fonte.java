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
public class Fonte {
    private int idFonte;
    private String modelo;
    private String marca;
    private int potencia;
    
    public Fonte(){
        
    }

    public int getIdFonte() {
        return idFonte;
    }

    public void setIdFonte(int idFonte) {
        this.idFonte = idFonte;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getCertificado() {
        return certificado;
    }

    public void setCertificado(String certificado) {
        this.certificado = certificado;
    }
    private String certificado;

    public Fonte(String modelo, String marca, int potencia, String certificado) {
        this.modelo = modelo;
        this.marca = marca;
        this.potencia = potencia;
        this.certificado = certificado;
    }
}
