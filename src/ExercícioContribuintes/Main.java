package ExercícioContribuintes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Contribuinte> lista = new ArrayList<>();
		
		System.out.print("Insira o número de contribuintes: ");
		int n = scanner.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Dados do contribuinte #" + i);
			System.out.print("Pessoa física ou juridica? (f/j) ");
			char opção = scanner.next().charAt(0);
			System.out.print("Nome: ");
			scanner.nextLine();
			String nome = scanner.nextLine();
			System.out.print("Renda Anual: ");
			double rendaAnual = scanner.nextDouble();
			
			if(opção == 'f') {
				System.out.print("Gastos com Saúde: ");
				double gastosSaude = scanner.nextDouble();
				lista.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
			}
			
			if(opção == 'j') {
				System.out.print("Número de funcionarios: ");
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
