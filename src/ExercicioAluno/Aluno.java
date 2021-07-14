package ExercicioAluno;

public class Aluno {
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double calculaMedia() {
		double media = (nota1 + nota2 + nota3);
		return media;
	}
	
	public double pontosQueFaltaram() {
		if(calculaMedia() < 60) {
			return 60 - calculaMedia();
		} else {
			return 0;
		}
	}
	
}
