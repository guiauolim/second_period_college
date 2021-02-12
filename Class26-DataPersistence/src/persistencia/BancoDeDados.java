package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;

public class BancoDeDados {
	// PROPRIEDADES
	private Connection objConexao = null;
	
	// METODO
	Connection getObjConexao() {
		return objConexao;
	}
	
	// METODO PARA CONECTAR NO BANCO
	void conectar() throws Exception {
		objConexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/campeonatobrasileiro?serverTimezone=UTC&user=root&password=uniceub&useSSL=false");
		
	}
	
	void desconectar() throws Exception {
		objConexao.close();
	}
	
}
