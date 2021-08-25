package ExercicioConta;

public class Conta {
	private int numero;
	private String dono;
	private double saldo;
	private double limiteDeSaque;
	
	public Conta(int numero, String dono, double saldo, double limiteDeSaque) {
		this.numero = numero;
		this.dono = dono;
		this.saldo = saldo;
		this.limiteDeSaque = limiteDeSaque;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public double getSaldo() {
		return saldo;
	}

	public double getLimiteDeSaque() {
		return limiteDeSaque;
	}

	public void setLimiteDeSaque(double limiteDeSaque) {
		this.limiteDeSaque = limiteDeSaque;
	}
	
	public void deposito(double valor) {
		saldo += valor;
	}
	
	public void saque(double valor) throws ContaException {
		validaSaque(valor);
		saldo -= valor;
	}
	
	public void validaSaque(double valor) throws ContaException {
		if(valor > limiteDeSaque) {
			throw new ContaException("Valor de saque passou do limite de saque");
		}
		
		if(valor > saldo) {
			throw new ContaException("Saldo Insuficiente");
		}
	}
}
