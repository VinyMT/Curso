package Exerc�cioContribuintes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Contribuinte> lista = new ArrayList<>();
		
		System.out.print("Insira o n�mero de contribuintes: ");
		int n = scanner.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Dados do contribuinte #" + i);
			System.out.print("Pessoa f�sica ou juridica? (f/j) ");
			char op��o = scanner.next().charAt(0);
			System.out.print("Nome: ");
			scanner.nextLine();
			String nome = scanner.nextLine();
			System.out.print("Renda Anual: ");
			double rendaAnual = scanner.nextDouble();
			
			if(op��o == 'f') {
				System.out.print("Gastos com Sa�de: ");
				double gastosSaude = scanner.nextDouble();
				lista.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
			}
			
			if(op��o == 'j') {
				System.out.print("N�mero de funcionarios: ");
				int nFuncionarios = scanner.nextInt();
				lista.add(new PessoaJuridica(nome, rendaAnual, nFuncionarios));
			}
		}
		System.out.println(" ");
		System.out.println("Impostos pagos: ");
		double total = 0;
		
		for(Contribuinte c : lista) {
			System.out.println(c.getNome() + ": " + String.format("%.2f", c.imposto()));
			total += c.imposto();
		}
		
		System.out.println(" ");
		System.out.println("Total de impostos pagos: " + String.format("%.2f", total));
		scanner.close();
	}
}
