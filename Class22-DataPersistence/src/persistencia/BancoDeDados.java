package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;



public class BancoDeDados {
	// PROPRIEDADES 
	private Connection objConexao = null;

	
	
	// METODOS GETS
	public Connection getObjConexao() {
		return objConexao;
	}


	// METODOS DE CONEXÃO AO BANCO
	public void conectar() throws Exception {
		objConexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/livraria?serverTimezone=UTC&user=root&password=uniceub&useSSL=false");
	}
	
	// METODO DE DESCONEXÃO DO BANCO
	public void desconectar () throws Exception {
		objConexao.close();
	}

	
}
