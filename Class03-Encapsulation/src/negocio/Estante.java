package negocio;

public class Estante {
	// Propriedades
	private int numero = 0;
	
	// construtor vazio
	public Estante () {
		
	}
	// construtor cheio
	public Estante (int numero) {
		this.numero = numero;
	}
	// Metodos gets/sets
	public int getNumero () {
		return numero;
	}
	public void setNumero ( int numero) {
		this.numero = numero;
	}

}
