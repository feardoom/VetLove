package model;

import java.util.ArrayList;

public class Cliente {
	private int id_cliente;
	private String nome;
	private String morada;
	private String email;
	private int telefone;
	private ArrayList<Animal> animais;
	
	public Cliente() {
		
	}

	public Cliente(int id_cliente, String nome, String morada, String email, int telefone) {
		super();
		this.id_cliente = id_cliente;
		this.nome = nome;
		this.morada = morada;
		this.email = email;
		this.telefone = telefone;
	}

	public int getId_cliente() {
		return id_cliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMorada() {
		return morada;
	}

	public void setMorada(String morada) {
		this.morada = morada;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
}
