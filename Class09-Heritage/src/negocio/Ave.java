package negocio;

public abstract class Ave extends Animal {
	// propriedades
	private double quantidadeOvos = 0;

	// metodos construtores	
	public Ave() {
		super();
	}

	public Ave(double peso, double altura, String nome, double quantidadeOvos) {
		super(peso, altura, nome);
		this.quantidadeOvos = quantidadeOvos;
	}
	// metodos gets/sets
	public double getQuantidadeOvos() {
		return quantidadeOvos;
	}

	public void setQuantidadeOvos(double quantidadeOvos) {
		this.quantidadeOvos = quantidadeOvos;
	}
	
	
	}
	

	
	



