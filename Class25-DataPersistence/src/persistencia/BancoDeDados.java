package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;

public class BancoDeDados {
	// PROPRIEDADES DA CLASSE
	private Connection objConexao = null;
	
	// METODO GET DA CONEXAO
	public Connection getObjConexao()  {
		return objConexao;
	}
	
	// METODOS DA CLASSE
	void conectar() throws Exception {
		objConexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/folhapagamento?serverTimezone=UTC&user=root&password=uniceub&useSSL=false"); 
	}
	
	void desconectar()  throws Exception {
		objConexao.close();
	}

}
