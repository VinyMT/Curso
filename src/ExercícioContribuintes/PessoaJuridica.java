package ExercícioContribuintes;

public class PessoaJuridica extends Contribuinte {

	private int nFuncionarios;
	
	public PessoaJuridica(String nome, double rendaAnual, int nFuncionarios) {
		super(nome, rendaAnual);
		this.nFuncionarios = nFuncionarios;
	}

	public int getnFuncionarios() {
		return nFuncionarios;
	}

	public void setnFuncionarios(int nFuncionarios) {
		this.nFuncionarios = nFuncionarios;
	}

	@Override
	public double imposto() {
		// TODO Auto-generated method stub
		if(nFuncionarios > 10) {
			return getRendaAnual() * 0.14;
		} else {
			return getRendaAnual() * 0.16;
		}
	}

}
