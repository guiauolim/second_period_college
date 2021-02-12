package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;

import negocio.Pessoa;

public class Principal {

	public static void main(String[] args) {
		// Interface generica...
		ArrayList<String> colecao = new ArrayList<String>();
		
		LinkedList<String> colecaoLista = new LinkedList<String>();
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Pessoa> colecaoPessoa	 = new ArrayList<Pessoa>();
		
		// entrada de dados
		
		try {
			colecaoPessoa.add(new Pessoa("Guilherme" , 19));
			
			Pessoa objPessoa = new Pessoa();
			System.out.print(" Digite o nome da pessoa: ");
			objPessoa.setNome(leitor.readLine());
			System.out.print(" Digite a idade: ");
			objPessoa.setIdade(Integer.parseInt(leitor.readLine()));
			colecaoPessoa.add(objPessoa);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		
		
		
		colecao.add("Primeira String do Array");	
		
		colecaoLista.add("Guilherme");
		colecaoLista.add("Vini");
		colecaoLista.add("Gabs");
		colecaoLista.add("GMario");
		
		// saida
		for (int i = 0; i < colecao.size(); i++) {
			System.out.println(colecao.get(i));
		}
		for (String membro : colecaoLista ) {
			System.out.println(membro);
		}
		for (Pessoa membro : colecaoPessoa) {
			System.out.println("Nome: " + membro.getNome());
			System.out.println("Idade: " + membro.getIdade());
		}
	}

}
