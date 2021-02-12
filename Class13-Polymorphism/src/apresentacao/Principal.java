package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Caipirinha;
import negocio.Drink;
import negocio.DryMartine;
import negocio.Mixer;
import negocio.MoscowMule;
import negocio.OldFashion;

public class Principal {

	public static void main(String[] args) {
		// declaraçõa
		Drink objDrink = null;
		int opcao = 0;
		
		// entrada de dados
		opcao = escolherOpcaoMenu();
		
		
		// processamento
		
		switch (opcao) {
		case 1: 
			objDrink = new Caipirinha();
			break;
		case 2: 
			objDrink = new DryMartine();
			break;
		case 3: 
			objDrink = new OldFashion();
			break;
		case 4:
			objDrink = new MoscowMule();
			break;
		}
		((Mixer) objDrink).misturar();
		// linha 40 é centro da aula
		// converti uma superclasse em uma interface com o objetivo de invocar o metodo misturar. Só fiz isso pois as subclasse implmentam a interface	
		
		// saida de dados
		System.out.println(objDrink.beber());
		

	}
	private static int escolherOpcaoMenu () {
		int retorno = 0;
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		
		do {
			try {
				System.out.println("|================================|");
				System.out.println("|          Menu de Opções        |");
				System.out.println("|================================|");
				System.out.println("|        1 -> Caiprinha          |");
				System.out.println("|        2 -> Dry Martini        |");
				System.out.println("|        3 -> Old Fashion        |");
				System.out.println("|        4 -> Moscow Mule        |");
				System.out.println("|================================|");
				System.out.println(" ");
				System.out.print(" Escolha seu Drink: ");
				retorno = Integer.parseInt(leitor.readLine());
			} catch (Exception e) {
				System.out.println(" Faz o bagulho certo!");	
			}
		}  while ((retorno < 1) || (retorno > 4));
		return retorno;
	}

}
