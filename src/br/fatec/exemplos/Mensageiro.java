/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fatec.exemplos;

import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *
 * @author ynhic
 */
public interface Mensageiro extends Remote{
    
    public void enviarMensagem( String msg ) throws RemoteException;  
    
    public String lerMensagem() throws RemoteException; 
}

