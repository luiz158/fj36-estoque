package br.com.caelum.fj36.modelo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class TestaEscritaDeObjetos {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("itens.txt"));
		
		List<ItemEstoque> itens = new ArrayList<>();
		itens.add(new ItemEstoque("001", 3));
		itens.add(new ItemEstoque("002", 6));
		itens.add(new ItemEstoque("003", 8));
		
		oos.writeObject(itens); //NotSerializableException se a ItemEstoque nao implementar Serializable
		oos.close();
		System.out.println("Arquivo criado");
	}
	
}
