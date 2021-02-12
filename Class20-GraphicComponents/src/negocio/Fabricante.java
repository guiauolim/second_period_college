package negocio;

import java.util.ArrayList;
import java.util.Collection;

public class Fabricante {
	// PROPRIEDADES
	private String nome = "";

	
	// METODO CONSTRUTOR VAZIO
	public Fabricante() {
		super();
	}

	// METODO CONSTRUTOR CHEIO
	public Fabricante(String nome) {
		super();
		this.nome = nome;
	}
	// METODOS GETS/SETS 
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	// METODO DA CLASSE
	public static Collection<Fabricante> retornarTodos() {
		ArrayList<Fabricante> retorno = new ArrayList<Fabricante>();
		
		retorno.add(new Fabricante(""));
		retorno.add(new Fabricante("Audi"));
		retorno.add(new Fabricante("BMW"));
		retorno.add(new Fabricante("Chery"));
		retorno.add(new Fabricante("Ford"));
		retorno.add(new Fabricante("GMC"));
		retorno.add(new Fabricante("Hyunday"));
		retorno.add(new Fabricante("Jeep"));
		retorno.add(new Fabricante("Mercedes"));
		retorno.add(new Fabricante("Peugeot"));
		retorno.add(new Fabricante("Volvo"));
		
		
		return retorno;
	}
	
	

}
