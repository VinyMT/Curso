package ExercicioRetangulo;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Digite a altura e largura do retângulo: ");
		retangulo.altura = scanner.nextDouble();
		retangulo.largura = scanner.nextDouble();
		
		System.out.println("Area: " + retangulo.Area());
		System.out.println("Perimetro: " + retangulo.Perimetro());
		System.out.println("Diagonal: " + retangulo.Diagonal());
		scanner.close();
	}	
}
