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
public class PlacaExpansao {
    
    private int idPlacaExpansao;
    private String nome;
    private String marca;
    private int nucleosCUDA;
    private float frequenciaCORE;
    private int memoria;
    private int consumo;
    
    public PlacaExpansao(){
        
    }
    public PlacaExpansao(String nome, String marca, int nucleosCUDA, float frequenciaCORE, int memoria, int consumo) {
        this.nome = nome;
        this.marca = marca;
        this.nucleosCUDA = nucleosCUDA;
        this.frequenciaCORE = frequenciaCORE;
        this.memoria = memoria;
        this.consumo = consumo;
    }

    public int getIdPlacaExpansao() {
        return idPlacaExpansao;
    }

    public void setIdPlacaExpansao(int idPlacaExpansao) {
        this.idPlacaExpansao = idPlacaExpansao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNucleosCUDA() {
        return nucleosCUDA;
    }

    public void setNucleosCUDA(int nucleosCUDA) {
        this.nucleosCUDA = nucleosCUDA;
    }

    public float getFrequenciaCORE() {
        return frequenciaCORE;
    }

    public void setFrequenciaCORE(float frequenciaCORE) {
        this.frequenciaCORE = frequenciaCORE;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }
    
}
