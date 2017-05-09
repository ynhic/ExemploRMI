/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fatec.exemplos;

import java.rmi.RemoteException; 
import java.rmi.server.UnicastRemoteObject;
/**
 *
 * @author ynhic
 */
public class MensageiroImpl extends UnicastRemoteObject implements Mensageiro{
    
    public MensageiroImpl() throws RemoteException{
        super();
    }
    
    public void enviarMensagem(String msg) throws RemoteException{
        // TODO Auto-generated method stub   
        System.out.printf("\n%s", msg );
    }
    
    @Override public String lerMensagem() throws RemoteException {   
    // TODO Auto-generated method stub   
    return "This is not a Hello World! message"; 
    
    }
    
    
    
}
