package br.com.caelum.fj36.modelo;

import java.io.Serializable;

public class ItemEstoque implements Serializable {

	private static final long serialVersionUID = 1L; //java.io.InvalidClassException if we change the serialVersionUID

	private String codigo;

	private Integer quantidade;

	public ItemEstoque(String codigo, int quantidade) {
		this.codigo = codigo;
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "ItemEstoque [codigo=" + codigo + ", quantidade=" + quantidade
				+ "]";
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

}
