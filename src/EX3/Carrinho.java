package EX3;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

	private Cliente cliente;
	private List<Produto> produtos = new ArrayList<Produto>();
	private double total;
	
	public Carrinho(Cliente cliente) {
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public double getTotal() {
		return total;
	}
	
	public List<Produto> getProdutos() {
		return produtos;
	}
	
	public void addProduto(Produto produto) {
		this.produtos.add(produto);
		this.total += produto.getValor();
	}
	
}