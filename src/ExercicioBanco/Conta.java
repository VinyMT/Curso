package ExercicioBanco;

public class Conta {
	private int numero;
	private String nome;
	private double valorConta;
	
	public Conta(int numero, String nome, double valorConta) {
		this.numero = numero;
		this.nome = nome;
		this.valorConta = valorConta;
	}

	public Conta(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}
	
	public int getNumero() {
		return numero;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public double getValorConta() {
		return valorConta;
	}

	public void deposito(double valor) {
		valorConta += valor;
	}
	
	public void saque(double valor) {
		valorConta -= (valor + 5);
	}

	@Override
	public String toString() {
		return "Conta: " + numero + ", Dono: " + nome + ", Saldo: " + valorConta;
	}
	
	
}
