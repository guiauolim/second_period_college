package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;

import negocio.Time;

public class TimeDAO {
	// PROPRIEDADES
	private PreparedStatement objExecucao = null;
	private ResultSet objCursor = null;
	
	// METODOS PARA MOSTRAR O TIME NA TELA
	public Collection<Time> recuperarTodos() throws Exception {
		ArrayList<Time> retorno = new ArrayList<Time>();
		BancoDeDados objBanco = new BancoDeDados();
		
		objBanco.conectar();
		
		objExecucao = objBanco.getObjConexao().prepareStatement("SELECT * FROM TIME");
		
		objCursor = objExecucao.executeQuery();
		
		while (objCursor.next())  {
			retorno.add(new Time(objCursor.getInt("ID"), objCursor.getString("NOME")));
			
		}
		objBanco.desconectar();
		
		return retorno;
		
	}

}
