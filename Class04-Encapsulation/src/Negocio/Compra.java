package Negocio;

import java.util.Date;

public class Compra {
	// Propriedades da classe
	private Produto objProduto;
	private int quantidade = 0;
	private Date data;
	private String cartao = "";
	
	// Metodo construtor
	public Compra() {
		super();
	}
	public Compra(Produto objProduto, int quantidade, Date data, String cartao) {
		super();
		this.objProduto = objProduto;
		this.quantidade = quantidade;
		this.data = data;
		this.cartao = cartao;
	}
	
	// Metodo get/set
	public Produto getObjProduto() {
		return objProduto;
	}
	public void setObjProduto(Produto objProduto) {
		this.objProduto = objProduto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getCartao() {
		return cartao;
	}
	public void setCartao(String cartao) {
		this.cartao = cartao;
	}
	
	
	
	
	

}
