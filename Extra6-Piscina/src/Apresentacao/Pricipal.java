package Apresentacao;

import java.util.Scanner;

import Negocio.CinversaoDeUnidadesDeVolume;

public class Pricipal {
	

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		CinversaoDeUnidadesDeVolume objeto = new CinversaoDeUnidadesDeVolume();
		System.out.print(" Digite um valor em litros: ");
		objeto.setCentCubicos(leitor.nextInt());
		System.out.print(" Digite um valor em metros cúbicos: ");
		objeto.setLitros(leitor.nextInt());
		System.out.print(" Digite um valor em galão americano: ");
		objeto.setPolegadasCub(leitor.nextInt());
		System.out.print(" Digite um valor em galão americano: ");
		objeto.setLitrosGalao(leitor.nextInt());
		leitor.close();
		
		System.out.println("============================================");
		
		System.out.println(" litros é equivalente a " + objeto.getCentCubicos() + " centímetros cúbicos! " );
		System.out.println(" metros cúbicos é equivalente a " + objeto.getLitros() + " litros! ");
		System.out.println(" galões Americanos é equivalente a " + objeto.getPolegadasCub() + " polegadas cúbicas! ");
		System.out.println(" galões Americanos é equivalente a " + objeto.getLitrosGalao() + " litros! ");

	}

}
