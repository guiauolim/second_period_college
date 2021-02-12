package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;


import negocio.Rodada;

public class RodadaDao {
	private PreparedStatement objExecucao = null;
	private ResultSet objCursor = null;
	
	// METODOS DA CLASSE
	public int getProximaRodada() throws Exception {
		BancoDeDados objBanco = new BancoDeDados(); 
		int retorno = 0;
		
		objBanco.conectar();
		
		objExecucao = objBanco.getObjConexao().prepareStatement("SELECT MAX(NUMERO) AS ULTIMARODADA FROM RODADA");
		
		objCursor = objExecucao.executeQuery();
		
		objCursor.next();
		retorno = 1 + objCursor.getInt("ULTIMARODADA");
		
		objBanco.desconectar();
		
		return retorno;
		}
	
	// METODO PARA GRAVAR NO BANCO 
	public void persistir (Rodada objRodada) throws Exception {
		BancoDeDados objBanco = new BancoDeDados();
		
		objBanco.conectar();
		
		objExecucao = objBanco.getObjConexao().prepareStatement("INSERT INTO RODADA" +
				                                                "(NUMERO)" + 
				                                                "VALUES" +
				                                                "(?)");
		
		objExecucao.setInt(1, objRodada.getNumero());
		objExecucao.executeUpdate();
		
		objExecucao = objBanco.getObjConexao().prepareStatement("SELECT ID FROM RODADA WHERE NUMERO = ?");
		objExecucao.setInt(1, objRodada.getNumero());
		objCursor = objExecucao.executeQuery();
		objCursor.next();
		objRodada.setId(objCursor.getInt("ID"));
		
		objBanco.desconectar();
	}
	
	}

