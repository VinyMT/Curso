package ExercicioContratos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Insira o nome do departamento: ");
		String nomeDep =  scanner.nextLine();
		Departamento departamento = new Departamento(nomeDep);
		
		System.out.println("Insira dados do trabalhador: ");
		System.out.print("Nome: ");
		String nome = scanner.nextLine();
		
		System.out.print("Nível: ");
		String nivelString = scanner.nextLine();;	
		NivelDoTrabalhador nivelNum = NivelDoTrabalhador.valueOf(nivelString);
		
		System.out.print("Salário base: ");
		double salarioBase = scanner.nextDouble();
		
		Trabalhador trab = new Trabalhador(nome, nivelNum, salarioBase, departamento);
		
		System.out.print("Quantos contratos esse trabalhador tem: ");
		int j = scanner.nextInt();
		for(int i = 1; i <= j; i++) {
			System.out.println("Insira os dados do contrato #" + i);
			System.out.print("Data (DD/MM/YYYY): ");
			Date data = format.parse(scanner.next());
			
			System.out.print("Valor por hora: ");
			double valorPorHora = scanner.nextDouble();
			
			System.out.print("Duração (Horas): ");
			int horas = scanner.nextInt();
			
			Contrato contrato = new Contrato(data, valorPorHora, horas);
			trab.adicionaContrato(contrato);
		}
		
		
		System.out.print("Digite um mês e ano para calcular o salário total: ");
		String dataSalarioTotal = scanner.next();
		int ano = Integer.parseInt(dataSalarioTotal.substring(3));
		int mes = Integer.parseInt(dataSalarioTotal.substring(0, 2));
		System.out.println("Nome: " + trab.getNome());
		System.out.println("Departamento: " + trab.getDepartamento().getNome());
		System.out.println("Salário Total: " + trab.salarioTotal(ano, mes));
		scanner.close();
	}

}
