package Apresentacao;

import java.util.Scanner;

import Negocio.CinversaoDeUnidadesDeVolume;

public class Pricipal {
	

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		CinversaoDeUnidadesDeVolume objeto = new CinversaoDeUnidadesDeVolume();
		System.out.print(" Digite um valor em litros: ");
		objeto.setCentCubicos(leitor.nextInt());
		System.out.print(" Digite um valor em metros c�bicos: ");
		objeto.setLitros(leitor.nextInt());
		System.out.print(" Digite um valor em gal�o americano: ");
		objeto.setPolegadasCub(leitor.nextInt());
		System.out.print(" Digite um valor em gal�o americano: ");
		objeto.setLitrosGalao(leitor.nextInt());
		leitor.close();
		
		System.out.println("============================================");
		
		System.out.println(" litros � equivalente a " + objeto.getCentCubicos() + " cent�metros c�bicos! " );
		System.out.println(" metros c�bicos � equivalente a " + objeto.getLitros() + " litros! ");
		System.out.println(" gal�es Americanos � equivalente a " + objeto.getPolegadasCub() + " polegadas c�bicas! ");
		System.out.println(" gal�es Americanos � equivalente a " + objeto.getLitrosGalao() + " litros! ");

	}

}
