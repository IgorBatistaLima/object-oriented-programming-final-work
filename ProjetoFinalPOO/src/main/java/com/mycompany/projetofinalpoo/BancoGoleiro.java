/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetofinalpoo;

import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author IGOR BATISTA
 */
public class BancoGoleiro {
    
    static Goleiro a = new Goleiro();
    static List<Goleiro> bdGol;
    private static BancoGoleiro bancoUnico;
    
    private BancoGoleiro(){
        bdGol = new ArrayList<Goleiro>();
    }
    
    public static BancoGoleiro getBancoGoleiro(){
        if (bancoUnico == null){
            bancoUnico = new BancoGoleiro();
        }
        return bancoUnico;
    }
    
    public List<Goleiro> getBdGol(){
        return bdGol;
    }
    
    public static void impAllGol(){
        for(int i = 0 ; i < bdGol.size() ; i++){
            System.out.println(
                    "Nome: "+bdGol.get(i).getNome()
                    +" - Numero: "+bdGol.get(i).getNumCamisa()
                    +" - Pos: "+ 1
                    +" - Ender: "+ bdGol.get(i)
            );
        }
    }
    
    public static void impOneGol(Goleiro a){
        System.out.println(
                "Numero: " + a.getNumCamisa()
                +" - Nome: " + a.getNome()   
        );
    }
    
    public static Goleiro cadGol(Goleiro a){
        if(consGolNum(a) == null){
            bdGol.add(a);
            return a;
        }
        return null;
    }
    
    public static Goleiro consGolNum(Goleiro a){
        for(int i = 0 ; i < bdGol.size() ; i++){
            if(a.getNumCamisa() == bdGol.get(i).getNumCamisa()){
                return bdGol.get(i);
            }
        }
        return null;
    }
    
    public static Goleiro altGolNum(Goleiro a){
        for(int i = 0; i <bdGol.size(); i++){
            if(a.getNumCamisa() == bdGol.get(i).getNumCamisa()){
                String nNome = JOptionPane.showInputDialog(
                            null,
                            "NOVO NOME",
                            "ATUALIZAR NOME",
                            1 //ICONE
                        );
                a.setNome(nNome);
                bdGol.set(i,a);
                return bdGol.get(i);
            }
        }
        return null;
    }
    
    public static Goleiro delGolNum(Goleiro a){
        for(int i = 0; i < bdGol.size(); i++){
            if(a.getNumCamisa() == bdGol.get(i).getNumCamisa()){
                bdGol.remove(bdGol.get(i));
                return null;
            }
        }
        return a;
    }
}
