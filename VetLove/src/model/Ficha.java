package model;

import java.util.ArrayList;

public class Ficha {
	private int id_ficha;
	private ArrayList<Vacina> vacinas;
	private ArrayList<Consulta> consultas;
	
	public Ficha() {
		
	}

	public Ficha(int id_ficha, ArrayList<Vacina> vacinas, ArrayList<Consulta> consultas) {
		this.id_ficha = id_ficha;
		this.vacinas = vacinas;
		this.consultas = consultas;
	}

	public int getId_ficha() {
		return id_ficha;
	}

	public void setId_ficha(int id_ficha) {
		this.id_ficha = id_ficha;
	}

	public ArrayList<Vacina> getVacinas() {
		return vacinas;
	}

	public ArrayList<Consulta> getConsultas() {
		return consultas;
	}
	
	public void addConsulta(Consulta consulta) {
		this.consultas.add(consulta);
	}
	
	public void addVacina(Vacina vacina) {
		this.vacinas.add(vacina);
	}
		
}
