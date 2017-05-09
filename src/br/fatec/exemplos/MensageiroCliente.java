/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fatec.exemplos;

import java.net.MalformedURLException; 
import java.rmi.Naming; 
import java.rmi.NotBoundException; 
import java.rmi.RemoteException; 
import java.rmi.registry.LocateRegistry; 
/**
 *
 * @author ynhic
 */
public class MensageiroCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        Mensageiro objeto1 = null;
        try{
            LocateRegistry.getRegistry("192.168.0.102");
            objeto1 = (Mensageiro)
            Naming.lookup("rmi://localhost:9999/MensageiroService" );
            objeto1.enviarMensagem( "Hello World!" );
        } catch (MalformedURLException | RemoteException | NotBoundException e) {    
                    // TODO Auto-generated catch block
                    System.out.println("problema de conexão");
        }
    
    }
    
}
