package ExercicioFuncionario;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Funcionario func = new Funcionario();
		
		System.out.print("Nome: ");
		func.nome = scanner.next();
		System.out.print("Sal�rio Bruto: ");
		func.salarioBruto = scanner.nextDouble();
		System.out.print("Imposto: ");
		func.imposto = scanner.nextDouble();
		System.out.println("Funcion�rio: " + func);
		
		System.out.print("Voc� quer aumentar o sal�rio em quantos por cento?");
		double porcentagem = scanner.nextDouble();
		func.incrementaSalario(porcentagem);
		System.out.print("Dados atualizados: " + func);
		
		scanner.close();
	}
}
