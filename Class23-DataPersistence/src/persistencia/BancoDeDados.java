	package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;

public class BancoDeDados {
	// PROPRIEDADES 
	private Connection objConexao = null;
	
	// M�TODO GET DA CLASSE
	Connection getObjConexao() {
		return objConexao;
	}
	
	// M�TODO DA CLASSE DE CONEX�O
	void Conectar () throws Exception {
		objConexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/escola?serverTimezone=UTC&user=root&password=uniceub&useSSL=false");
		
	}
	
	void Desconectar() throws Exception  {
		objConexao.close();
	}

}
