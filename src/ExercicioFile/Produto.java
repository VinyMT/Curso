package ExercicioFile;

public class Produto {
	private String nome;
	private double valor;
	private int qtd;
	
	public Produto(String nome, double valor,  int qtd) {
		this.setNome(nome);
		this.setQtd(qtd);
		this.setValor(valor);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
	public double valorTotal() {
		return valor * qtd;
	}

	@Override
	public String toString() {
		return nome + "," + valorTotal();
	}
	
	
}
