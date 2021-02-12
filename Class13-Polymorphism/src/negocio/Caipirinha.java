package negocio;

public class Caipirinha extends Drink implements Mixer{
    public void misturar() {	
    	adicionar(new Ingrediente("Cachaça", 50, " ml"));
    	adicionar(new Ingrediente("Limão",   2,  " colheres"));
    	adicionar(new Ingrediente("Açucar",  3,  " Colheres"));
    	adicionar(new Ingrediente("Gelo",    5,  " Pedras"));
	}
    
	
	

}
