package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Imovel;
import negocio.Novo;
import negocio.Usado;

public class Principal {

	public static void main(String[] args) {
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		
		Imovel objImovel = null;
		String opcao = "";
		
		// Entrada de dados
		// opcao de imovel
		try {
			do {
		System.out.print(" Digite <N> para novo ou <U> para usado: ");
		opcao = leitor.readLine();
			} while ((!opcao.equalsIgnoreCase("N") && (!opcao.equalsIgnoreCase("U")))); 
			
			// Instância da classe
		if (opcao.equalsIgnoreCase("N")) {
			objImovel = new Novo();
			
		} else {
			objImovel = new Usado();
		}
		
		// endereço do imovel
		System.out.print(" Digite o endereço do imóvel: ");
		objImovel.setEndereco(leitor.readLine());
		
		// metragem do Imóvel
		System.out.print(" Digite o tamanho do Imóvel: ");
		objImovel.setMetragem(Double.parseDouble(leitor.readLine()));
		
		// valor do Imóvel
		System.out.print(" Digite o valor do Imóvel: ");
		objImovel.setValor(Double.parseDouble(leitor.readLine()));
		
		// Adicional para Novo ou depreciaçao para usado
		if (opcao.equalsIgnoreCase("N")) {
			System.out.print(" Digite o adicional do Imóvel: ");
			((Novo) objImovel).setAdicional(Double.parseDouble(leitor.readLine())); 	
		} else {
			System.out.print(" Digite a depreciação do Imovel: ");
			((Usado) objImovel).setDepreciacao(Double.parseDouble(leitor.readLine()));
		}
		
		} catch (Exception erro) {
			System.out.println(erro);
		}
		// saida de dados
		System.out.println("---------------------------------------------------");
		System.out.println(" Endereço do Imóvel: " + objImovel.getEndereco());
		System.out.println(" Tamanho do Imóvel: " + objImovel.getMetragem() + " M2");
		System.out.println(" Valor do Imóvel: " + objImovel.getValor() + " R$");

	}

}
