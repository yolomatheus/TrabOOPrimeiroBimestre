package EX3;

public class Cliente {

	private String nomeCliente;
	private String pagamento;
	
	public Cliente(String nomeCliente, String pagamento) {
		this.nomeCliente = nomeCliente;
		this.pagamento = pagamento;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getPagamento() {
		return pagamento;
	}

	public void setPagamento(String pagamento) {
		this.pagamento = pagamento;
	}

}
