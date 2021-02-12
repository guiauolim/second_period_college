package negocio;

public class Leorpado extends Mamifero {
	// propriedades da classe
	private double velocidade = 0;

	
	// metodos construtores
	public Leorpado() {
		super();
	}

	public Leorpado(double peso, double altura, String nome, double litrosLeite, double velocidade) {
		super(peso, altura, nome, litrosLeite);
		this.velocidade = velocidade;
	}
    // metodos gets/sets
	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	// metodos da classe
			public void correr() {
				System.out.println(" Run forest!");

}
}