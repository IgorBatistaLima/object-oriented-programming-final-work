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
public class BancoAtacante {
    
    static Atacante a = new Atacante();
    static List<Atacante> bdAtac;
    private static BancoAtacante bancoUnico;
    
    private BancoAtacante(){
        bdAtac = new ArrayList<Atacante>();
    }
    
    public static BancoAtacante getBancoAtacante(){
        if (bancoUnico == null){
            bancoUnico = new BancoAtacante();
        }
        return bancoUnico;
    }
    
    public List<Atacante> getBdAtac(){
        return bdAtac;
    }
    
    public static void impAllAtac(){
        for(int i = 0 ; i < bdAtac.size() ; i++){
            System.out.println(
                    "Nome: "+bdAtac.get(i).getNome()
                    +" - Numero: "+bdAtac.get(i).getNumCamisa()
                    +" - Pos: "+ 1
                    +" - Ender: "+ bdAtac.get(i)
            );
        }
    }
    
    public static void impOneAtac(Atacante a){
        System.out.println(
                "Numero: " + a.getNumCamisa()
                +" - Nome: " + a.getNome()   
        );
    }
    
    public static Atacante cadAtac(Atacante a){
        if(consAtacNum(a) == null){
            bdAtac.add(a);
            return a;
        }
        return null;
    }
    
    public static Atacante consAtacNum(Atacante a){
        for(int i = 0 ; i < bdAtac.size() ; i++){
            if(a.getNumCamisa() == bdAtac.get(i).getNumCamisa()){
                return bdAtac.get(i);
            }
        }
        return null;
    }
    
    public static Atacante altAtacNum(Atacante a){
        for(int i = 0; i <bdAtac.size(); i++){
            if(a.getNumCamisa() == bdAtac.get(i).getNumCamisa()){
                String nNome = JOptionPane.showInputDialog(
                            null,
                            "NOVO NOME",
                            "ATUALIZAR NOME",
                            1 //ICONE
                        );
                a.setNome(nNome);
                bdAtac.set(i,a);
                return bdAtac.get(i);
            }
        }
        return null;
    }
    
    public static Atacante delAtacNum(Atacante a){
        for(int i = 0; i < bdAtac.size(); i++){
            if(a.getNumCamisa() == bdAtac.get(i).getNumCamisa()){
                bdAtac.remove(bdAtac.get(i));
                return null;
            }
        }
        return a;
    }
}
