package negocio;

public abstract class Mamifero extends Animal {
	
	// Propriedades 
	private  double litrosLeite = 0;
	
    // metodos construtores
	public Mamifero() {
		super();
	}

	public Mamifero(double peso, double altura, String nome, double litrosLeite) {
		super(peso, altura, nome);
		this.litrosLeite = litrosLeite;
	}
    
	
	// metodos gets/sets
	public double getLitrosLeite() {
		return litrosLeite;
	}

	public void setLitrosLeite(double litrosLeite) {
		this.litrosLeite = litrosLeite;
	}
	

}
