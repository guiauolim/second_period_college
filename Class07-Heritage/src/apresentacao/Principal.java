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
			
			// Inst�ncia da classe
		if (opcao.equalsIgnoreCase("N")) {
			objImovel = new Novo();
			
		} else {
			objImovel = new Usado();
		}
		
		// endere�o do imovel
		System.out.print(" Digite o endere�o do im�vel: ");
		objImovel.setEndereco(leitor.readLine());
		
		// metragem do Im�vel
		System.out.print(" Digite o tamanho do Im�vel: ");
		objImovel.setMetragem(Double.parseDouble(leitor.readLine()));
		
		// valor do Im�vel
		System.out.print(" Digite o valor do Im�vel: ");
		objImovel.setValor(Double.parseDouble(leitor.readLine()));
		
		// Adicional para Novo ou deprecia�ao para usado
		if (opcao.equalsIgnoreCase("N")) {
			System.out.print(" Digite o adicional do Im�vel: ");
			((Novo) objImovel).setAdicional(Double.parseDouble(leitor.readLine())); 	
		} else {
			System.out.print(" Digite a deprecia��o do Imovel: ");
			((Usado) objImovel).setDepreciacao(Double.parseDouble(leitor.readLine()));
		}
		
		} catch (Exception erro) {
			System.out.println(erro);
		}
		// saida de dados
		System.out.println("---------------------------------------------------");
		System.out.println(" Endere�o do Im�vel: " + objImovel.getEndereco());
		System.out.println(" Tamanho do Im�vel: " + objImovel.getMetragem() + " M2");
		System.out.println(" Valor do Im�vel: " + objImovel.getValor() + " R$");

	}

}
