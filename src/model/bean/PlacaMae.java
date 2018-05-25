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
public class PlacaMae {
    private int idPlacaMae;
    private String modelo;
    private String marca;
    private int nrSlot;
    private String tipoMemoria;
    private int consumoPlacamae;
    private String socket;
    
    public PlacaMae(){
        
    }

    public PlacaMae(String modelo, String marca, int nrSlot, String tipoMemoria, int consumoPlacamae, String socket, int limitacaoMemoriaPlacaMae) {
        this.modelo = modelo;
        this.marca = marca;
        this.nrSlot = nrSlot;
        this.tipoMemoria = tipoMemoria;
        this.consumoPlacamae = consumoPlacamae;
        this.socket = socket;
        this.limitacaoMemoriaPlacaMae = limitacaoMemoriaPlacaMae;
    }

    public int getIdPlacaMae() {
        return idPlacaMae;
    }

    public void setIdPlacaMae(int idPlacaMae) {
        this.idPlacaMae = idPlacaMae;
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

    public int getNrSlot() {
        return nrSlot;
    }

    public void setNrSlot(int nrSlot) {
        this.nrSlot = nrSlot;
    }

    public String getTipoMemoria() {
        return tipoMemoria;
    }

    public void setTipoMemoria(String tipoMemoria) {
        this.tipoMemoria = tipoMemoria;
    }

    public int getConsumoPlacamae() {
        return consumoPlacamae;
    }

    public void setConsumoPlacamae(int consumoPlacamae) {
        this.consumoPlacamae = consumoPlacamae;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    public int getLimitacaoMemoriaPlacaMae() {
        return limitacaoMemoriaPlacaMae;
    }

    public void setLimitacaoMemoriaPlacaMae(int limitacaoMemoriaPlacaMae) {
        this.limitacaoMemoriaPlacaMae = limitacaoMemoriaPlacaMae;
    }
    private int limitacaoMemoriaPlacaMae;
    
}
