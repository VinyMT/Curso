package ExercicioAluno;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner scanner = new Scanner(System.in);
		Aluno aluno = new Aluno();
		aluno.nome = scanner.nextLine();
		aluno.nota1 = scanner.nextDouble();
		aluno.nota2 = scanner.nextDouble();
		aluno.nota3 = scanner.nextDouble();
		
		double m�dia = aluno.calculaMedia();
		System.out.println("Nota final: " + m�dia);
		
		if(m�dia >= 60) {
			System.out.println("Passou");
		} else {
			System.out.println("Falhou");
			System.out.println("Faltaram " + aluno.pontosQueFaltaram() + " pontos");
		}
		
		
		scanner.close();
	}
}
