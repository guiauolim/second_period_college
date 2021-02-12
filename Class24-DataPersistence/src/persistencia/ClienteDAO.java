package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;

import negocio.Cliente;



public class ClienteDAO {
	// PROPRIEDADES
	private PreparedStatement objExecucao = null;
	private ResultSet objCursor = null;
	
	// METODOS DA CLASSE
	public Collection<Cliente> recuperarTodos () throws Exception {
		ArrayList<Cliente> retorno = new ArrayList<Cliente>();
		BancoDeDados objBanco = new BancoDeDados();
		
		objBanco.conectar();
		
		objExecucao = objBanco.getObjConexao().prepareStatement("SELECT * FROM CLIENTE");
		
		objCursor = objExecucao.executeQuery();
		
		while (objCursor.next()) {
			retorno.add(new Cliente(objCursor.getInt("ID"), objCursor.getString("NOME"), objCursor.getString("CARTAO")));
		}
		objBanco.desconectar();
		
		return retorno;
		
	}
	

}
