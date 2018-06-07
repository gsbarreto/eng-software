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
public class Armazenamento {
    private int idArmazenamento;
    private String modelo;
    private String marca;
    private int capacidade;
    private int cache;
    private float taxaTransferencia;
    
    public Armazenamento(){
        
    }

    public Armazenamento(String modelo, String marca, int capacidade, int cache, float taxaTransferencia) {
        this.modelo = modelo;
        this.marca = marca;
        this.capacidade = capacidade;
        this.cache = cache;
        this.taxaTransferencia = taxaTransferencia;
    }

    public int getIdArmazenamento() {
        return idArmazenamento;
    }

    public void setIdArmazenamento(int idArmazenamento) {
        this.idArmazenamento = idArmazenamento;
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

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getCache() {
        return cache;
    }

    public void setCache(int cache) {
        this.cache = cache;
    }

    public float getTaxaTransferencia() {
        return taxaTransferencia;
    }

    public void setTaxaTransferencia(float taxaTransferencia) {
        this.taxaTransferencia = taxaTransferencia;
    }
}
