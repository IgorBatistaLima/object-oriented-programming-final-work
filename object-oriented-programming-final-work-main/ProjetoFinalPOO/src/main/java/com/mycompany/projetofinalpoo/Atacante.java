/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetofinalpoo;

/**
 *
 * @author IGOR BATISTA
 */
public class Atacante extends Jogador {
    
    
    private int numGols;
    private int golCab;
    
   

    public Atacante(String nome, int idade, double peso, double altura, int numCamisa, int numGols, String posicao, int golCab) {
        super(nome, idade, peso, altura, numCamisa,posicao);
        this.numGols = numGols;
        this.golCab = golCab;
    }

    Atacante() {

    }

    

    public int getGolCab() {
        return golCab;
    }

    public void setGolCab(int golCab) {
        this.golCab = golCab;
    }

    public int getNumGols() {
        return numGols;
    }
    
    public void setNumGols(int numGols) {
        this.numGols = numGols;
    }
    public String getPosicao(){
        return posicao;

    }
    public void setPosicao(String posicao){
        this.posicao= posicao;
    }

}
