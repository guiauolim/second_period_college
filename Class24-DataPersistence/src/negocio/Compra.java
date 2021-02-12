package negocio;

import java.util.Calendar;
import java.util.Date;

import persistencia.CompraDAO;

public class Compra extends Entidade {
	
	// PROPRIEDADES DA CLASSE
	private Produto objProduto = null;
	private Cliente objCliente = null;
	private Date data = null;
	private int quantidade = 0;
	
	// METODOS CONSTRUTORES
	public Compra() {
		super();
	}
	public Compra(int id, Produto objProduto, Cliente objCliente, Date data, int quantidade) {
		super(id);
		this.objProduto = objProduto;
		this.objCliente = objCliente;
		this.data = data;
		this.quantidade = quantidade;
			
	}
	
	// METODOS GETS/SETS
	public Produto getObjProduto() {
		return objProduto;
	}
	public void setObjProduto(Produto objProduto) {
		this.objProduto = objProduto;
	}
	public Cliente getObjCliente() {
		return objCliente;
	}
	public void setObjCliente(Cliente objCliente) {
		this.objCliente = objCliente;
	}
	public Date getData() {
		return data;
	}
	
	public String getDataEmFormatoParaTela() {
		Calendar objCalendario = Calendar.getInstance();
		
		objCalendario.setTime(data);
		
		return objCalendario.get(Calendar.DAY_OF_MONTH) + "/" + 
               (objCalendario.get(Calendar.MONTH) + 1) + "/" +
		       objCalendario.get(Calendar.YEAR);
 	}
	public String getDataEmFormatoParaBanco() {
		Calendar objCalendario = Calendar.getInstance();
		
		objCalendario.setTime(data);
		
		return objCalendario.get(Calendar.YEAR) + "-" + 
               (objCalendario.get(Calendar.MONTH) + 1) + "-" +
		       objCalendario.get(Calendar.DAY_OF_MONTH);
 	}
	
	
	public void setData(Date data) {
		this.data = data;
	}
	
	public void setData(String data) {
		Calendar objCalendario = Calendar.getInstance();
		
		objCalendario.set(Integer.parseInt(data.substring(6,10)), (Integer.parseInt(data.substring(3,5))- 1), Integer.parseInt(data.substring(0,2)));
		this.data = objCalendario.getTime();
	}
	
	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	// METODOS DA CLASSE
	public void persistir () throws Exception {
		new CompraDAO().persistir(this);
	}  
 	
	
	
	
	
	

}
