package Apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Estante;
import negocio.Produto;

public class Principal {

	public static void main(String[] args) {
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		Produto objProduto = new Produto();
		
		try {
		System.out.print(" Digite o nome do Produto: ");
		objProduto.setNome(leitor.readLine());
		System.out.println();
		} catch (Exception erro) {
			System.out.println(erro);
		}
		do {
			try {
			System.out.print(" Digite o número da estante: ");
			objProduto.setObjEstante(new Estante(Integer.parseInt(leitor.readLine())));
			} catch ( Exception erro ) {
				System.out.println(" Somente número! Tente novamente! ");
				objProduto.setObjEstante(null);
			}
		} while (objProduto.getObjEstante() == null	); 
		/* Essa saída de laço pergunta se existe um objeto Estante dentro do objeto produto.. 
		 * se existir ele vai embora. Se não, ele volta pra linha 23 e recomeça */
		  do {
 		     try {
 			System.out.print(" Digite a quantidade de produto: ");
 			objProduto.setQuantidade(Integer.parseInt(leitor.readLine()));
 		   } catch ( Exception erro) {
 			System.out.println(" Somente números!");
 			objProduto.setQuantidade(-1);
 		    }
		} while (objProduto.getQuantidade() < 0);
		
		System.out.println("==================================");
		
		
 		System.out.println(" O nome do produto é: " + objProduto.getNome());
 		System.out.println(" O número da estante é: " + objProduto.getObjEstante().getNumero());
 		System.out.println(" A quantidade de produtos escolhidos são: " + objProduto.getQuantidade());

	}

}
