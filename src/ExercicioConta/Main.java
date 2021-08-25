package ExercicioConta;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Insira os dados da conta: ");
		System.out.print("Numero: ");
		int numero = scanner.nextInt();
		System.out.print("Dono: ");
		scanner.nextLine();
		String dono = scanner.nextLine();
		System.out.print("Saldo inicial: ");
		double saldo = scanner.nextDouble();
		System.out.print("Limite de saque: ");
		double limiteDeSaque = scanner.nextDouble();
		
		Conta conta = new Conta(numero, dono, saldo, limiteDeSaque);
		
		System.out.println("");
		
		System.out.print("Insira o valor de saque: ");
		double valor = scanner.nextDouble();
		try {
			conta.saque(valor);
			System.out.println("Novo saldo: " + conta.getSaldo());
		} catch(ContaException e) {
			System.out.println("Erro de Saque: " +  e.getMessage());
		}
		scanner.close();
	}
}
