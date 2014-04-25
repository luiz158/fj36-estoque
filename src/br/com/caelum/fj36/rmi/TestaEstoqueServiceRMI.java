package br.com.caelum.fj36.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class TestaEstoqueServiceRMI {

	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		EstoqueRMI estoqueRmi = (EstoqueRMI) Naming.lookup("rmi://localhost:1099/estoque");
		
		Integer quantidade = estoqueRmi.getQuantidade("ARQ");
		
		System.out.println("Quantidade em estoque: " + quantidade);
	}
	
}
