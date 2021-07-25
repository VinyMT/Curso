package ExercicioSalario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Trabalhador> trabalhadores = new ArrayList<>();
		
		System.out.print("Insira o número de trabalhadores: ");
		int n = scanner.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Dados do trabalhador #" + i);
			System.out.print("É terceirizado? (y/n) ");
			char opção = scanner.next().charAt(0);
			System.out.print("Nome: ");
			scanner.nextLine();
			String nome = scanner.nextLine();
			System.out.print("Horas: ");
			int horas = scanner.nextInt();
			System.out.print("Valor por hora: ");
			double valorPorHora = scanner.nextDouble();
			if(opção == 'y') {
				System.out.print("Taxa de despesa: ");
				double taxaAdicional = scanner.nextDouble();
				trabalhadores.add(new TrabalhadorTerceirizado(nome, horas, valorPorHora, taxaAdicional));
			} else {
				trabalhadores.add(new Trabalhador(nome, horas, valorPorHora));
			}
		}
		
		System.out.println("");
		System.out.println("Pagamentos: ");
		for(Trabalhador t : trabalhadores) {
			System.out.println(t.getNome() + " - " + t.pagamento());
		}
		
		scanner.close();
	}

}
