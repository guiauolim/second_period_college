package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Principal {
	public static void main(String[] args) {
		
		//DECLARAÇÃO
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		String nome = "";
		String enedereco = "";
		String telefone = "";
		
		// ENTRADA
		try {
		System.out.print(" Digite o nome: ");
		nome = leitor.readLine();
		
		System.out.print(" Digite o endereço: ");
		enedereco = leitor.readLine();
		
		System.out.print(" Digite o telefone: ");
		telefone = leitor.readLine();
		
		
		// CONEXÃO NO BANCO
		Connection objConexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/cadpessoa?serverTimezone=UTC&user=root&password=uniceub&useSSL=false");
		
		// REGISTRO NO BANCO
		PreparedStatement objExecucao = objConexao.prepareStatement("INSERT INTO PESSOA " +
		                											"(NOME, ENEDERECO, TELEFONE)" +
																	"VALUES" + 
		                											"(?, ?, ?)");
		objExecucao.setString(1, nome);
		objExecucao.setString(2, enedereco);
		objExecucao.setString(3, telefone);
		
		objExecucao.executeUpdate();
		
		// RECUPERAÇÃO DE REGISTRO DO BANCO
		objExecucao = objConexao.prepareStatement("SELECT * FROM PESSOA");
		ResultSet objCursor = objExecucao.executeQuery();
		while (objCursor.next()) {
			System.out.println("===================================================");
			System.out.println("ID: " + objCursor.getInt("ID"));
			System.out.println("Nome: " + objCursor.getString("NOME"));
			System.out.println("Endereço: " + objCursor.getString("ENDERECO"));
			System.out.println("Telefone: " + objCursor.getString("TELEFONE"));
		}
		// FECHAMENTO DA CONEXÃO
		objConexao.close();
		
		
		} catch (Exception e) {
		System.out.println(e);
	}
	
		
		
		
	}
}
