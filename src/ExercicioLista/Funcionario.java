package ExercicioLista;

public class Funcionario {
	private int id;
	private String nome;
	private double salario;
	
	public Funcionario(int id, String nome, double salario) {
		super();
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public void aumentaSalario(double prcnt) {
		salario += salario * (prcnt / 100);
	}
	
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return id + ", " + nome + ", " + salario;
	}
	

}
