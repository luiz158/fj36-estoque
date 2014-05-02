package br.com.caelum.fj36.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;

import br.com.caelum.fj36.modelo.ItemEstoque;

public class EstoqueService extends UnicastRemoteObject implements EstoqueRMI {

	private static final long serialVersionUID = 8197296924234825663L;

	private Map<String, ItemEstoque> repositorio = new HashMap<String, ItemEstoque>();

	public EstoqueService() throws RemoteException {
		repositorio.put("ARQ", new ItemEstoque("ARQ", 5));
		repositorio.put("SOA", new ItemEstoque("SOA", 2));
		repositorio.put("TDD", new ItemEstoque("TDD", 3));
		repositorio.put("RES", new ItemEstoque("RES", 4));
		repositorio.put("LOG", new ItemEstoque("LOG", 3));
		repositorio.put("WEB", new ItemEstoque("WEB", 4));
	}

	@Override
	public ItemEstoque getItemEstoque(String codigo) throws RemoteException {
		return repositorio.get(codigo);
	}

}
