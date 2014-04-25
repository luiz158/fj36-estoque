package br.com.caelum.fj36.modelo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class TestaLeituraDeObjetos {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("itens.txt"));
		
		@SuppressWarnings("unchecked")
		List<ItemEstoque> itens = (List<ItemEstoque>) ois.readObject();
		
		for (ItemEstoque itemEstoque : itens) {
			System.out.println("Codigo: " + itemEstoque.getCodigo() + " - Quantidade: " + itemEstoque.getQuantidade());
		}
		ois.close();
	}
	
}
