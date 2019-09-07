public class Pessoa {
	
	public int idade;
	public int dia_nascimento;
	public int mes_nascimento;
	public int ano_nascimento;
	public int Dia_atual;
	public int mes_atual;
	public int ano_atual;
	public String nome;
	
	public void calculoIdade () {
		
		Dia_atual = 4;
		mes_atual = 9;
		ano_atual = 2019;
		
		dia_nascimento = 14;
		mes_nascimento = 11;
		ano_nascimento = 2001;
		idade = (ano_atual - ano_nascimento);	
	}
	
	public void informaIdade () {
		
		System.out.println(idade);
		
	}
	
	public void informaNome () {
		nome="Matheus Oliveira"; 
		System.out.println(nome);
	}
	
	public void ajustaDataDeNascimento( int dia_nascimento, int mes_nascimento, int ano_nascimento) {
		
dia_nascimento = 15;
mes_nascimento = 5;
ano_nascimento = 2005;
	if (mes_nascimento < mes_atual || (mes_nascimento == mes_atual && dia_nascimento <= Dia_atual))
			idade = ano_atual - ano_nascimento;
				else
					idade = (ano_atual - ano_nascimento)-1;	
		
	}
}