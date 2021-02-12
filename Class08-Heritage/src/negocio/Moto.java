package negocio;

public class Moto extends Veiculo{
	// propriedades da classe
	private int cilindrada = 0;
    
	
	// metodos construtores
	public Moto() {
		super();
	}

	public Moto(String modelo, Fabricante objFabricante, String cor, int cilindrada) {
		super(modelo, objFabricante, cor);
		this.cilindrada = cilindrada;
	}
    
	// metodos gets/sets
	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	

}
