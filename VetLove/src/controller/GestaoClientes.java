package controller;

import java.util.ArrayList;

import model.Cliente;
import model.Questao;
import model.Resposta;
import model.Tema;
import tools.easyIO;

public class GestaoClientes {
	public static easyIO io = new easyIO(); 
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	
	public GestaoClientes() {
		int op;
		do {
			io.writeL("Escolha uma opcao");
			io.writeL("1. Adicionar Cliente");
			io.writeL("2. Listar Clientes");
			io.writeL("3. Detalhes Cliente");
			io.writeL("0. Sair");
			op = io.readN();
			
			switch (op) {
				case 1:
					inserirCliente();
					break;
				case 2:
					listTemas();
					break;
			}
		}while(op!=0);
	}
	
	public void inserirCliente() {
		Cliente cliente = new Cliente();
		io.writeL("Introduza o nome"); 
		cliente.setNome(io.readS());
		
		io.writeL("Introduza a morada");
		cliente.setMorada(io.readS());
		
		io.writeL("Introduza o email");
		cliente.setEmail(io.readS());
		
		io.writeL("Introduza o telefone");
		cliente.setTelefone(io.readN());

		addCliente(cliente);

	}
	
	public void addCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}
	
	public void listTemas() {
		io.writeL("Temas/Questoes/Respostas");
		for(Tema t:temas) {
			io.writeL("id: " + t.getId_tema());
			io.writeL("nome: " + t.getNome());
			if (t.getQuestoes().size()>0) {
				io.writeL("questoes:");
				for(Questao q:t.getQuestoes()) {
					io.writeL("  id: " + q.getId_questao());
					io.writeL("  questao: " + q.getTexto());
					if (q.getRespostas().size()>0) {
						    io.writeL("  respostas:");
							for(Resposta r:q.getRespostas()) {
								io.writeL("    id: " + r.getId_resposta());
								io.writeL("    texto: " + r.getTexto() + (q.getResposta_correta()==r.getId_resposta()? "(correta)" : ""));
							}
						}
				}
				
			}
		}
	}
	
}
