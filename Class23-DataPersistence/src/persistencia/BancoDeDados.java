	package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;

public class BancoDeDados {
	// PROPRIEDADES 
	private Connection objConexao = null;
	
	// MÉTODO GET DA CLASSE
	Connection getObjConexao() {
		return objConexao;
	}
	
	// MÉTODO DA CLASSE DE CONEXÃO
	void Conectar () throws Exception {
		objConexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/escola?serverTimezone=UTC&user=root&password=uniceub&useSSL=false");
		
	}
	
	void Desconectar() throws Exception  {
		objConexao.close();
	}

}
