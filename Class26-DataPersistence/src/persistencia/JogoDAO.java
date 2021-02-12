package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;

import negocio.Jogo;
import negocio.Rodada;
import negocio.Time;

public class JogoDAO {	
	private PreparedStatement objExecucao = null;
	private ResultSet objCursor = null;
	
	// METODOS
	public Collection<Jogo> recuperarTodos () throws Exception {
		ArrayList<Jogo> retorno = new ArrayList<Jogo>();
		BancoDeDados objBanco = new BancoDeDados();
		
		objBanco.conectar();
		
		objExecucao = objBanco.getObjConexao().prepareStatement("SELECT JOGO.ID AS IDJOGO, " +
		                                                        "       RODADA.ID AS IDRODADA, " +
				                                                "       RODADA.NUMERO AS NUMERORODADA, " +
		                                                        "       TIME1.ID AS IDTIME1, " + 
				                                                "       TIME1.NOME AS NOMETIME1, " + 
		                                                        "       TIME2.ID AS IDTIME2, " +
				                                                "       TIME2.NOME AS NOMETIME2, " +
		                                                        "       QTDGOLTIME1, " +
				                                                "       QTDGOLTIME2 " +
		                                                        "FROM JOGO, " +
				                                                "     RODADA, " +
		                                                        "     TIME AS TIME1, " + 
				                                                "     TIME AS TIME2 " +
		                                                        "WHERE JOGO.IDRODADA = RODADA.ID " + 
				                                                " AND JOGO.IDTIME1 = TIME1.ID " + 
		                                                        " AND JOGO.IDTIME2 = TIME2.ID" );
		
		objCursor = objExecucao.executeQuery();
		
		while (objCursor.next()) {
			retorno.add(new Jogo(objCursor.getInt("IDJOGO"), 
					    new Rodada(objCursor.getInt("IDRODADA"),
					    		   objCursor.getInt("NUMERORODADA")),
					    new Time(objCursor.getInt("IDTIME1"),
					    		objCursor.getString("NOMETIME1")),
					    new Time(objCursor.getInt("IDTIME2"),
					    		objCursor.getString("NOMETIME2")),
					    objCursor.getInt("QTDGOLTIME1"),
					    objCursor.getInt("QTDGOLTIME2")));
		}
		objBanco.desconectar();
		
		return retorno;		
				
	}
	
	
	
	// METODO DA CLASSE
	public void persistir(Jogo objJogo) throws Exception {
		BancoDeDados objBanco = new BancoDeDados();
		
		objBanco.conectar();
		
		objExecucao = objBanco.getObjConexao().prepareStatement("INSERT INTO JOGO" +
		                                                        "(IDRODADA, IDTIME1, IDTIME2, QTDGOLTIME1, QTDGOLTIME2)" +
				                                                "VALUES" +
		                                                        "(?, ?, ?, ?, ?)");
		
				
		objExecucao.setInt(1, objJogo.getObjRodada().getId());
		objExecucao.setInt(2, objJogo.getObjTime1().getId());
		objExecucao.setInt(3, objJogo.getObjTime2().getId());
		objExecucao.setInt(4, objJogo.getQtdGolTime1());
		objExecucao.setInt(5, objJogo.getQtdGolTime2());
		
		objExecucao.executeUpdate();
		
		objBanco.desconectar();

		
	}
	

}
