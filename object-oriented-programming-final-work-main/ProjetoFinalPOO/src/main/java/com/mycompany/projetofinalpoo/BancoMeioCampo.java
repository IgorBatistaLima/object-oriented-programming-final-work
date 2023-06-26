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
public class BancoMeioCampo {
    
    static MeioCampo a = new MeioCampo();
    static List<MeioCampo> bdMc;
    private static BancoMeioCampo bancoUnico;
    
    private BancoMeioCampo(){
        bdMc = new ArrayList<MeioCampo>();
    }
    
    public static BancoMeioCampo getBancoMeioCampo(){
        if (bancoUnico == null){
            bancoUnico = new BancoMeioCampo();
        }
        return bancoUnico;
    }
    
    public List<MeioCampo> getBdMc(){
        return bdMc;
    }
    
    public static void impAllMc(){
        for(int i = 0 ; i < bdMc.size() ; i++){
            System.out.println(
                    "Nome: "+bdMc.get(i).getNome()
                    +" - Numero: "+bdMc.get(i).getNumCamisa()
                    +" - Pos: "+ 1
                    +" - Ender: "+ bdMc.get(i)
            );
        }
    }
    
    public static void impOneMc(MeioCampo a){
        System.out.println(
                "Numero: " + a.getNumCamisa()
                +" - Nome: " + a.getNome()   
        );
    }
    
    public static MeioCampo cadMc(MeioCampo a){
        if(consMcNum(a) == null){
            bdMc.add(a);
            return a;
        }
        return null;
    }
    
    public static MeioCampo consMcNum(MeioCampo a){
        for(int i = 0 ; i < bdMc.size() ; i++){
            if(a.getNumCamisa() == bdMc.get(i).getNumCamisa()){
                return bdMc.get(i);
            }
        }
        return null;
    }
    
    public static MeioCampo altMcNum(MeioCampo a){
        for(int i = 0; i <bdMc.size(); i++){
            if(a.getNumCamisa() == bdMc.get(i).getNumCamisa()){
                String nNome = JOptionPane.showInputDialog(
                            null,
                            "NOVO NOME",
                            "ATUALIZAR NOME",
                            1 //ICONE
                        );
                a.setNome(nNome);
                bdMc.set(i,a);
                return bdMc.get(i);
            }
        }
        return null;
    }
    
    public static MeioCampo delMcNum(MeioCampo a){
        for(int i = 0; i < bdMc.size(); i++){
            if(a.getNumCamisa() == bdMc.get(i).getNumCamisa()){
                bdMc.remove(bdMc.get(i));
                return null;
            }
        }
        return a;
    }
}
