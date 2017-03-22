package model;

import java.util.Date;

public class Consulta {
	private Date data;
	private String descricao;
	
	public Consulta() {
		
	}

	public Consulta(Date data, String descricao) {
		this.data = data;
		this.descricao = descricao;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
	
}
