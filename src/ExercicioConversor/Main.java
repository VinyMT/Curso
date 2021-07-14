package ExercicioConversor;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Qual é o preço do dolar? ");
		double dol = scanner.nextDouble();
		System.out.print("Quantos dolares serão comprados? ");
		double reais = scanner.nextDouble();
		
		System.out.println("Quantidade a ser paga em reais: " + CurrencyConverter.converte(dol, reais));
		scanner.close();
	}
}
