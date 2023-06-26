/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetofinalpoo;

/**
 *
 * @author IGOR BATISTA
 */
//NOME: IGOR BATISTA LIMA RA: 2475855
public final class Defensor extends Jogador {

    private int numDesarme;
    private int duelosAlto;


    public Defensor(String nome, int idade, double peso, double altura, int numCamisa, int numDesarme, String posicao,
            int duelosAlto) {
        super(nome, idade, peso, altura, numCamisa, posicao);
        this.numDesarme = numDesarme;
        this.duelosAlto = duelosAlto;
    }

    Defensor() {
     
    }

    public int getDuelosAlto() {
        return duelosAlto;
    }

    public void setDuelosAlto(int duelosAlto) {
        this.duelosAlto = duelosAlto;
    }

    public int getNumDesarme() {
        return numDesarme;
    }

    public void setNumDesarme(int numDesarme) {
        this.numDesarme = numDesarme;
    }

    
}