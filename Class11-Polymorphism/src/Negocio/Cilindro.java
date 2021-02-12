package Negocio;

public class Cilindro implements Solido{
	private double raio = 0;
	private double altura = 0;
	public Cilindro(double raio, double altura) {
		super();
		this.raio = raio;
		this.altura = altura;
	}
	public Cilindro() {
		super();
	}
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	// metodos implementados da interface
	@Override
	public double calcularArea() {
		double areaBase = 0;
		double areaLateral = 0;
		areaBase = (2 * Math.PI * Math.pow(raio, 2));
		areaLateral = (2 * Math.PI * altura);
		
		return (areaBase + areaLateral);
	}

	public double calcularVolume() {
		double areaBase = 0;
		areaBase = (2 * Math.PI * Math.pow(raio, 2));
		
		return (areaBase * altura);
	}
	

}
