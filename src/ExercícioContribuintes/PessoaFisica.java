package ExercícioContribuintes;

public class PessoaFisica extends Contribuinte {

	private double gastosSaude;
	
	public PessoaFisica(String nome, double rendaAnual, double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}
	
	public double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public double imposto() {
		// TODO Auto-generated method stub
		return (getRendaAnual() * 0.25) - (gastosSaude * 0.5);
	}

}
