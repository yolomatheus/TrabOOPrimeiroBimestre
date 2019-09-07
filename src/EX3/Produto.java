package EX3;

public class Produto {

	private String nome;
	public int quantidade;
	private Double valor;
	
	public Produto(String nome, int quantidade, double valor) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.valor = valor;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
}