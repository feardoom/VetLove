package model;

import java.util.Date;

public class Vacina {
	private String nome;
	private Date data;
	private double preco;
	
	public Vacina() {
		
	}

	public Vacina(String nome, Date data, double preco) {
		this.nome = nome;
		this.data = data;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
		
	
}
