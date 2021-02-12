package negocio;

public abstract class Entidade {
	// PRORPIEDADES DA CLASSE
	private int id = 0;
	
	
	// METODOS CONSTRUTORES
	public Entidade() {
		super();
	}

	public Entidade(int id) {
		super();
		this.id = id;
	}

	// METODOS GETS/SETS
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
