package negocio;

public class Cadeira {
	// propriedades
         private String nome = "" ;
         
        // metodos construtores
	public Cadeira() {
		super();
	}

	public Cadeira(String nome) {
		super();
		this.nome = nome;
	}
	
	
       // metodos gets/sets   
	public String getCadeira() {
		return nome;
	}

	public void setCadeira(String nome) {
		this.nome = nome;
	}
	
	

}
