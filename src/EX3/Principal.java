package EX3;

public class Principal {

	public static void main(String[] args) {
		
		//CADASTRAR PRODUTO
		Produto produto = new Produto("Pedaleira Zoom G3xn", 1, 1.100);
		Produto produto2 = new Produto("Captadores Malagoli HH777, Custom-61", 2, 438.00);
		
		//CLIENTE / CARRINHO
		Cliente cliente = new Cliente("Matheus Oliveira", "Dinheiro");
		
		//CARRINHO / CLIENTE
		Carrinho carrinho = new Carrinho(cliente);
		carrinho.addProduto(produto);
		carrinho.addProduto(produto2);
		carrinho.addProduto(produto2);
		System.out.println("Total: R$ " + carrinho.getTotal());
		System.out.println("Tipo de pagamento: " + cliente.getPagamento());
		
	}
	
}