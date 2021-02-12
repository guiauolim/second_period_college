package negocio;

public class Cachorro extends Mamifero {
	// Propriedades
	private double forcaMordida = 0;

	// metodos construtores
	public Cachorro() {
		super();
	}

	public Cachorro(double peso, double altura, String nome, double litrosLeite, double forcaMordida) {
		super(peso, altura, nome, litrosLeite);
		this.forcaMordida = forcaMordida;
	}
    
	// metodos gets/sets
	public double getForcaMordida() {
		return forcaMordida;
	}

	public void setForcaMordida(double forcaMordida) {
		this.forcaMordida = forcaMordida;
	}
	

	// metodos da classe
		public void morder() {
			System.out.println(" Au au");
	

}
}	