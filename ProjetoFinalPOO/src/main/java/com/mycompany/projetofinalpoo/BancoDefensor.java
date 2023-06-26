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
public class BancoDefensor {
    
    static Defensor a = new Defensor();
    static List<Defensor> bdDef;
    private static BancoDefensor bancoUnico;
    
    private BancoDefensor(){
        bdDef = new ArrayList<Defensor>();
    }
    
    public static BancoDefensor getBancoDefensor(){
        if (bancoUnico == null){
            bancoUnico = new BancoDefensor();
        }
        return bancoUnico;
    }
    
    public List<Defensor> getBdDef(){
        return bdDef;
    }
    
    public static void impAllDef(){
        for(int i = 0 ; i < bdDef.size() ; i++){
            System.out.println(
                    "Nome: "+bdDef.get(i).getNome()
                    +" - Numero: "+bdDef.get(i).getNumCamisa()
                    +" - Pos: "+ 1
                    +" - Ender: "+ bdDef.get(i)
            );
        }
    }
    
    public static void impOneDef(Defensor a){
        System.out.println(
                "Numero: " + a.getNumCamisa()
                +" - Nome: " + a.getNome()   
        );
    }
    
    public static Defensor cadDef(Defensor a){
        if(consDefNum(a) == null){
            bdDef.add(a);
            return a;
        }
        return null;
    }
    
    public static Defensor consDefNum(Defensor a){
        for(int i = 0 ; i < bdDef.size() ; i++){
            if(a.getNumCamisa() == bdDef.get(i).getNumCamisa()){
                return bdDef.get(i);
            }
        }
        return null;
    }
    
    public static Defensor altDefNum(Defensor a){
        for(int i = 0; i <bdDef.size(); i++){
            if(a.getNumCamisa() == bdDef.get(i).getNumCamisa()){
                String nNome = JOptionPane.showInputDialog(
                            null,
                            "NOVO NOME",
                            "ATUALIZAR NOME",
                            1 //ICONE
                        );
                a.setNome(nNome);
                bdDef.set(i,a);
                return bdDef.get(i);
            }
        }
        return null;
    }
    
    public static Defensor delDefNum(Defensor a){
        for(int i = 0; i < bdDef.size(); i++){
            if(a.getNumCamisa() == bdDef.get(i).getNumCamisa()){
                bdDef.remove(bdDef.get(i));
                return null;
            }
        }
        return a;
    }
}
