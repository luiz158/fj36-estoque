package br.com.caelum.fj36.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

import br.com.caelum.fj36.modelo.ItemEstoque;

public interface EstoqueRMI extends Remote {

	ItemEstoque getItemEstoque(String codigo) throws RemoteException;
	
}
