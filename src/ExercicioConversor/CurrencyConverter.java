package ExercicioConversor;

public class CurrencyConverter {
	public static double converte(double dol, double reais) {
		double valorConvertido = dol * reais + ((dol * reais) * 0.06);
		return valorConvertido;
	}
}
