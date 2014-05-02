package br.com.caelum.fj36.txt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import br.com.caelum.fj36.modelo.Livro;

public class EscritaDeObjetosTxt {

	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter writer = new PrintWriter(new File("livros.txt"));
		
		List<Livro> livros = new ArrayList<>();
		livros.add(new Livro(1l, "CDI"));
		
		writer.print(livros);
		
		writer.close();
	}
	
}
