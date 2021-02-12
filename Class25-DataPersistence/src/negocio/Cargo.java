package negocio;

import java.util.Collection;

import persistencia.CargoDAO;

public class Cargo extends Entidade {
	private String nome = "";
	private double salario = 0;
	
	// 	METODOS CONSTRUTORES
	public Cargo() {
		super();
	}
	public Cargo(int id, String nome, double salario) {
		super(id);
		this.nome = nome;
		this.salario = salario;
	}
	// METODOS GETS/SETS
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	// METODOS DA CLASSE
	public static Collection<Cargo> recuperarTodos () throws Exception {
		return new CargoDAO().recuperarTodos();
	}
	
	// METODO PARA INCLUIR NO BANCO
	public void persistir () throws Exception {
		new CargoDAO().persistir(this);
	}
	
	
}
