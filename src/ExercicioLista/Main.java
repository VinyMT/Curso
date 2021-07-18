package ExercicioLista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Quantos funcionarios serão registrados? ");
		int nn = scanner.nextInt();
		System.out.println("        ");
		List<Funcionario> lista = new ArrayList<Funcionario>();
		
		for(int i = 1; i <= nn; i++) {
			System.out.println("Funcionario #" + i);
			System.out.print("Id: ");
			int id = scanner.nextInt();
			System.out.print("Nome: ");
			scanner.nextLine();
			String nome = scanner.nextLine();
			System.out.print("Salário: ");
			double salario = scanner.nextDouble();
			System.out.println("        ");
			lista.add(new Funcionario(id, nome, salario));
		}
		
		System.out.print("Insira o id do funcionario que deve receber aumento: ");
		int idAumento = scanner.nextInt();
		Funcionario func = lista.stream().filter(x -> x.getId() == idAumento).findFirst().orElse(null);
		double prcnt;
		
		if(func != null) {
			System.out.print("Insira a porcentagem: ");
			prcnt = scanner.nextDouble();
			func.aumentaSalario(prcnt);
		} else {
			System.out.println("Esse id não existe");
		}
		
		System.out.println("        ");
		System.out.println("Lista de funcionarios: ");
		
		for(Funcionario x : lista) {
			System.out.println(x);
		}
		
		scanner.close();
	}
}
