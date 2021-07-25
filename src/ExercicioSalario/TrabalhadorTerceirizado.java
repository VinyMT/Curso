package ExercicioSalario;

public class TrabalhadorTerceirizado extends Trabalhador {

	private double taxaAdicional;
	
	public TrabalhadorTerceirizado(String nome, int horas, double valorPorHora, double taxaAdicional) {
		super(nome, horas, valorPorHora);
		this.taxaAdicional = taxaAdicional;
	}

	@Override
	public double pagamento() {
		double pagamento = super.pagamento() + (taxaAdicional * 1.1);
		return pagamento;
	}

}
