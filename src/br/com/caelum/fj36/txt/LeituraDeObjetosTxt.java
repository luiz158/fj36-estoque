package br.com.caelum.fj36.txt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeituraDeObjetosTxt {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("livros.txt"));
		
		String linha = null;
		while((linha = reader.readLine()) != null) {
			System.out.println(linha);
		}
		reader.close();
	}
	
}
