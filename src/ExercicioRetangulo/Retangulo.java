package ExercicioRetangulo;

public class Retangulo {
	public double altura;
	public double largura;
	
	
	public double Area() {
		double area =  altura * largura;
		return area;
	}
	
	public double Perimetro() {
		double perimetro = (altura * 2) + (largura * 2);
		return perimetro;
	}
	
	public double Diagonal() {
		double diagonal = Math.sqrt(Math.pow(altura, 2) + Math.pow(largura, 2));
		return diagonal;
	}
	
}
