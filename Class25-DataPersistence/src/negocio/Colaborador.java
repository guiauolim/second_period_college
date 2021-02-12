package negocio;

import java.util.Collection;

import persistencia.ColaboradorDAO;

public class Colaborador extends Entidade {
	// PROPRIEDADES DA CLASSE
	private Cargo objCargo = null;
	private String nome = "";
	
	// METODOS CONSTRUTORES
	public Colaborador() {
		super();
	}
	public Colaborador(int id, Cargo objCargo, String nome) {
		super(id);
		this.objCargo = objCargo;
		this.nome = nome;
	}
	
	// METODOS GETS/SETS
	public Cargo getObjCargo() {
		return objCargo;
	}
	public void setObjCargo(Cargo objCargo) {
		this.objCargo = objCargo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	// METODOS DA CLASSE
	public static Collection<Colaborador> recuperarTodos () throws Exception {
		return new ColaboradorDAO().recuperarTodos();
	}
	public void persistir () throws Exception {
		new ColaboradorDAO().persistir(this);
	}
	
	

}
