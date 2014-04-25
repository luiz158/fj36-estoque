package br.com.caelum.fj36.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface EstoqueRMI extends Remote {

	Integer getQuantidade(String codigo) throws RemoteException;
	
}
