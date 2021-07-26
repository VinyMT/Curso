package ExercicioProduto;

public class ProdutoImportado extends Produto {
	private double taxaDeAlfandega;

	public ProdutoImportado(String nome, double preço, double taxaDeAlfandega) {
		super(nome, preço);
		this.taxaDeAlfandega = taxaDeAlfandega;
	}

	public double getTaxaDeAlfandega() {
		return taxaDeAlfandega;
	}

	public void setTaxaDeAlfandega(double taxaDeAlfandega) {
		this.taxaDeAlfandega = taxaDeAlfandega;
	}
	
	@Override
	public String etiquetaPreço() {
		return getNome() + " $ " + String.format("%.2f", preçoTotal()) + " (Taxa de alfândega: $ " + String.format("%.2f", taxaDeAlfandega) + ")";
	}
	
	public double preçoTotal() {
		return getPreço() + taxaDeAlfandega;
	}
}
