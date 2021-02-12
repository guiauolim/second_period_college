package Negocio;

public class Piramide implements Solido {
	// propriedades da classe
	private double aresta = 0;

	public Piramide() {
		super();
	}

	public Piramide(double aresta) {
		super();
		this.aresta = aresta;
	}

	public double getAresta() {
		return aresta;
	}

	public void setAresta(double aresta) {
		this.aresta = aresta;
	}

	
	
	
	// metodos implementados da interface
	public double calcularArea() {
		double calculo = 0;
		calculo = (4 * ((aresta * Math.sqrt((3 * Math.pow(aresta, 2)/ 4)) / 2)));
		return calculo;
	}


	public double calcularVolume() {
		double calculo = 0;
		calculo = ((((aresta * Math.sqrt((3 * Math.pow(aresta, 2)/ 4)) / 2)) *  Math.sqrt((3 * Math.pow(aresta, 2)/ 4)) / 2) / 3);
		return calculo;
	}
	

}
