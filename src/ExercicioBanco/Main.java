package ExercicioBanco;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Insira o número da conta: ");
		int numero = scanner.nextInt();
		System.out.print("Insira o nome do dono da conta: ");
		scanner.nextLine();
		String nome = scanner.nextLine();
		System.out.print("A conta irá ter um valor inicial? (s/n)");
		char opção = scanner.next().charAt(0);
		Conta conta;
		
		if(opção == 's') {
			System.out.print("Insira o valor inicial a ser depositado: ");
			double valorConta = scanner.nextDouble();
			conta = new Conta(numero, nome, valorConta);
		} else {
			conta = new Conta(numero, nome);
		}
		
		System.out.println("Dados da conta: ");
		System.out.println("Conta: " + conta.getNumero() + ", Dono: " + conta.getNome() + ", Valor: " + conta.getValorConta());
		
		System.out.print("Insira um valor de deposito: ");
		double valor = scanner.nextDouble();
		conta.deposito(valor);
		
		System.out.println("Dados atualizados: ");
		System.out.println("Conta: " + conta.getNumero() + ", Dono: " + conta.getNome() + ", Valor: " + conta.getValorConta());
		
		System.out.print("Insira um valor de saque: ");
		valor = scanner.nextDouble();
		conta.saque(valor);
		
		System.out.println("Dados atualizados: ");
		System.out.println("Conta: " + conta.getNumero() + ", Dono: " + conta.getNome() + ", Valor: " + conta.getValorConta());
		
		scanner.close();
	}	
}
