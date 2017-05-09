/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fatec.exemplos;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
/**
 *
 * @author ynhic
 */
public class ServerObjetos {
    public static void main(String[] args) {
        System.out.println("Servidor ativo...");
        new ServerObjetos();
        
    }
    
    public ServerObjetos(){
        
        try{
            Mensageiro objeto1 = new MensageiroImpl();
            //registra o servidor  pela porta 9999, evitando de 
            //faze-lo  no console usando RMIC
            
            LocateRegistry.createRegistry(9999);
            Naming.rebind("rmi://localhost:9999/MensageiroService", objeto1);
             
        } catch (Exception e){
            System.out.println("Erro "+e);
        }
    }
}
