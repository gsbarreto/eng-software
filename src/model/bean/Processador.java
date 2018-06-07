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
public class Processador {
    private int idProcessador;
    private String marca;
    private int numNucleos;
    private String modelo;
    private int numThread;
    private float frequenciaProcessador;
    private int cacheProcessador;
    private String socketProcessador;
    
    public Processador(){        
    }

    public Processador(String marca, int numNucleos, String modelo, int numThread, float frequenciaProcessador, int cacheProcessador, String socketProcessador) {
        this.marca = marca;
        this.numNucleos = numNucleos;
        this.modelo = modelo;
        this.numThread = numThread;
        this.frequenciaProcessador = frequenciaProcessador;
        this.cacheProcessador = cacheProcessador;
        this.socketProcessador = socketProcessador;
    }

    public int getIdProcessador() {
        return idProcessador;
    }

    public void setIdProcessador(int idProcessador) {
        this.idProcessador = idProcessador;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumNucleos() {
        return numNucleos;
    }

    public void setNumNucleos(int numNucleos) {
        this.numNucleos = numNucleos;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumThread() {
        return numThread;
    }

    public void setNumThread(int numThread) {
        this.numThread = numThread;
    }

    public float getFrequenciaProcessador() {
        return frequenciaProcessador;
    }

    public void setFrequenciaProcessador(float frequenciaProcessador) {
        this.frequenciaProcessador = frequenciaProcessador;
    }

    public int getCacheProcessador() {
        return cacheProcessador;
    }

    public void setCacheProcessador(int cacheProcessador) {
        this.cacheProcessador = cacheProcessador;
    }

    public String getSocketProcessador() {
        return socketProcessador;
    }

    public void setSocketProcessador(String socketProcessador) {
        this.socketProcessador = socketProcessador;
    }
}

