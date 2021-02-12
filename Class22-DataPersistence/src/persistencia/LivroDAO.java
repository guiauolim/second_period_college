package persistencia;

import java.sql.PreparedStatement;

import negocio.Livro;

public class LivroDAO {
	public void persistir(Livro objLivro) throws Exception {
		BancoDeDados objBanco = new BancoDeDados();
		PreparedStatement objExecucao = null;
		
		objBanco.conectar();
		
		if (objLivro.getId() == 0) {
			objExecucao = objBanco.getObjConexao().prepareStatement("INSERT INTO LIVRO" +
		                                                            "(TITULO, IDAUTOR)" +
		                                                            "VALUES" +
					                                                "(?, ?)");
			
			objExecucao.setString(1, objLivro.getTitulo());
			objExecucao.setInt(2, objLivro.getObjAutor().getId());
			
		} else {
			objExecucao = objBanco.getObjConexao().prepareStatement("UPDATE LIVRO SET" + 
                                                                    "TITULO = ?, " +
                                                                    "IDAUTOR = ? " + 
                                                                    "WHERE ID = ?");

			objExecucao.setString(1, objLivro.getTitulo());
			objExecucao.setInt(2, objLivro.getObjAutor().getId());
			objExecucao.setInt(3, objLivro.getId());
			
		}
		objExecucao.executeUpdate();
		objBanco.desconectar();
	}
	

	public void despersistir(Livro objLivro) throws Exception {
		BancoDeDados objBanco = new BancoDeDados();
		PreparedStatement objExecucao = null;
		
		objBanco.conectar();
		

			objExecucao = objBanco.getObjConexao().prepareStatement("DELETE FROM LIVRO 		  " + 
		                                                            "WHERE ID = ?");
			
			objExecucao.setInt(1, objLivro.getId());
			
			objExecucao.executeUpdate();
				
			objBanco.desconectar();
	}

}
