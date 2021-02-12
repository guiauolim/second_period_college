package negocio;

public class MoscowMule extends Drink implements Mixer{

	
	public void misturar() {
		adicionar(new Ingrediente("Vodka",    200, " ml"));
		adicionar(new Ingrediente("Limão",    2,   " unidades"));
		adicionar(new Ingrediente("Gengibre", 10,  " g"));
		adicionar(new Ingrediente("Gelo",     5,   " pedras"));
		
	}

}
