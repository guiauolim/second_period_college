package Apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Carro;
import negocio.Fabricante;
import negocio.Moto;
import negocio.Veiculo;

public class Principal {

	public static void main(String[] args) {
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		String tipoVeiculo = "";
		Veiculo ObjVeiculo = null;
		
		// Entrada de dados
		try {
			do {
				System.out.print(" Informe <C> para Carro ou <M> para Moto: ");
				tipoVeiculo = leitor.readLine();
				
			} while ((! tipoVeiculo.equalsIgnoreCase("C")) && (! tipoVeiculo.equalsIgnoreCase("M")));
			
			if (tipoVeiculo.equalsIgnoreCase("C")) {
				ObjVeiculo = new Carro();
			}	else {
					ObjVeiculo = new Moto();
				}
			
			// modelo
			System.out.print(" Informe o modelo: ");
			ObjVeiculo.setModelo(leitor.readLine());
			
			// Fabricante 
			System.out.print(" Informe o fabricante: ");
			ObjVeiculo.setObjFabricante(new Fabricante(leitor.readLine()));
			
			// cor
			System.out.print(" Informe a cor: ");
			ObjVeiculo.setCor(leitor.readLine());
			
			if (tipoVeiculo.equalsIgnoreCase("C")) {
				// Se tem teto solar
				System.out.print(" Informe <S> indicar se tem teto solar ou qualquer coisa se não houver ");
				((Carro) ObjVeiculo ).setTetoSolar(leitor.readLine().equalsIgnoreCase("S"));
			} else {
				System.out.print(" Informe a cilindrada: ");
				((Moto) ObjVeiculo).setCilindrada(Integer.parseInt(leitor.readLine()));
			}
			
		} catch (Exception erro) {
			System.out.println(erro);
		}
		// saida
		System.out.println("------------------------------------------");
		System.out.println(" Modelo: " + ObjVeiculo.getModelo());
		System.out.println(" Fabricante: " + ObjVeiculo.getObjFabricante().getNome());
		System.out.println(" Cor: " + ObjVeiculo.getCor());
		if (tipoVeiculo.equalsIgnoreCase("C")) {
			System.out.println(" Teto solar: " + ((((Carro) ObjVeiculo).isTetoSolar()) ? " SIM " : " NÃO " ));
		} else {
			System.out.println(" Cilindrada: " + ((Moto) ObjVeiculo).getCilindrada());
		}

	}

}
