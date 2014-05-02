package br.com.caelum.fj36.modelo;

public class Livro {

	private Long id;
	
	private String nome;
	
	public Livro(Long id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public Livro() {
	}

	@Override
	public String toString() {
		return "Livro [id=" + id + ", nome=" + nome + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
