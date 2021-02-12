package negocio;

public class Aguia extends Ave {
	// propriedades
	private double autonomia = 0;
	
    // metodos constutores
	public Aguia() {
		super();
	}

	public Aguia(double peso, double altura, String nome, double quantidadeOvos, double autonomia) {
		super(peso, altura, nome, quantidadeOvos);
		this.autonomia = autonomia;
	}
	
    // metodos gets/sets
	public double getAutonomia() {
		return autonomia;
	}

	public void setAutonomia(double autonomia) {
		this.autonomia = autonomia;
	}
	
	// metodos da classe
			public void voar() {
				System.out.println(" To voando! ");
}
}