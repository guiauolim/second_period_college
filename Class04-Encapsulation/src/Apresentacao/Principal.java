package Apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;

import Negocio.Compra;
import Negocio.Produto;
import Negocio.Tipo;

public class Principal {

	public static void main(String[] args) {
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		Produto objProduto = new Produto();
		Compra objCompra = new Compra();
		Calendar objCalendario = Calendar.getInstance();
			

		  try {
					//Entrada de dados do nome do produto
			System.out.print(" Digite o nome do Produto: ");
			objProduto.setNome(leitor.readLine());
			
					// Entrada de dados do Tipo de produto 
			System.out.print(" Digite o Tipo de Produto: ");
			objProduto.setObjTipo(new Tipo(leitor.readLine()));
			
					// Entrada de dados do Preço do produto
			do {
				try {
					System.out.print(" Digite o preço do Produto: ");
					objProduto.setPreco(Double.parseDouble(leitor.readLine()));
				} catch (Exception e) {
					System.out.print(" Somente número Positivo e maior que 0!");
				}
			} while (objProduto.getPreco() <= 0);
			
			
					// Compor o OBjeto compra com Produto
			objCompra.setObjProduto(objProduto);
			
					// Quantidade de produto
			do {
				try {
			System.out.print(" Digite a quantidade de Produto: ");
			objCompra.setQuantidade(Integer.parseInt(leitor.readLine()));
				} catch (Exception erro) {
					System.out.println(" Somente números! ");
				}
			} while (objCompra.getQuantidade() <= 0);
			
					// Data da compra
			do {
				try {
					System.out.print(" Digite a data da Compra: ");
					String dataInformada = leitor.readLine();
			       
					objCalendario.set(Calendar.DAY_OF_MONTH, Integer.parseInt(dataInformada.substring(0, 2)));
					objCalendario.set(Calendar.MONTH, Integer.parseInt(dataInformada.substring(3, 5)) - 1);
					objCalendario.set(Calendar.YEAR, Integer.parseInt(dataInformada.substring(6)));
					
					objCompra.setData(objCalendario.getTime());
			   } catch (Exception erro) {
				    System.out.println(" Digite uma data no formato dd/mm/yyyy! ");
			   } 
			} while (objCompra.getData() == null);	
			
					// Número do cartão
		        try {	
			        System.out.print(" Digite o número do cartão: ");
			        objCompra.setCartao(leitor.readLine());
			
		       } catch (Exception erro) {
			        System.out.println(erro);
		    }
		
		       } catch (Exception erro) {
			        System.out.println(erro);
		    }
		
		            System.out.println("-------------------------------------------------------");
		
		            // Saida de dados
					System.out.println(" O nome do Produto: " + objCompra.getObjProduto().getNome());
					System.out.println(" O tipo de Produto:  " + objCompra.getObjProduto().getObjTipo().getDescricao());
					System.out.println(" A data da compra: " + objCompra.getData());	
					System.out.println(" A quantidade de Produto: " + objCompra.getQuantidade());
					System.out.println(" Valor total da compra: " + objCompra.getObjProduto().getPreco() * objCompra.getQuantidade());
				
		


	}

}
