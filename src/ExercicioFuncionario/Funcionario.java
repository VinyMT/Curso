package ExercicioFuncionario;

public class Funcionario {
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido() {
		double salarioLiquido = salarioBruto - imposto;
		return salarioLiquido;
	}
	
	public void incrementaSalario(double porcentagem) {
		salarioBruto += (salarioBruto * (porcentagem/100));
	}
	
	public String toString() {
		return nome + ", R$ " + salarioLiquido();
	}
}
