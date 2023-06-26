/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetofinalpoo;

/**
 *
 * @author IGOR BATISTA
 */
public final class Goleiro extends Jogador {
    
    private int defeDificeis;
    private int penalpegados;
    
    public Goleiro(String nome, int idade, double peso, double altura, int numCamisa, int defeDificeis,
            int penalpegados,String posicao) {
        super(nome, idade, peso, altura, numCamisa ,posicao);
        this.defeDificeis = defeDificeis;
        this.penalpegados = penalpegados;
    }

    Goleiro() {
      
    }
    public int getDefeDificeis() {
        return defeDificeis;
    }
    public void setDefeDificeis(int defeDificeis) {
        this.defeDificeis = defeDificeis;
    }
    public int getPenalpegados() {
        return penalpegados;
    }
    public void setPenalpegados(int penalpegados) {
        this.penalpegados = penalpegados;
    }
    
   
}