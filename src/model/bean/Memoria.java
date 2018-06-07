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
public class Memoria {
    private int memoria;
    private String modelo;
    private String marca;
    private String tipo;
    private float frequenciaMemoria;
    private int tamanho;
    
    
    public Memoria(){
        
    }

    public Memoria(String modelo, String marca, String tipo, float frequenciaMemoria, int tamanho) {
        this.modelo = modelo;
        this.marca = marca;
        this.tipo = tipo;
        this.frequenciaMemoria = frequenciaMemoria;
        this.tamanho = tamanho;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getFrequenciaMemoria() {
        return frequenciaMemoria;
    }

    public void setFrequenciaMemoria(float frequenciaMemoria) {
        this.frequenciaMemoria = frequenciaMemoria;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
}
