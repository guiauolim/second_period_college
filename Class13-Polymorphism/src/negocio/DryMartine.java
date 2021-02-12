package negocio;

public class DryMartine extends Drink implements Mixer {

	public void misturar() {
	adicionar(new Ingrediente("Gin",       150, " ml"));
	adicionar(new Ingrediente("Vodka",     50,  " ml"));
	adicionar(new Ingrediente("Vermuth",   50,  " ml"));
	adicionar(new Ingrediente("Azeitonas", 10,  " unidades"));
	adicionar(new Ingrediente("Gelo",      5,   " pedras"));
	}
	

}
