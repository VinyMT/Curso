package ExercicioProduto;

public class ProdutoImportado extends Produto {
	private double taxaDeAlfandega;

	public ProdutoImportado(String nome, double pre�o, double taxaDeAlfandega) {
		super(nome, pre�o);
		this.taxaDeAlfandega = taxaDeAlfandega;
	}

	public double getTaxaDeAlfandega() {
		return taxaDeAlfandega;
	}

	public void setTaxaDeAlfandega(double taxaDeAlfandega) {
		this.taxaDeAlfandega = taxaDeAlfandega;
	}
	
	@Override
	public String etiquetaPre�o() {
		return getNome() + " $ " + String.format("%.2f", pre�oTotal()) + " (Taxa de alf�ndega: $ " + String.format("%.2f", taxaDeAlfandega) + ")";
	}
	
	public double pre�oTotal() {
		return getPre�o() + taxaDeAlfandega;
	}
}
