package model;

import java.util.Date;

public class Animal {
	private int id_ficha;
	private String classificacao;
	private String nome;
	private String raca;
	private Date data_nasc;
	private Ficha ficha;
	
	public Animal() {
		
	}

	public Animal(int id_ficha, String classificacao, String nome, String raca, Date data_nasc, Ficha ficha) {
		this.id_ficha = id_ficha;
		this.classificacao = classificacao;
		this.nome = nome;
		this.raca = raca;
		this.data_nasc = data_nasc;
		this.ficha = ficha;
	}

	public int getId_ficha() {
		return id_ficha;
	}

	public void setId_ficha(int id_ficha) {
		this.id_ficha = id_ficha;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public Date getData_nasc() {
		return data_nasc;
	}

	public void setData_nasc(Date data_nasc) {
		this.data_nasc = data_nasc;
	}

	public Ficha getFicha() {
		return ficha;
	}

	public void setFicha(Ficha ficha) {
		this.ficha = ficha;
	}	
	
}
